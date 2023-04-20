package PersonaInterface;

import java.util.Scanner;

public class Persona implements Obligatorio{
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
	
	@Override
	public void pedirTodosLosDatos() {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		//edad nombre dni asig
		
		System.out.println("Dime la edad: ");
		setEdad(Integer.parseInt(t.nextLine()));
		
		System.out.println("Dime la nombre: ");
		setNombre(t.nextLine());
		System.out.println("Dime el dni: ");
		setDni(t.nextLine());
		
	}

	@Override
	public void visualTodosLosDatos() {
		// TODO Auto-generated method stub
		System.out.printf("Edad %d Nombre %s Dni %s\n",getEdad(),getNombre(),getDni());
	}
	
	
	
}
