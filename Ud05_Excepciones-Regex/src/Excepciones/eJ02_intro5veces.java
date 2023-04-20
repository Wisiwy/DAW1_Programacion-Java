package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class eJ02_intro5veces {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Intro nº decimal: ");
			try {
				Scanner teclado = new Scanner(System.in);
				double a = teclado.nextDouble();
				break;
			} catch (Exception e) {
				System.err.println("Error.//" + e.getMessage());
			}

		}
		
		double dato = 0;
		boolean pedir = true;
		int cont = 0;
		do {

			try {
				Scanner t = new Scanner(System.in);
				System.out.println("Numero: ");
				dato = t.nextDouble();
				pedir = false;
			} catch (InputMismatchException e) {
				System.err.println("No es un num!!");
				cont++;
				if(cont>=5)
					pedir=false;
			}
		} while (pedir); // Si no pones nada considera true 
		
		
		

	}
	
	

}
