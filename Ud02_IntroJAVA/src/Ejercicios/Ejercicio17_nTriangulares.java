package Ejercicios;

import java.util.Scanner;

public class Ejercicio17_nTriangulares {
//	Se definen los n�meros triangulares como los obtenidos de 
//	sumar los n�meros naturales sucesivos 1, 2, 3 � Es decir, 
//	los primeros n�meros triangulares son 1, 3, 6, 10, etc. 
//	Escriba un programa que muestre los N primeros n�meros triangulares.
	public static void main(String[] args) {
		System.out.println("*******CALCULADORA N� TRIANGULARES******");
		System.out.println("----------------------------------------");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos n� triangulares quieres calcular: ");
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
