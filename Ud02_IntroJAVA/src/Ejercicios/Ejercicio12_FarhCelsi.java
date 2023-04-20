package Ejercicios;

import java.util.Scanner;

public class Ejercicio12_FarhCelsi {
	//ENUNCIADO: Escriba un programa que convierta grados Celsius en Fahrenheit y 
	//viceversa, a elección del usuario. La relación entre ambos es F=(9/5)*C+32.
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("******CALCULADOR CELSIUS-FAHRENHEIT******");
		
	boolean menu = true;	
	while (menu) {
		int select = 0;
		System.out.println("\n ------------------------");
		System.out.println(" Que quieres calcular:");
		System.out.println("1 - Celsius - Farheint");
		System.out.println("2 - Farheint - Celsius");
		System.out.println("0 - Salir del programa");
		select = teclado.nextInt(); 
		if (select == 1) {
			System.out.println("\n--------Celsius-Farheint--------");
			System.out.println("Introduce Celsius: ");
			double cels = teclado.nextDouble();
			double farh = cels*(9/5)+32;

			if (farh < 50 ) {
			System.out.printf("\n Hace %.2f grados Farheint. \n Coge rebequita que refresca\n",farh);
			} else {
			System.out.printf("\n Hace %.2f grados Farheint. \n Sin mÃ¡s no es dia de playa pero se esta bien",farh);
			} 
		}else if(select == 2) {
			
			System.out.println("\n--------Farheint - Celsius--------");
			System.out.println("Introduce Farheint: ");
			double farh = teclado.nextDouble();
			double cels = (farh-32)/(9/5);

			if (cels < 10 ) {
			System.out.printf("\n Hace %.2f grados Farheint. \n Coge rebequita que refresca\n",cels);
			} else {
				System.out.printf("\n Hace %.2f grados Farheint.\n Sin mÃ¡s no es dia de playa pero se esta bien",cels);
			}
			
		}else if (select == 0) {	
			menu = false;
			System.out.printf("\n Comprate un termometro y deja de dar por culo.\n ------- HASTA OTRA IDIOTA--------");
		}else {
			System.err.println("Error. Dale a un boton de los que hemos dicho subnormal.\n  Yo programando y tu no sabes darle a un boton.");
		}
	}	
		
		
		
	teclado.close();	
	}

}
