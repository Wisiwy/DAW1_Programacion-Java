package Ejercicios;

import java.util.Scanner;

// 19.	Elabore un programa que lea números enteros y escriba el número resultante de invertir sus cifras.
public class Ejercicio19_nEnteros {

	public static void main(String[] args) {
		
		System.out.println("*******INVERTIDOR DE NUMEROS*******");
		System.out.println("-----------------------------------");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nº a invertir: ");
		int num = teclado.nextInt();
		int inv = 0;
		int i = 0;
		
		//TODO MAL LA RAYADA. recorrer las posiciones a traves de multiplos de 10
//		for (int i = 1; i>=num; i = i*10) {
//			//Guardo en "pos" el resto de la division el 
//			int pos = num%i;
//			//Nuevo num restamos pos
//			num = num -pos;
//			//Guardo pos en inverso como 
//			inv = pos*i;
//			int inv2 = inv + pos;
//			
//		}
		
		
		
		
	}
}
