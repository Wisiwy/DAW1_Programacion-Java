package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ManejaDB {
	
	private Connection conn;
	
	public ManejaDB(File ruta) throws SQLException {
		
		if(!ruta.exists())
			try {
				ruta.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		conn = DriverManager.getConnection("jdbc:sqlite:"+ruta.getPath());
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void crearBaseDatos(String ruta) {
		
	}
	
	public void crearBaseDatos(File datos) {
		
				
		try {
			Statement sentencia = conn.createStatement();
			BufferedReader br = new BufferedReader(new FileReader(datos));
			
			String instruccion = "";
			String linea = br.readLine();
			while(linea != null) {
				
				if(!linea.startsWith("--")) {
					instruccion+=linea;
					if(linea.contains(";")) {
						try {
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
	
	public void rellenaBaseDatos(File ruta) {
	
		if (ruta.exists()) {
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(ruta));
				String linea = br.readLine();
				while(linea!=null) {
					//System.out.println(linea);
					String[] data = linea.split("::|:;|;:|;;");
					//System.out.println(data.length);
					if (data.length == 5) {
						altaPiloto(Integer.parseInt(data[0]),data[1],data[3],data[2],Integer.parseInt(data[4]));
					}else if(data.length == 2) {
						altaCircuito(Integer.parseInt(data[0]),data[1]);
					}else if(data.length == 4) {
						float vel = Float.parseFloat(data[3].substring(0, 7).replace(',', '.'));
						altaPuntua(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2]),vel);
					}
					
					linea=br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("Fichero no existe");
		}
		
		
	}
	
	public void altaPiloto(String linea) {
		String insercion = "INSERT INTO pilotos VALUES(?,?,?,?,?)";
		String[] data = linea.split("[::|:;|;:|;;]");
		
		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setInt(1, Integer.parseInt(data[0]));
			ps.setString(2, data[1]);
			ps.setString(3, data[3]);
			ps.setString(4, data[2]);
			ps.setInt(5, Integer.parseInt(data[4]));
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			if(e.getErrorCode() == 19)
				System.err.println("Clave primaria ya existe..");
			else
				e.printStackTrace();
		}
	}
	public void altaPiloto(int id, String nom, String coche, String escuderia, int edad) {
		String insercion = "INSERT INTO pilotos VALUES(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setInt(1, id);
			ps.setString(2, nom);
			ps.setString(3, coche);
			ps.setString(4, escuderia);
			ps.setInt(5, edad);
			ps.executeUpdate();
			ps.close();
			System.out.println("--Piloto insertado: "+id+" "+nom);
		} catch (SQLException e) {
			if(e.getErrorCode() == 19)
				System.err.println("Ese piloto ya existe en la base de datos");
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
	public void altaPuntua(int idp, int idc, int anio, float vel) {
		String insercion = "INSERT INTO puntua VALUES(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setInt(1, idp);
			ps.setInt(2, idc);
			ps.setInt(3, anio);
			ps.setFloat(4, vel);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			if(e.getErrorCode() == 19)
				System.err.println("Ese registro ya existe en la base de datos");
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
			if(e.getErrorCode() == 19)
				System.err.println("Clave primaria ya existe..");
			else
				e.printStackTrace();
		}
	}
	public void altaCircuito(int id, String nom) {
		String insercion = "INSERT INTO circuitos VALUES(?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setInt(1, id);
			ps.setString(2, nom);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			if(e.getErrorCode() == 19)
				System.err.println("Ese circuito ya existe en la base de datos");
			else
				e.printStackTrace();
		}
	}
	
	public void bajaCircuito(int id) {
		
		String borrado = "DELETE FROM circuitos WHERE idc = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(borrado);
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Error: "+e.getErrorCode());
			if(e.getErrorCode() == 19)
				System.err.println("Ese circuito ya existe en la base de datos");
			else
				e.printStackTrace();
		}
		
	}
	
	public void modificaCircuito(int id, String nom) {
		
		String borrado = "UPDATE circuitos SET circuito = ? WHERE idc = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(borrado);
			ps.setString(1, nom);
			ps.setInt(2, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Error: "+e.getErrorCode());
			if(e.getErrorCode() == 19)
				System.err.println("Ese circuito ya existe en la base de datos");
			else
				e.printStackTrace();
		}
	}
	
    public ResultSet ejecuta(String sql){
		
    	ResultSet rs = null;
		
		try {
			Statement sentencia = conn.createStatement();
			rs = sentencia.executeQuery(sql);
		}catch(SQLException e) {
			if(e.getErrorCode() == 1)
				System.out.println("Tabla no disponible: "+e.getSQLState());
			else
				e.printStackTrace();
		}
		return rs;
		//sentencia.close();
	}

	public DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
	    ResultSetMetaData metaData = rs.getMetaData();
	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);

	}

	public JComboBox cargaBoxTablas() {
		JComboBox j = new JComboBox(); 
		DatabaseMetaData md;
		
		j.addItem("Selecciona");
		try {
			md = conn.getMetaData();
			ResultSet rs = md.getTables(null, null, "%", null);
			while (rs.next()) {
			  //System.out.println(rs.getString(3));
			  j.addItem(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return j;
	}

	public JComboBox cargaId() {
		JComboBox j = new JComboBox(); 
		
		
		j.addItem("");
		try {
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery("SELECT idc FROM circuitos");
			
			while (rs.next()) {
			  //System.out.println(rs.getString(3));
			  j.addItem(rs.getInt(1));
			}
			sentencia.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return j;
	}

	public void cargaId(JComboBox j) {
		j.addItem("");
		try {
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery("SELECT idc FROM circuitos");
			
			while (rs.next()) {
			  //System.out.println(rs.getString(3));
			  j.addItem(rs.getInt(1));
			}
			sentencia.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargaBoxTablas(JComboBox j) {
DatabaseMetaData md;
		
		j.addItem("Selecciona");
		try {
			md = conn.getMetaData();
			ResultSet rs = md.getTables(null, null, "%", null);
			while (rs.next()) {
			  //System.out.println(rs.getString(3));
			  j.addItem(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String getItemId(int id) {
		String idc = "";
		try {
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery("SELECT circuito FROM circuitos WHERE idc = "+id);
			
			if (rs.next()) {
			  //System.out.println(rs.getString(3));
			  idc = rs.getString(1);
			}
			sentencia.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return idc;
	}


}
