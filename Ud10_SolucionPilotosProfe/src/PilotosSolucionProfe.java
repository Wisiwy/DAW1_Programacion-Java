import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PilotosSolucionProfe {

	public static void main(String[] args) {
		String datos = "12Pole.txt";
		String baseDatos = "pilotos.sql";

		File db = new File("pilotos.db");
		File fDatos = new File(datos);
		File fSql = new File(baseDatos);
//		db.delete()	;

		if (!db.exists()) { // si no existe el fichero de base de datos

			try {
				// crear fichero
				db.createNewFile();

				// crear estructura de base de datos (leerSQL
				// crear conexion
				Connection conn = DriverManager.getConnection("jdbc:sqlite:" + db.getPath());

				// leer SQL
				Statement senten = conn.createStatement();
				String instruccion = "";
				List<String> lLineas = Files.readAllLines(fSql.toPath());
				for (String string : lLineas) {
					if (!string.startsWith("--")) {
						instruccion += string;
						if (string.contains(";")) {
							System.out.println("test: " + instruccion);
							// prepararStatement
							senten.executeUpdate(instruccion);
							instruccion = "";// reseteas instruccion
						}
					}
				}
				System.out.println("BASE DE DATOS CREADA");

//				conn.close();

			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {// si existe
				// insertamos los datos del txt
			try {
				Connection conn = DriverManager.getConnection("jdbc:sqlite:" + db.getPath());
				String insert = "INSERT INTO Pilotos VALUES (?,?,?,?,?,?,?);";

				List<String> allDatos = Files.readAllLines(fDatos.toPath(), StandardCharsets.ISO_8859_1);
				for (String string : allDatos) {

					// castear los strings a Int o float
					String[] lineaArray = string.split("::");
					float velocidad = Float.parseFloat(lineaArray[6].replace(',', '.').replaceAll("km/h", ""));// con
																												// substring
																												// funcion
//					System.out.printf("%2d %-18s %7.3f \n", Integer.parseInt(lineaArray[0]), lineaArray[1], velocidad);

					// statment
					PreparedStatement ps = conn.prepareStatement(insert);
					ps.setInt(1, Integer.parseInt(lineaArray[0]));
					ps.setString(2, lineaArray[1]);
					ps.setString(3, lineaArray[2]);
					ps.setString(4, lineaArray[3]);
					ps.setString(5, lineaArray[4]);
					ps.setString(6, lineaArray[5]);
					ps.setFloat(7, velocidad);
					try {//lo hacemos en este try catch para que el programa siga mande el mensaje //comprabar si esta repetida la tupla dentro de la base de datos. 
						ps.executeUpdate();
						System.out.println("Dato insertado");
					} catch (SQLException e) {
						if(e.getErrorCode()==19) {
							System.out.println("Clave primaria ya existe");
						}
					}
					
				}
				// select tabla BD
				Statement senten = conn.createStatement();
				ResultSet rs = senten.executeQuery("SELECT * FROM pilotos;");
				while (rs.next()) {
					System.out.printf("%2d %-18s %7.3f \n", rs.getInt(1), rs.getString(2), rs.getFloat(7));
				}
			} catch (IOException | SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
