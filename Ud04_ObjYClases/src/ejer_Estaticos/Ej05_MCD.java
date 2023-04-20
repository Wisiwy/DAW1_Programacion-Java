package ejer_Estaticos;

import aUtilidad.Dibujo;
import aUtilidad.Leer;
import aUtilidad.Mates;

public class Ej05_MCD {
	public static void main(String[] args) {
		Dibujo.titulo("MAXIMO COMUN DIVISOR");
		int p = Leer.leerInt("Intro n1: ");
		int q = Leer.leerInt("Intro n2: ");
		
		Mates.mcd(p, q);
		
	}

}
