package BBDD_Squilite_MySQ;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlite_03leerArchivosSQL {
	
	public static void main(String[] args) {
		
		String entrada = "D:\\sqlite\\emp.sql";
		String salida = "D:\\sqlite\\empleados.db";
		
		try {
			leerSQL(entrada,salida);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void leerSQL(String entrada,String salida) throws SQLException, IOException {
		
		File f = new File(salida);
		if(!f.exists())
			f.createNewFile();
		
		BufferedReader br = new BufferedReader(new FileReader(entrada));
		Connection conex = DriverManager.getConnection("jdbc:sqlite:"+salida);
		Statement sentencia = conex.createStatement();
		
		String linea = br.readLine();
		String insert = "";
		while(linea != null) {
			System.out.println(linea);
			if(!linea.startsWith("--")) {
				insert += linea;
				if(linea.indexOf(";") > 0) {
					sentencia.executeUpdate(insert);
					insert="";
				} 
			}
				
			linea = br.readLine();
		}
		
		br.close();
		sentencia.close();
		conex.close();
		
	}

}
