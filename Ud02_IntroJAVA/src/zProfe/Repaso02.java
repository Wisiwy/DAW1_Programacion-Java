package zProfe;

import java.util.Scanner;

public class Repaso02 {
	
	public static void main(String[] args) {
		
		
		//entrada de datos
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un num1: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Introduce un num2: ");
		int num2 = teclado.nextInt();
		
		int suma = num1 + num2;
		System.out.println("la suma es: "+suma);
		
		//entrada de datos con decimales
		System.out.print("Introduce un num1: ");
		double num11 = teclado.nextDouble();
		
		System.out.print("Introduce un num2: ");
		double num21 = teclado.nextDouble();
		
		double resta = num11 - num21;
		System.out.println("la resta es: "+resta);
		
		teclado.close();
	}

}
