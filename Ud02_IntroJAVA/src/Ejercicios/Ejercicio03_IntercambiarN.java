package Ejercicios;

import java.util.Scanner;

public class Ejercicio03_IntercambiarN {

	public static void main(String[] args) {
		
		//Pido dos numeros
		
		Scanner teclado = new Scanner(System.in);
		
			System.out.println("************INTERCAMBIADOR DE NUMEROS SI...************");
			System.out.println("Introduce dos numeros:  ");
			double num1 = teclado.nextDouble();
			double num2 = teclado.nextDouble();			
	System.out.println("Num1: " + num1 + "/ Num2: " + num2);
		
	//compruebo si es mayor que uno y los intercambio
			
			if (num1 > num2) {
				double aux;				
				aux = num1;
				num1 = num2;
				num2 = aux;
				}
		System.out.println("Num1: " + num1 + "/ Num2: " + num2);
	// necesito de un auxiliar para guardar el valor y luego ponerselo a num2	
		
		
		
	}
	
}
