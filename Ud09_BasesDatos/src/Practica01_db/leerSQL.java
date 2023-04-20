package Practica01_db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class leerSQL {

	public static void leer(Connection conexion, File fSql) {

		FileReader fr;
		try {
			fr = new FileReader(fSql);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			String sentencia = "";

			while (linea != null) {
				if (!linea.startsWith("--")) { // si empieza por "--" empieza a leer sentencia

					sentencia+= linea;

					if (linea.indexOf(";")>0) { // mientras no con
						Statement sentenciaDB = conexion.createStatement();
						sentenciaDB.executeUpdate(sentencia);
						sentencia = "";
					}

				}
				linea = br.readLine();

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
