package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej03_sumarDatPedido {

//	Escribe un programa que pida números hasta que se introduzca un dato que no sea válido como número o 
//	hasta que se hayan dado 6 números.  Después mostrará el resultado de sumar todos los números insertados. 
//	Hay que usar al menos estos 2 métodos:
//		Uno que pida una cadena.
//		Otro que pida un número entero.
//		Si se produce un error en uno de estos métodos hay que dejar que se propague.

	public static void main(String[] args) {

		double dato = 0, suma = 0;
		boolean pedir = true;
		int cont = 0;
		
		do {

			try {
				Scanner t = new Scanner(System.in);
				System.out.println("Numero: ");
				dato = t.nextDouble();
				suma += dato;
				cont++;
			} catch (Exception e) {
				System.err.println("No es un num!!");
				System.err.println("Adioas. Tu suma hasta ahora: " + suma);
				cont=6;
			}
		} while (cont < 6);

		System.out.println("Suma: " + suma);

	}

}
