
public class Expresiones {

	// Patrones para validar

	//// Formato de dni
	// private static String dni = "[0-9]{8}[a-zA-Z]{1}";
	private static String dni = "[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]{1}";
	//// Formato de nie
	private static String nie = "[XYZxyz]{1}[0-9]{7}[a-zA-Z]{1}";
	// Formato de dni/Nie con nueve posiciones
	private static String dniNie = "[0-9XYZxyz]{1}[0-9]{7}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]{1}";

	// Número de teléfono con tres bloques de números separados por un blanco
	// private static String tel = "[0-9]{3}\s[0-9]{3}\s[0-9]{3}";
	private static String tel = "([0-9]{3}\s){2}[0-9]{3}";

	// Cuenta bancaria formato IBAN (ejemplo: ES98 2038 5778 9830 0076 0236)
	// private static String iban = "ES[0-9]{2}\s([0-9]{4}\s){4}[0-9]{4}";
	private static String iban = "ES[0-9]{2}(\s[0-9]{4}){5}";

	// Matrícula de coche 4 números 3 letras de las posibles
	private static String mat = "[0-9]{4}[a-zA-Z]{3}";

	// Hora en formato hh:mm:ss (Formato 24h)
//	private static String h24 = "[00-23]{2}((:)[00-59]{2}){2}";
//	private static String h24 = "([0-1][0-9]|[2][0-3])(:([0-5][0-9])){2}";
//	private static String h24 = "[0-9][0-9]:[0-9][0-9]:[0-9][0-9]";//
//	private static String h24 = "[0-2][0-9]:[0-5][0-9]:[0-5][0-9]";
//	private static String h24 = "[0-2][0-9](:[0-5][0-9]){2}";
	private static String h24 = "([01][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]";
//			º					//HORA				//MINUTOS Y seg
	
	//Hora en formato hh:mm:ss (Formato 12h)
	private static String h12 = "([1][0-2]|[0][0-9]):[0-5][0-9]:[0-5][0-9]";

	public static String getDni() {
		return dni;
	}

	public static String getNie() {
		return nie;
	}

	public static String getDniNie() {
		return dniNie;
	}

	public static String getTel() {
		return tel;
	}

	public static String getIban() {
		return iban;
	}

	public static String getMat() {
		return mat;
	}

	public static String getH24() {
		return h24;
	}

	public static String getH12() {
		return h12;
	}

}
