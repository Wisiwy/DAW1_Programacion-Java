package Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
	//pedir base
		System.out.println("************CALCURADORA DE AREAS TRIANGULO************");
		System.out.print("Base del triangulo: ");
		double b = teclado.nextDouble();
		
	//pedir altura
		System.out.print("Altura del triangulo: ");
		double h = teclado.nextDouble();
	//operar
		double area = (h*b)/2;
		System.out.printf("La base es: %.2f \n", area);
		//%f = contenga un numero decimal y 6.2 6 posiciones 2 decimales. Prioriza entero
	
	
	
	
		teclado.close();
	
	}
	
}
