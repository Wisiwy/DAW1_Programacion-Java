package EjerciciosTarde;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_01 {
	
	public static void main(String[] args) {
		
		double dato=0;
		boolean pedir = true;
		
		do {
			try {
				Scanner t = new Scanner(System.in);
				System.out.print("N�mero: ");
				dato = t.nextDouble();
				pedir=false;
			}catch(InputMismatchException e) {
				System.err.println("No es un n�mero!!");
			}
		}while(pedir);
		//}while(pedir==true);
		
		
		
	}

}
