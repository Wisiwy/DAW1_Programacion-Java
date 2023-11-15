package Exam20_21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import aUtilidad.CreateDB;
import aUtilidad.Dibujo;
import aUtilidad.Input;
import aUtilidad.Leer;

public class GestionDB {
	public static void main(String[] args) {

		// test con base datos anterior
		File f, fsql;
		if (Input.checkLinux()) {
			f = new File("files/conexion.txt");
		} else {
			f = new File("files\\conexion.txt");
		}

		try {
			Connection conn = leerConexionBD(f);

			//
			// menu gestion
			String[] opc = { "Alta atleta", "Baja de atleta", "Modificacion de valores", "Listado por prueba y marca",
					"Listado por apellidos y nombres" };
			int key = Dibujo.menu(opc);
			switch (key) {
			case 1: {
				
				altaAtleta(conn);
				break;
			}
			case 2: {
				bajaAtleta(conn);
				break;
			}
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
			}
		
			conn.close();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	private static void bajaAtleta(Connection conn) throws SQLException {
		String[] pk =  elegirPKAtleta(conn);
		Statement sente = conn.createStatement( );
		sente.executeQuery("DELETE FROM atleta WHERE nombre = "+pk[0]+"AND apellido="+pk[1]+ "AND prueba=" + pk[2]+";");
	}

	private static String[] elegirPKAtleta(Connection conn) {
		CreateDB.selectTabla(conn, "atleta");
		String nom = Leer.leerString("Nombre: ").toUpperCase();
		String ape = Leer.leerString("Apellido:").toUpperCase();
		String prueba = Leer.leerString("Prueba:").toUpperCase();
		String[] aux = {nom, ape, prueba};
		return aux;
	}

	private static void altaAtleta(Connection conn) throws SQLException {
		AtletaP1 aux = crearAtleta();
		String insert = "INSERT INTO atleta VALUES (?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(insert);

		ps.setString(1, aux.getNom());
		ps.setString(2, aux.getApe());
		ps.setString(3, aux.getSexo());
		ps.setString(4, aux.getFecha_nac());
		ps.setString(5, aux.getPrueba());
		ps.setString(6, aux.getMarca());

		ps.executeUpdate();
		System.out.println("Alta realizada!!");
	}

	private static AtletaP1 crearAtleta() {
		Dibujo.titulo("ALTA ALTETA");
		String nom = Leer.leerString("Nombre: ");
		String ape = Leer.leerString("Apellido: ");
		String sexo = Leer.leerString("Sexo: ");
		String fecha_nac = Leer.leerString("Fecha_nac :");
		String prueba = Leer.leerString("Prueba: ");
		String marca = Leer.leerString("Marca: ");

		return new AtletaP1(nom, ape, sexo, fecha_nac, prueba, marca);
	}

	private static Connection leerConexionBD(File f) throws IOException, SQLException {
		BufferedReader br = new BufferedReader(new FileReader(f));
		String path = null, user = null, pass = null;
		int cont = 1;
		String linea = br.readLine();
		while (linea != null) {
			if (cont == 1)
				path = linea;
			if (cont == 2)
				user = linea;
			if (cont == 3)
				pass = linea;

			linea = br.readLine();
			cont++;
		}
		System.out.println("DATOS DE CONEXION");
		System.out.println(path);
		System.out.println(user);
		System.out.println(pass);
		System.out.println(cont + "lineas txt");

		Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path);
		System.out.println("Conexion realizada");
		return conn;
	}

}
