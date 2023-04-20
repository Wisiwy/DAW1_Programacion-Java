package zProfe;

import java.util.Scanner;

public class Ej_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean menu = true;
		
		while(menu) {
			
			System.out.println("Menu:   ");
			System.out.println("-------------------------\n");
			
			System.out.println("  1 - Celsius a Fahrenheit");
			System.out.println("  2 - Fahrenheit a Celsius");
			System.out.println("  0 - Salir");
			System.out.print("\n Opcion: ");
			
			int valor = teclado.nextInt();
			
			if(valor == 1) {
				
				//Celsius a Fahrenheit
				System.out.print("Grados Celsius: ");
				double grados = teclado.nextDouble();
				double sol = (9/5)*grados+32;
				System.out.printf("Fahrenheit: %.2f",sol);
				
			}else if (valor == 2) {
				
				//Fahrenheit a Celsius
				System.out.print("Grados Fahrenheit: ");
				double grados = teclado.nextDouble();
				double sol = (grados-32)/(9/5);
				System.out.printf("Celsius: %.2f",sol);
				
			}else if (valor == 0){
				System.out.println("Salir del programa");
				menu = false;
			}else {
				System.err.println("Opcion no valida.");
			}
			
		}
	
	teclado.close();
	}//fin del main
}
