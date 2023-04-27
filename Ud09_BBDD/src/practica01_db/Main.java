package practica01_db;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws IOException {

//		File fSqlSalida = new File("files\\empleados.db");
		File fSqlSalida = new File("files/empleados2.db");

		
		//*****CREAMOS CONEXION
		Connection conexion;
		try {
			conexion = DriverManager.getConnection("jdbc:sqlite:files\\empleados2.db");
//			conexion = DriverManager.getConnection("jdbc:sqlite:files/empleados.db");
			System.out.println("Conexion establecida");
			ManejaDB empleadosDB = new ManejaDB(conexion);
			Statement sentencia = conexion.createStatement();

			if (!fSqlSalida.exists()) {
				// crea la conexion y rellana con el archivo sql
				fSqlSalida.createNewFile();
//				File fSql = new File("files\\emp.sql");
////				File fSql = new File("files/emp.sql");
//				leerSQL.leer(conexion, fSql);
//				System.out.println("BD cargadas");
			}
			File fSql = new File("files\\emp.sql");
//			File fSql = new File("files/emp.sql");
			leerSQL.leer(conexion, fSql);
			System.out.println("BD cargadas");
			
			System.out.println();

			// mostrar tabla empleados
			empleadosDB.SelectAll("Empleados");

			// ******INSERTAR EMPLEADO

			Empleado e = new Empleado("raul", "gomez", 12, 1134141, "Calle", 300, 21);
			try {

				empleadosDB.insertEmpl(e);

			} catch (Exception exc) {
				System.err.println(e.getID_empleado() + " : esta id ya esta en BD");
				System.err.println("Empleado ya en BBDD. Meta otro. U otra Id.");
			}

			Informe inf = new Informe(empleadosDB);
			
			
			// ******BORRAR EMPLEADO***
			// seleccion empleado a borrar
			int idAux = selectIdEmp(empleadosDB);
			empleadosDB.deleteEmp(idAux);
			empleadosDB.SelectAll("Empleados");
			
			// ******ACTUALIZAR SALDO***
			idAux = selectIdEmp(empleadosDB);
			empleadosDB.updateSalary(idAux);
			empleadosDB.SelectAll("Empleados");
			
			//*****************************INFORME GENERAR*****************+
			inf = new Informe(empleadosDB);
			inf.escribirFichero();
			
			inf.sumarSueldo();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		}

	}

	private static int selectIdEmp(ManejaDB empleadosDB) {
		empleadosDB.SelectAll("Empleados");
		return Leer.leerIntPosi("Que empleado quieres modificar?");
	}

}
