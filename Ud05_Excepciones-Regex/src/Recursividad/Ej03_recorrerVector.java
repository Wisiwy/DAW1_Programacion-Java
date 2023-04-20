package Recursividad;

import java.util.Scanner;

public class Ej03_recorrerVector {

	static String[] v = { "Bulbasaur", "Squirtle", "Mewtwo", "Sudowoododo", "Gengar" };

	public static void main(String[] args) {

//		Desde donde iteramos
		System.out.println("Recorrer:");
		recorrerVector(0);
		System.out.println("------------");

		System.out.println("Al reves:");
		recorrerVectorReves(v.length - 1);

		System.out.println("------------");
		System.out.println("Buscar:");

		Scanner t = new Scanner(System.in);
		String pat = t.nextLine();
		
		 pat = "Pedro";
		buscaRecursiva(0, pat);

		buscarElemento(v.length - 1,pat);

	}

//	Metodo profe recursividad
	private static void buscaRecursiva(int i, String patron) {
		// if(v[p].compareTo(patron)==0 || p == v.length) {//Falla por ordenarlo del
		// reves
		if (i == v.length || v[i].compareTo(patron) == 0) { // El orden de las condiciones es importante las hace en
															// orcen
			if (i == v.length)
				System.out.println("No encontrado.");
			else
				System.out.println("Encontrado" + patron + "en posicion" + i + "/" + (v.length - 1));
		} else
			buscaRecursiva(i + 1, patron);
	}
	public static void buscarElemento(int p, String patron) {
		
//------Problema anidamiento en un if que comprueve las dos la vez
		if (p == v.length - 1)
			System.out.println("No esta.");
		if (v[p].compareToIgnoreCase(patron) == 0)
			System.out.println("Esta en el array.");
		else {
			buscarElemento(p + 1, patron);
		}

	}

	public static void recorrerVectorReves(int p) {
		if (p == 0)
			System.out.println(v[p]);
		else {
			System.out.println(v[p]);
			recorrerVectorReves(p - 1);
		}
	}

	public static void recorrerVector(int p) {

		if (p == v.length - 1)
			System.out.println(v[p]);
		else {
			System.out.println(v[p]);

			recorrerVector(p + 1);
		}

	}

	

}
