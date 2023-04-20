package Ejemplo5_Poli;

public class Persona {
	
	private int edad;
	private String nombre;
	private String dni;
	
	
	public Persona(int e, String n, String d) {
		super();
		edad = e;
		nombre = n;
		dni = d;
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



	public void imprimirDatos() {
		System.out.printf("Dni: %s Nombre: %s \n",dni,nombre);
		
	}
	

}
