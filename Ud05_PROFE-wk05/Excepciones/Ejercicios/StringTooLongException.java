package Ejercicios;

public class StringTooLongException extends Exception{

	private String cadena;
	
	public StringTooLongException(String mensaje, String cadena) {
		
		super("La cadena "+cadena+" es "+mensaje);
		//mensaje "muy larga", "corta"...
		
		this.setCadena(cadena);
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	
}
