package ejer_StringsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer15_Notas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/**
		 * PREGUNTAS: Me da error al introducir numeros decimales no se porque. 
		 * 
		 * Ejemplo profe hace m�todos/apartado.
		 */

		// A) pedir 5 notas alumnos y mostrar
		
		double[] notas = new double[5]; //mirar el profe usa metodos 
		System.out.println("Intro nota alumno: ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = teclado.nextDouble(); //Profe introduce con metodo "leerDouble"
		}
		System.out.println(Arrays.toString(notas));
		System.out.println("-------------------------------");

		// B) Calcular la media
		double med;
		double sum = 0;
		for (int i = 0; i < notas.length; i++) {
			sum = sum + notas[i];
			System.out.println(" Sum: " + sum);
		}
		// calcular media.
		med = sum / notas.length;
		System.out.printf("Tu media es %4.2f. \n", med);
		System.out.println("-------------------------------");

		// C) Media y notas superior a media
		System.out.print("Notas superiores media: ");
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > med) {
				notas[i]++; //	//E)Sumar 1 punto al alumno. 
				if(notas[i] > 10)
					notas[i]=10; //si al sumar 10 se pasa que se quede en 10
			}
				
//				if (i == notas.length-1)
//					System.out.println(notas[i] + ".");
			}
			System.out.print(Arrays.toString(notas));
		
		System.out.println();
		System.out.println("-------------------------------");
		
		// D) Mejor y peor nota.
		Arrays.sort(notas);
		System.out.println("Peor: " + notas[0] + " Mejor: " + notas[notas.length - 1]);
		//Con Sort se modifica el orden del array. Mejor la solucion profe. 
		
		//Profe recorre todo el vector
//		Declara variable max y min y con clase Math
		double max=0, min=0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > max || i == 0) 
				max=notas[i];
			if(notas[i]<min || i == 0)
				min = notas[i];
		}
		System.out.println("Min : " + min);
		System.out.println("Max: " + max);

		
		//E)Sumar 1 punto al alumno. 
		
	}

}
