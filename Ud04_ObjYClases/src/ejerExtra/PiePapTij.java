package ejerExtra;

import java.util.Arrays;

import aUtilidad.Dibujo;
import aUtilidad.Leer;


public class PiePapTij {

	public static void main(String[] args) {

		Dibujo.titulo("PIEDRA - PAPEL - TIJERA");

//		---------------PUNTUACIONES-------------------
		Score taScore[] = new Score[5];
		for (int i = 0; i < taScore.length; i++) {
			taScore[i] = new Score(null,0);
		}
		
//		MENU PRINCIPAL

		int opt = 0;
		do {

			String[] menuPrin = { "Nueva partida", "Ver puntuaciones" };
			opt = Dibujo.menu(menuPrin);
			
//			//-------------NUEVA PARTIDA
			if (opt == 1) {

				System.out.println("NUEVA PARTIDA");
//				String nom = Leer.leerString("Nombre jugador:");
				taScore[4] = new Score(Leer.leerString("Nombre jugador:") , 0);
//		nuevo jugador se escribe en el ultimo lugar del vector taScore
				int scoreP1 = 0; // ¿?Es nedcesario o se puede setear en cada momento.

//		--------------PARTIDA-------------------	

				// PARTIDA: 10 rondas juego
				for (int i = 1; i <= 10; i++) {
					
					System.out.printf("------------------------");
					System.out.printf("Ronda[%d] %n", i);

					// MENU: Usuario elige 1-piedra, 2-tijera, 3-papel (se usara esta asignacion
					// durante toda la clase)
					String[] opcMenu = { "Piedra", "Papel", "Tijera" };
					int p1 = Dibujo.menu(opcMenu); // 

					// Ordenador saca numero (piedra,papel,tijera)
					int ia = (int) (Math.random() * 3) + 1; // ?¿?¿?¿?¿entre uno y tres No me sale el 3 ?¿?¿?
					System.out.printf("Rival: %d - %s // ", ia, opcMenu[ia - 1]);

					// Calculo de resultado
					if (p1 == ia)
						System.out.printf("EMPATE");
					else if (jugada(p1, ia) == true) {
						System.out.printf("HAS GANADO. FELICIDADES");
						scoreP1 += 10;
					} else if (jugada(p1, ia) == false) {
						System.err.printf("HAS PERDIDO. PRINGADO");
						scoreP1 -= 3;
					}
					// imprime resultado ron da
					System.out.printf("%n**Jug %d ", scoreP1);
					System.out.println("------------------------------------");
				}
//		------------------ASIGNAR PUNTUACIONES-------------------
				// Asigna puntuacion partida a tablaScore de resultados.
				taScore[4].setPuntuacion(scoreP1); //?¿?¿?
				scoreP1 = 0;

				// ORDENAR VECTOR
				System.out.println("-----------------");
				System.out.println("ARRAY ORDENADO");
				System.out.println(taScore.toString());
				Arrays.sort(taScore);
			}
			// 2- VER PUNTUACIONES: IMPRIMIR VECTOR
			if (opt == 2) {
				System.out.println("1");
				for (int j = 0; j < taScore.length; j++) {
					System.out.println(taScore[j].toString()); 
				}
			}
		} while (opt != 0);
		// HACER QUE SE PUEDA JUGAR VARIAS VECES.

	}

	/**
	 * Dados dos enteros calcula quien gana, siendo: <br>
	 * <ol>
	 * <li>Piedra</li>
	 * <li>Papel</li>
	 * <li>Tijera</li>
	 * 
	 * @param jug
	 * @param ia
	 * @return false == pierde
	 */
	public static boolean jugada(int jug, int ia) {
		boolean res = true;
		if (jug == 1) {
			if (ia == 2)
				res = false;
		}
		if (jug == 2) {
			if (ia == 3)
				res = false;
		}
		if (jug == 3) {
			if (ia == 1)
				res = false;
		}
		return res;

	}

}
