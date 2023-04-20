package Repaso;

import java.util.Scanner;

public class Ej_17 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Valor: ");
		int num=scanner.nextInt();
		int suma=0;
		for (int i=1; i<=num; i++) {
			suma=suma+i;
			System.out.println(suma);
		}
		
		
	}

}
