package Excepciones;

public class ej05_excepcionPersonalizada {

	public static void main(String[] args) {
//hacer 
		Persona p = null;
		try {
			p = new Persona("Raul", -5); // Como la edad metida es menos que 0 saltará la excepcion
		} catch (EdadInvalidaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(p);

	}

}
