package ejer_StringsArrays_Profe;

import java.util.Arrays;

import java.util.Scanner;

import aUTILIDAD.Leer;

public class Ej_15 {
	
	//15.	a) Pedir la nota de 5 alumnos (Igual para 500) y luego mostrarlas.
	//b) Despu�s modificar el programa para que al final muestre todas las notas y calcule la nota media.
	//c) Modificar el anterior programa, para que despu�s de pedir las 5 notas, muestre la nota media, y las notas que sean superior a la media.
	//d) Finalmente, igual que la opci�n c), pero que muestre la mejor y la peor nota.
	//e) Modificarlo de nuevo para que sume 1 punto a todos los alumnos que superen la nota media.

	public static void main(String[] args) {
		
		System.out.println("Programa a: ");
		//a();
		
		System.out.println("Programa b: ");
		b();
		
		
		
		
		
	}
	
	private static void b() {
		
		int cant = 0;
		do{
			cant = Leer.leerInt("cantidad de notas: ");
		}while(cant <= 0 );
		
		
		double[] lista = new double[cant];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = Leer.leerDouble("nota("+(i+1)+"): ");
		}
		
		System.out.println(Arrays.toString(lista));
		
		double media =0;
		for (int i = 0; i < lista.length; i++) {
			//como hago la media??
			media = media+lista[i];
		}
		media = media/lista.length;
		System.out.printf(" nota media: %5.2f ",media);
		
	}

	public static void a() {
		
		int cant = 0;
		do{
			cant = Leer.leerInt("cantidad de notas: ");
		}while(cant <= 0 );
		
		
		double[] lista = new double[cant];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = Leer.leerDouble("nota("+(i+1)+"): ");
		}
		
		System.out.println(Arrays.toString(lista));
	}

}
