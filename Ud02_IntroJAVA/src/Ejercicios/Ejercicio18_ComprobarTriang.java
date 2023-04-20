package Ejercicios;

import java.util.Scanner;

public class Ejercicio18_ComprobarTriang {

//	Escriba un programa que nos diga si un número es o no triangular, 
//	y cuál es el número triangular anterior y posterior al número.
	//Formula T(N)=N+(N+1)/2
	public static void main(String[] args) {

		System.out.println("*******COMPROBADORA Nº TRIANGULARES******");
		System.out.println("----------------------------------------");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Es mi numero triangular: ");
		
		boolean condi = true;
		int num = teclado.nextInt();
		int tri = 0;
		int cont = 1;
		do {
			if (tri < num) {

				tri = tri + cont;
				System.out.printf("En la vuelta %d tu numero triangular es: %d ", cont, tri);
				System.out.println(" ");
				cont = cont + 1;

			} else if (tri == num) {
				
				System.out.print("\n SI es triangular.");
				condi = false;
				System.out.println("//// Anterior:" + (tri - (cont+1)) +" //// Posterior: " + (tri + cont));

			} else {
				System.err.print("NO es triangular. ");
				condi = false;
			}
		} while (condi == true);
		teclado.close();

	}
}
