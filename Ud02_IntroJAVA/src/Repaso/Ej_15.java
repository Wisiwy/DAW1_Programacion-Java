package Repaso;

import java.util.Scanner;

public class Ej_15 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final int tope = 5;
		double valor=0;
		
		for(int i=1 ; i<=tope ; i++ ) {
			System.out.print("Introduce un num("+i+"): ");
			valor = valor + teclado.nextDouble();
		}
		
		//valor = valor/tope;
		double media = valor/tope;
		System.out.println("La media es: "+media);
	}

}
