package controlador;

import java.io.BufferedReader;
import java.io.File;
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

import aUtilidad.Dibujo;
import aUtilidad.Ficheros;
import aUtilidad.Leer;
import modelo.Libro;

public class ControlDB {

	private Connection conn;

	public ControlDB(Connection c) {
		this.conn = c;
	}

	public void cerrarConn() throws SQLException {
		conn.close();
	}
	
	public DefaultTableModel buildTableModel(ResultSet rs)
	        throws SQLException {

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
	public ResultSet selectTableRS (String tableName) throws SQLException {
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);
		return  rs ;
	}
	
	
	
	public void cargarExcelCsv(File fCsv) throws IOException, SQLException {
		// ignorar las 3 primeras lineas
		System.out.println("CARGAR FICHERO CSV");
		BufferedReader br = Ficheros.abrirBR(fCsv);
		String linea = br.readLine();
		int cuentaCampos = 0;// max 12 campos

		while (linea != null) {
			if (linea.matches("^\\d.*")) { // ^ siginifica principio strin \d numero
				//creamos una lista de 12 de tamaño con el array del split
				//y setemos nulos si fuera necesario 
				String[] strArray = linea.split(";");
				List<String> strList = new ArrayList<String>();
				strList.addAll(Arrays.asList(strArray));
				if(strList.size()<12) {
					for (int i = strList.size(); i < 12; i++) {
						if(i==8)
							strList.add(8,"0");
						else
							strList.add(" ");
					}
				}
				//resueltve problemas con paginas
				strList.get(8).replace('*', '0');
				strList.get(8).replace('?', '0');
				System.out.println(strList.size() + " longitud list");
				Dibujo.pintarLista(strList);
				System.out.println();
				
				//creamos nuevo libro a partir de la lista e insertamos en la BD
				insertLibro(newLibro(strList));
				
				
			}
			linea = br.readLine();

		}
		br.close();
		// mirar los puntos y comas para cargarlos correctamente

		// mirar para como dejo null si no hay nada entre los puntos y comas
	}
	
	/**
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
		}catch(NumberFormatException e){
			if(strList.get(8)=="")
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

	public void updateTabla(Integer id, String nomTabla, String nomColumn) throws SQLException {
		String nuevoDato = Leer.leerString("Intro nuevo " + nomColumn +": ");
//		String dataType = tipoDato(nomColumn, nomTabla);
//		parsearDato(nuevoDato);
		// convertir de string al dato que sea necesario
        String sql = "UPDATE " + nomTabla + " SET " + nomColumn + " = '" + nuevoDato + "' WHERE id = " + id;
		
		// ejecutar sentencia
        Statement senten = conn.createStatement();
		int row = senten.executeUpdate(sql);
		System.out.println(nomColumn +"de fila nº "+ row+ "modificado correctamente. ");
		senten.close();

		// pregunta se puede poner para que la lectura sea de cualquier tipo de datç
		// royo
	}

	private String tipoDato(String nomColumn, String nomTabla) throws SQLException {
		Statement senten = conn.createStatement();
		ResultSet rs = senten.executeQuery("SELECT " + nomColumn + " FROM" + nomTabla + ";");
		System.out.println("Tipo de dato " + (rs.getMetaData().getColumnTypeName(0)));
		return rs.getMetaData().getColumnTypeName(0);
	}

	
	/**
	 * Seleccona y muestra por consola la tabla cuyo nombre pasemos. 
	 * @param nombre de la tabla
	 */
	public void selectTabla(ResultSet rs) {

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

}
