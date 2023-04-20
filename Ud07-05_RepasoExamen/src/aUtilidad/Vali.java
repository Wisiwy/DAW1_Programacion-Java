package aUtilidad;

public class Vali {


	/**
	 * COMPROBAR SI STRING ES NUMERO<br>
	 * Comprueba de un <strong>string<strong> si es un numero o no. Si hay algo que
	 * no lo sea devuelve falso
	 * 
	 * @param str
	 * @return Si es o no un numero.
	 */
	public static boolean esNum(String str) {
		for (int i = 0; i < str.length(); i++)
			if (Character.isDigit(str.charAt(i)) != true)
				return false;

		return true;
	}

	/**
	 * Es num POSITIVO<BR>
	 * castear para otro tipo de datos.
	 * @param num int
	 * @return boolean es o no es positivo
	 */
	public static boolean esPosi(int num) {

		if (num >= 0)
			return true;
		else
			return false;

	}
	/**
	 * Es num NEGATIVO<BR>
	 * castear para otro tipo de datos.
	 * @param num int
	 * @return boolean es o no es negativo
	 */
	public static boolean esNega(int num) {

		if (num < 0)
			return true;
		else
			return false;

	}
	
	/**VER NUMERO DENTRO DE RANGO
	 * Ver si un numero dado estra entre otros dos. 
	 * @param num - Numero a comparar
	 * @param menor - Rango menor
	 * @param mayor - Rango mayor
	 * @return true (dentro) false(fuera)
	 */
	public static boolean entreRangoNum(int num, int menor, int mayor ) {

		if (num >= menor && num <= mayor)
			return true;
		else
			return false;

	}
	

	/**
	 * NUMERO ES PRIMO
	 * 
	 * @param int num
	 * @return boolean dice si es o no es primo
	 */
	public static boolean esPrimo(int num) {
		for (int n = 2; n < num / 2; n++) { // comprobar si es divisible entre 1 y si mism, empezar desde 0
			if (num % n == 0)
				return false;// break point romper bucle cuando encuentre uno divisible salga bucle
								// devolviendo false
		}
		return true; // devuelve true si pasa por todo el bucle.
	}

	public static boolean compararStrings(String[] lista, String mnsj) {

		boolean aux = false;
		String str = "";
		str = Leer.leerString(mnsj);
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].compareTo(str) == 0) {
				aux = true;
				i = lista.length;
			}
		}
		if (aux == false)
			System.err.println("Error, valor no conocido.");

		return aux;

	}



}
