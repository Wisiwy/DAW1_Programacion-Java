package expresionesRegulares;

public class Patrones {

//	PATRONES PARA VALIDAR
//		Dni
//	private static String dni = "[0-9]{8}[a-zA-Z]{1}";
//		Otra forma quitando ciertas letras que no se usan en los DNI
	private static String dni = "[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|C|B|N|J|Z|S|Q|V|H|L|C|H|K|E]{1}";
//		nie
	private static String nie = "[XYZxyz]{1}[0-9]{7}[a-zA-Z]{1}";
//		formato de dni/nie a la vez
	private static String dniNie = "[0-9XYZxyz]{1}[0-9]{7}[T";
//	
/*
 * TLFN: Número de teléfono con tres bloques de números serparados por un blanco
 */
//	private static String tlfn = "[0-9]{3}/s[0-9]{3}/s[0-9]{3}";
//	mas pro
	private static String tlfn = "([0-9]{3}\s){2}[0-9]{3}";
	
/*
 * 	IBAN:Cuenta bancaria formato IBAN; (ejemplo: ES98 2038 5778 9830 0076 0236)
 */
	private static String iban = "ES[0-9]{2}(\s[0-9]{4})){5}"; //cogemos el patron espacio y 4 numeros 5 veces
/*
 * MATRICULA	
 */
	private static String mat = "[0-9]{4}[A-Za-z]{3}"; //cogemos el patron espacio y 4 numeros 5 veces
	
/*
 * HORA 24h formato hh:mm:ss 
 */
	private static String h24 = "([01][0-9]|[2][0-3])(:[0-5][0-9]){2}";
	
	public static String getH24() {
		return h24;
	}
	public static String getDni() {
		return dni;
	}
	public static String getNie() {
		return nie;
	}
	public static String getDninie(){
		return dniNie;
	} 
	public static String getTlfn() {
		return tlfn;
	}

	
	
}
