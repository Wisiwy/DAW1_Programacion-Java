package ARRAYS;

import java.util.Arrays;
import java.util.Iterator;

import Estaticos.Leer;

public class Principal {

	
	public static void main(String[] args) {
		
		
		int[][] matriz = new int[3][6];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=5;
			}
			
		}
		
		pintar(matriz);
		
		for (int i = 0; i < 3; i++) {
			int x = Leer.leerEntero("x(0-2): ");
			int y = Leer.leerEntero("y(0-5): ");
			int valor = Leer.leerEntero("Valor: ");
			
			matriz[x][y] = valor;
			
			System.out.println();
			pintar(matriz);
		}
	}

	private static void pintar(int[][] m) {
		
		for (int f = 0; f < m.length; f++) {//para cada fila
			for (int c = 0; c < m[f].length; c++) {//para cada columna
				System.out.printf(" %2d ",m[f][c]);
			}
			System.out.println();
		}
	}
	
	
	
}
