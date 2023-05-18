package principal;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import controlador.*;
import vista.Vtodo;

public class Principal {
	
	public static void main(String[] args) {
		
		
		File fBaseDatos = new File("formula1.db"); 
		//File fscript = new File("formula1.sql"); 
		//File fdatos = new File("datosF1.txt"); 
		
		
		ManejaDB maneja = null;
		try {
			maneja = new ManejaDB(fBaseDatos);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		Vtodo ven = new Vtodo(maneja);
		ven.setVisible(true);
		
	}

}
