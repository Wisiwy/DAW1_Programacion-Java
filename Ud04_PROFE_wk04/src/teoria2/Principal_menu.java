package teoria2;

import java.util.Scanner;

public class Principal_menu {
	
	public static void main(String[] args) {
		
		int opt = 0;
		Persona[] lista = new Persona[10];
		String[] opciones = {"Añadir PERSONA","Borrar PERSONA","LISTAR persona"};
		carga(lista);
		
		do {
			
			opt = menu(opciones);
			
			if(opt == 1) {
				anadir(lista);
			}else if (opt == 2) {
				borrar(lista);
			}else if(opt == 3) {
				listar(lista);
			}else if(opt != 0) {
				System.err.println("Opcion no valida.");
			}
			
		}while(opt !=0 );
		
		
	}
	
	


	public static void borrar(Persona[] lista) {
		
		System.out.println();
		listar(lista);
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Borrar: ");
		int opt = t.nextInt();
		
		lista[opt] = null;
	}




	public static void anadir(Persona[] lista) {
		
		boolean recogido = false;
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] == null && recogido == false) {
				Scanner t = new Scanner(System.in);
				
				Persona p = new Persona();
				System.out.print("Nombre: ");
				p.setNombre(t.nextLine());
				System.out.print("Apellido: ");
				p.setApellido(t.nextLine());
				System.out.print("Edad: ");
				p.setEdad(t.nextInt());
				
				lista[i] = p;
				recogido = true;
				//i = lista.length;
			}
		}
		
	}




	public static void listar(Persona[] lista) {
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null)
				System.out.println(i+" -- "+lista[i] );
		}
	}
	
	public static void carga(Persona[] lista) {
		
		lista[0] = new Persona("Gabi","Alonso",22);
		lista[1] = new Persona("David","Alonso",27);
		lista[6] = new Persona("Raquel","Alonso",24);
		lista[4] = new Persona("Fernando","Gomez",22);
		
	}




	public static int menu() {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1 - Añadir persona");
		System.out.println("2 - Borrar persona");
		System.out.println("3 - Listar personas");
		System.out.println("0 - Salir");
		System.out.print("\n Opcion: ");
		int opt = t.nextInt();
		
		return opt;
		
	}
	
	public static int menu(String[] s) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println();
		for(int i=1; i<=s.length ; i++) 
			System.out.println(i+" - "+s[i-1]);
		System.out.println("0 - Salir");
		System.out.print("\n Opcion: ");
		int opt = t.nextInt();
		
		return opt;
		
	}
	
}
