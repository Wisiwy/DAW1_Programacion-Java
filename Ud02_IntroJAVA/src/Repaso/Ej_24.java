package Repaso;

import java.util.Scanner;

public class Ej_24 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Valor: ");
		int num=scanner.nextInt();
		
		for(int fila=1 ; fila <=num ; fila++) {
			for(int col=1 ; col <= num ; col++) {
				
				if(col <= fila)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
