package EjerciciosTarde;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_03 {

	
	public static void main(String[] args) {
		
		
		double dato=0,suma=0;
		boolean pedir = true;
		int cont =0;
		
		do {
			try {
				Scanner t = new Scanner(System.in);
				System.out.print("N�mero: ");
				dato = t.nextDouble();
				suma += dato;
				cont++;
				if(cont >= 6)
					pedir=false;
			}catch(InputMismatchException e) {
				System.err.println("No es un n�mero!!");
				pedir=false;
			}
		}while(pedir);
		//}while(pedir==true);
		System.out.println("Suma: "+suma);
		System.out.println("Salgo del programa!.");
		
		
	}
}
