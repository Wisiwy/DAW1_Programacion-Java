package Ejercicios;

import java.util.Scanner;

public class Ejercicio14_Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("**********ES TU ANO BISIESTO?**********");
		System.out.println("A ver si eres capaz de adivinar un ano bisiesto.");
		boolean bis = false;

		while (bis == false) {
			System.out.println("\n Introduce un ano: ");
			int ano = teclado.nextInt();
			if ((ano%4 == 0 && ano%100 != 0) || (ano%400 == 0)) { //no hace falta (ano%4 == 0) porque si divisible por 400% ya lo es de 100 y 4. 
				bis = true;
				System.out.println(" Enhorabuena tu ano es bisiesto. \n No has ganado nada. No siempre en la vida se gana algo. ");
			} else {
				System.err.println("\n Mal, mul mal. Introduce otro.\n");
			}
		}
teclado.close();
	}

}
