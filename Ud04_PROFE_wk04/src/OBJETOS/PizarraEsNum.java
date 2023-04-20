package OBJETOS;

import Estaticos.Leer;

public class PizarraEsNum {
	
	
	public static void main(String[] args) {
		
		
		String valor = Leer.leerCadena("dame un num: ");
		
		if(esNum(valor))
			System.out.println("es un numero.");
		else
			System.out.println("no es un numero");
		
		
		
		
	}
	
	public static boolean esNum(String num) {
		
		for (int i = 0; i < num.length(); i++) 
			if(!Character.isDigit(num.charAt(i)))
				return false;
		
		return true;
	}

}
