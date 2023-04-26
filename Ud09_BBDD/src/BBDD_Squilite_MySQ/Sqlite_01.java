package BBDD_Squilite_MySQ;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlite_01 {

	public static void main(String[] args) {
		try {
			File f = new File("D:\\sqlite\\gabi.db");
			if(!f.exists())
				f.createNewFile();
			
			Connection conexion = DriverManager.getConnection("jdbc:sqlite:D:\\1DAW_FP\\programacion\\sqlite\\dani.db");
			System.out.println("Conexion establecida");
			
			Statement sentencia = conexion.createStatement(); //realiza la conexion
			
			sentencia.executeUpdate("CREATE TABLE agenda ( "
					+ "nombre VARCHAR(15),"
					+ "tel VARCHAR(9)"
					+ ");");
			
			
			int tuplas = sentencia.executeUpdate("INSERT INTO departamento VALUES(80,'fabrica','Teruel')");
			System.out.println("se han insertado "+tuplas+" registros");
			
			String sql = "SELECT loc, dnombre, dept_no FROM departamento"; //no es necesario;
			ResultSet resultado = sentencia.executeQuery(sql); //comando devuleve un ResultSet
			//resultSet es una coleccion, los numeros son las columnas
			while(resultado.next()) {
				System.out.printf(" %3d - %15s %15s \n", resultado.getInt(3),resultado.getString(2),resultado.getString(1));
				//recogemos los datos, tenemos que conocer las tablas
			}
			sentencia.close();
			conexion.close();
			
		}catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
