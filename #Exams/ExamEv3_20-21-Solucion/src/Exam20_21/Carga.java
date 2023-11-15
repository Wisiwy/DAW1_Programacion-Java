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

import aUtilidad.CreateDB;
import aUtilidad.Input;

public class Carga {

	public static void main(String[] args) {
		// creacion ficheros a usar
		File f, fsql;
		if (Input.checkLinux()) {
			f = new File("files/examen20.db");
			fsql = new File("files/examenSQLite.sql");
		} else {
			f = new File("files\\examen20.db");
			fsql = new File("files\\examenSQLite.sql");
		}

		try {
			f.delete();
			if (!f.exists())
				f.createNewFile();
			System.out.println("Archivos creados.");

			// crear conexion

			Connection conn = DriverManager.getConnection("jdbc:sqlite:" + f.getAbsolutePath());
			System.out.println("Conexion establecida");
			// carga sql
			CreateDB.leerSQL(conn, fsql);
			System.out.println("Creacion esquema BD.");

			// carga datos

			leeDatos(conn);
			System.out.println("Carga datos from txt");

			conn.close();

		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void leeDatos(Connection conn) throws FileNotFoundException {
		File f;
		if (Input.checkLinux()) {
			f = new File("files/EXAMEN.TXT");
		} else {
			f = new File("files\\EXAMEN.TXT");
		}

		BufferedReader br = new BufferedReader(new FileReader(f));

		try {
			String linea = br.readLine();
			while (linea != null) {
				insertaDato(linea.split(","), conn);
				linea = br.readLine();
			}

			br.close();

		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void insertaDato(String[] split, Connection conn) throws SQLException {
		String insert = "INSERT INTO atleta VALUES (?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(insert);

		ps.setString(1, split[2]);
		ps.setString(2, split[1]);
		ps.setString(3, split[3]);
		ps.setString(4, split[4]);
		ps.setString(5, split[0]);
		ps.setString(6, split[5]);

		ps.executeUpdate();

	}

}
