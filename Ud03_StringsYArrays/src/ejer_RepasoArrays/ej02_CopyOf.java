package ejer_RepasoArrays;

import java.util.Arrays;

import aUTILIDAD.Leer;

public class ej02_CopyOf {

	public static void main(String[] args) {
		int[] vect1 = new int[10];
		int[] vect2 = new int[10];
		int[] vect3 = new int[10];
		
		//relleno random
		Arrays.setAll(vect1, i -> (int) (Math.random()*20));
//		relleno teclado
		for (int i = 0; i < vect2.length; i++) {
			vect2[i] = Leer.leerInt("Rellena vect [" + (i+1) + "]: ");
		}
//		sumar vect 1 + vect 2
		for (int i = 0; i < vect3.length; i++) {
			vect3[i] = vect1[i] + vect2[i];
		}
//		imprimir vect3
		
		
		
		System.out.print("Vect3: ");
		for (int i = 0; i < vect3.length; i++) 
			System.out.print(vect3[i] + ", ");
		System.out.println();
		
//		ordenar e imprimir
		Arrays.sort(vect3);
		System.out.println("--------Ordenado----------");
		System.out.print("Vect3: ");
		
				
		for (int i = 0; i < vect3.length; i++) 
			System.out.print(vect3[i] + ", ");
		System.out.println();
		System.out.println();
		
		
	
	}

}
