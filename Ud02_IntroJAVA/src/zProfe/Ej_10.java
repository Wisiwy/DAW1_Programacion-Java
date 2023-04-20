package zProfe;

import java.util.Scanner;

public class Ej_10 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce A: ");
		int a = teclado.nextInt();
		System.out.print("Introduce B: ");
		int b = teclado.nextInt();
		System.out.print("Introduce C: ");
		int c = teclado.nextInt();
		
		//resultado final sea a < b < c
		
		//posibilidades:
		//a < b < c
		if (a < b && b < c) {
			//ya esta resuelto
		}
		//a < c < b
		if (a < c && c < b) {
			int aux = c;
			c=b;
			b = aux;
			//a < b < c
		}
		//c < a < b
		if(c < a && a < b) {
			int aux = c;
			c = a;
			a = aux;
			//a < c < b
			aux = c;
			c = b;
			b = aux;
			//a < b < c
		}
		//c < b < a
		//b < a < c
		//b < c < a
		
		System.out.printf("A: %d  B: %d  C: %d \n",a,b,c);
		
	}

}
