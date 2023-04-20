package Ejercicios;

import java.util.Scanner;
//7.	Escriba un programa que convierta euros en yenes, y otro que convierta yenes en euros.
public class Ejercicio07_EurYenes {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("************CALCULADORA EUROS-YENES************");
		
		final double yenes = 138.28; //CONSTANTE: Asignar un unico valor
									//Protego el valor de la variable que no se modifique. 
		
		//Pedimos intro Euros
		System.out.println("Cuantos Eurapios quieres llevarte a Japón cacho Otaku: ");
		double euros = teclado.nextDouble();
				
		//Multiplicamos por el factor de conversion 138,28 e impr pantalla. Y asignamos yenes
		double yenes2 = yenes*euros;
		System.out.printf("En tu cartera tienes:%.3f yenes\n", yenes2);
		
		/*SOLUCION 
		 recoger el factor de conversion en una constantel
	*/
		
	
	}
}
	
