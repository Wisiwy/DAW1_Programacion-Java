package EjerciciosTarde;

public class EdadInvalidaException extends Exception {

	
	public EdadInvalidaException() {
		super("No se puede tener una edad menor que 0");
	}
}
