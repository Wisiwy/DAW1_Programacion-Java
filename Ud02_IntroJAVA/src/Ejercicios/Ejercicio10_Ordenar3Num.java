package Ejercicios;

import java.util.Scanner;

public class Ejercicio10_Ordenar3Num {

	public static void main(String[] args) {
		System.out.println("************ORDENADOR DE 3 NUMEROS************");

		Scanner teclado = new Scanner (System.in);
		int a, b, c, aux;
		System.out.println("Introduce 3 numeros para ordenar: ");
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		aux = 0;
		
		//Ordenar
		if (a>b) {
			aux = a;
			a = b;
			b = aux;
			if (a>c) {
				aux = a;
				a = c;
				c = aux;
			}			
		} else {
			if (a>c) {
				aux = a;
				a = c;
				c = aux;		
			}
		}
		if (b>c) {
			aux = b;
			b = c;
			c = aux;
		}
		
		
		System.out.println("Numeros ordenados de menor a mayor:" +a + "," +b+ "," +c);
	}

}
