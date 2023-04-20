package teoria_StringsArrays;

import java.util.Iterator;

public class Clase03_Strings {

	public static void main(String[] args) {

		// Formas construir Strings
		String cad;
		cad = "Ra�l";

		String cad2 = "Rub�n";

		String cad3 = new String("Mar�a");

		//////////////////////////// SACAR
		//////////////////////////// PANTALLA//////////////////////////////////////////
		System.out.println(cad + cad2 + cad3);

		cad2 = cad2 + cad;

		System.out.println(cad2);

		/////////////////////////////////////// METODOS ctrl + space y los
		/////////////////////////////////////// miramos////////////////
		for (int pos = 0; pos < cad.length(); pos++) {
			System.out.println(cad.charAt(pos)); // charAt : saca la posicion que ocupa la letra en el estring

		}
		/////////////////////////////////// INICIALIZAR CADENA
		/////////////////////////////////// VACIA///////////////////////
		cad = "";
		cad2 = "      ";

		System.out.println("cad: " + cad);
		System.out.println("cad2: " + cad2);

		if (cad2.isBlank())
			System.out.println("cad2 est� blanco");

		if (cad.isEmpty())
			System.out.println("cad is vacia");

		if (cad == "")
			System.out.println("cad esta vacia"); // *********EL MAS USADO*********

		if (cad.equals(""))
			System.out.println("cad esta vacia");

		if (cad.compareTo("") == 0)
			System.out.println("cad esta vacia");

		////////////////////////////////// ORDENAR///////////////////
		
		cad = "Fernando"; // Ordenar por el metodo asci comparando 2 cadenas
		cad2 = "Francisco";

		if (cad.compareTo(cad2) > 0) // Realiza una comparacion de los datos sacadaos de cada letra con el codigo
										// ascci
			System.out.println(cad2 + " , " + cad); // Le damos el orden nosotros con los if
		else
			System.out.println(cad + " , " + cad2);

		System.out.println(cad.toUpperCase());

		////////////////////////////////// COMPARAR STRINGS///////////////////////////

		String str1 = "zarzamora";
		String str2 = "tren";

		if (str1 == str2) {
			System.out.println(" == iguales");
		} else {
			System.out.println(" == tururu");
		}

		if (str1.equals(str2)) {
			System.out.println("equals iguales");
		} else {
			System.out.println("equals tururu");
		}

		if (str1.compareTo(str2) == 0) {
			System.out.println("compareto iguales");
		} else {
			System.out.println("compareto tururu");
		}

		if (str1.compareTo(str2) > 0) {
			System.out.println(str2 + ", " + str1);
		} else {
			System.out.println(str1 + ", " + str2);
		}

		String str = "Hola que tal";
		str = str.replace(" ", "");
		System.out.println(str);

	}

}
