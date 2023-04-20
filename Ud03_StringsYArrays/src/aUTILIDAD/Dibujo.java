package aUTILIDAD;

import java.util.Scanner;

public class Dibujo {

	public static void titulo(String str) {
		System.out.println("------------------------");
		System.out.println("        " + str + "         ");
		System.out.println("------------------------");
	}

	/**
	 * Escribe menu a partir de un vector de Strings
	 * 
	 * @param Strin[] opc
	 * @return valor int de la opcion elegida
	 */
	public static int menu(String[] opc) {
		System.out.println("Elige una opcion:");
		for (int i = 0; i <= opc.length; i++) {
			if (i == opc.length) {
				System.out.println("\n0 - Salir del programa.");
				break;
			}
			System.out.printf("%d - %s.%n", (i + 1), opc[i]);
		}
		Scanner tec = new Scanner(System.in);
		int select = tec.nextInt();
//validar que sea un int.
		return select;
//			System.out.printf("%d - %s.%n",i,hola[i]);

	}

	/**
	 * Pinta una matriz <br>
	 * Si la matriz es de otro tipo de datos castear. (char)
	 *
	 * @param matriz
	 */

	public static void pintarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(" %3d",matriz[i][j]);
			}
			System.out.println();
		}

	}

	/**
	 * Pinta una vector <br>
	 * Si la vector es de otro tipo de datos castear. (char)
	 *
	 * @param vector int o castear
	 */

	public static void pintarVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + ",");
		}

	}

}
