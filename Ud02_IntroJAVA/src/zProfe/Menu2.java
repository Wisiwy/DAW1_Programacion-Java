package zProfe;

import java.util.Scanner;

public class Menu2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		do {
			
			System.out.println("Menu:   ");
			System.out.println("-------------------------\n");
			
			System.out.println("  1 - Sumar");
			System.out.println("  2 - Restar");
			System.out.println("  0 - Salir");
			System.out.print("\n Opcion: ");
			
			valor = teclado.nextInt();
			
			if(valor == 1) {
				System.out.println("Sumar!");
			}else if (valor == 2) {
				System.out.println("Restar!");
			}else {
				System.out.println("Salir del programa");
			}
			
		}while(valor >= 0 && valor <= 2);
		
		teclado.close();
	}

}
