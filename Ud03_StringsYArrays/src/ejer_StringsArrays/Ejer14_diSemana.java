package ejer_StringsArrays;

import java.util.Scanner;

public class Ejer14_diSemana {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// inicializar array con dias semana
		String[] sema = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "wasel wasel" };
int num;
//do {
		System.out.println("Numero [1-7]: ");
		num = teclado.nextInt();
			System.err.println("Prueba otra vez");			
			System.out.println(sema[(num-1)]);
		
		if (num < 1 || num > 7) {
	System.out.println("Bye, bye hasta otro ratito.");
		}
	
//} while (1==1);		
		
		
	}

}
