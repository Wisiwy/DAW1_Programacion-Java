package Repaso;

import java.util.Scanner;

public class Ej_14 {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce a�o: ");
		int valor = teclado.nextInt();
		
		
		
		if( (valor%4==0 && valor%100!=0) || ( valor%400==0 )) 
			System.out.println("Es bisiesto");
		else 
			System.out.println("No es bisiesto");
		
		
		
		
		/*
		if(valor%4==0) {
			//es divisible entre 4
			if(valor%100==0) {
				//divisible entre 100
				if(valor%400==0) {
					System.out.println("Es bisiesto");
				}else {
					System.out.println("No es bisiesto.");
				}
			}else {
				//no es divisible entre 100
				System.out.println("Es bisiesto");
			}
		}else {
			//no es divisible entre 4
			System.out.println("No es bisiesto.");
		}*/
		
		
	}

}
