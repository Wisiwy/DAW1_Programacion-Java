package BBDD_Squilite_MySQ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_02 {

	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://10.6.7.1/tienda", "root", "");
			System.out.println("Conexion establecida");

			Statement sentencia = conexion.createStatement(); // realiza la conexion
			String sql = "SELECT loc, dnombre, dept_no FROM departamentos"; // no es necesario;
			ResultSet resultado = sentencia.executeQuery(sql); // comando devuleve un ResultSet
			
			while(resultado.next()) {
				System.out.printf(" %3d - %15s %15s \n", resultado.getInt(3),resultado.getString(2),resultado.getString(1));
				//recogemos los datos, tenemos que conocer las tablas
			}
			
			sentencia.close();
			conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// direccion, usuario, contraseña

	}

}
