package teoria_ClasesYObj_profe;

import java.util.Arrays;
import java.util.Comparator;

public class Principal_order {

	public static void main(String[] args) {

		Persona[] lista = new Persona[5];

		lista[0] = new Persona("Oscar", "Gutierrez", 23);
		lista[1] = new Persona("Alejandro", "Perez", 27);
		lista[2] = new Persona("Luis", "Gutierrez", 24);
		lista[3] = new Persona("Alejandro", "Perez", 20);
		lista[4] = new Persona("Luis", "Perez", 24);

//		-------Mostrar contenido
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

//		--------Ordenar por edad <COMPARATOR>		

		// definir comparator para el Array.sort - que compare la edad de "a" con la
		// edad de "b"
		Comparator<Persona> cEdad = (a, b) -> a.getEdad() - b.getEdad();
		Arrays.sort(lista, cEdad);
		System.out.println();
		// mostrar el contenido
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		// cEdad.reverse : cambia el orden

//		--------Ordenar por nombre y apellido <COMPARATOR>		

		// Creamos un comparator y entre <> le decimos que comprar "personas".
		Comparator<Persona> cApp = (a, b) -> a.getApellido().compareTo(b.getApellido());
		Comparator<Persona> cNom = (a, b) -> a.getNombre().compareTo(b.getNombre());

		// Define una persona "a" y "b", se comparan de la manera indicada.

//		.thenComparing: compara por apellido y en caso de igualdad compara por (cNom)
		Arrays.sort(lista, cApp.thenComparing(cNom));
//		Anidados:Arrays.sort(lista, cApp.thenComparing(cNom.thenComparing(cEdad)));

		Principal_arrayBorrarAnadir.listar(lista);
		System.out.println();
		// mostrar el contenido
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

	}
}
