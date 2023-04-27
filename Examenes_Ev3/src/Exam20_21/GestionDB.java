package Exam20_21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import aUtilidad.Dibujo;
import aUtilidad.Input;

public class GestionDB {
	public static void main(String[] args) {

		//test con base datos anterior
		File f, fsql;
		if (Input.checkLinux()) {
			f = new File("files/conexion.txt");
		} else {
			f = new File("files\\conexion.txt");
		}
		
		try {
			Connection conn = leerConexionBD(f);
			
			
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		//
		//menu gestion
		String[] opc = { "Alta atleta", "Baja de atleta", "Modificacion de valores", "Listado por prueba y marca",
				"Listado por apellidos y nombres" };
		int key = Dibujo.menu(opc);
//		switch (key) {
//		case 1: {
//			
//			
//			altaAtleta(conn);
//			yield type;
//		}
//		case 2: {
//
//			yield type;
//		}
//		case 3: {
//
//			yield type;
//		}
//		case 4: {
//
//			yield type;
//		}
//		case 5: {
//
//			yield type;
//		}
//		case 0: {
//			System.out.println("ADIOS");
//			break;
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + key);
//		}
//
	}

	private static Connection leerConexionBD(File f) throws IOException, SQLException {
		BufferedReader br = new BufferedReader(new FileReader(f));
		String path = null, user = null, pass = null;
		int cont = 1;
		String linea = br.readLine();
		while(linea!= null) {
			if(cont==1)
				path = linea;
			if(cont==2)
				user = linea;
			if(cont==3)
				pass = linea;
			
			linea=br.readLine()	;
			cont++;
		}
		System.out.println("DATOS DE CONEXION");
		System.out.println(path);
		System.out.println(user);
		System.out.println(pass);
		System.out.println(cont + "lineas txt");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path);
		System.out.println("Conexion realizada");
		return  conn ;
	}

}
