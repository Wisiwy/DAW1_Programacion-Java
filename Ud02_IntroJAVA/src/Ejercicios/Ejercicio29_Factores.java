package Ejercicios;

import java.util.Scanner;

public class Ejercicio29_Factores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("******FACTORES PRIMOS******");
		System.out.println("------------------------------");
		int num = teclado.nextInt();
		int div = 2;

		while (num > 1) {
			if (num%div==0){
				//System.out.print(div + " ");
				//Nos reta a que salga con formato como el de la hora numero tuberia y factor
				System.out.printf(" %3d | %-2d \n",num, div); //Con simbolo negativo alineo a la izq
				num = num / div;
			}else {
				div++;
			}

		}
		System.out.printf(" %3d | %-2d \n",num, div);
		
		
//		while (num % div != 0) {
//			for (div = 2; div < num; div++) { // comprobar si es divisible entre 1 y si mism, empezar desde 0
//				if (num % div == 0) {
//					num = num / div;
//					System.out.println(div);//
//				}
//
//				teclado.close();
//			}
//
//		}
	}
}