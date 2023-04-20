package Ejercicios;

import java.util.Scanner;

public class Ej_06 {
	
	public static void main(String[] args)  {
		
		String cad="";
		do {
			try {
				Scanner t = new Scanner(System.in);
				System.out.print("Cadena: ");
				cad = t.nextLine();
				
				compruebaLongitud(cad);
				System.out.println("Longitud de cadena correcta!");
				
			}catch(StringTooLongException e) {
				System.err.println(e.getMessage());
			
			}catch(Exception e) {
				System.err.println("Se ha producido un error");
			}
		}while(cad.length() != 2);
		
	}
	
	public static void compruebaLongitud(String cad) throws StringTooLongException {
		
		if( cad.length() > 2)
			throw new StringTooLongException("mayor de 2 caracteres.",cad);
		else if(cad.length() < 2)
			throw new StringTooLongException("menor de 2 caracteres.",cad);
			
	}

}
