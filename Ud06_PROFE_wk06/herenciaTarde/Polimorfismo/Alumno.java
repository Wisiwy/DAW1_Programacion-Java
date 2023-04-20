package Polimorfismo;

public class Alumno extends Persona{

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
	public void imprimeDatos()
	{
		System.out.printf("Alumno: %s DNI: %s Mat: %s \n",this.getNombre(),this.getDni(),matricula);
	}
}
