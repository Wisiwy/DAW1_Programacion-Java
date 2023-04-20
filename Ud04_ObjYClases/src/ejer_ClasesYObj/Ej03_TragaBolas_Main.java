package ejer_ClasesYObj;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Ej03_TragaBolas_Main {

	public static void main(String[] args) {
		String[] menu = { "Crear tragaBolas", "Comer", "Trotar", "Dormir", "Ver estado" };
		TragaBolas tra = new TragaBolas(" ", 0);
		String color = "";
		Integer maxBolas = 0;
		int opt = 0;
		do {
			opt = Dibujo.menu(menu);

			if (opt == 1) {
				String[] colo = { "azul", "amarillo", "rojo", "verde" };
				boolean aux = false;

//				mirar correc
				do {
					tra.setColor(Leer.leerString("Que color quieres (azul/amarillo/rojo/verde):"));
					for (int i = 0; i < colo.length; i++) {
						if (colo[i].compareTo(tra.getColor()) == 0) {
							aux = true;
							i = colo.length;
						}
					}
					if (aux == false)
						System.err.println("Error, color no conocido.");

				} while (aux == false);

				tra.setMaxBolas(Leer.leerIntPosi("Cuantas bolas comera tu tragabolas:"));
				tra.visualizar();

			} else if (opt == 2) {
				// si eliges 2 sin haber consturido hay excepcio. ser distino de de vacio
				if (tra != null)
					tra.comer();
			} else if (opt == 3) {
				if (tra != null)
					tra.trotar();
			} else if (opt == 4) {
				if (tra != null)
					tra.dormir();
			} else if (opt == 5) {
				if (tra != null)
					tra.visualizar();
			} else
				System.out.println("Hasta otra!!!!!");

		} while (opt != 0);

	}

}
