package Ejercicios;

import java.util.Scanner;

public class Ejercicio07_1_YenesEuros {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("************CALCULADORA YENES-EUROS************");
		final double yenes = 138.28;
		//Pedimos intro 
		System.out.println("Cuantos Yenupios quieres llevarte a Españita flamenquito: ");
		double yenes2 = teclado.nextDouble();
		
		
		//Lo mismo pero dividiendo por yen pantalla. Y asignamos yenes
		
		double euros = yenes2/yenes;
		System.out.printf("En tu cartera tienes: %.3f euros\n", euros);
		
		
		teclado.close();
		
	}



}
