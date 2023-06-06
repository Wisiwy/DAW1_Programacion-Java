package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import aUtilidad.Dibujo;
import aUtilidad.Ficheros;
import modelo.Libro;

public class ControlDB {

	private Connection conn;

	public ControlDB(Connection c) {
	
		this.conn = c;
	}

	/**
	 * Borra libro a partir del id
	 * 
	 * @param idLibro
	 * @throws SQLException
	 */

	public void borrarLibro(Integer idLibro) throws SQLException {
		// ATENCION posible enrror en no poner al final del detete ;
		String delete = "DELETE FROM libros WHERE id = ?";

		PreparedStatement ps = conn.prepareStatement(delete);
		ps.setInt(1, idLibro);
		ps.executeUpdate();
		System.out.println("Libro borrado.");
		ps.close();

	}

	/**
	 * Prepara el Resulet Seta para ser mostrado en un JTable
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */

	public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {

		ResultSetMetaData metaData = rs.getMetaData();

		// names of columns
		Vector<String> columnNames = new Vector<String>();
		int columnCount = metaData.getColumnCount();
		for (int column = 1; column <= columnCount; column++) {
			columnNames.add(metaData.getColumnName(column));
		}

		// data of the table
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		while (rs.next()) {
			Vector<Object> vector = new Vector<Object>();
			for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
				vector.add(rs.getObject(columnIndex));
			}
			data.add(vector);
		}

		return new DefaultTableModel(data, columnNames);

	}

	/**
	 * Prepara un archivo .csv, crea un objeto libro y lo carga en la BD en la tabla
	 * "libro"
	 * 
	 * @param fCsv
	 * @throws IOException
	 * @throws SQLException
	 */

	public void cargarExcelCsv(File fCsv) throws IOException, SQLException {
		// ignorar las 3 primeras lineas
		System.out.println("CARGAR FICHERO CSV");
		BufferedReader br = Ficheros.abrirBR(fCsv);
		String linea = br.readLine();
		int cuentaCampos = 0;// max 12 campos

		while (linea != null) {
			if (linea.matches("^\\d.*")) { // ^ siginifica principio strin \d numero
				
				// creamos una lista de 12 de tamaño con el array del split
				// y setemos nulos si fuera necesario
				String[] strArray = linea.split(";");
				List<String> strList = new ArrayList<String>();
				strList.addAll(Arrays.asList(strArray));
				if (strList.size() < 12) {
					for (int i = strList.size(); i < 12; i++) {
						if (i == 8)
							strList.add(8, "0");
						else
							strList.add(" ");
					}
				}
				// resueltve problemas con paginas
				strList.get(8).replace('*', '0');
				strList.get(8).replace('?', '0');
				System.out.println(strList.size() + " longitud list");
				Dibujo.pintarLista(strList);
				System.out.println();

				// creamos nuevo libro a partir de la lista e insertamos en la BD
				insertLibro(newLibro(strList));

			}
			linea = br.readLine();

		}
		br.close();
		// mirar los puntos y comas para cargarlos correctamente

		// mirar para como dejo null si no hay nada entre los puntos y comas
	}

	public void cerrarConn() throws SQLException {
		conn.close();
	}

	/**
	 * Recoge el nombre de la DB p
	 * 
	 * @return String con el nombre de la DB
	 * @throws SQLException
	 */
	public String DBname() throws SQLException {
		return conn.getMetaData().getURL().replace("jdbc:sqlite:", "");
	}

	/**
	 * Inserta un objeto libro en la tabla libros
	 * 
	 * @param l objeto libro
	 * @throws SQLException
	 */

	public void insertLibro(Libro l) throws SQLException {

		String insert = prepareInsert("libros", l);
		PreparedStatement ps = conn.prepareStatement(insert);
		System.out.println(insert);

		ps.setInt(1, l.getNum());
		ps.setString(2, l.getTitulo());
		ps.setString(3, l.getAutor());
		ps.setInt(4, l.getAnyo());
		ps.setString(5, l.getTematica());
		ps.setString(6, l.getUbicacion());
		ps.setString(7, l.getEditorial());
		ps.setString(8, l.getIsbn());
		ps.setInt(9, l.getPaginas());
		ps.setString(10, l.getEdad());
		ps.setString(11, l.getObservaciones());
		ps.setString(12, l.getFechaAdquisicion());

		ps.executeUpdate();
		ps.close();
		System.out.println("Libro insertado");

	}

	/**
	 * NO SIRVE. He creado un constructor en la clase libro igual
	 * 
	 * @param strList con los datos sacados de CSV
	 * @return objeto libro
	 */

	private Libro newLibro(List<String> strList) {
		Libro l = new Libro();
		l.setNum(Integer.parseInt(strList.get(0)));
		l.setTitulo(strList.get(1));
		l.setAutor(strList.get(2));

		l.setAnyo(Integer.parseInt(strList.get(3)));
		l.setTematica(strList.get(4));
		l.setUbicacion(strList.get(5));
		l.setEditorial(strList.get(6));
		l.setIsbn(strList.get(7));
		try {
			l.setPaginas(Integer.parseInt(strList.get(8)));
		} catch (NumberFormatException e) {
			if (strList.get(8) == "")
				l.setPaginas(0);
			else {
				System.err.println("Error de formato en id " + strList.get(0));
				l.setPaginas(0);
			}
		}

		l.setEdad(strList.get(9));
		l.setObservaciones(strList.get(10));
		l.setFechaAdquisicion(strList.get(10));
		return l;
	}

	/**
	 * Prepara el statement y eecuta la sentencia pasada por String
	 * 
	 * @param qr Sentencia SQL
	 * @return
	 * @throws SQLException
	 */
	public ResultSet personalizeQueary(String qr) throws SQLException {

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(qr);
		return rs;
	}

	/**
	 * Devuelve un string con elementos HTML (<br/>
	 * ) para poder hacer lo que se quiera
	 * 
	 * @param rs
	 * @return Strin con saltor br
	 */
	public String pintaRS(ResultSet rs) {
		ResultSetMetaData rsmd;
		String pinta = null;
		try {
			rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();

			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					pinta += rsmd.getColumnName(i).toUpperCase() + ": ";
					pinta += rs.getString(i);
					pinta += "<br/>";
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pinta;
	}

	/**
	 * Cuenta los campos de un objto y crea la sentencia INSERT INTO values
	 * 
	 * @param String nomTabla, Objeto a insertar l
	 * @return
	 */
	private String prepareInsert(String nomTabla, Libro l) {
		int numFields = l.getClass().getDeclaredFields().length;
		String insert = "INSERT INTO " + nomTabla + " VALUES (";
		for (int i = 1; i <= numFields; i++) {
			if (i == numFields)
				insert += "?);";
			else
				insert += "?,";

		}
		return insert;
	}

	/**
	 * Devuelve el Result Set de la consulta Xquery. Podría sustituir a select table
	 * pero no quiero cambiar elcodigo XD<br>
	 * Ordenado alfabeticamente.
	 * 
	 * @param columName
	 * @param tableName
	 * @return ResultSet con consulta.
	 * @throws SQLException
	 */
	public ResultSet selectColumnTable(String columName, String tableName) throws SQLException {

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT DISTINCT " + columName + " FROM " + tableName + " ORDER BY " + columName);
		return rs;
	}

	/**
	 * Selecciona el maximo id de la tabla y le suma 1.
	 * 
	 * @param tableName
	 * @return max id +1
	 * @throws SQLException
	 */

	public String selectNextId(String tableName) throws SQLException {
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT MAX(id) FROM " + tableName);
		Integer maxId = null;
		if (rs.next()) {
			maxId = rs.getInt(1);

			System.out.println("El valor máximo de ID es: " + maxId);
		}
		maxId++;

		rs.close();
		stmt.close();

		return maxId.toString();
	}

	/**
	 * Seleccona y muestra por CONSOLA la tabla cuyo nombre pasemos.
	 * 
	 * @param nombre de la tabla
	 */
	public void verTabla(ResultSet rs) {

		String cab = "";
		try {
			// recogemos metadatos
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();

			// dibuja cabecera
			for (int i = 1; i <= columnsNumber; i++) {
				cab += String.format("| %-10s", rsmd.getColumnName(i).toUpperCase());
			}
			System.out.println(cab);
			for (int i = 0; i < cab.length(); i++)
				System.out.print("-");
			System.out.println("");

			// dibuja datos
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnValue = rs.getString(i);
					System.out.printf("| %-10s", columnValue);

				}
				System.out.println();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < cab.length(); i++)
			System.out.print("-");
		System.out.println();
	}

	/**
	 * Devuelve todos los datos de una tabla pasada
	 * 
	 * @param tableName
	 * @return
	 * @throws SQLException
	 */
	public ResultSet selectTableRS(String tableName) throws SQLException {

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);
		return rs;
	}

	/**
	 * Devuelve el tipo de dato de una columna en una tabla.
	 * 
	 * @param nomColumn
	 * @param nomTabla
	 * @return String con tipo de dato de la columna
	 * @throws SQLException
	 */
	private String tipoDato(String nomColumn, String nomTabla) throws SQLException {
		Statement senten = conn.createStatement();
		ResultSet rs = senten.executeQuery("SELECT " + nomColumn + " FROM " + nomTabla + ";");
		return rs.getMetaData().getColumnTypeName(1);
	}

	/**
	 * Modifica la base de datos en el id pasado con un nuevo dato y l aaclumna y
	 * tabla dicha.
	 * 
	 * @param id
	 * @param nomTabla
	 * @param nomColumn
	 * @param newData
	 * @throws SQLException
	 */

	public void updateTabla(Integer id, String nomTabla, String nomColumn, String newData) throws SQLException {
		String dataType = tipoDato(nomColumn, nomTabla);
		System.out.println("El tipo de dato a parsear es " + dataType);
		// parsearDato(newData);
		// convertir de string al dato que sea necesario
		String sql = "UPDATE " + nomTabla + " SET " + nomColumn + " = '" + newData + "' WHERE id = " + id;

		// ejecutar sentencia
		Statement senten = conn.createStatement();
		int row = senten.executeUpdate(sql);
		System.out.println(nomColumn + " de fila nº " + row + "modificado correctamente. ");
		senten.close();

		// pregunta se puede poner para que la lectura sea de cualquier tipo de datç
		// royo
	}
/**
 * Escribire en un file todas lo que aparece en un tableMode 
 * @param model
 * @param f
 * @return file 
 * @throws IOException
 */
	public File escribirTableModel(TableModel model, File f) throws IOException {
		// abrir writer
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		
		// calcular maxima anchura de celda por columna
		int maxAnchoCelda = 0;
		int maxAnchoTabla = 0;
		String cabecera = "| ";
		
		// escribir nombre columnas
		for (int i = 0; i < 3; i++) {
			maxAnchoCelda = getAnchoColumna(i,model);
			maxAnchoTabla+=maxAnchoCelda;
			cabecera += String.format("%-"+maxAnchoCelda+"s", model.getColumnName(i));
			if (i < 2)
				cabecera+=" | ";
			
		}
		bw.write(cabecera);
		bw.newLine();
		
		//escribir lina de guiones
		for (int i = 0; i < maxAnchoTabla; i++) {
			bw.write("-");
		}
		bw.flush();
		bw.newLine();

		// escribir row de la tabla
		String fila = "| ";
		for (int i = 0; i < model.getRowCount(); i++) {
			for (int j = 0; j < 3; j++) {
				maxAnchoCelda = getAnchoColumna(j,model);
				fila += String.format("%-"+maxAnchoCelda+"s", model.getValueAt(i,j));
				if (j < 2)
					fila+=" | ";
			}
			bw.write(fila);
			bw.newLine();
			fila="| ";
		}
		bw.flush();
		bw.close();

		System.out.println("Archivo escrito correctamente");
		return f;
	}

	/**
	 * 
	 * @param i     numero de columna del modelo
	 * @param model el modelo
	 * @return el maximo de ancho
	 */
	private int getAnchoColumna(int i, TableModel model) {

		// calculamos el ancho del nombreColumna
		int columnNameLength = model.getColumnName(i).length();
		// calculamos el Mac ancho del fila
		int maxCellLength = 0;
		int rowCount = model.getRowCount();
		for (int row = 0; row < rowCount; row++) {
			Object value = model.getValueAt(row, i);
			if (value != null) {
				int cellLength = value.toString().length();
				if (cellLength > maxCellLength) {
					maxCellLength = cellLength;
				}
			}
		}

		// comparamos longitud de nombre columna con maxima longitud data
		int maxAnchoCelda = (columnNameLength > maxCellLength) ? columnNameLength : maxCellLength;

			//si la condicion entre parentesis es cierta se asigna columnName de lo contrario se asigna maxCell
		System.out.println("el ancho de columa es "+ maxAnchoCelda);
		return maxAnchoCelda;
	}



	public void escribirXMLTableModel(TableModel model, File f) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		//diferencia entre leer y escribir, se crea no se parse
		Document doc = db.newDocument();
		
		//raiz
		Element eRaiz= doc.createElement("LIBROS");
		doc.appendChild(eRaiz);
		
		
		for (int i = 0; i < model.getRowCount(); i++) {
			//definimos el nodo qeu contiene elementos
			Element eLib = doc.createElement("LIBRO");
			eRaiz.appendChild(eLib);
			
			//definimos el atributo			
			Attr aLib = doc.createAttribute("id");
			aLib.setValue(model.getValueAt(i, 0).toString());
			eLib.setAttributeNode(aLib);	
			
			//elementos
			for (int j = 1; j < model.getColumnCount(); j++) {
				//definimos elementos
				Element element = doc.createElement(model.getColumnName(j));
				element.appendChild(doc.createTextNode(model.getValueAt(i, j).toString()));
				eLib.appendChild(element);
				
			}
		}
		
		//generar xml
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer t = tf.newTransformer();
				//**darle formato
				t.setOutputProperty(OutputKeys.INDENT,"yes");
				
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(f);
				t.transform(source, result);
		
		
		
		
	}

	
}
