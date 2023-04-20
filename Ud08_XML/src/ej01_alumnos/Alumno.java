package ej01_alumnos;

public class Alumno {

	public Integer id;
	public String nombre;
	public Integer edad;
	
	public Alumno() {
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return String.format("Id: %d \n %s \t %d años.",id,nombre,edad );
	}
	
	
	
	
	
	
	
}
