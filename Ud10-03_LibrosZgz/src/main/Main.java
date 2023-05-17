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
		File f = new File("librosZgz.db");

////----------------------------------------------------------------------------
		// Si el archivo existe
		if (!f.exists()) {
			try {
				// crear fichero
				f.createNewFile();
				// crear conexion
				Connection conn = DriverManager.getConnection("jdbc:sqlite:" + f.getAbsolutePath());
				System.out.println("Conexion establecida!!");
				System.out.println();
////----------------------------------------------------------------------------
				// CREACION CLASE CREATE Y ESQUEMA TABLA LIBROS
				CreateDB create = new CreateDB(conn);
				// comprueba si existe la tabla
				String nombreTabla = "libros";
				// comprueba si existe libros y lo borra en cado de que exista
				if (create.tablaExists(nombreTabla))
					create.dropTable(nombreTabla);
				create.createTableLibros(nombreTabla);
				System.out.println("Tabla" + nombreTabla + "creada.");
				System.out.println();

				//
////----------------------------------------------------------------------------
////		// TEST : PROBAR CON UNA CLASE LIBRO. Con la clase CONTROL.
				ControlDB control = new ControlDB(conn);

////				Libro libroAux = new Libro(12, "titulo", "autortest", 1991, "estudios", "biblioteca", "editorialtest",
////						"isbn 1231", 345, "a apartir de 12 anyos", "biblioteca guay", "12/12/12");
////				
				// insertar libro
////				control.insertLibro(libroAux);
////				control.selectTabla("libros");

////				//update libro
////				control.updateTabla(12, nombreTabla, "autor");	
////				control.selectTabla("libros");
////				
				// borrar libro
////				control.borrarLibro(12);
////				control.selectTabla("libros");	
////----------------------------------------------------------------------------
//			//leer CSV 
				control.cargarExcelCsv(new File("LibrosZaragoza2.csv"));
				// dibujamos la tabla en consolla
				control.selectTabla(control.selectTableRS("libros"));

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
		} else {
			//SI .BD NO EXISTE
			// conectamos y creamos una clase control
			try {

				// lanzar Windows Builder
				VenPrincipal frame = new VenPrincipal(f);
				frame.setVisible(true);

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

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
