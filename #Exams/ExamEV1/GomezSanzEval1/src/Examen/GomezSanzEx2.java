package Examen;

import java.util.Iterator;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class GomezSanzEx2 {

	public static void main(String[] args) {
		Dibujo.titulo("SIMBOLO");
		int valor = Leer.leerInt("Intro altura:");

		for (int fila = 1; fila <= (valor*2)-1; fila++) {
			for (int col = 1; col <= valor; col++) {
				if (fila == col || (fila - valor) == (valor -col)) 
					System.out.print("**");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		

	}

}
