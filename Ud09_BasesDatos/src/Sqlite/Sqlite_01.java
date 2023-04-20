package Sqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlite_01 {

	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:sqlite:D:\\1DAW_FP\\programacion\\sqlite\\dani.db");
			System.out.println("Conexion establecida");
			
			Statement sentencia = conexion.createStatement(); //realiza la conexion
			int tuplas = sentencia.executeUpdate("INSERT INTO departamento VALUES(80,'fabrica','Teruel')");
			System.out.println("se han insertado "+tuplas+" registros");
			
			String sql = "SELECT loc, dnombre, dept_no FROM departamento"; //no es necesario;
			ResultSet resultado = sentencia.executeQuery(sql); //comando devuleve un ResultSet
			//resultSet es una coleccion, los numeros son las columnas
			while(resultado.next()) {
				System.out.printf(" %3d - %15s %15s \n", resultado.getInt(3),resultado.getString(2),resultado.getString(1));
				//recogemos los datos, tenemos que conocer las tablas
			}
			
			conexion.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
