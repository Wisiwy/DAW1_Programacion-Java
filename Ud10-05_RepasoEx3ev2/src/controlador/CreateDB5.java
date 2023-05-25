package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB5 {
	
	Connection conn;

	public CreateDB5(Connection conn) {
		this.conn = conn;
	}

	public void cargaSQL(File fSql) {
		try {
			Statement sentencia = conn.createStatement();
			BufferedReader br = new BufferedReader(new FileReader(fSql));
			
			String instruccion = "";
			String linea = br.readLine();
			while(linea != null) {
				
				if(!linea.startsWith("--")) {
					instruccion+=linea;
					if(linea.contains(";")) {
						try {
							System.out.println(instruccion);
							sentencia.executeUpdate(instruccion);
						} catch (SQLException e) {
							if(e.getErrorCode() == 0)
								System.err.println(e.getMessage());
							else
								e.printStackTrace();
						}
						
						instruccion="";
					}
				}
				
				linea = br.readLine();
			}
			
			sentencia.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}

	
	
	
}
