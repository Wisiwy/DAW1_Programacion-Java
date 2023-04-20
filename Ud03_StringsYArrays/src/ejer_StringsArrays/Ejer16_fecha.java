package ejer_StringsArrays;

import java.util.Scanner;

public class Ejer16_fecha {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		boolean fecha = true;
		
			System.out.println("===========Es tu fecha correcta?==========");
			System.out.println();
			int[] diasmes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		do {	
			//intro dia
			int dia;
			do {
				System.out.print("Dia (1-31): ");
				dia = teclado.nextInt();
				if (dia > 31 || dia < 1) 
					System.err.println("Rango incorrecto. [1-31]");
			} while (dia > 31 || dia < 1);

			//intro mes
			int mes;
			do {
				System.out.print("Mes (1-12): ");
				mes = teclado.nextInt();
				if (mes > 12 || mes < 1) 
					System.err.println("Rango incorrecto. [1-12]");
			}while (mes > 12 || mes < 1);
			
			System.out.println("Dias que tiene ese mes: " + diasmes[mes-1]);
			
			
			System.out.println("Ano: ");
			int ano = teclado.nextInt();

			// Comprobamos dia respecto a mes

			if (dia > (diasmes[mes-1]) || dia < 1) 
				fecha = false;
			
			// comprobar año
			if (ano>2022) {
				fecha = false;
				System.out.println("Un viajero del futuro.");
			}
			if (fecha == false)
				System.err.println("Fecha incorrecta. Introduce otra.");
			
			//Si la fecha es correcta
			if (fecha==true) {
				System.out.printf("Fecha correcta.\n %2d/%2d/%2d",dia,mes,ano);
			}
		}while (fecha == false);
			
		teclado.close();
	}
}