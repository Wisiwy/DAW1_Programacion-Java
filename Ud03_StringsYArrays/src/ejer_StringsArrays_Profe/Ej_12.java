package ejer_StringsArrays_Profe;

import java.util.Scanner;

public class Ej_12 {
	
	public static void main(String[] args) {
		//12.	Hacer un programa que pida dos nombres y te diga si 
		//son iguales.  Si son distintos los muestra ordenados.  
		//Finalmente muestra los dos nombres en may�sculas y 
		//en min�sculas.
		
		Scanner teclado = new Scanner(System.in);
	
		
		System.out.print("Nombre1: ");
		String n1 = teclado.nextLine();
		//System.out.println(n1);
		
		System.out.print("Nombre2: ");
		String n2 = teclado.nextLine();
		//System.out.println(n2);
		
		if(n1.compareToIgnoreCase(n2) == 0) {
			System.out.println("Son iguales.");
		}else {
			System.out.println("Son diferentes.");
			
			if(n1.compareTo(n2) > 0) {
				System.out.println(n2+", "+n1);
			} else {
				System.out.println(n1+", "+n2);
			}
		}
		
		//n1 = n1.toLowerCase();
		System.out.println("Minusculas: "+n1.toLowerCase()+", "+n2.toLowerCase() );
		System.out.println("Mayusculas: "+n1.toUpperCase()+", "+n2.toUpperCase() );


	}

}
