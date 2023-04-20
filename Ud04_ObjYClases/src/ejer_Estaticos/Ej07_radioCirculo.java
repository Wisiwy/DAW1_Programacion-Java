package ejer_Estaticos;

import java.util.Scanner;

import aUtilidad.Dibujo;
import aUtilidad.Mates;
import aUtilidad.Vali;



public class Ej07_radioCirculo {

	public static void main(String[] args) {
		Dibujo.titulo("CALCULAR CIRCULOS");
		Scanner teclado = new Scanner(System.in);
		// CHEKEAR ES NUMERO. INTRO RADIO
		String str = "";
		int r = 0;
		do {
			System.out.println("Intro radio: ");
			str = teclado.nextLine();
			if (Vali.esNum(str) == true) {
				r = Integer.parseInt(str);
			} else
				System.err.println("No es un numero. Intro otro. ");
		} while (Vali.esNum(str) == false);
		System.out.println("---------------------------");
		// ************MENU************
		System.out.println("Que quieres calcular.");
		String[] menu = { "Longitud", "Superficie", "Volumen" };
		int opt = Dibujo.menu(menu);

		// **************TRABAJO**************
		if (opt == 1) {
			double longi = Mates.circLong(r);
			System.out.printf("Longitud: %.2f %n", longi );
		}else if (opt == 2) {
			double sup = Mates.circSuperfi(r);
			System.out.printf("Superficie: %.2f %n",sup);
		}else if (opt == 3) {
			double volu = Mates.circVolum (r);
			System.out.printf("Volumen: %.2f %n",volu);
		}
		
//
//		
//		else if (opcion==2)
//			Mates.circSuperfi();
//			else if (opcion==3)
//				Mates.volumen(r)
//				else if (opcion==0)
//		Math.class
	}

}
