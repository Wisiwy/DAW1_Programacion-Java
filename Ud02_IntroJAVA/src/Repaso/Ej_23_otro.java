package Repaso;

import java.util.Scanner;

public class Ej_23_otro {
	
public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Valor: ");
		int tope=scanner.nextInt();
		
		
		
		for(int fila=1 ; fila <=tope ; fila++) {
			for(int col=1 ; col <= tope ; col++) {
				if(fila == 1 || fila == tope || col == 1 || col == tope)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
