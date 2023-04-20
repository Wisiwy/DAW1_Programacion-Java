package ejem08_interfaces;

import java.util.Scanner;

public class Persona implements Obligatorio {
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

	@Override
	public Persona pedirTodosDatos (String nombre, Integer edad, Integer dni) {
		Scanner t = new Scanner(System.in);
		nombre = t.nextLine();
		edad = t.nextInt();
		dni= t.nextInt();		
		
		Persona aux = new Persona(nombre, edad, dni);
		return  aux;
		
	}
	public void visualTodosDatos() {
		System.out.printf("%15s, %2d años || Dni: 10%d",this.nombre,this.edad,this.dni);
		
		
	};

	
	

}
