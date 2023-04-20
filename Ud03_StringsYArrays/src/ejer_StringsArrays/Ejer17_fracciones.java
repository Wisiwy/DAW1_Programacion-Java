package ejer_StringsArrays;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import aUTILIDAD.Leer;

public class Ejer17_fracciones {

	public static void main(String[] args) {
		System.out.println("========CALCULADOR DE FRACCIONES=====");
		System.out.println("=====================================");
		Scanner teclado = new Scanner(System.in);
		//Leer fraciones
		int[][] frac = new int [2][3];
		System.out.println("Introduce dos fracciones. ");
		frac[0][0] = Leer.leerInt("Numerador 1: ");
		frac[1][0] = Leer.leerInt("Denominador 1:");
		System.out.println("-------------------------");
		frac[0][1] = Leer.leerInt("Numerador 2: ");
		frac[1][1] = Leer.leerInt("Denominador 2:");
	
		// Elegir operaciones
		//*************************MENU**********************************
		boolean menu = true;
		while (menu) {

			System.out.println("-------------------------");
			System.out.println("Que operacion quieres hacer:   ");
			System.out.println("-------------------------\n");
			System.out.println("  1 - Sumar");
			System.out.println("  2 - Restar");
			System.out.println("  3 - Multiplicar");
			System.out.println("  4 - Dividir");
			System.out.println("  0 - Salir");
			System.out.print("\n Opcion: ");
			int valor = teclado.nextInt();
			if (valor == 1) { //SUMA
				System.out.println("Sumar!");
				sumaFrac(frac);
			} else if (valor == 2) {
				System.out.println("Restar!");
				restaFrac(frac);
			} else if (valor == 3) {
				System.out.println("Multiplicar!");
				multFrac(frac);
			} else if (valor == 4) {
				System.out.println("Dividir!");
				divFrac(frac);
			} else if (valor == 0) {
				System.out.println("Salir del programa");
				menu = false;
			} else {
				System.err.println("Opcion no valida.");
			}
		}
	}
	/**
	 * 
	 * @param frac = vector 2 dimensiones
	 * @return suma de fraciones.
	 */
	public static void sumaFrac(int[][] frac) {
		frac[1][2] = frac[1][0]*frac[1][1];
 		frac[0][2] = (frac[0][0]*frac[1][1])+(frac[0][1]*frac[1][0]);
 		System.out.println(frac[0][2]+ " / " + frac[1][2]);
	}
	
	public static void restaFrac(int[][] frac) {
		frac[1][2] = frac[1][0]*frac[1][1];
		frac[0][2] = (frac[0][0]*frac[1][1])-(frac[0][1]*frac[1][0]);
		System.out.println(frac[0][2]+ " / " + frac[1][2]);
	}
	
	public static void multFrac(int[][] frac) {
		frac[1][2] = frac[1][0]*frac[1][1]; //denominador
		frac[0][2] = frac[0][0]*frac[1][0]; //numerador
		System.out.println(frac[0][2]+ " / " + frac[1][2]);
	}
	
	public static void divFrac(int[][] frac) {
		frac[1][2] = frac[1][0]*frac[1][0]; //denominador
		frac[0][2] = frac[0][0]*frac[1][1]; //numerador
		System.out.println(frac[0][2]+ " / " + frac[1][2]);
	}

	public static void reducir (int[][] frac) {
		 for (int i=2; i<frac[1][2]; i++) {
			if (frac[0][2]%i ==0 && frac[1][2]%i ==0) {
				
				
			}
		
			 
		 }
		
		
	}
	
	
	
	
	

	/**
	 * MAXIMO COMUN MULTIPLO
	 * 
	 * @param num1 entero
	 * @param num2 entero
	 * @return maximo comun multiplo
	 */

	public static int mcm(int num1, int num2) {
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		int mcm = (a / mcd(num1, num2)) * b;
		System.out.println("minimo comum mult: " + mcm);
		return mcm;
	}

	/**
	 * MAXIMO COMUN DIVISOR
	 * 
	 * @param num1 entero
	 * @param num2 entero
	 * @return maximo comun divisor
	 */
	public static int mcd(int num1, int num2) {
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		int mcd = 0;
		do {
			mcd = b;
			b = a % b;
			a = mcd;
		} while (b != 0);
		System.out.println("minimo comum div: " + mcd);
		return mcd;
	}
}
