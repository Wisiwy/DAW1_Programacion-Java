package ejerExtra;

public class HojaExtra03_generadorNombres {

	public static void main(String[] args) {

		String[] nom = { "Julia", "Andres", "Vicente", "Carmen", "Sofocles", "Eliseo", "Marie", "Bartolome",
				"Anastasia", "Cosme" };
		boolean[] nomaux = new boolean[10];
		for (int i = 0; i < nomaux.length; i++)
			nomaux[i] = true;

		String[] ape = { "Gomez", "Sanz", "Villagrasa", "Perez", "Campos", "Dolera", "Pitt", "Lawrence", "Costacurta",
				"Hidalgo" };
		boolean[] apeaux = new boolean[10];
		for (int i = 0; i < apeaux.length; i++)
			apeaux[i] = true;

		int aux;
		int aux2;
		int cont = 0;
		do {
			
			aux = (int) (Math.random() * 9);
			aux2 = (int) (Math.random() * 9);

			if (nomaux[aux] == true && apeaux[aux] == true && apeaux[aux2] == true) {
				System.out.printf("%s %s, %s ", ape[aux], ape[aux2], nom[aux]);
				System.out.println();
				nomaux[aux] = false;
				apeaux[aux] = false;
				apeaux[aux2] = false;
				cont++;
			}
		} while ((nomaux[aux] == false && apeaux[aux] == false && apeaux[aux2] == false )|| cont < 5);
	}

}
