package aUtilidad;

public class Regex {

	// **************************AYUDA CONSEJOS CLASE STRING y REGEX********************
//	3.1. String.matches(regex)
//	Podemos comprobar si una cadena de caracteres cumple con un patrón usando el método
//	matches de la clase String. Este método recibe como parámetro la expresión regular.

//								if(cadena.matches(".*1(?!2).*"))
//									System.out.println("SI");
//								else
//									System.out.println("NO");
	

//	3.2. String.split(regex)
//	El método split de la clase String es la alternativa a usar StringTokenizer para separa
//	cadenas. Este método divide el String en cadenas según la expresión regular que recibe. La
//	expresión regular no forma parte del array resultante.
//	
//							String str = "blanco-rojo:amarillo.verde_azul";
//							String[] cadenas = str.split("[-:._]");
	
//							for(int i = 0;i<cadenas.length; i++)
//								System.out.println(cadenas[i]);
//					Muestra por pantalla:  blanco, rojo, amarillo, verde, azul. 
//	******************************************************************************************************

	private static String dni = "[0-9]{8}[a-zA-Z]{1}";
//			//Quitando letras que no se usan en el DNI
//	private static String dni = "[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|C|B|N|J|Z|S|Q|V|H|L|C|H|K|E]{1}";

	private static String nie = "[XYZxyz]{1}[0-9]{7}[a-zA-Z]{1}";

	private static String dniNie = "([0-9]|[XYZxyz])[0-9]{7}[A-Za-z]{1}";

	// 3 bloques separados por (/s) espacio en blanco
	private static String tlfn = "([0-9]{3}/s){2}[0-9]{3}";

	// Ej. ES98 2038 5778 9830 0076 0236
	private static String iban = "^ES[0-9]{2}([0-9]{4}){5}";

	// Formato 24h (hh:mm:ss)
	private static String h24 = "([01][1-9]|[2][0-3])(:[0-5][0-9]){2}";

	// Formato 12h (hh:mm:ss)
	private static String h12 = "([0][1-9]|[1][0-2])(:[0-5][0-9]){2}";

	private static String matricula = "[0-9]{4}[a-zA-Z]{3}";

	private static String mail = "[a-z0-9]+@[a-z]+.[a-z]{2,3}";

	private static String ip = "([1]{0,1}[0-9]{0,2}|[2][0-4][0-9]|(25)[0-5].){3}([1]{0,1}[0-9]{0,2}|[2][0-4][0-9]|(25)[0-5])";

	public static String getDni() {
		return dni;
	}

	public static String getNie() {
		return nie;
	}

	public static String getDniNie() {
		return dniNie;
	}

	public static String getTlfn() {
		return tlfn;
	}

	public static String getIban() {
		return iban;
	}

	public static String getH24() {
		return h24;
	}

	public static String getH12() {
		return h12;
	}

	public static String getMatricula() {
		return matricula;
	}

	public static String getMail() {
		return mail;
	}

	public static String getIp() {
		return ip;
	}

}
