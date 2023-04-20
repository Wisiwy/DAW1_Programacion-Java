package Estaticos;

import java.util.Scanner;

public class Ej_07 {
	
	final static double PI =3.1416;
	
	
	
	public static void main(String[] args) {
		
		boolean menu = true;
		String[] s = {"Longitud","Area","Volumen"};
		
		do {
			
			double r = Leer.leerDouble("Radio: ");
			
			int opt = miMenu(s);
			
			if(opt == 1) {
				System.out.printf("La longitud es: %.2f \n",longitud(r));
			}else if(opt == 2) {
				//double resultado = PI*r*r;
				System.out.printf("El área es: %.2f \n",area(r));
			}else if(opt == 3) {
				//double resultado = 4*PI/3*r*r*r;
				System.out.printf("El volumen es: %.2f \n",volumen(r));
			}else if(opt == 0) {
				menu = false;
			}else {
				System.err.println("Opción no válida.");
			}
			
			
		}while(menu);
		
		
	}
	
	private static double volumen(double r) {
		return 4*PI/3*r*r*r; //4/3*PI
	}

	private static double area(double r) {
		return PI*r*r;
	}

	public static double longitud(double r) {
		return 2*PI*r;
	}
	
	public static int miMenu(String[] s) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println();
		for(int i=1; i<=s.length ; i++) 
			System.out.println(i+" - "+s[i-1]);
		System.out.println("0 - Salir");
		System.out.print("\n Opcion: ");
		int opt = t.nextInt();
		
		System.out.println("\n");
		
		return opt;
		
	}

}
