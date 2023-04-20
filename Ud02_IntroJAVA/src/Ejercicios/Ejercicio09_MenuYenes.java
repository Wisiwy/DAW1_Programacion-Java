package Ejercicios;
//8.	Unifique los ejercicios 5 y 6 en un solo programa que te deje elegir al principio cu�l de las dos operaciones hacer, o no hacer ninguna. 
//		Despu�s de dar el resultado te volver� a ese men� inicial.

import java.util.Scanner;

public class Ejercicio09_MenuYenes {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("************CALCULADORA MENU EUROS-YENES************");
		boolean menu = true;
		final double yenes = 138.28;
		while(menu) {				
			System.out.println("\n A que divisa quieres convertir: ");			
	//MENU
			System.out.println("Menu:");
			System.out.println("-----------------;");			
			System.out.println(" 1 - Convertir a Yenes.");
			System.out.println(" 2 - 3Convertir a Euros");
			System.out.println(" 0 - Salir");
			System.out.println("\n Opcion: ");
			int select = teclado.nextInt();
			if (select == 1 ) {
				//Pedimos intro Euros
				System.out.println("Cuantos Eurapios quieres llevarte a Jap�n cacho Otaku: ");
				double euros = teclado.nextDouble();
				//Multiplicamos por el factor de conversion 138,28 e impr pantalla. Y asignamos yenes
				double yenes2 = yenes*euros;
				System.out.printf("En tu cartera tienes:%.3f yenes\n", yenes2);			
			} else if(select == 2) {
				System.out.println("Cuantos Yenupios quieres llevarte a Espa�ita flamenquito: ");
				double yenes2 = teclado.nextDouble();			
				//Lo mismo pero dividiendo por yen pantalla. Y asignamos yenes
				double euros = yenes2/yenes;
				System.out.printf("En tu cartera tienes: %.3f euros\n", euros);				
			}else if(select == 0) {
				System.out.println("Salir del programa.");
				menu = false;
			}else {
				System.out.println("Opcion no valida.");
			}
		
		}
		
		teclado.close();
			
		
		
	}  
	
}
