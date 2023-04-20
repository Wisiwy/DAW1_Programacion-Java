package Examen;

import java.util.Iterator;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

// TE HACE EL SORTEO Y NADA MAS CREO QUE ME HE COMPLICADO SI TENGO TIEMPO INTENTO COMPLETAR VOY HA HACER OTRO
public class GomezSanzEx3 {

	ResultadoSorteo[] resultados = new ResultadoSorteo[1000];

	public static void main(String[] args) {

//		-----------BOMBO NUMEROS
//		 Inicializo y relleno los bombos y auxiliares.
		int[] bomboNum = new int[1000];
		for (int i = 0; i < bomboNum.length; i++)
			bomboNum[i] = (int) ((Math.random() * 999) + 1);

		Dibujo.pintarVector(bomboNum);
		boolean[] bomboNumAux = new boolean[1000];
		for (int i = 0; i < bomboNumAux.length; i++)
			bomboNumAux[i] = true;

//		-----------BOMBO PREMIOS
//		relleno con premios
		int[] bomboPrem = new int[23];
		bomboPrem[0] = 10000;
		bomboPrem[1] = 5000;
		bomboPrem[2] = 1000;
		for (int i = 3; i < bomboPrem.length; i++) {
			bomboPrem[i] = 500;
		}
//		relleno chequear enttregados
		boolean[] bomboPremAux = new boolean[23];
		for (int i = 0; i < bomboPremAux.length; i++)
			bomboPremAux[i] = true;

//		Empieza sorteo
		Dibujo.titulo("LOTERIA EXAMEN PROGRAMACION");
		int cont = 1;
		for (int i = 0; i < bomboPremAux.length; i++) {

			// Sorteamos numero
			int resNum = sorteo(bomboNum, bomboNumAux);

			// Sorteamos Premio
			int resPrem = sorteo(bomboPrem, bomboPremAux);

//		Print resultado jugada
			System.out.printf("Extraccion numero %d: El numero %-4d obtiene un premio de %5d; ", cont, resNum, resPrem);
			System.out.println();
			cont++;

		}

		Dibujo.titulo("QUE HACER");
		String[] menu = { "Mostrar Resultados", "Consultar numero" };
		int o = Dibujo.menu(menu);
		switch (o) {
		case 1:

			break;
		case 2:

			break;
		default:
			break;
		}

	}

	private static int sorteo(int[] bombo, boolean[] bomboAux) {
		int sorteo = 0;
//		GENERAMOS UN NUMERO SIEMPRE Y CUANDO NO SEA FALSE
		do {
			sorteo = (int) ((Math.random() * bomboAux.length));

			if (bomboAux[sorteo] == true)
				bomboAux[sorteo] = false;

		} while (bomboAux[sorteo] == true);
		return bombo[sorteo];

	}

}
