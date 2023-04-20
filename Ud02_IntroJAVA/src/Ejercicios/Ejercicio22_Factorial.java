package Ejercicios;

import java.util.Scanner;

public class Ejercicio22_Factorial {
//Escriba un programa que calcule el factorial de un número.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Intro num:");
		int num = teclado.nextInt();
		int fact = 1;
		System.out.printf(" F(%2d)* ",num);
		for (int i = 1; i <= num; i++) {
			
			System.out.printf(" *%2d  ",i);
			fact = i * fact;
		}
		System.out.printf(" = %3d \n",fact);
		teclado.close();
	}

}
