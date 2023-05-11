package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

	private Connection c;
	
	public CreateDB(Connection conn) {
		
		this.c = conn;
	}
	
	public void createTableAgenda() throws SQLException {
		
		
		//MEJORA 01: Si ya existe la tabla, que avise de que existe y no lance execute update. 
		
		//MEJORA 02: Leer un SQL. 
		
		Statement sentencia =c.createStatement();
		String sql = "CREATE TABLE agenda ("
				+ "nombre VARCHAR(15),"
				+ "apellido VARCHAR(15),"
				+ "telefono VARCHAR(15)"
				+ ");";
		

		sentencia.executeUpdate(sql);
		sentencia.close();
	}
	
	public void cerrar() throws SQLException {
		c.close();
	}
	

}
