package Ejercicios_extra;

public class Ejer1 {
	
	public static void main(String[] args) {
		
		int[][] tabla1 = new int[4][4];
		int[][] tabla2 = new int[4][4];
		int[][] tabla3 = new int[4][4];
		
		generar(tabla1);
		System.out.println("\nTabla1");
		imprimir(tabla1);
		
		generar(tabla2);
		System.out.println("\nTabla2");
		imprimir(tabla2);
		
		tabla3 = sumar(tabla1,tabla2);
		System.out.println("\nTabla3");
		imprimir(tabla3);
		
	}
	
	public static int aleatorio() {
		return (int)(Math.random()*10);
	}
	
	public static void imprimir(int[][] uno) {
		
		for (int fila = 0; fila < uno.length; fila++) {
			for (int col = 0; col < uno[fila].length; col++) {
				System.out.printf(" %2d ",uno[fila][col]);
			}
			System.out.println();
		}
	}
	
	public static void generar(int[][] uno) {
		
		for (int fila = 0; fila < uno.length; fila++) {
			for (int col = 0; col < uno[fila].length; col++) {
				uno[fila][col]=aleatorio();
			}
		}
	}
	
	public static int[][] sumar(int[][] uno, int[][] dos) {
		
		int[][] resultado = new int[4][4];
		for (int fila = 0; fila < uno.length; fila++) {
			for (int col = 0; col < uno[fila].length; col++) {
				resultado[fila][col] = uno[fila][col] + dos[fila][col];
			}
		}
		return resultado;
	}

}
