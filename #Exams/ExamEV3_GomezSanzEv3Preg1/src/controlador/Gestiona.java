package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class Gestiona {
	private Connection conn;

	public Gestiona(Connection conn) {

		this.conn = conn;
	}

	public void altaRuta(List<String> strList) {
		String insercion = "INSERT INTO rutas VALUES(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(insercion);
			ps.setInt(1, Integer.parseInt(strList.get(0)));
			ps.setString(2, strList.get(1));
			ps.setString(3, strList.get(2));
			ps.setString(4, strList.get(3));
			ps.setFloat(5, Float.parseFloat(strList.get(4).split(" ")[0]));
			ps.setFloat(6, Float.parseFloat(strList.get(5).split(" ")[0]));
			ps.setInt(7, Integer.parseInt(strList.get(0).split(" ")[0].replace(".", "")));
			ps.setInt(8, Integer.parseInt(strList.get(0).split(" ")[0].replace(".", "")));

			ps.executeUpdate();
			ps.close();
			System.out.println("Ruta insertado: " + strList.get(0) + " nombre: " + strList.get(1));

		} catch (SQLException e) {
			if (e.getErrorCode() == 19)
				System.err.println("Ruta existente");
			else
				e.printStackTrace();
		}

	}

	public void bajaRuta(int id) {
		String delete = "DELETE FROM rutas WHERE id = ?";

		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(delete);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Ruta " + id + " borrado correctamente.");
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void modificaKm(int id, float newData) {
		String delete = "UPDATE rutas SET distancia WHERE id = ?";
		String sql = "UPDATE rutas SET distancia = " + newData + " WHERE id = " + id;

		// sentnecia
		try {

			Statement senten = conn.createStatement();

			int row = senten.executeUpdate(sql);
			System.out.println("Km de fila nº " + row + " modificado correctamente. ");
			senten.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void listado() {

		ArrayList<Usuario> usuarios;
		try {
			// creamos list Usuarios con sus nombres
			usuarios = creaListUsers();
			// recorremos las rutas por cada usuario y recogemos distancia
			addDist(usuarios);
			addAscen(usuarios);

			pintarListado(usuarios);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void pintarListado(ArrayList<Usuario> usuarios) {
		String cabecera = "|Usuario | Km recorridos| Desnivel";
		System.out.println(cabecera);
		System.out.println("-----------------------------------------");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

	}

	private void addAscen(ArrayList<Usuario> usuarios) throws SQLException {
		ResultSet rs;
		String qr;
		for (Usuario usuario : usuarios) {
			qr = "SELECT id_ruta FROM realiza WHERE nombre = '" + usuario.getNom() + "';";
			rs = personalizeQr(qr);
			// recogemos km de cada ruta recorrida por el usuario.
			Integer ascensoTotal = 0;
			//rs con rutas
			while (rs.next()) {
				ResultSet rsAux;
				qr = "SELECT ascenso FROM rutas WHERE id = " + rs.getInt(1) + ";";
				rsAux = personalizeQr(qr);
				// rs con km por ruta
				while (rsAux.next()) {
					ascensoTotal += rsAux.getInt(1);
				}
			}
			usuario.setAscensoTotal(ascensoTotal);
			ascensoTotal = 0;

		}
	}

	private void addDist(ArrayList<Usuario> usuarios) throws SQLException {
		ResultSet rs;
		String qr;
		for (Usuario usuario : usuarios) {
			qr = "SELECT id_ruta FROM realiza WHERE nombre = '" + usuario.getNom() + "';";
			rs = personalizeQr(qr);
			// recogemos km de cada ruta recorrida por el usuario.
			float distTotal = 0;
			while (rs.next()) {
				ResultSet rsAux;
				qr = "SELECT distancia FROM rutas WHERE id = " + rs.getInt(1) + ";";
				rsAux = personalizeQr(qr);
				// sumamos los km
				while (rsAux.next()) {
					distTotal += rsAux.getFloat(1);
				}
			}
			usuario.setDistTotal(distTotal);
			distTotal=0;
		}
	}

	private ArrayList<Usuario> creaListUsers() throws SQLException {
		ArrayList<Usuario> usuarios = new ArrayList();
		ResultSet rs;
		// selecionamos nombres de usuarios
		String qr = "SELECT nombre FROM usuario;";

		rs = personalizeQr(qr);

		while (rs.next()) {
			String nom = rs.getString(1);
			System.out.println(nom);
			Usuario aux = new Usuario(nom);
//			if (usuarios.size()> 0) {
//				System.out.println("entro lista usuarios mayor 0");
//				for (Usuario usuario : usuarios) {
//					if (usuario.getNom().compareTo(nom) != 0) {
//						usuarios.add(aux);
//					}
//				}
//			}else {}
				
				usuarios.add(aux);
				
			
//			for (Usuario usuario : usuarios) {
//				System.out.println(usuario);
//			}
		}
	return usuarios;

	}

	public ResultSet personalizeQr(String qr) throws SQLException {

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(qr);
		return rs;
	}

}
