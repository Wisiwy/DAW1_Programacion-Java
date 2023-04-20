package Practica01_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class ManejaDB {
	private static  Connection conexion;
	
	final String BORRAR = "DELETE FROM empleados WHERE emp_no = ?";
	
	public ManejaDB(Connection conexion) {
		this.conexion = conexion;
	}

	public static void SelectAll(String tabla) {
		try {
			Statement sentencia = conexion.createStatement();
			ResultSet res = sentencia.executeQuery("SELECT * FROM " + tabla);
			ResultSetMetaData rsmd = res.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			// dibuja cabecera
			String cab = "";
			for (int i = 1; i <= columnsNumber; i++) {
				cab += String.format("| %-10s", rsmd.getColumnName(i).toUpperCase());
			}
			System.out.println(cab);
			for (int i = 0; i < cab.length(); i++)
				System.out.print("-");
			System.out.println("");
			// dibuja datos
			while (res.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnValue = res.getString(i);
					System.out.printf("| %-10s", columnValue);
					
				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public  void insertarDato(Object e) throws SQLException {
		int numFields = e.getClass().getDeclaredFields().length;
		String insert ="INSERT INTO empleados VALUES (";
		for (int i = 0; i < numFields; i++) {
			insert+="?,";
				if (i==numFields) 
					insert+="?);";	
		}

		PreparedStatement ps = this.conexion.prepareStatement(insert);
		for (int i = 0; i < numFields; i++) {
			//coger el tipo de dato
			
		
		}
		
		
		
	}

}
