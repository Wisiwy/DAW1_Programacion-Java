package Ejercicios;

import java.util.Scanner;

public class Ej_bus {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		Bus bus1 = new Bus(1,4);
		
		do {
			
			System.out.println("1 - Incrementa");
			System.out.println("2 - Decrementa");
			System.out.println("3 - Salir");
			System.out.print("\n Opción: ");
			Scanner t = new Scanner(System.in);
			int opt = Integer.parseInt(t.nextLine());
			
			
			if(opt == 1) {
				
				try {
					bus1.incrementa();
					System.out.println(bus1+"\n\n");
				} catch (Exception e) {
					System.out.println(" !!!!! "+e.getMessage());
				}
				//System.out.println(bus1);
			}else if(opt == 2) {
				
				try {
					bus1.decrementa();
					System.out.println(bus1+"\n\n");
				} catch (Exception e) {
					System.out.println(" !!!!! "+e.getMessage());
				}
				
			}else if(opt == 3) {
				menu = false;
			}else {
				System.out.println("Opción no valida");
			}
			
			
			
		}while(menu);
		
	}

}
