package OTROS;

public class Persona implements Comparable<Persona>{
	
	
	private String nombre;
	private String apellido;
	private double altura;
	private int edad;
	
	
	public Persona(String nombre, String apellido, double altura, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
		this.edad = edad;
	}


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


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		//return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", altura=" + altura + ", edad=" + edad + "]";
		return String.format("| %10s, %-10s | %2.2f | %2d |", apellido,nombre,altura,edad);
	}


	@Override
	public int compareTo(Persona p) {
		// devuelve un entero 0, positivo o negativo
		
		//ordenar por apellido
		//return this.apellido.compareTo(p.apellido);
		
		//order by apelido, nombre
		//if(this.apellido.compareTo(p.apellido) != 0) //si los apellidos son diferentes
		//	return this.apellido.compareTo(p.apellido); //ordena por apellido
		//else                                         //sino
		//	return this.nombre.compareTo(p.nombre);      //ordena por nombre
		
		//order by apellido asc, nombre asc, edad desc
		if(this.apellido.compareTo(p.apellido) != 0) //si los apellidos son diferentes
			return this.apellido.compareTo(p.apellido); //ordena por apellido
		else
			if(this.nombre.compareTo(p.nombre)!=0)//sino si los nombres son diferentes
				return this.nombre.compareTo(p.nombre);      //ordena por nombre
			else                                  //sino
				return p.edad-this.edad;    //comparo por edad
	}


	
	
	
	
	

}
