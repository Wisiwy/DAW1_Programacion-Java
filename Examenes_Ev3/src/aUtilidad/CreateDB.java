package aUtilidad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
}
