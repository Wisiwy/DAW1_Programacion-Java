package teoria_StringsArrays;

import java.util.Arrays;

public class Clase04_MetodosArray {
	public static void main(String[] args) {
		int[] vector = { 5, 3, 4, 2, 1 };

	// .toString: conviertte en una cadena
		System.out.println(Arrays.toString(vector));
		
	// .sort: los ordena
		Arrays.sort(vector);
		System.out.println(Arrays.toString(vector));
		
	// .copyOf: copia del vector origen (de donde, n primeros valores que copia)
		int[] v2 = Arrays.copyOf(vector, 2);
		System.out.println("CopyOf: " + Arrays.toString(v2));
		
	// .copyOfRange: 3 parametros (donde, inicio, final)
		int[] v3 = Arrays.copyOfRange(vector, 2, 5);
		System.out.println(Arrays.toString(v3));
		
	// .fill: inicializar con todo 3. (donde, con que valor)
		int[] v4 = new int[5];
		Arrays.fill(v4, 3);
		System.out.println(Arrays.toString(v4));

		int[] v5 = new int[5];
	// .setAll: igual que fill pero puedo pasarle una funcion (inicializar con numeros randoms)
		Arrays.setAll(v5, (i) -> (int) (Math.random() * 100));
		System.out.println(Arrays.toString(v5));

	}
}
