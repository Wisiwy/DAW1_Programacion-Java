package EjerciciosTarde;

public class StringTooLongException extends Exception{
	
	public StringTooLongException(String message, String chain) {
		super("La cadena "+chain+" "+message);
		
	}
	
}
