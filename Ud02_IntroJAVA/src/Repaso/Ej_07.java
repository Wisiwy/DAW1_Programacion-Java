package Repaso;

import java.util.Scanner;

public class Ej_07 {
	
	

	public static void main(String[] args) {
		
		final double yen = 140.16; //1 euros son 140 yenes
		
		
		Scanner teclado = new Scanner(System.in);
		
		//pido cantidad a convertir		
		System.out.print("Introduce la cantidad a convertir: ");
		double valor = teclado.nextDouble();
		
		//Calculo el valor en yenes	
		//double yenes = euros * yen;
		
		//Mostrar el resultado
		System.out.println("El resultado es:"+(valor*yen));
		
		
		/*********************/
		
		System.out.print("Introduce la cantidad a convertir: ");
		valor = teclado.nextDouble();
		
		//Calculo el valor en yenes	
		//double yenes = euros * yen;
		
		//Mostrar el resultado
		System.out.println("El resultado es:"+(valor/yen));
		teclado.close();
	}
		
}
