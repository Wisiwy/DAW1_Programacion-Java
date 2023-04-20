package teoria_ClasesYObj_profe;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Hora2_Main {

	public static void main(String[] args) {
		boolean menu = true;
		String[] opciones = { "Crear hora", "Sumar hora", "Restar hora", "Mostrar hora", "A Segundos",
				"Sumar segundos" };

		int o = Dibujo.menu(opciones);
		Hora2 miHora = new Hora2();
		do {

			if (o == 1) {
				int h = entrada("h", 0, 23);
				int m = entrada("m", 0, 59);
				int s = entrada("s", 0, 59);
				miHora = new Hora2(h, m, s);

			} else if (o == 2) {
				if (miHora != null) {
					int h = entrada("h", 0, 23);
					int m = entrada("m", 0, 59);
					int s = entrada("s", 0, 59);
					Hora2 aux = new Hora2(h, m, s);
					miHora.sumarHora(aux);
				}

			} else if (o == 3) {
				if (miHora != null) {
					int h = entrada("h", 0, 23);
					int m = entrada("m", 0, 59);
					int s = entrada("s", 0, 59);
					Hora2 aux = new Hora2(h, m, s);
					miHora.restarHora(aux);
				}
			} else if (o == 4) {
				if (miHora != null) {
					miHora.imprimirHora();
				} // No esta creada hora el objeto esta instanciado pero no construido
				System.err.println("No hay hora creada. ");

			} else if (o == 5) {
				if (miHora != null) {
					miHora.imprimirHora();
					System.out.println("Son: %d");
				}
			} else if (o == 6) {

			} else if (o == 0) {
				menu = false;
			} else
				System.err.println("Error. Dato no valido");
		} while (menu == false);

	}

	private static int entrada(String cad, int i, int j) {
		int num;
		do {
			num = Leer.leerInt(cad);
			if (num < i || num > j) {
				System.err.println("Numero no valido (" + i + "-" + j);
			}

		} while (num < i || num > j);

		return 0;
	}

}
