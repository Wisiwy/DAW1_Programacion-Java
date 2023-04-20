package Ejercicios;

import java.util.Scanner;

public class Ej_bus_vector {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		//Bus bus1 = new Bus(1,4);
		Bus[] cochera = new Bus[10];
		
		do {
			
			System.out.println("1 - Incrementa");
			System.out.println("2 - Decrementa");
			System.out.println("3 - Mostrar todos");
			System.out.println("4 - Nuevo Bus");
			System.out.println("0 - Salir");
			System.out.print("\n Opción: ");
			Scanner t = new Scanner(System.in);
			int opt = Integer.parseInt(t.nextLine());
			
			
			if(opt == 1) {
				for (int i = 0; i < cochera.length; i++) {
					if(cochera[i] != null)
						System.out.println(i+" -  "+cochera[i]);
				}
				System.out.println("\n\n");
				System.out.print("Pos: ");
				int pos = Integer.parseInt(t.nextLine());
				
				if(cochera[pos] != null) {
					try {
						cochera[pos].incrementa();
						System.out.println(cochera[pos]+"\n\n");
					} catch (NoPlace e) {
						System.out.println(" !!!!! "+e.getMessage());
					}
				}
				//System.out.println(bus1);
			}else if(opt == 2) {
				for (int i = 0; i < cochera.length; i++) {
					if(cochera[i] != null)
						System.out.println(i+" -  "+cochera[i]);
				}
				System.out.println("\n\n");
				System.out.print("Pos: ");
				int pos = Integer.parseInt(t.nextLine());
				
				if(cochera[pos] != null) {
					try {
						cochera[pos].decrementa();
						System.out.println(cochera[pos]+"\n\n");
					} catch (Invalid e) {
						System.out.println(" !!!!! "+e.getMessage());
					}
				}
				/*try {
					//bus1.decrementa();
					//System.out.println(bus1+"\n\n");
				} catch (Invalid e) {
					System.out.println(" !!!!! "+e.getMessage());
				}*/
				
			}else if(opt == 3) {
				//mostrar todos
				for (int i = 0; i < cochera.length; i++) {
					if(cochera[i] != null)
						System.out.println(cochera[i]);
				}
				System.out.println("\n\n");
			}else if(opt == 4) {
				//crear nuevo
				System.out.println("\n\n");
				System.out.print("Id: ");
				int id = Integer.parseInt(t.nextLine());
				System.out.print("Capacidad: ");
				int cap = Integer.parseInt(t.nextLine());
				
				Bus aux = new Bus(id,cap);
				
				for (int i = 0; i < cochera.length; i++) {
					if(cochera[i] == null) {
						
						cochera[i] = aux;
						i=cochera.length;
						//break;
					}
				}
				
			}else if(opt == 0) {
				menu = false;
			}else {
				System.out.println("Opción no valida");
			}
			
			
			
		}while(menu);
		
	}

}
