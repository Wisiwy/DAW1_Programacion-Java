package teoria;

import java.util.Scanner;

public class Ej_array {
	
	public static void main(String[] args) {
		
		
		Persona[] lista = new Persona[10];
		lista[5] = new Persona("Andrii","Alvarez",21);
		
		int opt = 0;
		
		do {
			opt = menu();
			
			if(opt == 1) {
				opcion1(lista);
			}else if(opt == 2) {
				opcion2(lista);
			}else if(opt == 3) {
				opcion3(lista);
			}else if(opt != 0) {
				System.err.println("opcion no valida");
			}
				
			
		}while(opt != 0 );
		
	}
	
	private static void opcion2(Persona[] lista) {
		System.out.println();
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null)
				System.out.println(i +" :::: " + lista[i]);
		}
		
		System.out.println();
		Scanner t = new Scanner(System.in);
		System.out.print("Borrar: ");
		int opt = t.nextInt();
		
		lista[opt] = null;
		
	}

	private static void opcion1(Persona[] lista) {
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] == null) {
				
				Scanner t = new Scanner(System.in);
				
				Persona aux = new Persona();
				
				System.out.print("Nombre: ");
				aux.setNombre(t.nextLine());
				System.out.print("Apellido: ");
				aux.setApellido(t.nextLine());
				System.out.print("Edad: ");
				aux.setEdad(t.nextInt());
				
				lista[i] = aux;
				i = lista.length;
				
			}
				
		}
		
		
	}

	private static void opcion3(Persona[] lista) {
		
		System.out.println();
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null)
				System.out.println(lista[i]);
		}
	}

	public static int menu() {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1 - Añadir persona");
		System.out.println("2 - borrar persona");
		System.out.println("3 - listar personas");
		System.out.println("0 - Salir");
		
		System.out.print("\n  Opcion: ");
		
		return t.nextInt();
		
	}
	

}
