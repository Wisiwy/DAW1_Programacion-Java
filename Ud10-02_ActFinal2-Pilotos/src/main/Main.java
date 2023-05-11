package main;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controlador.ControlDB;
import controlador.CreateDB;
import vista.MainWin;

public class Main {

	public static void main(String[] args) {
		
		//definicion documentos
		String strSql = "formula1.sql";
		String strTxt = "datosF1.txt";

		File fDB = new File ("f1.db");
		File fSql = new File (strSql);
		File fTxt = new File (strTxt);
		
		if(!fDB.exists()) {
			try {
				//create conecction
				fDB.createNewFile();
				Connection conn = DriverManager.getConnection("jdbc:sqlite:" + fDB.getPath());
				System.out.println("Conexion establecida");
				//create DB schema
				CreateDB creaDB = new CreateDB(conn);
				creaDB.readSQL(fSql);
				creaDB.closeConn();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}else {
			//load file txt to database
			try {
				Connection conn = DriverManager.getConnection("jdbc:sqlite:" + fDB.getPath());
				ControlDB control = new ControlDB(conn);
				control.insertDataTxt(fTxt);
				control.verTabla("puntua");
				control.verTabla("pilotos");
				control.verTabla("circuitos");
				
				MainWin ventana = new MainWin(control);
				ventana.setVisible(true);
			
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			
			
			
		}
		
		
		
	}
}
