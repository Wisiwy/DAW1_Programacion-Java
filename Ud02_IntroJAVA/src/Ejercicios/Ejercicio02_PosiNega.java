package Ejercicios;

import java.util.Scanner;

public class Ejercicio02_PosiNega {

	public static void main(String[] args) {
System.out.println("************NUMERO POSITIVO O NEGATIVO************");

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int num1 = teclado.nextInt();
		if( num1 >0) {
			System.out.println("Es positivo.");
		}else if (num1==0) {
			System.out.println("Es cero.");
		}else{
			System.out.println("Es negativo");
		}
						
		
				
	teclado.close();
	}
	

}
