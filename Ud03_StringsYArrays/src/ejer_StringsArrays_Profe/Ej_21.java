package ejer_StringsArrays_Profe;

public class Ej_21 {
	
	public static void main(String[] args) {
		
		String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dni = "73023151Z";
		
		int num = Integer.parseInt(dni.substring(0, dni.length()-1));
		System.out.println(num);
		
		int resto = num%23;
		System.out.println(resto);
		
		char miLetra = letra.charAt(resto);
		System.out.println(miLetra);
		
		if(miLetra == dni.charAt(dni.length()-1))
			System.out.println("Correcto");
		else
			System.out.println("incorrecto");
		

	
	}

}
