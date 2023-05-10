package controlador;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import aUtilidad.Dibujo;

public class ControlDB {

	private Connection conn;

	public ControlDB(Connection conn) {
		this.conn = conn;
	}

	public void insertDataTxt(File fTxt) throws IOException, SQLException {
		List<String> lStr = Files.readAllLines(fTxt.toPath(), StandardCharsets.ISO_8859_1);
		for (String string : lStr) {
//			System.out.println(string);
			String[] arrayStr = string.split("::|;;|:;");
			if (arrayStr.length == 2) {
//				 System.out.println("circuito ");
//				Dibujo.pintarVector(arrayStr);
				insertCircuitos(arrayStr);
			} else {
				if (arrayStr[3].contains("km/h")) {
//					System.out.println("puntu ");
//					Dibujo.pintarVector(arrayStr);
					insertPuntua(arrayStr);
				} else {
//					System.out.println("piloto ");
//					Dibujo.pintarVector(arrayStr);
					insertPiloto(arrayStr);
				}
			}

//			for (int i = 0; i < arrayStr.length; i++) {
//				System.out.println(arrayStr[i]);
//			}
		}

	}

	private void insertPiloto(String[] arrayStr) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO pilotos VALUES(?,?,?,?);");

		try {
			ps.setInt(1, Integer.parseInt(arrayStr[0])); // idp
		} catch (NumberFormatException e) {
			System.out.println("Problema de formato id piloto");
		}
		ps.setString(2, arrayStr[1]); // nombre
		ps.setString(3, arrayStr[2]);// coche
		ps.setString(3, arrayStr[3]);// escuderia

		try {
			ps.executeUpdate();
			System.out.println("Piloto insertado");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19)
				System.out.println("Prymary key already exist");
		}

		ps.close();

	}

	private void insertCircuitos(String[] arrayStr) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO circuitos VALUES(?,?);");
		try {
			ps.setInt(1, Integer.parseInt(arrayStr[0])); // idc
		} catch (NumberFormatException e) {
			System.out.println("Problema de formato id cirucitos");
		}
		ps.setString(2, arrayStr[1]); // nombre cicuito
		try {
			ps.executeUpdate();
			System.out.println("Circuito insertado");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19)
				System.out.println("Prymary key already exist");
		}

		ps.close();
	}

	private void insertPuntua(String[] arrayStr) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO puntua VALUES(?,?,?,?);");
		try {
			ps.setInt(1, Integer.parseInt(arrayStr[0])); // idp
			ps.setInt(2, Integer.parseInt(arrayStr[1])); // idc
			ps.setInt(3, Integer.parseInt(arrayStr[2])); // anio
		} catch (NumberFormatException e) {
			System.out.println("Problema de formato id o anio o vel media. Parse");
		}
		// preparar velMedia para insertar en float
		float velMedia = Float.parseFloat(arrayStr[3].replace(',', '.').substring(0,7));
		ps.setFloat(4, velMedia);

		try {
			ps.executeUpdate();
			System.out.println("Puntua insertado");
		} catch (SQLException e) {
			if (e.getErrorCode() == 19)
				System.out.println("Prymary key already exist");
		}

		ps.close();
	}

	public void selectTabla(String tabla) {

		String cab = "";
		try {
			Statement sentencia = conn.createStatement();
			ResultSet res = sentencia.executeQuery("SELECT * FROM " + tabla);
			// recogemos metadatos
			ResultSetMetaData rsmd = res.getMetaData();
			int columnsNumber = rsmd.getColumnCount();

			// dibuja cabecera
			Dibujo.titulo(rsmd.getTableName(1).toUpperCase());
			
			for (int i = 1; i <= columnsNumber; i++) {
				String columnName = rsmd.getColumnName(i);
				String tableName = rsmd.getTableName(i);
				int maxDataLen = maxDataLength(columnName,tableName);
				//contruir string de cabecera
				cab += String.format("| %-"+(maxDataLen+columnName.length())+"s", columnName.toUpperCase());
			}
			System.out.println(cab);
			for (int i = 0; i < cab.length(); i++)
				System.out.print("-");
			System.out.println("");

			// dibuja datos
			while (res.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnName = rsmd.getColumnName(i);
					String tableName = rsmd.getTableName(i);
					int maxDataLen = maxDataLength(columnName,tableName);
					
					String columnValue = res.getString(i);
					System.out.printf("| %-"+(maxDataLen+columnName.length())+"s", columnValue);

				}
				System.out.println();
			}
			sentencia.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < cab.length(); i++)
			System.out.print("-");
		System.out.println();
	}

	private int maxDataLength(String columnName, String tableName) throws SQLException {
		String query = "SELECT MAX(LENGTH("+ columnName +")) FROM "+ tableName;
		Statement state = conn.createStatement();
		ResultSet rs = state.executeQuery(query);
		int maxLength = 0;
		if (rs.next()) {
			maxLength = rs.getInt(1);
            return maxLength;
        }
		state.close();
		rs.close();
		return 0;
	}

	
}
