package Excepciones;

public class ejExtraCoches {

	public static void main(String[] args) throws NoColor, NoMarca, Exception {

		System.out.println(generaCoche());
		try {
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static Coche generaCoche() throws NoColor, NoMarca, Exception {
		String[] colores = { "rojo", "rosa", "verde", "amariloo", "plateado", "blanco", "negro", "cyan", "gris",
				"naranja", "azul" };
		String[] marcas = { "ford", "nissan", "toyota", "lancia", "opel", "dacia", "renaul", "skoda", "ferrar" };

		int i = (int) Math.random() * colores.length;
		int j = (int) Math.random() * marcas.length;
		Coche c = new Coche(colores[i], marcas[j], generaMatricula());
		return c;
	}

	private static String generaMatricula() {
		String letrasMat = "";
		char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'y', 'z' };
		for (int i = 0; i < 3; i++) {
			letrasMat += abc[(int) Math.random() * abc.length];

		}

		String matri = Integer.toString((int) Math.random() * 9999) + letrasMat;

		return matri;
	}
}
