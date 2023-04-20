package ejer_RepasoArrays;

import java.util.Arrays;

import aUTILIDAD.Dibujo;

public class ej04_mayMenMAtriz {

	public static void main(String[] args) {

		int[][] matriz = new int[5][5];
		for (int z = 0; z < matriz.length; z++) {
			for (int j = 0; j < matriz[z].length; j++) {
				matriz[z][j] = (int) (Math.random() * 200 - 100);
//				Arrays.setAll(matriz, i -> (int)(Math.random()*200-100));
			}
		}
		Dibujo.pintarMatriz(matriz);
//		mayor y menor y su posicion
		int may = 0;
		int mayposi1 = 0;
		int mayposi2 = 0;
		int men = matriz[0][0];
		int menposi1 = 0;
		int menposi2 = 0;
		for (int z = 0; z < matriz.length; z++) {
			for (int j = 0; j < matriz[z].length; j++) {
				if (matriz[z][j] > may) {
					may = matriz[z][j];
					mayposi1 = z;
					mayposi2 = j;
				}
				if (matriz[z][j] < men) {
					men = matriz[z][j];
					menposi1 = z;
					menposi2 = j;
				}
//				Arrays.setAll(matriz, i -> (int)(Math.random()*200-100));
			}
		}
		System.out.printf("Mayor: %2d [%02d][%02d] // Menor: %2d [%02d][%02d]",may,(mayposi1+1),(mayposi2+1),men,(menposi1+1),(menposi2+1));

	}

}
