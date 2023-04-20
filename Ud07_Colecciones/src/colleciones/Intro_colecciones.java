package colleciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Intro_colecciones {

	public static void main(String[] args) {
//		 +++++++++++++++++++++++++++++++++++++++++++++++++++++
//								ARRAY LIST
		
		List aEdad = new ArrayList();
//		Metodos añadir datos a la coleccion
		aEdad.add(1);
		aEdad.add(3);
		aEdad.add(4);
		aEdad.add(7);

//		Añadir y Colocar en una posicion determinada
		aEdad.add(2, 9);

//		Recorremos en vector, 
		for (int i = 0; i < aEdad.size(); i++) {
			System.out.println(aEdad.get(i));
		}
		System.out.println(aEdad);
//		 +++++++++++++++++++++++++++++++++++++++++++++++++++++
//												LINKED LIST
//		Guarda hashCode no el objeto en si. 
		List aEdad2 = new LinkedList();
		aEdad2.add("Valor");
		aEdad2.add("Corazon");
		aEdad2.add(23);
		aEdad2.add("Valentia");
		aEdad2.add("Vitalidad");
		aEdad.remove(0); // borra en posición 0 
		System.out.println(aEdad2);
		

		
		
//		 +++++++++++++++++++++++++++++++++++++++++++++++++++++
//													SET 
//		Es como una bolsa los mete. Los ordena con el hashCode. No tienen una posición determinada.  
		Set aEdad3 = new HashSet();
		aEdad3.add(2);
		aEdad3.add(3);
		aEdad3.add(1);
		aEdad3.add(51);
		aEdad3.add(12);
		
		Iterator <Integer> it = aEdad3.iterator();
//		HasNext tenga siguiente
		while (it.hasNext()) {
//			System.out.println(it.next());
			int j = it.next();
			System.out.println(j);
		}
		
		
		
	}

}
