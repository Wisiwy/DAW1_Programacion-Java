package Ejemplo5_Poli;

public class Alumno extends Persona {
	
	private String matricula;
	
	public Alumno(int edad, String nombre, String dni, String matricula) {
		super(edad, nombre, dni);
		this.matricula = matricula;
	}

	

	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

/*

	@Override
	public void imprimirDatos() {
		System.out.printf("Alumno: %s Dni: %s Nombre: %s \n",matricula,getDni(),getNombre());
	}

*/


}
