package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_02 {
	
	public static void main(String[] args) {
		
		
		Boolean pedir = true;
		double dato;
		int cont = 0;
		
		do {
			
			try {
				Scanner t = new Scanner(System.in);
				System.out.print("Valor: ");
				dato = t.nextDouble();
				
				//esta línea se ejecuta si todo va bien
				pedir = false;
				
			}catch(InputMismatchException e) {
				cont++;
				if(cont < 5)
					System.err.println("Introduce un número.");
				else {
					//break;
					pedir = false;
				}
			}
			
		}while(pedir);
		//}while(pedir == true);
		
		System.out.println("Salgo de la aplicación.");
	}

}
