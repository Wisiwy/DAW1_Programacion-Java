package teoria_ClasesYObj_profe;

import java.util.Objects;

public class Alumno {
	
	//Defino las variables que tendra el constructor.
//	Private, solo los metodos dentro de la clase Alumno tendran acceso.

	private String nombre;
	private String apellido;
	private int edad;

//	********CONSTRUCTOR VACIO*********
	public Alumno() {
		
	}
//	********CONSTRUCTOR DEFINIDO*********
//	objeto alumno tendra dos strings y una edad
//	click drch / source / using fields
//	

	public Alumno(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
//	********GETERS AND SETTERS*********
//	click drch / source / geters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return apellido + ", "+nombre+" : edad: "+edad;
	}

//	Otros constructores:
//	click drch / source / has code and equals--
//	comparar HASHCODE con nombres edad apellido comprobarlo.
	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
	
	
	
	
	

}
