package H1_sencillos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej08 {
	public static void main(String[] args) {

		TreeMap<Integer, ArrayList<String>> coleccion = new TreeMap();
		String nombre;
		int nota = 0;
		do {
			Scanner sc = new Scanner(System.in);

			System.out.print("Nombre: ");
			nombre = sc.nextLine();

			if (nombre.compareTo("*") != 0) {

				System.out.print("Nota: ");
				nota = sc.nextInt();
				
				//inserción en la coleccion!!
				ArrayList<String> aux;
				if(coleccion.containsKey(nota)) { //si existe la clave
					aux = coleccion.get(nota);   //recojo el dato asociado
					//ArrayList<String> aux = coleccion.get(nota);
					//aux.add(nombre);
					//coleccion.put(nota, aux);
				}else {
					aux = new ArrayList();
					//ArrayList<String> aux = new ArrayList();
	 				//aux.add(nombre);
					//coleccion.put(nota, aux);
				}
				aux.add(nombre);
				coleccion.put(nota, aux);
			}

		} while (nombre.compareTo("*") != 0);

		// System.out.println(coleccion);
		//coleccion.forEach((a, b) -> System.out.printf("Clave: %d Valor: "+b+" \n", a));
	
		Iterator<Integer> it = coleccion.keySet().iterator();
		while(it.hasNext()) {
			Integer clave = it.next();
			ArrayList<String> dato = coleccion.get(clave);
			
			//ordenar
			dato.sort(null);
			
			System.out.println("Nota: "+clave+" valor: "+dato);
			
			
		}
		
		
		
		
		
		
	}
}
