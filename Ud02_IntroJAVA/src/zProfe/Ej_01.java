package zProfe;

import java.util.Scanner;

public class Ej_01 {
	
	public static void main(String[] args) {
		
		
		//area de triangulo
		Scanner teclado = new Scanner(System.in);
		
		//pido la base
		System.out.print("Introduce base: ");
		double base = teclado.nextDouble();
		
		//pido altura
		System.out.print("Introduce altura: ");
		double alt = teclado.nextDouble();
		
		//calculo area
		double area = base * alt /2;
		
		//muestro area
		//System.out.println("El area es: "+area);
		System.out.printf("El area es: %.2f \n",area);
		
		teclado.close();
	}

}
