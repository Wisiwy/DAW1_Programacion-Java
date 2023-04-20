package teoria_ClasesYObj_profe;

import java.util.Scanner;

public class Principal_persona {

	public static void main(String[] args) {
		// quiero crear una variable que sea "Persona"

		// los objetos necesitan un constructor "new" para poder inicializarse
		// guardar espacio de memoria para los datos de persona.
		Persona per1 = new Persona(); // Constructor es necesario

		// Crear vector para guardar personas 10.
		Persona[] lista = new Persona[10];
		// tenemos que llamar constructor para cada posicion
		lista[5] = new Persona("Raul", "Perez", 24);
		// en posicion 5 metermos esa persona
		lista[8] = new Persona(); // guardamos espacio en memoria luego lo metermos
		lista[8].setNombre("vicente");
		lista[8].setApellido("gimeneza");
		lista[8].setEdad(8);
		// metemos a vicente en la posicion 8 seteando las cosas 1 a 1

		// recorrer array
		System.out.println();
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null) //Quita los nulos
			System.out.println(lista[i]);// necesito definir toString para que salga
		}

		miMetodo(lista);
		// intro una nueva persona por t en la primera libre

	}
	/**
	 * Mete un objeto persona en el primer espacio vacio
	 * @param lista
	 */
	private static void miMetodo(Persona[] lista) {
		// Modificara el array. Insercciones en un array. 
		// Queremos definir una nueva Persona en el primer sitio libre
		boolean recogido = false;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) { // Ahora coge todos los vacios � Queremos solo el primero
				
				Scanner t = new Scanner(System.in);
				Persona p = new Persona();// creamos persona
				System.out.println("Nombre: ");
				p.setNombre(t.nextLine());
				System.out.println("Apellido: ");
				p.setApellido(t.nextLine());
				System.out.println("Nombre: ");
				p.setEdad(t.nextInt());
				//hacer que salga la primera vez que se mete
				recogido = true;
				//i = lista.length; // 2�forma:pasamos i al toda la lengh y salir del for
			}
		}
	}

}
