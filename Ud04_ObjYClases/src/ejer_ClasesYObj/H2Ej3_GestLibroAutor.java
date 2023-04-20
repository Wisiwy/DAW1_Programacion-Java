package ejer_ClasesYObj;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class H2Ej3_GestLibroAutor {

//	-------------------VECTORES DE OBJ: autor y libro--------------
	static Libro[] libros = new Libro[100];
	static Autor[] autores = new Autor[100];
	static Autor autaux = new Autor();

//	-------------------DIBUJAR MENU--------------
	public static void main(String[] args) {

		String[] opc = { "Crear libros.", "Crear autor.", "Modificar autor.", "Modificar libro.", "Listado de libros",
				"Listado de autores" };
		boolean menu = true;
		do {

			Dibujo.titulo("LIBRERIA RAULES2");
			int om = Dibujo.menu(opc);

			if (om == 1) {
				 crearLibro(elegirAutor(autores));
//-------------------CREAR AUTOR
			} else if (om == 2) {
				 crearAutor();				
//-------------------MODIFICAR AUTOR
			} else if (om == 3) {
				Dibujo.titulo("MODIFICAR AUTOR");

				visualizarAutor(autores);
				int aux = Leer.leerInt("Que autor quieres modificar?");
				modificarAutor(autores[aux - 1]);

//-------------------MODIFICAR LIBRO
			} else if (om == 4) {
				Dibujo.titulo("MODIFICAR LIBRO");
				visualizarLibros(libros);
				int aux = Leer.leerInt("Que libro quieres modificar?");
				modificarLibro(libros[aux - 1]);
			} else if (om == 5) {
				visualizarLibros(libros);

			} else if (om == 6) {
				visualizarAutor(autores);

			} else if (om == 0) {
				menu = false;
			} else
				System.err.println("Error. Dato no valido");
		}while(menu==true);

	}

	private static Autor elegirAutor(Autor[] autores) {
		System.out.println("Eliga autor del libro: ");
		visualizarAutor(autores);
		System.out.println("0 - Crear autor. ");
		int pos = Leer.leerInt("Pos: ");
		// Mando crear autor
		if (pos == 0) {
			autaux = crearAutor();
		} else {
			// relleno con el autor de la lista elegido
			if (autores[pos - 1] != null)
				autaux = autores[pos - 1];
		}
		return autaux;
	}

	private static void modificarLibro(Libro libro) {
		String[] opc = { "Modificar titulo", "Modificar autor", "Modificar precio", "Modificar cantidad" };
		int o = Dibujo.menu(opc);

		switch (o) {
		case 1:
			libro.setTitulo(Leer.leerString("Nuevo titulo: "));
			break;
		case 2:
			autaux = elegirAutor(autores);
			libro.setAutor(autaux);
			break;
		case 3:
			libro.setPrecio(Leer.leerDouble("Nuevo precio: "));
			break;
		case 4:
			libro.setCantidad(Leer.leerInt("Nueva cantidad"));
		}
	}

	private static void modificarAutor(Autor autor) {
		String[] opc = { "Modificar nombre", "Modificar emailt", "Modificar genero" };
		int o = Dibujo.menu(opc);

		switch (o) {
		case 1:
			autor.setNombre(Leer.leerString("Nuevo nombre: "));
			break;
		case 2:
			autor.setEmail(Leer.leerString("Nuevo Email: "));
			break;
		case 3:

			String gen;
			do {
				gen = Leer.leerString("Nuevo genero autor (m/f): ");
				if (gen.charAt(0) != 'f' && gen.charAt(0) != 'm')

					System.err.println("Intro genero (m/f)");
			} while (gen.charAt(0) != 'f' && gen.charAt(0) != 'm');
			autor.setGenero(gen);
			break;
		}
	}

	private static Libro crearLibro(Autor autaux) {
		Dibujo.titulo("CREAR LIBRO");
		String tit = Leer.leerString("Intro titulo libro: ");
		Double pre = Leer.leerDouble("Intro precio libro: ");
		Libro lib = new Libro(tit, autaux, pre);
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libros[i] =lib;
				System.out.printf("Nuevo libro:%n %s", libros[i]);
				i = libros.length;
			}
		}
		return lib;
	}

	private static Autor crearAutor() {
		Dibujo.titulo("CREAR AUTOR");
		String nom = Leer.leerString("Nombre autor: ");
		String mail = Leer.leerString("Mail autor: ");
		String gen = "";
		gen = Leer.leerString("Genero autor (m/f): ");
//		char c;
//		do {
//			gen = Leer.leerString("Genero autor (m/f): ");
//			System.out.println(gen);
//			c = gen.charAt(0);
//			if (c != 'f' && c != 'm')
//				System.err.println("Intro genero (m/f)");
//		} while (c != 'f' && c != 'm');

		Autor aut = new Autor(nom, mail, gen);

		
		for (int i = 0; i < autores.length; i++) {
			if (autores[i] == null) {
				autores[i] = aut;
				System.out.println("Nuevo" + autores[i]);
				i = autores.length;
			}
		}
		
		return aut;
	}

	private static void visualizarAutor(Autor[] autores) {
		for (int i = 0; i < autores.length; i++) {
			if (autores[i] != null) {
				System.out.printf("%3d - %s \n", (i + 1), autores[i].toString());
			}
		}

	}

	private static void visualizarLibros(Libro[] libros) {
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null) {
				System.out.printf("%3d - %s \n", (i + 1), libros[i].toString());
			}
		}

	}

}
