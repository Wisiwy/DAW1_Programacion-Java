package ejerExtra;

import java.util.Arrays;

import aUtilidad.Dibujo;
import aUtilidad.Leer;
import aUtilidad.Vali;



public class DibujarLanda {

	public static void main(String[] args) {

		Dibujo.titulo("LANDA");
		int f=0;
		do {
			f = Leer.leerInt("Intro filas landa: ");
			if (Vali.esPosi(f)==false)
				System.err.println("Intro numero negativo.");
		} while (Vali.esPosi(f)==false);
		//¿?¿?¿?¿Como validar si esNum hay que meter string. Se puede castear Porque no me funciona?
		
		
//	 f = 4;
		int c = f * 2;
		char[][] matriz = new char[f][c];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ( j == ((c/2)-i) || j == ((c/2)+i) || j == (((c/2)-i)-1) || j == (((c/2)+i)-1)  )
					matriz[i][j] = '*';
				else
					matriz[i][j] = ' ';
			}
		}
		pintar(matriz);

	}

	private static void pintar(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

	}

}
