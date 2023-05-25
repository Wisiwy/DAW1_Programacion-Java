package main;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controlador.CreateDB5;
import controlador.ManejaDB5;

public class Main {
	public static void main(String[] args) {
		File fDb = new File ( "rutas.db");
		
		if (!fDb.exists()) {
			try {
				fDb.createNewFile();
				Connection conn = DriverManager.getConnection("jdbc:sqlite:"+fDb.getAbsolutePath());
				System.out.println("Conexion realizada");
				
				CreateDB5 create = new CreateDB5(conn);
				
				File fSql = new File("examenSQLite.sql");
				create.cargaSQL(fSql);
				System.out.println("Sql cargado. DB cargada.");
				
				ManejaDB5 maneja = new ManejaDB5(conn);
				maneja.cargaTXT();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}else {
			
			
			
		}
	}

}
