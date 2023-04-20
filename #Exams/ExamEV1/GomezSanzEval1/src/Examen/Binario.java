package Examen;

import java.util.Iterator;

import aUtilidad.Dibujo;

public class Binario {

	public static void main(String[] args) {
		boolean[] b1 = new boolean[8];
		for (int i = 0; i < b1.length; i++) {
			int aux = (int) (Math.random() * 2);
			System.out.print(aux + ",");
			if (aux == 0)
				b1[i] = false;
			else
				b1[i] = true;
		}
		
		
		boolean[] b2 = new boolean[8];
		for (int i = 0; i < b2.length; i++) {
			int aux = (int) (Math.random() * 2);
			if (aux == 0)
				b2[i] = false;
			else
				b2[i] = true;
		}
		Dibujo.titulo(" VECTORES BOOLEANOS");
		System.out.println("Vector 1: ");
		mostrar(b1);
		System.out.println("Vector 2: ");
		mostrar(b2);
		System.out.println("Resultao comparacion: ");
		mostrar(comparar(b1, b2));

	}

	private static boolean[] comparar(boolean[] b1, boolean[] b2) {
		boolean[] aux = new boolean[8];
		for (int i = 0; i < aux.length; i++) {
			
			if (b1[i] == true || b2[i]==true) 
				aux[i] = true;
			else
			aux[i] = false;
			}
		return aux;
		
	}

	private static void mostrar(boolean[] b) {
		System.out.print("[");
		for (int i = 0; i < b.length; i++) {
			if (b[i] == true)
				System.out.print(1 + ",");
			if (b[i] == false)
				System.out.print(0 + ",");
		}
		System.out.print("]");
		System.out.println();
	}

}
