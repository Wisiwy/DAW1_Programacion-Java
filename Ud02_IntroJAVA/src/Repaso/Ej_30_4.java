package Repaso;

import java.util.Scanner;

public class Ej_30_4 {
	
	public static void main(String[] args) {
		
		int cont = 4, num = 1, acum=0;
		
		while(cont > 0) {
		
			//System.out.print(num+ " --> ");
			for(int i=1 ; i < num ; i++) {
				if(num%i == 0) {
					//System.out.print(i+" ");
					acum = acum + i;
				}
			}
			//System.out.print(" ## "+acum);
			
			if(num == acum) {
				acum=0;//para mostrar los divisores
				System.out.print(num+ " --> ");
				for(int i=1 ; i < num ; i++) {
					if(num%i == 0) {
						System.out.print(i+" ");
						acum = acum + i;
					}
				}
				System.out.print(" ## "+acum);
				System.out.println();
				cont--;
			}
				
			acum=0;
			num++;
			//System.out.println();
		}
	}

}
