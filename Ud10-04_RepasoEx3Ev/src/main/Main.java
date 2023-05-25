package main;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controler.CreateDB;
import controler.ManejaDB;

public class Main {
	public static void main(String[] args) {
		
		//definir el archivo db  
		File fDb= new File ("pilotos.db");
		
		
		
		
		//si no existe, creamos la estructura de la base de datos

		if (!fDb.exists()) {
			try {
				fDb.createNewFile();
				//crear la conexion
				Connection conn = DriverManager.getConnection("jdbc:sqlite:" + fDb.getAbsolutePath());
				System.out.println("Conexion establecida.");System.out.println();
				
				//createDB , esquema SQL
				CreateDB creaDB = new CreateDB(conn);
				creaDB.leerSQL("formula1.sql");
				System.out.println("DB succesfully created");
				creaDB.cerrarConn();
				
				//manage DB, cargarTXT
				File fDatos = new File("datosF1.txt");
				ManejaDB maneja = new ManejaDB(conn);
				maneja.cargaTxt(fDatos);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		//crear el controlador con la conn
		
	}

}
