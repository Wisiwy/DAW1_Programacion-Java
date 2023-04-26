package aUtilidad;

public class Mates {

	/**
	 * FACTORIAL DE NUMERO El N*(N-1)*(N-2)....
	 * 
	 * @param n
	 * @return int con factroial de num hasta el 25 (m�s no te permite
	 */
	public static int esFactorial(int n) {
		int fact = 1;
		System.out.printf("F(%2d)/", n);
		for (int i = 1; i <= n; i++) {
			fact = i * fact;
		}
		return fact;
	}

	/**
	 * NUMERO DIVISORES<br>
	 * Calcular numero de <strong>divisores</strong> de un numero
	 * 
	 * @param q entero
	 * @return entero con el numero de divisores de q
	 */
	public static int calcDivi(int q) {
		int divi = 2;
		for (int i = 2; i <= q; i++) {
			if (q % i == 0)
				divi++;
		}
		return divi;
	}

	/**
	 * NUMERO DE DIVISORES Cuenta el numero de divisores de un num
	 * 
	 * @param num
	 * @return int la cantidad de divisores del numero cuantos tiene
	 */
	public static int numDiv(int num) {

		int cont = 2;

		for (int i = 2; i < num; i++)
			if (num % i == 0)
				cont++;

		return cont;
	}

	/**
	 * MCD Maximo Comun Divisor
	 * 
	 * @param num1
	 * @param num2
	 * @return Maximo Comun Divisor
	 */
	public static int mcd(int num1, int num2) {
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		int mcd = 0;
		do {
			mcd = b;
			b = a % b;
			a = mcd;
		} while (b != 0);
		System.out.printf("Maximo Comum Divisor (%d,%d) = %d %n ", num1, num2, mcd);
		return mcd;
	}

	/**
	 * MCM Maximo Comun Multiplo
	 * 
	 * @param num1
	 * @param num2
	 * @return Devuelve el Maximo Comun Multiplo de dos numeros
	 */
	public static int mcm(int num1, int num2) {
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		int mcm = (a / mcd(num1, num2)) * b;
		System.out.printf("Minimo Comum Multiplo (%d,%d) = %d %n", num1, num2, mcm);
		return mcm;
	}

	/**
	 * Tabla de MULTIPLICAR de un int
	 * 
	 * @param num
	 */
	public static void tablaMultiplicar(int num) {
		System.out.println("Tabla de multiplicar de " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%4d x %02d = %3d\n", num, i, (num * i));
		}

	}

	/**
	 * MEDIA VARIOS NUVEROS
	 * 
	 * @param vector
	 * @return double con MEDIA
	 */
	public static double miMedia(double[] vector) {
		double valor = 0.0, suma = 0.0;

		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}

		valor = suma / vector.length;

		return valor;
	}

	/**
	 * LONGITUD DE CIRCUNFERENCIA
	 * 
	 * @param r radio
	 * @return double longitud circu
	 */
	public static double circLong(int r) {
//	Calcular 2*pi*r
		double longi = 2 * Math.PI * r;
		return longi;
	}

	/**
	 * SUPERFICIE CIRCUNFERENCIA
	 * 
	 * @param double radio
	 * @return double superficie
	 */
	public static double circSuperfi(int r) {
//	 pi*r^2
		double sup = Math.PI * (r * r);
		return sup;
	}

	/**
	 * VOLUMEN ESFERA
	 * 
	 * @param r radio int
	 * @return vol volumen double
	 */
	public static double circVolum(int r) {
//		4/3*pi*r3
		double vol = (4 / 3) * Math.PI * (r * r * r);
		return vol;
	}
}
