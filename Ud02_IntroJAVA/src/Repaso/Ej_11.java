package Repaso;

import java.util.Scanner;

public class Ej_11 {
	
	public static void main(String[] args) {
		
		//pedir informaci�n
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce metros: ");
		double metros = teclado.nextDouble();
		
		//procesar informaci�n
		double pies = metros * 39.27 / 12;
		
		//mostrar resultado
		System.out.printf("%.2f metros son %.2f pies.\n",metros,pies);
	}

}
