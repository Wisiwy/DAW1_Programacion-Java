package Ejercicios;

import java.util.Scanner;

public class Ejercicio08_MenuHoras {

	public static void main(String[] args) {
		System.out.println("******************Calculadora HORAS - SEGUNDOS********************");
		Scanner teclado = new Scanner(System.in);
		int select;
		boolean menu = true;
		while (menu) {

			System.out.println(" \n Que quieres hacer?:---------- \n");
			System.out.println("1 - Calcular SEGUNDOS a partir de horas.");
			System.out.println("2 - Calcular HORAS a partir de segundos.");
			System.out.println("0 - Salir del programa.");
			select = teclado.nextInt();

			if (select == 1) {

				System.out.println("************CALCULADORA DE SEGUNDOS.************");
				System.out.print("Introduce cuantas horas calcular: ");
				int h = teclado.nextInt();
				System.out.print("Introduce cuantas minutos calcular: ");
				int min = teclado.nextInt();
				System.out.print("Introduce cuantas segundos calcular: ");
				int seg = teclado.nextInt();

				// calcular cuantos segundos
				int segtotal;
				segtotal = (h * 3600) + (min * 60) + seg;
				System.out.println("Un total de " + segtotal + " segundos\n");

			} else if (select == 2) {

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
					System.out.println(horas + " horas, " + min + " minutos, " + seg + " segundos");
				} else {
					System.out.println(min + " minutos, " + seg + "segundos");
				}

			} else if (select == 0) {
				menu = false;
				System.out.println("Gracias por usa nuestra calculadora. HASTA PRONTO!");
			} else {
				System.err.println("*******ERROR!********\n Introduzca otro numero");
			}

		}


	}
}