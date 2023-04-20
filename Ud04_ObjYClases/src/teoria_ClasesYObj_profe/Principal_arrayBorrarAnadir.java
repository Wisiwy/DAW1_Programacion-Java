package teoria_ClasesYObj_profe;

import java.util.Scanner;

import aUtilidad.Dibujo;
import aUtilidad.Leer;



public class Principal_arrayBorrarAnadir {
	public static void main(String[] args) {
		String[] menu = { "Anadir persona", "Borrar persona", "Listar Persona" };
		int opt = Dibujo.menu(menu);

		// Creamos la lista
		Persona[] lista = new Persona[10];
		carga(lista);
		do {
			opt = Dibujo.menu(menu);
			if (opt == 1) {
				anadir(lista);
			} else if (opt == 2) {
				borrar(lista);
			} else if (opt == 3) {
				listar(lista);
			} else if (opt != 0) {
				System.err.println("Opcion no valida.");
			}

		} while (opt != 0);// para para si es 0 sale del menu

	}

	private static void anadir(Persona[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) { // Ahora coge todos los vacios. Queremos solo el primero.
				Scanner t = new Scanner(System.in);
				Persona aux = new Persona();// creamos persona
				System.out.println("Nombre: ");
				aux.setNombre(t.nextLine());
				System.out.println("Apellido: ");
				aux.setApellido(t.nextLine());
				System.out.println("Nombre: ");
				aux.setEdad(t.nextInt());

				lista[i] = aux;
				// hacer que salga la primera vez que se mete
				i = lista.length; // pasamos a "i" lista.lengh y sale del for
			}
		}
	}

	private static void borrar(Persona[] lista) {
		//Queremos un listado de lo que hay en el array y me pregunte cual quiero borrar
		System.out.println();
		listar(lista);
		int opt = Leer.leerInt("Borrar: ");
		lista[opt] = null;
	}

	public static void listar(Persona[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) // Quita los nulos
				System.out.println(i + " -- " + lista[i]); // Indica que hay en la posicion actual
		}
	}

	public static void carga(Persona[] lista) { // Cargamos varias personas al array
		lista[0] = new Persona("Gabi", "Alonso", 22);
		lista[1] = new Persona("David", "Alonso", 27);
		lista[6] = new Persona("Raquel", "Alonso", 24);
		lista[4] = new Persona("Fernando", "Gomez", 22);
	}

}
