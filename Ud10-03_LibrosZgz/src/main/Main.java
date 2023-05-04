package main;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



import aUtilidad.Input;

public class Main {
	public static void main(String[] args) {
		//crear conexion
		try {
		File f = new File("librosZgz.db");
		if(!f.exists())
			f.createNewFile();
			Connection conn = DriverManager.getConnection("jdbc:sqlite:librosZgz.db");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File fCsv = new File ("LibrosZaragoza.csv"); 
		
		//llamar a la vista principal
	}

}
