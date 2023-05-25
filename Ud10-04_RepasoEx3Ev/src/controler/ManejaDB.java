package controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManejaDB {

	private Connection conn;

	public ManejaDB(Connection conn2) {
		// TODO Auto-generated constructor stub
	}

	public void cargaTxt(File fDatos) throws IOException {
		if (fDatos.exists()) {
			BufferedReader br;

			br = new BufferedReader(new FileReader(fDatos));
			String linea = br.readLine();
			while (linea != null) {
				String[] data = linea.split("::|:;|;:|;;");
				if (data.length == 5) {
					altaPiloto(linea);
				} else if (data.length == 2) {
					altaCircuito(linea);

				} else if (data.length == 4) {
					altaPuntua(linea);
				}

			}

		} else {
			System.out.println("File not found");
		}

	}

	

	private void altaPiloto(String linea) {

		String insert = "INSERT INTO puntua VALUES (?,?,?,?);";

		String[] data = linea.split("[::|:;|;:|;;]");

		try {
			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setInt(1, Integer.parseInt(data[0])); // id
			ps.setString(2, data[1]);				//nombre
			ps.setString(3, data[3]);				//coche
			ps.setString(4, data[2]);				//escuderia
			ps.setInt(5, Integer.parseInt(data[4]));//años
			
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			if (e.getErrorCode() == 19)
				System.err.println("Clave primaria ya existe..");
			else
				e.printStackTrace();
		}
	}
	
	public void altaPuntua(String linea) {
		String insercion = "INSERT INTO puntua VALUES(?,?,?,?)";
		String[] data = linea.split("[::|:;|;:|;;]");
		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setInt(1, Integer.parseInt(data[0]));
			ps.setInt(2, Integer.parseInt(data[1]));
			ps.setInt(3, Integer.parseInt(data[2]));
			float vel = Float.parseFloat(data[3].substring(0, 7).replace(',', '.'));
			ps.setFloat(4, vel);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			if(e.getErrorCode() == 19)
				System.err.println("Clave primaria ya existe..");
			else
				e.printStackTrace();
		}
	}
	public void altaCircuito(String linea) {
		String insercion = "INSERT INTO circuitos VALUES(?,?)";
		String[] data = linea.split("[::|:;|;:|;;]");
		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setInt(1, Integer.parseInt(data[0]));
			ps.setString(2, data[1]);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			if(e.getErrorCode() == 19) //inserccion de clave primaria existente
				System.err.println("Clave primaria ya existe..");
			else
				e.printStackTrace();
		}
	}
}
