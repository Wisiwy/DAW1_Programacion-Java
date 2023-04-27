import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Leer {
	public static int entero(String texto) {
		int valor;
		String var;
		while (true) {
			var = cadena(texto);
			try {
				valor = Integer.parseInt(var);
				return valor;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Error de datos");
			} 
		}
	}

	public static String cadena(String texto) {
		Scanner teclado = new Scanner(System.in);
		String valor;
		System.out.println(texto);
		valor = teclado.nextLine();
		return valor;
	}

	public static String cadena(String regex, String texto) {
		Scanner teclado = new Scanner(System.in);
		String valor;
		System.out.println(texto);
		valor = teclado.nextLine();
		try {
			while (!valor.matches(regex)) {
				System.out.println(texto);
				valor = teclado.nextLine();
			}
		} catch (PatternSyntaxException e) {
			// TODO Auto-generated catch block
			System.out.println(regex + " No es una expresión regular");
			return null;
		}
		return valor;
	}
	
	public static float real(String texto) {
		float valor;
		String var;
		while (true) {
			var = cadena(texto);
			try {
				valor = Float.parseFloat(var);
				return valor;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Error de datos reales");
			} 
		}
		
	}

	public static double doble(String texto) {
		double valor;
		String var;
		while (true) {
			var = cadena(texto);
			try {
				valor = Double.parseDouble(var);
				return valor;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Error en los datos tecleados");
			} 
		}
	}

	public static int menu(String[] menu) {
		int opcion = -1;
		for (int i = 1; i < menu.length; i++) {
			System.out.println(i + ".-" + menu[i]);
		}
		System.out.println("0.-" + menu[0]);
		while (opcion < 0 || opcion >= menu.length) {
			opcion = entero("Elije opción");
		}
		return opcion;
	}
}
