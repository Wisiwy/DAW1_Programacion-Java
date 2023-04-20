package Ejercicios;

import java.util.Scanner;
//5.	Escriba un programa que calcule 
//		la cantidad total de segundos a partir de horas, minutos y segundos pedidos al usuario.
public class Ejercicio05_HorasSegundos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("************CALCULADORA DE SEGUNDOS.************");

		System.out.print("Introduce cuantas horas calcular: ");
		int h = teclado.nextInt();
		System.out.print("Introduce cuantas minutos calcular: ");
		int min = teclado.nextInt();
		System.out.print("Introduce cuantas segundos calcular: ");
		int seg = teclado.nextInt();
		
		//calcular cuantos segundos
		
		int segtotal;
		segtotal = (h*3600) + (min*60) + seg;
		System.out.println("Un total de " + segtotal + " segundos");
		

		/*Solucion profe
		System.out.println(horas+" : " + min + " : " + seg);
		System.out.println("Total de: " + ((h*3600) + (min*60) + seg);
		*/
		
		
		
		
		teclado.close();
	}

}
