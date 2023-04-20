package otros_ejer01_HashMaps;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws ExceptionVacio {

		int veces = 50;
		String nac[] = { "Espanola", "Portuguesa", "Italiana", "Francesa", "Canadiense", "Chilena", "Turco", "Uruguaya",
				"Koreana", "Nepali", "Sueca", "Mozambiquena", "Marroqui", "" };

		Colegio cole = new Colegio();

		for (int i = 1; i < (veces + 1); i++) {
			int ale = (int) (Math.random() * 14);
			try {

				cole.addAlumno(nac[ale].toUpperCase());
			} catch (ExceptionVacio e) {
				System.out.println(e.getMessage());
			}
			// convierte en uppercase
		}
		cole.showAll();

	}

}
