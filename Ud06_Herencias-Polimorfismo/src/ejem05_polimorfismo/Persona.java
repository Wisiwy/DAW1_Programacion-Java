package ejem05_polimorfismo;

public class Persona {
	private String nombre;
	private Integer edad;
	private Integer dni;
	
	public Persona(String nombre, Integer edad, Integer dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	public void imprimirDatos() {
		System.out.printf("Nombre: %-10s | Edad: %2d | Dni: %10d \n",nombre, edad, dni);
	}
	
	

}
