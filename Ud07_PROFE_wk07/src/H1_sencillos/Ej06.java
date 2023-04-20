package H1_sencillos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ej06 {

	public static void main(String[] args) {
		
		TreeSet<String> coleccion= new TreeSet();
		Scanner t =  new Scanner(System.in);
		boolean leer = true;
		
		do {
			System.out.println("Introduce una palabra ");
			String str = t.nextLine();
			
			if (str.compareTo("*")==0) {
				leer = false;
				
			} else {
				coleccion.add(str);
			}
			
			
		} while (leer);
		
		System.out.println("Dime un numero entero ");
		int num = t.nextInt();
		
		if (num < 0 || num > coleccion.size()) {
			System.out.println("El numero no es valido ");
			
		} else {
			/*Iterator<String> it = coleccion.iterator();
			int cont = 0;
			 while (it.hasNext() && cont < num ) {
				 cont ++;
				String string = (String) it.next();
				
				System.out.println(string);
			
			}*/
			ArrayList<String> aux = new ArrayList(coleccion);
			for (int i = 0; i < num; i++) {
				
				System.out.println(aux.get(i));
				
			}
			
		}

	}
}
