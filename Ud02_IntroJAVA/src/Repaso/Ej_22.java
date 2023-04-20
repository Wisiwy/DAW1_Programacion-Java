package Repaso;

import java.util.Scanner;

public class Ej_22 {
	public static void main(String[] args) {
		
		
		//factorial
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("num: ");
		int a = teclado.nextInt();
		
		System.out.println();
		
		System.out.printf("F(%2d) = ",a);
		int acum=1;
		
		for(int i=a ; i >0 ; i--) {
			System.out.print(" * "+i);
			acum=acum*i;
		}
		System.out.printf(" = %3d \n",acum);
		
	}

}
