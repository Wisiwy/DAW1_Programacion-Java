package Repaso;

import java.util.Scanner;

public class Ej_32 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Num: ");
		int num = teclado.nextInt();
		
		do {
			int cociente, acum=0;
			do {
				cociente = num/10;
				int resto = num%10;
				
				acum=acum+resto;
				if(cociente >= 10) {
					num = cociente;//********
				}else {
					acum=acum+cociente;
				}
			}while(cociente >= 10);
			if(acum < 10)
				System.out.println("Crapulo: "+acum);
			else
				System.out.println("Suma: "+acum);
			num = acum;//*******
		}while(num >=10);
		
		//System.out.println("Crapulo: "+num);
	}

}
