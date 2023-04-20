package H1_sencillos;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejer07 {
	/*
	 * TreemapNotasAlumnosPorApellido Escribe un programa en Java que:  Pida el
	 * apellido (se supone que no se repiten) y la calificación obtenida por un
	 * alumno. La entrada de datos terminará cuando se introduzca como apellido “*”.
	 *  Muestre un listado por orden alfabético de los datos de cada alumno.
	 */

	public static void main(String[] args) {
		TreeMap<String, Integer> coleccion = new TreeMap();
		String nombre;
		int nota=0;
		do {
			Scanner sc = new Scanner(System.in);

			System.out.print("Nombre: ");
			nombre = sc.nextLine();

			if (nombre.compareTo("*") != 0) {
			
				System.out.print("Nota: ");
				nota = sc.nextInt();
				coleccion.put(nombre, nota);
			}

		} while (nombre.compareTo("*") != 0);
		
		//System.out.println(coleccion);
		coleccion.forEach((a,b)->System.out.printf("Clave: %s Valor: %d \n",a,b));
		
	}

}
