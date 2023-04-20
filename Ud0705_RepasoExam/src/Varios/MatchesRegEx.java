package Varios;

import aUtilidad.Regex;

public class MatchesRegEx {

	
	
	public static void main(String[] args) {
		String dato = "";
		String patron = Regex.getH24();
		
		if(dato.matches(patron)) //Que el string dato matchea 
			System.out.println("Valido!!");
		else
			System.err.println("Patron No valido!!!");


		
	}
	
	
}
