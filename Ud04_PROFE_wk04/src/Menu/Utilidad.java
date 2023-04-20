package Menu;

import java.util.Scanner;

public class Utilidad {
	
	
	public static int menu() {
		
		System.out.println();
		System.out.println("1 - Subir");
		System.out.println("2 - Bajar");
		System.out.println("3 - Entrar");
		
		System.out.println("0 - Salir");
		System.out.print("\n Opcion: ");
		
		Scanner t = new Scanner(System.in);
		int opt = t.nextInt();
		
		return opt;
	}

	public static int menu(String[] s) {
		
		System.out.println();

		for (int i = 0; i < s.length; i++) {
			System.out.println((i+1)+" - "+s[i]);
		}
		
		System.out.println("0 - Salir");
		System.out.print("\n Opcion: ");
		
		Scanner t = new Scanner(System.in);
		//int opt = t.nextInt();
		String dato;
		do {
			dato = t.nextLine();
			if(esNum(dato)==false)
				System.err.println("Introduce un número.");
		}while(!esNum(dato));
		
		int opt = Integer.parseInt(dato);
		
		return opt;
	}
	
	public static boolean validaCadena(String cad, String[] pos) {
		
		for (int i = 0; i < pos.length; i++) 
			if(pos[i].compareToIgnoreCase(cad)==0)
				return true;
		
		return false;
	}
	
	public static boolean esNum(String str) {
		
		for (int i = 0; i < str.length(); i++) 
			if(!Character.isDigit(str.charAt(i)))
				return false;
		
		return true;
	}
	

}
