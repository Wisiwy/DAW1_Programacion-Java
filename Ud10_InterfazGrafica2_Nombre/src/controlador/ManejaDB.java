package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Contacto;

public class ManejaDB {
	
	private Connection conn;
	
	public ManejaDB (Connection c) {
		this.conn = c;
		
	}
	
	public void cerrar() throws SQLException {
		conn.close();
	}
	
	
	public void altaContacto (Contacto alta) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO agenda VALUES(?,?,?)");
		ps.setString(1, alta.getNom());
		ps.setString(2, alta.getApe());
		ps.setInt(3, alta.getTlfn());
		ps.executeUpdate();
	}
	/**
	 * muestra el resulstado de una selección
	 * @throws SQLException
	 */
	public String verSelect(String sql) throws SQLException {
		Statement senten = conn.createStatement();
		ResultSet rs = senten.executeQuery(sql);
		String select = null;
		while (rs.next()) {
			System.out.printf("%12s %12s  %9s \n",rs.getString(1),rs.getString(2),rs.getInt(3));
			select+=String.format("%12s %12s  %9s \n",rs.getString(1),rs.getString(2),rs.getInt(3));	
		}
		senten.close();
		return select;
	}

}
