package otros_ejer02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lista {

	public static void main(String[] args) {
//		SET: Es como una bolsa los mete. Los ordena con el hashCode. No tienen una posición determinada.  

		List<String> list1 = new ArrayList();

		list1.add("Lunes");
		list1.add("Martes");
		list1.add("Miercoles");
		list1.add("Jueves");
		list1.add("Viernes");
		list1.add("Sabado");
		list1.add("Domingo");
		for (String string : list1) {
			System.out.println(string);
		}

		System.out.println();
		list1.add(4, "Juernes");

		for (String string : list1) {
			System.out.println(string);
		}
		//Se puede sisoear directamente tiene un toString especificacdo
		System.out.println(list1);

		System.out.println();
		//Le paso en el constructor la lista1 lo copia.
		List<String> list2 = new ArrayList<String>(list1);

		for (String string : list2) {
			System.out.println(string);
		}
		list1.addAll(list2);
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println();
		//Mostrar posicion 3 y 4
		System.out.println(list1.get(3)+"-"+list1.get(4));
		System.out.println();
//		ESOS METODOS SOLO SIRVEN SI ES LINKED LIST
//		System.out.println("Primero: " + list1.getLast());
//		System.out.println("Ultimo: " + list1.getFirst());
		System.out.println();
		//Eliminar 
		if (!list1.remove("Juernes"))
			System.out.println("NO");
		else
			System.out.println("BORRADO");
		
		System.out.println("ITERATOR");
		System.out.println();
		Iterator<String> it = list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Buscar elemento");
		if(list1.contains("Lunes".toUpperCase()))
			System.out.println("Encontrado");
		else
			System.out.println("NO Encontrado");
		
		
		//*********ORDENAR LISTA: COMPARATOR Y COMPARTE TO
		System.out.println();
		System.out.println("Ordenar");
		
		//Por que poner null. Si la clase que vamos a ordenar implementa la interfaz comparable
//		se ordena con el parametro definido en la clase, en este caso, STRING. 
		list1.sort(null);
		//Definir un comparator.
		
		
//		Notacion landa definimos 2 obj (a,b) seran del tipo string porque el comparador es de ese tipo 
//		-> le ponemos la regla. El comparador devuelve un numero (0, posit, nega) en funcion d num ordeno
		Comparator<String> comp = (a,b) -> a.length()-b.length(); //esto devuelve (0,posi,nega)
		Comparator<String> compAZ = (a,b) -> a.compareTo(b); //c
		Comparator<String> compZA = (a,b) -> b.compareTo(a); //comparador orden inverso
		//COmparteTo ordena de mator a mento
		
		list1.sort(comp); //usa (0,posi,nega) para usar metodo burbuja.
		list1.sort(comp.thenComparing(compZA)); //compara por comp y luego por el siguiente comparador
		
		for (String string : list1) {
			System.out.println(string);
		}
		
		System.out.println();
		System.out.println("Clear");
		list1.clear();
		
		System.out.println("Buscar elemento");
		if(list1.contains("Lunes"))
			System.out.println("Encontrado");
		else
			System.out.println("NO Encontrado");
		
	}
		
}
