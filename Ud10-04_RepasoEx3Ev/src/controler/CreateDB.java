package controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

	private Connection conn;

	public CreateDB(Connection conn) {
		this.conn = conn;
	}

	public void leerSQL(String fSql) throws IOException, SQLException {
		// preparacion reader archivo sql
		File fSqlAUX = new File(fSql);
		System.out.println("INSERCION DATOS FROM " + fSqlAUX.getAbsolutePath());
		
		BufferedReader br = new BufferedReader(new FileReader(fSqlAUX));
		String linea = br.readLine();

		// preparar sentencia
		Statement sente = conn.createStatement();

		String insert = "";
		while (linea != null) {
			System.out.println(linea);
			if (!linea.startsWith("--")) {
				insert += linea;
				if(linea.contains(";")) {
					try {
						sente.executeUpdate(insert);
					} catch (SQLException e) {
						if(e.getErrorCode() == 0)
							//suelta un error 
							System.err.println(e.getMessage());
						else
							e.printStackTrace();
					}
					
					insert="";
				}
			}
			
			linea = br.readLine();
		}
		

		br.close();
		sente.close();
		conn.close();
	}

	public void cerrarConn() throws SQLException {
		conn.close();
	}

}
