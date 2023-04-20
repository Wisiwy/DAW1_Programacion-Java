package EjerciciosTarde;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_02 {
	
	public static void main(String[] args) {
		
		double dato=0;
		boolean pedir = true;
		int cont =0;
		
		do {
			try {
				Scanner t = new Scanner(System.in);
				System.out.print("Número: ");
				dato = t.nextDouble();
				pedir=false;
			}catch(InputMismatchException e) {
				System.err.println("No es un número!!");
				
				cont++;
				if(cont >= 5)
					pedir=false;
			}
		}while(pedir);
		//}while(pedir==true);
		
		System.out.println("Salgo del programa!.");
		
	}

}
