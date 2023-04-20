package PersonaInterface;

import java.util.Scanner;

public class Alumno extends Persona{

	@Override
	public void visualTodosLosDatos() {
		// TODO Auto-generated method stub
		super.visualTodosLosDatos();
		System.out.printf("Matricula %d \n",getMatricula());
	}

	private int matricula;

	public Alumno(int edad, String nombre, String dni, int matricula) {
		super(edad, nombre, dni);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	@Override
	public void pedirTodosLosDatos() {
		Scanner t = new Scanner(System.in);
		super.pedirTodosLosDatos();

		
		//edad nombre dni asig
		
		System.out.println("Dime la matricula: ");
		setDni(t.nextLine());
	}

	@Override
	public void imprimeDatos()
	{
		System.out.printf("Alumno: %s DNI: %s Mat: %s \n",this.getNombre(),this.getDni(),matricula);
	}
}
