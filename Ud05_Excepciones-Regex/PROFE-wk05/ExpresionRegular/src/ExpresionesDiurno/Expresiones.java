package ExpresionesDiurno;

public class Expresiones {
	
	//Formato de dni/Nie con nueve posiciones
	private static String dni = "[0-9]{8}[A-Z]{1}";
	private static String nie = "[XYZxyz]{0}[0-9]{7}[A-Z]{1}";
	//private static String dniNie = "[XYZxyz0-9]{1}[0-9]{7}[A-Z]{1}";
	private static String dniNie = "([0-9]|[XYZxyz])[0-9]{7}[A-Z]{1}";
	
	//Número de teléfono con tres bloques de números separados por un blanco
	//private static String telefono = "[0-9]{3} [0-9]{3} [0-9]{3}";
	//private static String telefono = "([0-9]{3} ){2}[0-9]{3}";
	private static String telefono = "([0-9]{3}( ){0,1}){3}";
	
	//Cuenta bancaria formato IBAN (ejemplo: ES98 2038 5778 9830 0076 0236)
	private static String iban = "^ES[0-9]{2}( [0-9]{4}){5}";
	
	//Matrícula de coche 4 números 3 letras de las posibles
	private static String matricula = "[0-9]{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}";
	
	//Hora en formato hh:mm:ss (Formato 24h)
	//private static String h24 = "[0-9]{2}:[0-9]{2}:[0-9]{2}"; 
	//private static String h24 = "([01][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]"; 
	private static String h24 = "([01][0-9]|[2][0-3])(:[0-5][0-9]){2}"; 

	
	//Hora en formato hh:mm:ss (Formato 12h)
	private static String h12 = "([0][1-9]|[1][0-2])(:[0-5][0-9]){2}";
	
	
	//un correo electronico
	private static String mail= "[a-z0-9]+@[a-z]+.[a-z]{2,3}";
	//una ip
	private static String ip="([1]{0,1}[0-9]{0,2}|[2][0-4][0-9]|(25)[0-5].){3}([1]{0,1}[0-9]{0,2}|[2][0-4][0-9]|(25)[0-5])";
	//pasword (entre 8 y 10 caracteres, al menos 1 letraMayus, 1 Letra minus, 1 num y 1 especial[.@*#_])
	private static String pass="";
	
	public static String getDni() {
		return dni;
	}

	public static String getNie() {
		return nie;
	}

	public static String getDniNie() {
		return dniNie;
	}

	public static String getTelefono() {
		return telefono;
	}

	public static String getIban() {
		return iban;
	}

	public static String getMatricula() {
		return matricula;
	}

	public static String getH24() {
		return h24;
	}

	public static String getH12() {
		return h12;
	}

	
	
	
	
	
	

}
