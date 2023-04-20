package ejerExtra;

import java.util.Arrays;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class DibujarCruz {
	public static void main(String[] args) {

		int num = 6;
//		do {
//			
//			num = Integer.parseInt(Leer.leerString("Tamaño cruz: "));
//					
//		} while (num<3);

		char[][] matriz = new char[num][num * 2];

		// Num == IMPAR
		if (num % 2 != 0) {

			for (int i = 0; i < matriz.length; i++) {
				if (i == num / 2) {
					for (int j = 0; j < matriz[i].length; j++) {
						if ((j % 2) == 0)
							matriz[i][j] = '*';
					}

				} else {
					for (int j = 0; j < matriz[i].length; j++) {
						if (j == (num - 1))
							matriz[i][j] = '*';
					}

				}
			}
			// Num == PAR
		} else {
			for (int i = 0; i < matriz.length; i++) {
				if ((i == num / 2) || (i == (num / 2) - 1)) {
					for (int j = 0; j < matriz[i].length; j++) {
						if ((j % 2) == 0)
							matriz[i][j] = '*';
					}

				} else {
					for (int j = 0; j < matriz[i].length; j++) {
						if ((j == (num))||(j == (num-2)) )
							matriz[i][j] = '*';
					}

				}
			}

		}

//	
		Dibujo.pintarMatrizChar(matriz);

	}

}
