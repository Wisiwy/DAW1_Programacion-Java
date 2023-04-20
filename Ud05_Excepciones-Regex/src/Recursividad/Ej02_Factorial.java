package Recursividad;

public class Ej02_Factorial {

	public static void main(String[] args) {
//		Factorial de un num
		int num = 6;
		int resultado = factorial(num);
		System.out.println("resultado:" + resultado);

	}

	private static int factorial(int n) {
		int r = 0;
		// Parada donde para
		if (n == 1)
			r = n;
		else
			r = n * factorial(n-1);
//		Empieza a calcular al cerrar la recursividad
		System.out.println("-->");

		return r;
	}

}
