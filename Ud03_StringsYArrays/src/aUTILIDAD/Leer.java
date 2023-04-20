
package aUTILIDAD;


import java.util.Scanner;

public class Leer {

	//Clase Leer que leer� diferentes tipos. Clase static.
	/**
	 * Leer Entero (nextInt)
	 * @param str - Escribir en pantalla
	 * @return valor - numero entero leido
	 */
	public static int leerInt(String str) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(str);
		valor = teclado.nextInt();
		
		return valor;
	}
	
	/**
	 * Leer entero POSITIVO. (nextInt
	 * @param string
	 * @return valor int positivo
	 */
	public static int leerIntPosi(String string) {

		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.print(string);
			valor = teclado.nextInt();
			if (valor < 0)
				System.err.println("Numero erroneo.");
		} while (valor < 0);
		return valor;
	}
	
	
	
	public static double leerDouble(String str) {
		
		double valor;
		String valorSTR;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(str);
		//valor = teclado.nextDouble();
		valorSTR = teclado.next();
		if(valorSTR.indexOf(".") > 0) {
			valorSTR.replace(".", ",");
		}
		valor = Double.parseDouble(valorSTR);

		return valor;
	}
	
	public static String leerString(String str) {
		
		String valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(str);
		valor = teclado.nextLine();

		return valor;
	}
	
/**BUSCAR dentro vector double.
 * Busca un double dentro de un vector de doubles.
 * @param vector
 * @param nota
 * @return
 */
	public static int miBusca(double[] vector, double nota) {
		int valor = -1;
		boolean encontrado = false;
		
		for(int i=0;i<vector.length;i++) {
			//if(vector[i] == nota && encontrado == false) {
			if(vector[i] == nota && !encontrado) {
				valor = i+1;
				encontrado = true;
			}
				
		}
						
		return valor;
	}
	

}
