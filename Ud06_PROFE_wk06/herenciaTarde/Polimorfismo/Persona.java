package Polimorfismo;

public class Persona {
	private int edad;
	private String nombre;
	private String dni;
	
	public Persona(int edad, String nombre, String dni) {
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void imprimeDatos() {
		
		System.out.printf("Nombre %s Edad %d Dni %s \n",nombre,edad,dni);
	}
	
	
	
}
