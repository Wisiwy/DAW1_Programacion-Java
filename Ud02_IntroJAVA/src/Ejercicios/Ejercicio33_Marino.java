
package Ejercicios;

import java.util.Scanner;

public class Ejercicio33_Marino {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("*******La GUAZA del MARINO*******");
		System.out.println("-----------------------------------");
		boolean fin = true;
		int y = 0, x = 0;
//		CALCULAR FIN JUEGO. (avance por teclado)
//		do { **PAra entrrada teclado			

		// 						AVANCE ALEATORIO
		for (int i = 1; i <= 10 && fin == true; i++) {

			int num = (int) (Math.random() * 200 - 10);
			System.out.printf("\n \n Dado:%3d; Vuelta:%2d.\n ", num, i);
			Thread.sleep(500);
			// Thread.sleep(500);

//				//				AVANCE POR TECLADO
//				Scanner teclado = new Scanner(System.in);
//				System.out.print("\nIntroduce un numero: ");
//				int num = teclado.nextInt();

				// 				MOVIMIENTO QUE HACE
			if (num < 0) {
				//se duerme el pirata
				System.out.println("Vaya tu pirata se ha dormido.");
				fin = false;

			} else if (num % 2 == 0) {
				//dar paso hacia delante
				y = y + 1; //Tambien se puede y++;
				System.out.printf("AVANZA. Ole my guazas. \n Coord: x = %02d / y = %02d",x , y); //%02d rellena con 0 a la izq
				if (y == 15) {
					System.out.printf("Congrats Ramon el Marinero, llego al barco. \n Coord: x = %2d / y = %2d.",x , y);
					fin = false;
					}
			} else if ((num%2 != 0) && ((num - 1) % 4 == 0)) {
				//Da paso derecha
				x++;
				System.out.printf("DERECHA. Vas midiendo las aceras.\n Coord: x = %2d / y = %2d.",x ,y);

			} else {
				x--;
				System.out.printf("IZQ. Das la mano al mismo dos veces. \n Coord: x = %2d / y = %2d.", x, y);
			}

			if (Math.abs(x) == 3) {
				System.out.printf("Ha sonado CHOF!!, trae el harpon mariano, Ramon lo ha vuelto hacer \n Coord: x = %2d / y = %2d.", x, y);
				fin = false;
			}
			if (i==10) {
				System.out.printf("¡Ni PALANTE ni PA ATRAS! \n Te quedaste a mitad gandul\n Coord: x = %2d / y = %2d.", x, y);
			}
		}
//		} while (fin == true);**Para entrada teclado

		System.err.println("\n \n FIN DEL JUEGO");
	}
}

//int num = Math.random()*200-10; 
//for int 
//: Debueve un double, lo escalamos para que devuelva un numero 
//entre el 1-199 lo rescalo con -10, para que sea de -9, 189