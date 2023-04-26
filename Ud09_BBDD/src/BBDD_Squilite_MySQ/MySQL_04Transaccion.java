package BBDD_Squilite_MySQ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_04Transaccion {
	
	
	
	public static void main(String[] args) {
		
		//inserción de 3 departamentos con transaccion
		//------------------------------------------------------
		String insertar = "INSERT INTO departamentos VALUES(?,?,?)";
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","");
			System.out.println("Conexion establecida.");
			
			//para hacer la transaccion deshabilitamos el autocommit
			conexion.setAutoCommit(false);
			
			PreparedStatement ps = conexion.prepareStatement(insertar);
			ps.setInt(1, 301);
			ps.setString(2, "dpto 1");
			ps.setString(3, "Teruel");
			ps.executeUpdate();
			
			ps = conexion.prepareStatement(insertar);
			ps.setInt(1, 302);
			ps.setString(2, "dpto 2");
			ps.setString(3, "Teruel");
			ps.executeUpdate();
			
			ps = conexion.prepareStatement(insertar);
			ps.setInt(1, 303);
			ps.setString(2, "dpto 3");
			ps.setString(3, "Teruel");
			ps.executeUpdate();
			
			//conexion.commit();
			conexion.rollback();
			
			ps.close();
			conexion.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		
		//ver datos de la tabla
		//------------------------------------------------------------------
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","");
			System.out.println("Conexion establecida.");

			
			Statement sentencia = conexion.createStatement();
			
			String sql = "SELECT loc, dnombre, dept_no FROM departamentos"; //no es necesario ;
			ResultSet resultado = sentencia.executeQuery(sql);
		
			
			while(resultado.next())
				System.out.printf(" %3d - %-15s %-15s \n",resultado.getInt(3),resultado.getString(2),resultado.getString(1));
			
			sentencia.close();
			conexion.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
