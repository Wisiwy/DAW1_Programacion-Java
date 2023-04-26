package BBDD_Squilite_MySQ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_03PrepareStatement {
	
	public static void main(String[] args) {
		
		Connection conexion;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","");
			System.out.println("Conexion establecida.");

			String insertar = "INSERT INTO departamentos VALUES(?,?,?)";
			PreparedStatement ps = conexion.prepareStatement(insertar);
			ps.setInt(1, 101);
			ps.setString(2, "Recursos H.");
			ps.setString(3, "Teruel");
			
			ps.executeUpdate();
			
			
			//ver el resultado*************************************************************
			//Statement sentencia = conexion.createStatement();
			
			String selectAll = "SELECT loc, dnombre, dept_no FROM departamentos"; //no es necesario ;
			ps = conexion.prepareStatement(selectAll);
			ResultSet resultado = ps.executeQuery(selectAll);
		
			
			while(resultado.next())
				System.out.printf(" %3d - %-15s %-15s \n",resultado.getInt(3),resultado.getString(2),resultado.getString(1));
			
			
			//ver por localidad
			System.out.println("Teruel: ");
			String selectLoc = "SELECT loc, dnombre, dept_no FROM departamentos Where loc like ?"; //no es necesario ;
			ps = conexion.prepareStatement(selectLoc);
			ps.setString(1, "Teruel");
			resultado = ps.executeQuery(selectAll);
		
			
			while(resultado.next())
				System.out.printf(" %3d - %-15s %-15s \n",resultado.getInt(3),resultado.getString(2),resultado.getString(1));
			
			ps.close();
			//sentencia.close();
			conexion.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
