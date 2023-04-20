package teoria_StringsArrays;

public class Clase02_Matriz {
	public static void main(String[] args) {

		// MATRIZ 1 fila/columna
		double[][] matriz1 = new double[2][3];
		System.out.println("*******MATRIZ 1*******");
		System.out.println("----------------------");
		matriz1[0][0] = 8;
		matriz1[0][1] = 6.1;
		matriz1[0][2] = 9.2;

		matriz1[1][0] = 7.6;
		matriz1[1][1] = 9.1;
		matriz1[1][2] = 1.2;

//		*****RECORRER MATRIZ
		for (int fila = 0; fila < matriz1.length; fila++) { // Fallo habitual no empezar en 0
			System.out.println("Fila : " + fila);
			// Recorro todas las columnas que hay POR CADA fila
			for (int col = 0; col < matriz1[0].length; col++) { // Cogemos la longitud de una fila [0] para recorer las
																// columnas.
				// Muestra el valor que hay en ese hueco de la matriz en
				System.out.println("col: "+(col+1)+" - "+matriz1[fila][col]);
				// fila [0] col[1] esta el 6.1.
			}
			System.out.println();
		}
		
		System.out.println();
		// MATRIZ 2: insertar por cadena json.
		double[][] matriz2 = { { 9, 8, 7, 6 }, { 5, 4, 3, 2 }, { 1.2, 2.4, 8.7, -9.4 } };
		System.out.println("*******MATRIZ 2*******");
		System.out.println("----------------------");
		for (int fila = 0; fila < matriz2.length; fila++) { // Fallo habitual no empezar en 0
			System.out.println("Fila2 : " + fila);
			// recollor todas las columnas que hay POR CADA fila
			for (int col = 0; col < matriz2[0].length; col++) { // Cogemos la longitud de una fila [0] para recorer las
																// columnas.
				System.out.print(matriz2[fila][col] + " | "); // muestra el valor que hay en ese hueco de la matriz en
															// fila 0 col1 esta el 6.1.
			}
			System.out.println();

		}
	}
}
