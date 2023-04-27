package aUtilidad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

	
public static void leerSQL(Connection con,File fentrada) throws SQLException, IOException {
		
				
		BufferedReader br = new BufferedReader(new FileReader(fentrada));
		Statement sentencia = con.createStatement();
		
		String linea = br.readLine();
		String insert = "";
		
		while(linea != null) {
			System.out.println(linea);
			if(!linea.startsWith("--")) {
				insert += linea;
				if(linea.indexOf(";") > 0) {
					sentencia.executeUpdate(insert);
					insert="";
				} 
			}
				
			linea = br.readLine();
		}
		br.close();

		sentencia.close();
		
	}

public static void selectTabla(Connection conn,String tabla) {
	String cab = "";
	try {
		Statement sentencia = conn.createStatement();
		ResultSet res = sentencia.executeQuery("SELECT * FROM " + tabla);
		ResultSetMetaData rsmd = res.getMetaData();
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
	for (int i = 0; i < cab.length(); i++)
		System.out.print("-");
	System.out.println();
}


}
