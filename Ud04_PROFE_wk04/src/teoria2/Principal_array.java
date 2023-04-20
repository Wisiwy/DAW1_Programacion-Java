package teoria2;

import java.util.Scanner;

public class Principal_array {
	
	public static void main(String[] args) {
		
		
		Persona[] lista = new Persona[10];
		
		lista[5] = new Persona("Raul","Perez",24);
		lista[8] = new Persona();
		lista[8].setNombre("Vicente");
		lista[8].setApellido("Gimenez");
		lista[8].setEdad(8);
		
		//recorrer el array
		System.out.println();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		miMetodo(lista);
		
		//recorrer el array
		System.out.println();
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null)
				System.out.println(lista[i]);
		}
		
	}

	private static void miMetodo(Persona[] lista) {
		
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

}
