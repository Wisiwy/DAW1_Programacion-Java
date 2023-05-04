package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import aUtilidad.Ficheros;

public class CreateDB {

	private Connection c;

	public CreateDB(Connection conn) {
		this.c = conn;
	}

	public void createTableLibros(String nomTabla) throws SQLException {

		Statement sent = c.createStatement();
		String sql = "CREATE TABLE " + nomTabla + "("
				+ "id NUMBER(4),"
				+ "titulo VARCHAR(75),"
				+ "autor VARCHAR(50),"
				+ "año NUMBER(4),"
				+ "tematica VARCHAR(25),"
				+ "ubicacion VARCHAR(25),"
				+ "editorial VARCHAR(25),"
				+ "paginas NUMBER(5)"
				+ "edad VARCHAR (20)"
				+ "observaciones VARCHAR(200)"
				+ "fechaAdquisicion DATE "
				+ ");";

		sent.executeUpdate(sql);
		sent.close();

	}
	
	public void cargarExcelCsv(File fCsv) throws FileNotFoundException {
		//ignorar las 3 primeras lineas
		BufferedReader br = Ficheros.abrirBR(fCsv);
		//mirar los puntos y comas para cargarlos correctamente
		
		//mirar para como dejo null si no hay nada entre los puntos y comas
	}

	/**
	 * Ejecuta un archivo Sql en una conexion base de tatos
	 * 
	 * @param fSql STring con la ubicacion del arhivo
	 * @throws IOException
	 * @throws SQLException
	 */
	public void leerSQL(String fSql) throws IOException, SQLException {

		// preparacion reader archivo sql
		File fSqlAUX = new File(fSql);
		System.out.println("INSERCION DATOS FROM " + fSqlAUX.getAbsolutePath());
		BufferedReader br = new BufferedReader(new FileReader(fSqlAUX));
		String linea = br.readLine();

		// preparar sentencia
		Statement sente = c.createStatement();

		String insert = "";
		while (linea != null) {
			System.out.println(linea);
			if (!linea.startsWith("--")) {
				insert += linea;
				if (linea.indexOf(";") > 0) {
					sente.executeUpdate(insert);
					insert = "";
				}
			}
			linea = br.readLine();
		}

		br.close();
		sente.close();
		c.close();

	}

	public void cerrarConn() throws SQLException {
		c.close();
	}

}
