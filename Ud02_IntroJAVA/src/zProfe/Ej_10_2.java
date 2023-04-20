package zProfe;

import java.util.Scanner;

public class Ej_10_2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce A: ");
		int a = teclado.nextInt();
		System.out.print("Introduce B: ");
		int b = teclado.nextInt();
		System.out.print("Introduce C: ");
		int c = teclado.nextInt();
		
		//resultado final sea a < b < c
		
		
		if (a > b) {
			//caso b < a < c , c < b < a , b < c < a
			
			if (b < c) {
				//b < a < c , b < c < a
				if (a < c) {
					//b < a < c
					int aux = b;
					b = a;
					a = aux;
					/////a < b < c
				}else {
					//b < c < a
					int aux = c;
					c = a;
					a = aux;
					//b < a < c
					aux = b;
					b = a;
					a = aux;
					//// a < b < c
					
				}
			}else {
				// c < b < a
				int aux = c;
				c = a;
				a = aux;
			}
		}else {
			//casos: a < b < c , c < a < b , a < c < b
			
			if( a > c) {
				//c < a < b
				int aux = c;
				c = a;
				a = aux;
				//a < c < b
				aux = c;
				c = b;
				b = aux;
			}else {
				if(b > c) {
					//a < c < b
					int aux = c;
					c = b;
					b = aux;
				}else {
					//a < b < c
					//ya esta
				}
			}
		}
		
		System.out.printf("A: %d  B: %d  C: %d \n",a,b,c);
		
	}
	
	
	
	

}
