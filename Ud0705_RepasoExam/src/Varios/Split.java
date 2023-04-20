package Varios;

public class Split {

	public static void main(String[] args) {

		/**EJEMPLO 1: Simbolos*///
		String str = "rojo;amarillo-verde_azul";
		String[] partes = str.split("[-:_;]"); //
		
		/**EJEMPLO 2: por letra**///
		String str2 = "esto es un emeplo de como funciona split";
		String[] partes2 = str2.split("(e[s|m])|(pl)"); // Divide por "es" o por "em" o "pl"
		
		for (int i = 0; i < partes.length; i++) {
			System.out.println(i+" -- "+partes[i]);
		}
		for (int i = 0; i < partes2.length; i++) {
			System.out.println(i+" -- "+partes2[i]);
		}
	
	}

}
