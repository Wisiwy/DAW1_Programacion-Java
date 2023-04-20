package Ejercicios;

import java.util.Scanner;

public class Ejercicio13_ValorAbsol {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("***********VALOR ABSOLUTO*********");
		System.out.println("Calcular el valor absoluto de: ");
		int num = teclado.nextInt();
		int abs = 0;
		if (num < 0) {
			abs = -num;
			System.out.printf("Tu valor absoluto es %d. ", abs);
		} 
		System.out.printf("Tu valor absoluto es %d. ", num);
//		No hace falta este else {
//			abs = num;}
// 	---------------------------------------------		
//		syso Math.abs(num); (llamamos clase estatica contiene seri de metodos, que ayudan 
//						a hacer cosas)
//		System.out.printf("Tu valor absoluto es %d. ", Math.abs(num));
		

		teclado.close();
	}

}
