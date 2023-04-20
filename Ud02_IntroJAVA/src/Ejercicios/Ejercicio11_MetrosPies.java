package Ejercicios;

import java.util.Scanner;

public class Ejercicio11_MetrosPies {
	/*
	 * Escriba un programa que calcule el equivalente en pies de una longitud en
	 * metros dada por el usuario, teniendo en cuenta que un metro equivale a 39,27
	 * pulgadas y que 12 pulgadas equivalen a un pie.
	 */
	public static void main(String[] args) {

		final double kPulg = 39.27;
		Scanner teclado = new Scanner(System.in);
		System.out.println("************CALCULADORA METROS-PIES************");
		System.out.println("Introduzca METROS a convertir: ");
		double m = teclado.nextDouble();
		// calculo pulgadas a partir metros
		double pulg = m * kPulg;
		double pie = pulg / 12;
		pulg = pulg % 12;
		System.out.printf("Tu pene mide %.3f pies y %.3f pulgadas", pie, pulg);

		teclado.close();
	}

}
