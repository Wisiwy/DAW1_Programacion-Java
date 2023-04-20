package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
// import java.util.*; //import con asterisco importa todas las clases de java util


public class ej01_introLetra {

//	public static void main(String[] args) {
//
//		boolean compro = true;
//		do {
//			System.out.println("Intro nº decimal: ");
//			try {
//				Scanner teclado = new Scanner(System.in);
//				double a = teclado.nextDouble();
//				compro = true;
//			} catch (Exception e) {
//				System.err.print("Error. " + e.getMessage());
//				compro = false;
//			}
//		} while (compro == false);
//
//	}
//------PROFE SOLUCION----
	public static void main(String[] args) {

		double dato = 0;
		boolean pedir = true;
		do {

			try {
				Scanner t = new Scanner(System.in);
				System.out.println("Numero: ");
				dato = t.nextDouble();
				pedir = false;
			} catch (InputMismatchException e) {
				System.err.println("No es un num!!");
			}
		} while (pedir); // Si no pones nada considera true 

	}

}
