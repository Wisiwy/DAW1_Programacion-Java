package Ejercicios;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String n, int e) throws EdadInvalidaException {
		this.nombre = n;
		this.setEdad(e);
		/*if(e < 0) {
			//lanzo excepcion
			throw new EdadInvalidaException();
		}else {
			this.edad = e;
		}*/
		
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
		
		if(edad < 0) {
			//lanzo excepcion
			throw new EdadInvalidaException();
		}else {
			this.edad = edad;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

		

}
