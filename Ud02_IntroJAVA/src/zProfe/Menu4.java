package zProfe;

import java.util.Scanner;

public class Menu4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		boolean menu = true;
		
		do{
			
			System.out.println("Menu:   ");
			System.out.println("-------------------------\n");
			
			System.out.println("  1 - Sumar");
			System.out.println("  2 - Restar");
			System.out.println("  0 - Salir");
			System.out.print("\n Opcion: ");
			
			int valor = teclado.nextInt();
			
			if(valor == 1) {
				System.out.println("Sumar!");
			}else if (valor == 2) {
				System.out.println("Restar!");
			}else if (valor == 0){
				System.out.println("Salir del programa");
				menu = false;
			}else {
				System.err.println("Opcion no valida.");
			}
			
		}while(menu);
	
	teclado.close();
	}//fin del main

}
