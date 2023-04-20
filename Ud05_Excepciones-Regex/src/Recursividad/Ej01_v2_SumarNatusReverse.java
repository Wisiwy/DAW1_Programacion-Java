package Recursividad;

public class Ej01_v2_SumarNatusReverse {

	public static void main(String[] args) {
		int num = 1;

		int resultado = sumaRecursiva(num);

	}
// Igual que v1 pero desde 10 a 1

	private static int sumaRecursiva(int num) {

		int r = 0;
		System.out.println("Num: " + num + " r: " + r);
//	num vale 10 al principio
		if (num == 10)
// entra cuando num sea 1
			r = num;

		else // entra en 10-2
		r = num + sumaRecursiva(num + 1);
		System.out.println("-->Num: " + num + " r: " + r);

		return r;
	}

}
