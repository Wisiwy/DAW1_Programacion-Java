package Practica01_db;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws IOException {

		File fSqlSalida = new File("files\\empleados.db");
		Connection conexion;
		try {
			conexion = DriverManager.getConnection("jdbc:sqlite:files\\empleados.db");
			System.out.println("Conexion establecida");
			ManejaDB empleadosDB = new ManejaDB(conexion);
			Statement sentencia = conexion.createStatement();

			if (!fSqlSalida.exists()) {
				// crea la conexion y rellana con el archivo sql
				fSqlSalida.createNewFile();
				File fSql = new File("files//emp.sql");
				leerSQL.leer(conexion, fSql);
			}
			System.out.println();
			
			empleadosDB.SelectAll("Empleados");
			
			Empleado e = new Empleado("raul","gomez",12,1134141,"Calle",21);;
			
			empleadosDB.insertarDato(e);
			

//				manejaDB.InsertarEmpleado(conexion);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		}

	}

}
