package aUtilidad;

import java.util.Scanner;

public class Dibujo {

	public static void titulo(String str) {
		System.out.printf("%n-------------------------------------%n");
		System.out.println("        " + str + "         ");
		System.out.println("--------------------------------------");
	}

	/**DIBUJAR MENU
	 * Escribe menu a partir de un vector de Strings.<BR>
	 * Valida que sea un numero y que este dentro del rango de opc.
	 * 
	 * 
	 * @param Strin[] opc
	 * @return valor int de la opcion elegida
	 */
	public static int menu(String[] opc) {
		
//		PINTA MENU
		System.out.println("Elige una opcion:");
		for (int i = 0; i < opc.length; i++) {
			System.out.printf("%2d - %s%n", (i + 1), opc[i]);
		}
		System.out.println("\n0 - Salir del programa.");
//		VALIDA que sea numero y que este en rango de opciones
		int select = 0;
		Scanner tec = new Scanner(System.in);
		String aux;
		do {
			aux = tec.nextLine();
			if (Vali.esNum(aux) == true)
				select = Integer.parseInt(aux);
			if (Vali.esNum(aux) == false || Vali.entreRangoNum(select, 0, opc.length) == false)
				System.err.printf("Dato introducido erroneo. Prueba de nuevo [0 -%2d].", opc.length);
		} while (Vali.esNum(aux) == false || Vali.entreRangoNum(select, 0, opc.length) == false);

//		System.out.println("numero elegido " + select); Sirvio para debugar.
		return select;
	}

	/**
	 * Pinta una matriz <strong>int</strong> <br>
	 * Si la matriz es de otro tipo de datos castear. (char)
	 *
	 * @param matriz
	 */

	public static void pintarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

	}
	/**
	 * Pinta una matriz <strong>char</strong> <br>
	 * Si la matriz es de otro tipo de datos castear. (char)
	 *
	 * @param matriz
	 */
	
	public static void pintarMatrizChar(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
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
			System.out.println(vector[i]);
		}

	}

}
