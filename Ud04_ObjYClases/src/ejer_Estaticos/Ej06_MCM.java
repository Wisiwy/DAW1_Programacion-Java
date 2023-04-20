package ejer_Estaticos;

import aUtilidad.Dibujo;
import aUtilidad.Leer;
import aUtilidad.Mates;

public class Ej06_MCM {

	public static void main(String[] args) {

		Dibujo.titulo("MINIMO COMUN MULTIPLO");
		
		int p = Leer.leerInt("Intro n�:");
		int q = Leer.leerInt("Intro n�:");
		Mates.mcm(p, q);
	}

}
