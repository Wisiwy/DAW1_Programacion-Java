package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.mysql.jdbc.ResultSetMetaData;

import aUtilidad.Dibujo;
import aUtilidad.Ficheros;
import modelo.Libro;

public class CreateDB {

	private Connection conn;

	public CreateDB(Connection conn) {
		this.conn = conn;
	}

	public void createTableLibros(String nomTabla) throws SQLException {

		Statement sent = conn.createStatement();
		String sql = "CREATE TABLE " + nomTabla + "(" + "id NUMBER(4)," + "titulo VARCHAR(75)," + "autor VARCHAR(50),"
				+ "anyo NUMBER(4)," + "tematica VARCHAR(25)," + "ubicacion VARCHAR(25)," + "editorial VARCHAR(25),"
				+ "isbn VARCHAR(25)," + "paginas NUMBER(5)," + "edad VARCHAR(20)," + "observaciones VARCHAR(200),"
				+ "fechaAdquisicion VARCHAR(25) " + ");";

		sent.executeUpdate(sql);
		sent.close();

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
		Statement sente = conn.createStatement();

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
		conn.close();

	}

	public void cerrarConn() throws SQLException {
		conn.close();
	}

	/**
	 * Return if the table already exist in the database
	 * 
	 * @param tableName
	 * @return
	 * @throws SQLException
	 */

	public boolean tablaExists(String tableName) throws SQLException {
		ResultSet rs = conn.getMetaData().getTables(null, null, tableName, null);
		if (rs.next()) {
			System.out.println("Table " + tableName + " already exists");
			return true;
		} else {
			System.out.println("Table " + tableName + " does not exist");
			return false;
		}
	}

	public void dropTable(String nomTabla) throws SQLException {
		Statement sent = conn.createStatement();
		String sql = "DROP TABLE " + nomTabla;
		sent.executeUpdate(sql);
		System.out.println(nomTabla + "tabla eliminada. ");
		sent.close();
	}

}
