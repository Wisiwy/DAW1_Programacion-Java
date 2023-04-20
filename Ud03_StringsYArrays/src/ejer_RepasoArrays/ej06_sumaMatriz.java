package ejer_RepasoArrays;

import java.util.Iterator;

import aUTILIDAD.Dibujo;

public class ej06_sumaMatriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) ((Math.random()*10)-5);
			}
		}
		Dibujo.pintarMatriz(matriz);
//		Suma filas
		int sumfil = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				sumfil+=matriz[i][j];
			}
			System.out.printf("Suma fila %d = %2d. %n",(i+1),sumfil);
			sumfil=0;
		}
		System.out.println("----------------------");
		int sumcol = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				sumcol+=matriz[j][i];
			}
			System.out.printf("Suma columna %d = %2d. %n",(i+1),sumcol);
			sumcol=0;
		}
	
	}

}
