package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Carga {

	private Connection conn;

	public Carga(Connection conn) {
		this.conn = conn;

	}

	public void leerSQL(File file) {

		try {
			Statement sentencia = conn.createStatement();
			BufferedReader br = new BufferedReader(new FileReader(file));

			String instruccion = "";
			String linea = br.readLine();
			while (linea != null) {

				if (!linea.startsWith("--")) {
					instruccion += linea;
					if (linea.contains(";")) {
						try {
							sentencia.executeUpdate(instruccion);
						} catch (SQLException e) {
							if (e.getErrorCode() == 0) {
								System.err.println(e.getMessage());
								System.out.println("ya existe la tabla");

							} else
								e.printStackTrace();
						}

						instruccion = "";
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

	public void cargaTxt(String rutaTxt) throws IOException {

		File fTxt = new File(rutaTxt);

		if (fTxt.exists()) {

			BufferedReader br = new BufferedReader(new FileReader(fTxt));

			String linea = br.readLine();
			while (linea != null) {
				String[] data = linea.split(",");
				if (data.length == 2) {
					insertaUsuario(data);
				} else if (data.length == 3) {
					insertaRealiza(data);

				} else {
					insertaRuta(data);
				}
				linea = br.readLine();

			}
			
			br.close();

		} else {
			System.out.println("Fichero no encontrado.");
		}

	}

	private void insertaRuta(String[] data) {
		String insercion = "INSERT INTO rutas VALUES(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setInt(1, Integer.parseInt(data[0]));
			ps.setString(2, data[1]);
			ps.setString(3, data[2]);
			ps.setString(4, data[3]);
			ps.setFloat(5, Float.parseFloat(data[4].split(" ")[0]));
			ps.setFloat(6, Float.parseFloat(data[5].split(" ")[0]));
			ps.setInt(7, Integer.parseInt(data[6].split(" ")[0].replace(".", "")));
			ps.setInt(8, Integer.parseInt(data[7].split(" ")[0].replace(".", "")));

			ps.executeUpdate();
			ps.close();
			System.out.println("Ruta insertado: " + data[0] + " nombre: " + data[1]);

		} catch (SQLException e) {
			if (e.getErrorCode() == 19)
				System.err.println("Ruta existente");
			else
				e.printStackTrace();
		}

	}

	private void insertaRealiza(String[] data) {
		String insercion = "INSERT INTO realiza VALUES(?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setString(1, data[0]);
			ps.setInt(2, Integer.parseInt(data[1]));
			ps.setString(3, data[2]);
			ps.executeUpdate();
			ps.close();
			System.out.println("Realiza insertado: " + data[0] + " fecha: " + data[2]);

		} catch (SQLException e) {
			if (e.getErrorCode() == 19)
				System.err.println("Realiza existente");
			else
				e.printStackTrace();
		}

	}

	private void insertaUsuario(String[] data) {
		String insercion = "INSERT INTO usuario VALUES(?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setString(1, data[0]);
			ps.setString(2, data[1]);
			ps.executeUpdate();
			ps.close();
			System.out.println("Usuario insertado: " + data[0]);

		} catch (SQLException e) {
			if (e.getErrorCode() == 19)
				System.err.println("Usuario existente");
			else
				e.printStackTrace();
		}

	}

}
