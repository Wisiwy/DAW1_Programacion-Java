package Ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio15_20reales {
	//Escriba un programa que lea por teclado 20 números reales y calcule su media. 
	//Hacerlo sin utilizar 20 variables reales.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("*******CALCULADORA MEDIA (20 numeros reales)*******");
		System.out.println("Introduzca 20 numeros para hacer su media: ");
		int valor = teclado.nextInt();
		int med = 0;

		for (int i = 2; i <= 20; i++) { // Iterar 20 veces
			valor = valor + teclado.nextInt();
			System.out.println("La media por ahora es: " + (valor / i));
			System.out.println("Llevo metidos " + i + (" numeros."));
			med = valor/i;
		}
		System.err.println(
				"Ya has introducido 20 numeros capullo, para ya avaricias. n "
				+ "Tu media total es: " + med);
	
	teclado.close();
	}

}
