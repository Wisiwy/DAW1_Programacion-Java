package Ejercicios;

import java.util.Scanner;

//6.	Escriba un programa que haga lo contrario al ejercicio anterior.
public class Ejercicio06_SegAHoras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("************CONVERSOR DE SEG a HORAS.************");
		System.out.print("Introduce cuantas segundos quieres convertir: ");
		int segtotal = teclado.nextInt();
		// Dividimos segtotal para 3600 para calcular horas
		int min = segtotal / 60;
		int seg = segtotal % 60;
		// con % cogemos el resto de la division para actualizar seg total
		if (min > 59) {
			int horas = min / 60;
			min = min % 60;
			System.out.println(horas + " horas, " + min + " minutos, " + seg + "segundos");
		} else {
			System.out.println(min + " minutos, " + seg + "segundos");
		}

		// Calculamos los min dividiento los nuevos segtotal para 60

		// Solucion

		teclado.close();
	}

}
