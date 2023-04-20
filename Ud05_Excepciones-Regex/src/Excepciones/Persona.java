 package Excepciones;

public class Persona {

	private String nombre;
	private int edad;

	Persona(String nombre, int edad) throws EdadInvalidaException {
		this.nombre = nombre;
		// try {
		this.setEdad(edad);
		// }catch(EdadInvalidaException)

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws EdadInvalidaException {
		if (edad < 0)// Controlamos excepcion si cumple lanzo la excepcion
			throw new EdadInvalidaException();
		else
			this.edad = edad;
	}

	public String toString() {
		return String.format("Nombre: %s // Edad: %d ",nombre, edad); 
		}

}
