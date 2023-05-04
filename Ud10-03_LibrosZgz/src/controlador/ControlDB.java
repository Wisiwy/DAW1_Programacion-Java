package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import aUtilidad.Leer;
import modelo.Libro;

public class ControlDB {

	private Connection c;

	public ControlDB(Connection c) {
		this.c = c;
	}

	public void cerrarConn() throws SQLException {
		c.close();
	}

	public void insertLibro(Libro l) throws SQLException {

		String insert = prepareInsert("libros", l);
		PreparedStatement ps = c.prepareStatement(insert);
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
		ps.setDate(13, l.getFechaAdquisicion());

		ps.executeUpdate();
		System.out.println("Libro insertado");

	}

	/**
	 * Cuenta los campos de un objto y crea la sentencia INSERT INTO values
	 * 
	 * @param String nomTabla, Objeto a insertar l
	 * @return
	 */
	private String prepareInsert(String nomTabla, Libro l) {
		int numFields = l.getClass().getDeclaredFields().length - 1;
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
		PreparedStatement ps = c.prepareStatement(delete);
		ps.executeUpdate();
		System.out.println("Libro borrado.");
		ps.close();

	}

	public void updateTabla(Integer id, String nomTabla, String nomColumn) throws SQLException {
		String nuevoDato = Leer.leerString("Intro nuevo" + nomColumn);
		String dataType = tipoDato(nomColumn,nomTabla);
//		parsearDato(nuevoDato);
		// convertir de string al dato que sea necesario
		String update = "UPDATE" + nomTabla + "SET " + nomColumn 
						+ "=" + nuevoDato + "WHERE id = " + id;
		
		//ejecutar sentencia
		Statement senten = c.createStatement();
		senten.executeUpdate(update);
		System.out.println(nomColumn + "modificado correctamente. ");
		senten.close();

		// pregunta se puede poner para que la lectura sea de cualquier tipo de datç
		// royo
	}

	private String tipoDato(String nomColumn, String nomTabla) throws SQLException {
		Statement senten = c.createStatement();
		ResultSet rs = senten.executeQuery("SELECT "+nomColumn+" FROM"+nomTabla+";");
		System.out.println("Tipo de dato "+ (rs.getMetaData().getColumnTypeName(0)));
		return rs.getMetaData().getColumnTypeName(0);
	}

	public void selectTabla() {

	}

}
