package Ejercicios;

import java.util.Scanner;

public class Ejercicio17_nTriangulares {
//	Se definen los números triangulares como los obtenidos de 
//	sumar los números naturales sucesivos 1, 2, 3 … Es decir, 
//	los primeros números triangulares son 1, 3, 6, 10, etc. 
//	Escriba un programa que muestre los N primeros números triangulares.
	public static void main(String[] args) {
		System.out.println("*******CALCULADORA Nº TRIANGULARES******");
		System.out.println("----------------------------------------");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos nº triangulares quieres calcular: ");
		int num = teclado.nextInt();
		int tri = 0;
//		System.out.println("Tu numero triangular es: " + tri);
		for (int i = 1; i <= num; i++) {
			tri = tri + i;
			System.out.println("Tu numero triangular es: " + tri);			
		}
		
		
		
	teclado.close();	
	}

}
