package Repaso;

import java.util.Scanner;

public class Ej_16 {

	public static void main(String[] args) {
		
		System.out.println("******TABLAS DE MULTIPLICAR******");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce n� a multiplicar: ");
		int multA = teclado.nextInt();
		
		System.out.print("Introduce veces a multiplicar: ");
		int multB = teclado.nextInt();
		
		for (int i = 0; i<= multB; i++) {
			System.out.printf("%d x %d = %d \n", multA, i, (multA * i));
		}
		teclado.close();

	}

}
