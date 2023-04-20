package ejer_StringsArrays_Profe;

public class Ej_20 {
	
	public static void main(String[] args) {
		
		String pass= "dani";
		byte b = validar(pass);
		
		switch (b) {
		case 0:
			System.out.println("Password v�lido");
			break;
		case 1:
			System.out.println("Debe contener m�s de 2 caracteres.");
			break;
		case 2:
			System.out.println("Debe contener menos de 10 caracteres.");
			break;
		case 3:
			System.out.println("No debe contener espacios.");
			break;
		case 4:
			System.out.println("Debe contener #@$%&.");
			break;
		}
		
	}

	
	public static byte validar(String str) {
		
		if(str.length() < 2)
			return 1;
		else if (str.length() > 10)
			return 2;
		else if(str.contains(" "))
			return 3;
		else if(str.contains("#")  || str.contains("@") || str.contains("$") || str.contains("%") || str.contains("&"))
			return 0;
		else
			return 4;
		
		
	}


	
	

}
