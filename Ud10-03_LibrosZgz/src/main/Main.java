package main;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.Date;

import aUtilidad.Input;
import aUtilidad.Leer;
import controlador.ControlDB;
import controlador.CreateDB;
import modelo.Libro;
import vista.VenPrincipal;

public class Main {
	public static void main(String[] args) {
////----------------------------------------------------------------------------
		// crear conexion
		try {
			File f = new File("librosZgz.db");
			f.delete();
			if (!f.exists())
				f.createNewFile();
			Connection conn = DriverManager.getConnection("jdbc:sqlite:" + f.getAbsolutePath());
			System.out.println("Conexion establecida!!");

////----------------------------------------------------------------------------
			// creamos DB y su tabla libro
			CreateDB create = new CreateDB(conn);
			// tabla
			String nombreTabla = "libros";
			if (create.tablaExists(nombreTabla)) // comprueba si existe la tabla
				create.dropTable(nombreTabla);
			create.createTableLibros(nombreTabla);
			System.out.println("Tabla" + nombreTabla + "creada.");
			System.out.println();
			
////----------------------------------------------------------------------------
//			// manejaDB para meter un ejemplo de libro
			ControlDB control = new ControlDB(conn);
//
////				// TEST : PROBAR CON UNA CLASE LIBRO
////				Libro libroAux = new Libro(12, "titulo", "autortest", 1991, "estudios", "biblioteca", "editorialtest",
////						"isbn 1231", 345, "a apartir de 12 anyos", "biblioteca guay", "12/12/12");
////				//insertar libro
////				control.insertLibro(libroAux);
////				control.selectTabla("libros");
////				//update libro
////				control.updateTabla(12, nombreTabla, "autor");	
////				control.selectTabla("libros");
////				//borrar libro
////				control.borrarLibro(12);
////				control.selectTabla("libros");
//			
////----------------------------------------------------------------------------
//			//leer CSV 
//				control.cargarExcelCsv(new File ("LibrosZaragoza2.csv"));
//				control.selectTabla("libros");
//				conn.close();
//				control.cerrarConn();
				
			//lanzar Windows Builder
				try {
					VenPrincipal frame = new VenPrincipal(control);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}	

	private static Libro creaLibro() {
		Libro aux = new Libro();
		System.out.println("-----------------NUEVO LIBRO--------------");
		aux.setNum(Leer.leerInt("Id Libro: ")); // Fin mejor que te lea el id ultimo y le sume uno
		aux.setTitulo(Leer.leerString("Titulo: "));
		aux.setAutor(Leer.leerString("Autor: "));
		aux.setAnyo(Leer.leerIntPosi("Anyo: "));
		aux.setTematica(Leer.leerString("Tematica: "));
		aux.setEditorial(Leer.leerString("Editorial: "));
		aux.setIsbn(Leer.leerString("ISBN: "));
		aux.setUbicacion(Leer.leerString("Ubicacion: "));
		aux.setPaginas(Leer.leerIntPosi("Paginas: "));
		aux.setEdad(Leer.leerString("Edad: "));
		aux.setObservaciones(Leer.leerString("Observaciones: "));
		aux.setFechaAdquisicion(Leer.leerString("Fecha adquisición(dd/MM/yy) : "));

		// MOVIDA CON LA CLASE DATE
		// boolean fecha = false;
//		do {
//			try {
//				aux.setFechaAdquisicion(Leer.leerString("Fecha adquisición(dd/MM/yy) : "));
//				fecha = true;
//			} catch (ParseException e) {
//				System.err.println("Error formato fecha. Recuerda dd/mm/yy: ");
//			}
//
//		} while (!fecha);

		return aux;
	}

}
