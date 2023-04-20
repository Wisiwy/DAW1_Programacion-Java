package Repaso;

import java.util.Scanner;

public class Ej_26 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Num: ");
		int num = teclado.nextInt();
		
		System.out.print("Divisores: ");
		for(int i=1 ; i <=num ; i++) {
			if(num%i == 0)
				System.out.print(i+" ");
		}
	}

}
