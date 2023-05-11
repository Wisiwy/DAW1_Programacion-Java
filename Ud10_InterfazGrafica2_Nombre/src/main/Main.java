package main;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import aUtilidad.Input;
import controlador.CreateDB;
import controlador.ManejaDB;
import modelo.Contacto;
import vista.VenPrincipal;

public class Main {

	public static void main(String[] args) {

		boolean lin = Input.checkLinux();

		/**
		 * Escribe un programa que controle las insercciones en una base de datos.
		 * 
		 * Vista: -Ventana principal (opciones ver e insertar) -Ventana para hacer
		 * inserciones Modelo: Clase contacto (nombre, apellidos, tlfn) Controlador:
		 * -Clase para crear la base de datos (CreaDB) -Clase para insertar en la BD.
		 * (ManejaDB)
		 * 
		 */

		// creamos conexion a partir de fichero

//		String db = "agenda";
//		if(lin) {
//			File f = new File ("files/agenda.db");
//		}else
		File f = new File("files\\agenda.db");
		f.delete();
		if (!f.exists()) {
			try {
				//si no existe crea fichera
				f.createNewFile();
				//crea la tabla
				CreateDB creaDb = new CreateDB (DriverManager.getConnection("jdbc:sqlite:" + f.getAbsolutePath())); 
					//necesita un string por eso pasamos getAbasolutePath no el fichero f 
				creaDb.createTableAgenda();
				creaDb.cerrar();
				
			} catch (IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//*********************PRUEBA*****************
		Contacto c1 = new Contacto ("Javier", "Perez", 976123123);
		Contacto c2 = new Contacto ("Lucia", "Gonzalez", 976123123);
		try {
			
			ManejaDB maneja = new ManejaDB (DriverManager.getConnection("jdbc:sqlite:" + f.getAbsolutePath()));
			maneja.altaContacto(c2);
			maneja.altaContacto(c1);
			
			
			maneja.verSelect("SELECT * FROM agenda");
			
			VenPrincipal frame = new VenPrincipal(maneja);
			frame.setVisible(true);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Ventanas
		
		
	}

}
