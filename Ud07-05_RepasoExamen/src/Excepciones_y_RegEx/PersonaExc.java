package Excepciones_y_RegEx;

public class PersonaExc {

	private String nombre;
	private int edad;

	public PersonaExc(String nombre, int edad) throws EdadMalExceptionPersonalizada {

		this.nombre = nombre;
		this.setEdad(edad); // Hacemos uso del .setEdad(); para que recoga excepcion
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

	public void setEdad(int edad) throws EdadMalExceptionPersonalizada {
		// **Definimos cuando tira excepcion
		if (edad < 0)
			throw new EdadMalExceptionPersonalizada();
		else
			this.edad = edad;
	}
	
	public String toString() {
		return String.format("Nombre: %s // Edad: %d ",nombre, edad); 
		}

}
