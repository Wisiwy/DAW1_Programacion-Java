package teoria_StringsArrays;

import java.util.Arrays;
import java.util.Iterator;

import aUTILIDAD.Leer;

public class Clase06_PintarConArrays {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][6];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) { //la longitud de las columnas
				matriz[i][j]=5;
			}
		}
//		Metodo pintar la matriz
		pintar(matriz);
//		***Elegir una posicion y cambiar le el valor
		for (int i = 0; i < matriz.length; i++) {
			int x = Leer.leerInt("f(0-2): ");
			int y = Leer.leerInt("y(0-5): ");
			int valor = Leer.leerInt("Valor celda: ");
			
			matriz[x][y] =valor;
			System.out.println();
			pintar (matriz);
		}
		
//		Arrays.fill(matriz, 1);
		
		
	}

	private static void pintar(int[][] m) {
		for (int f = 0; f < m.length; f++) { //para cada fila
			for (int c = 0; c < m[f].length; c++) { //recorroro las columnas
				System.out.printf(" %2d , ", m[f][c]);//pinto la fila
			}
			System.out.println(); //pinta salto de carro
		}
		
		
	}

}
