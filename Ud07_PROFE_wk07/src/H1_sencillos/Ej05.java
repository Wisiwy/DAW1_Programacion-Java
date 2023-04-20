package H1_sencillos;

import java.util.Scanner;
import java.util.TreeSet;

public class Ej05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		TreeSet<Integer> coleccion= new TreeSet();
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Introduce números enteros al azar");
						
			int num = teclado.nextInt();
			
			coleccion.add(num);
		}
		
		int num;
		
		do {
			System.out.println("Introduce números enteros al azar (pista: usa el -9999):");
			
			num = teclado.nextInt();
			
			coleccion.add(num);
		}while(num != -9999);
		
		System.out.println("Los números que has introducido han sido: "+coleccion);
		
		for (Integer lol : coleccion) {
			if (coleccion.first()==lol)
				System.out.print(lol);
			else
				System.out.print(", "+lol);
		}
		
	}

}
