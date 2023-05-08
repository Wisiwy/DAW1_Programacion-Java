package practica01_db;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class ManejaDB {
	private static Connection conexion;

	final String BORRAR = "DELETE FROM empleados WHERE ID = ?";

	public ManejaDB(Connection conexion) {
		this.conexion = conexion;
	}

	public static void escribeTabla(FileWriter fw, String tabla) {
		String cab = "";
		try {
			Statement sentencia = conexion.createStatement();
			ResultSet res = sentencia.executeQuery("SELECT * FROM " + tabla);
			ResultSetMetaData rsmd = res.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			// dibuja cabecera
			for (int i = 1; i <= columnsNumber; i++) {
				cab += String.format("| %-10s", rsmd.getColumnName(i).toUpperCase());
			}
			System.out.println(cab);
			fw.append(cab + "\n");

			for (int i = 0; i < cab.length(); i++) {
				System.out.print("-");
				fw.append("-");
			}
			System.out.println("");
			fw.append("\n");
			// dibuja datos
			while (res.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnValue = res.getString(i);
					System.out.printf("| %-10s", columnValue);

					fw.append(columnValue.format("| %-10s", columnValue));

				}
				System.out.println();
				fw.append(" \n");
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < cab.length(); i++)
			System.out.print("-");
		System.out.println();
	}

	public static void selectTabla(String tabla) {
		String cab = "";
		try {
			Statement sentencia = conexion.createStatement();
			ResultSet res = sentencia.executeQuery("SELECT * FROM " + tabla);
			ResultSetMetaData rsmd = res.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			// dibuja cabecera
			for (int i = 1; i <= columnsNumber; i++) {
				cab += String.format("| %-10s", rsmd.getColumnName(i).toUpperCase());
			}
			System.out.println(cab);
			for (int i = 0; i < cab.length(); i++)
				System.out.print("-");
			System.out.println("");
			// dibuja datos
			while (res.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnValue = res.getString(i);
					System.out.printf("| %-10s", columnValue);

				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < cab.length(); i++)
			System.out.print("-");
		System.out.println();
	}

	public static Connection getConexion() {
		return conexion;
	}

	public static void setConexion(Connection conexion) {
		ManejaDB.conexion = conexion;
	}

	public void insertEmpl(Empleado e) throws SQLException {
		int numFields = e.getClass().getDeclaredFields().length - 1;
		String insert = "INSERT INTO empleados VALUES (";
		for (int i = 1; i <= numFields; i++) {
			if (i == numFields)
				insert += "?);";
			else
				insert += "?,";

		}

		PreparedStatement ps = this.conexion.prepareStatement(insert);

		ps.setInt(1, e.getID_empleado());
		ps.setString(2, e.getNom());
		ps.setString(3, e.getApe());
		ps.setInt(4, e.getID_Localidad());
		ps.setInt(5, e.getTelefono());
		ps.setString(6, e.getDirec());
		ps.setInt(7, e.getSueldo());
		ps.setInt(8, e.getAntiguedad());

		ps.executeUpdate();

	}

	public void deleteEmp(int idAux) {
		try {
			PreparedStatement ps = this.conexion.prepareStatement(BORRAR);
			ps.setInt(1, idAux);

			ps.executeUpdate();
			System.out.println("Borrado empleado: " + idAux);

			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateSalary(int idAux) {
		// pruebo con statement solamente
		try {
			int sala = Leer.leerIntPosi("Nuevo salario: ");
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("UPDATE empleados SET salario = " + sala + " WHERE ID = " + idAux);
			System.out.println("Salario modificado.");
			sentencia.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
