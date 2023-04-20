package Estaticos;

import java.util.Scanner;

public class Ej_01 {
	
	public static void main(String[] args) {
		
		
		int num;
		String r;
		Scanner t = new Scanner(System.in);
		
		do {
			System.out.print("Introduce num: ");
			
			r = t.nextLine();
			
			if(r.length() > 0) {
				
				if( Utilidad.esNum(r)) {
					num = Integer.parseInt(r);
					
					if(Utilidad.esPrimo(num)==true) {
						System.out.println(num+ " es primo.");
					}else {
						System.out.println(num+" no es primo.");
					}
				}else {
					System.err.println("Debe ser un numero.");
				}
				
				System.out.println();
			}
		}while(r.length() > 0);
	}

}
