package Ejercicios;

public class Ejercicio19Ex_Euromillon {
//imprimir los 50 primeros numeros como un vboleto de loteria
// del euromillon
	public static void main(String[] args) {
		for (int i = 1; i<=50; i++) {
		System.out.println();
		for (int fila = 1; fila <= 9; fila++) {
			//System.out.print(" " + fila);
			int col = 0;
			int dato = fila + col * 9;
			while (col < 6 && dato <= 50) {
				System.out.printf(" %2d ", dato);
				col++;
				dato = fila + col * 9;
			}

		}
	}
	}
}

//Super mal repasar