package Estaticos;

import java.util.Scanner;

public class Ej_01_1 {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Num: ");
		String r = teclado.nextLine();
		
		if(Utilidad.esNum(r)==true) {
			int num = Integer.parseInt(r);
			//int num = Integer.parseInt(teclado.nextLine());
			
			if(esPrimo(num)==true) {
				System.out.println(num+ " es primo.");
			}else {
				System.out.println(num+" no es primo.");
			}
		}
	}
	
	public static boolean esPrimo(int num) {
		
		for(int i=2 ; i<(num/2)+1 ; i++ ) { 
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
