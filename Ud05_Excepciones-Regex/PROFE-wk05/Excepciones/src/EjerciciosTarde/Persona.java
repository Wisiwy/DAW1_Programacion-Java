package EjerciciosTarde;

public class Persona {

	
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) throws EdadInvalidaException {
		this.nombre = nombre;
		//this.edad = edad;
		this.setEdad(edad);
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
		
		if( edad < 0)
			throw new EdadInvalidaException();
		else
			this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
}
