package LibroAutor;

import Estaticos.Leer;
import Menu.Utilidad;
import OBJETOS.TragaBolas;

public class Principal {

	public static void main(String[] args) {

		boolean menu = true;
		String[] s = { "Crear Libro", "Crear autor", "Modificar libro", "Modificar autor", "Listado Libros",
				"Listado Autor" };

		Libro[] libros = new Libro[100];
		Autor[] autores = new Autor[100];

		do {

			int o = Utilidad.menu(s);

			if (o == 1) {
				// crear libro
				mostrar(autores);
				System.out.println(" 00 - CREAR NUEVO");

				int pos = Leer.leerEntero("Pos: ");
				Autor nuevoAutor = null;

				if (pos == 0) {
					// crear autor

					String nombre = Leer.leerCadena("Nombre: ");
					String email = Leer.leerCadena("email: ");
					String genero = Leer.leerCadena("genero(m/f): ");

					nuevoAutor = new Autor(nombre, email, genero);
					insertarAutor(nuevoAutor, autores);
				} else {
					// eleginos el autor
					if (autores[pos - 1] != null)
						nuevoAutor = autores[pos - 1];
				}

				String titulo = Leer.leerCadena("Título: ");
				Double precio = Leer.leerDouble("Precio: ");

				Libro miLibro = new Libro(titulo, nuevoAutor, precio);
				insertarLibro(miLibro, libros);

			} else if (o == 2) {
				// crear autor

				Autor nuevoAutor = null;

				// crear autor

				String nombre = Leer.leerCadena("Nombre: ");
				String email = Leer.leerCadena("email: ");
				String genero = Leer.leerCadena("genero(m/f): ");

				nuevoAutor = new Autor(nombre, email, genero);
				insertarAutor(nuevoAutor, autores);

			} else if (o == 3) {
			} else if (o == 4) {
			} else if (o == 5) {
				mostrarLibros(libros);
			} else if (o == 6) {
				mostrar(autores);
			} else if (o == 0) {
				menu = false;
			} else {
				System.err.println("Error. dato no valido.");
			}

		} while (menu == true);

		System.out.println("Salgo del programa.");
	}

	private static void mostrar(Autor[] autores) {

		for (int i = 0; i < autores.length; i++) {
			if (autores[i] != null)
				System.out.printf(" %2d - %-15s  %-15s \n", (i + 1), autores[i].getNombre(), autores[i].getEmail());
		}

	}
	
	private static void mostrarLibros(Libro[] libros) {

		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null)
				System.out.printf(" %2d - %-15s  %s \n", (i + 1), libros[i].getTitulo(), libros[i].getAutor().toString());
		}

	}

	private static void insertarAutor(Autor nuevoAutor, Autor[] autores) {

		for (int i = 0; i < autores.length; i++) {
			if (autores[i] == null) {
				autores[i] = nuevoAutor;
				i = autores.length;
			}
		}
	}

	private static void insertarLibro(Libro miLibro, Libro[] libros) {
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libros[i] = miLibro;
				i = libros.length;
			}
		}

	}
}
