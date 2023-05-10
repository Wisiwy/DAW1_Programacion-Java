package controlador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CreateDB {

	public Connection conn;

	public CreateDB(Connection conn) {
		this.conn = conn;
	}

	public void readSQL(File fSql) throws IOException, SQLException {

		// statment
		Statement state = conn.createStatement();
		String instru = "";

		// read Sql prepare insert string
		List<String> listStr = Files.readAllLines(fSql.toPath());
		for (String string : listStr) {
			if (!string.startsWith("--")) {
				instru += string;
				if (string.contains(";")) {
					System.out.println("Sql Command: " + instru);
					state.executeUpdate(instru);
					System.out.println("Tabla creada");
					instru = "";
				}
			}
		}
		System.out.println("DataBase created");
	}

	public void closeConn() throws SQLException {
		conn.close();
	}
}
