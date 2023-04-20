package OBJETOS;

public class Alumno {
	
	private String nombre;
	private int edad;
	
	
	public Alumno(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
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


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	public void imprimirNombre() {
		System.out.println("Me llamo "+nombre);
	}
	public void imprimirEdad() {
		System.out.println("Tengo "+edad+" a�os.");
	}
	public void incrementarEdad() {
		edad++;		
	}

}
