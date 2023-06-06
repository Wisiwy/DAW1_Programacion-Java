package principal;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Carga;
import controlador.Gestiona;
import modelo.Usuario;

public class Principal {
	
	private static Connection conn;

	public static void main(String[] args) {

		File fDb = new File ( "examen.db");
//		fDb.delete();
		
		if (!fDb.exists()) {
		
			try {
				fDb.createNewFile();
				conn = DriverManager.getConnection("jdbc:sqlite:"+fDb.getAbsolutePath());
				System.out.println("Conexion realizada");
				
				//cargamos SQL
				Carga cargaDB= new Carga(conn);
				
				cargaDB.leerSQL(new File ("examenSQLite.sql"));
				System.out.println("DB creada");
				
				//cargas datos.txt
				String ruta = "datosTabla.txt";
				cargaDB.cargaTxt(ruta);
				
				//visualizar tablas
				
				verTabla("rutas");
				verTabla("usuario");
				verTabla("realiza");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}else {
			
			try {
				
				//gestiona base de datos
				conn = DriverManager.getConnection("jdbc:sqlite:"+fDb.getAbsolutePath());
				Gestiona gestDB = new Gestiona(conn);
				//VISUALIZAR DATOS
				titulo("VISUALIZAR DATOS");
				verTabla("rutas");
				System.out.println();
				verTabla("usuario");
				System.out.println();
				verTabla("realiza");
				System.out.println();
				
				//MODIFICAR UNA TUPLA 
				titulo("MODIFICAR UNA TUPLA ");
				int id = 2;
				float newKm = 12;
				gestDB.modificaKm(id, newKm);
				verTabla("rutas");
				System.out.println();

				//BORRAR TUPLA
				titulo("BORRAR TUPLA");
				id = 1;
				gestDB.bajaRuta(id);
				verTabla("rutas");
				System.out.println();
				
				//ALTA RUTA
				
				titulo("ALTA RUTA");
				//"DISCLAIMER"
				//creo una desde codigo lista de strings y se la paso.
				//hubiera cogido gettext(), de los jPanel y los hubiera añadido a la lista.
				//altaRuta se encarga de parsear.
				gestDB.altaRuta(nuevaRuta());
				verTabla("rutas");
				
				
				titulo("LISTADO");
				gestDB.listado();


		


				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			//listado especial
//			gestDB.listado("Enrique");
			
			//abrimos interfaz ventaninas
			
			
		}

		
	}

	private static List<String> nuevaRuta() {
		List<String> aux = new ArrayList();
		aux.add(0, "22");
		aux.add(1, "Breton - Los Enlaces");
		aux.add(2, "Complicada");
		aux.add(3, "00:21");
		aux.add(4, "1.2 km");
		aux.add(5, "30 km/h");
		aux.add(6, "20 m");
		aux.add(7, "25 m");
		
		return aux;
		
	}

	private static void verTabla(String tableName) throws SQLException {
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);
		
		
		String cab = "";
		try {
			// recogemos metadatos
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();

			// dibuja cabecera
			for (int i = 1; i <= columnsNumber; i++) {
				cab += String.format("| %-10s", rsmd.getColumnName(i).toUpperCase());
			}
			System.out.println(cab);
			for (int i = 0; i < cab.length(); i++)
				System.out.print("-");
			System.out.println("");

			// dibuja datos
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnValue = rs.getString(i);
					System.out.printf("| %-10s", columnValue);

				}
				System.out.println();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < cab.length(); i++)
			System.out.print("-");
		System.out.println();
		
		
	}
	public static void titulo(String str) {
		System.out.printf("%n-------------------------------------%n");
		System.out.println("        " + str + "         ");
		System.out.println("--------------------------------------");
	}
	
}
