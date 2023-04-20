package EjerciciosTarde;

import java.util.Scanner;

public class Ej_06 {
 public static void main(String[] args) {
	
	boolean pedir = true;
	
	 do {
		 
		 System.out.println("Escribe una cadena de 2 caracteres: ");
	
		 try {
			Scanner teclado = new Scanner(System.in);
			String letras = teclado.nextLine();
			compruebaLongitud(letras);
			pedir = false;
			
		}catch(StringTooLongException a) {
			
			System.out.println(a.getMessage());		
		}
	 }while(pedir);
	 	//pedir == true
	 
}
	public static void compruebaLongitud(String cadena) throws StringTooLongException {
		
		if(cadena.length()==2)
			System.out.println(cadena);
		else if(cadena.length()<2)
			throw new StringTooLongException("tiene menos de dos caracteres", cadena);
		else
			throw new StringTooLongException("tiene más de dos caracteres", cadena);
		
	}
	
}
