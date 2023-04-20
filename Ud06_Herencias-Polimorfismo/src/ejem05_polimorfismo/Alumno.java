package ejem05_polimorfismo;

public class Alumno extends Persona {

	private String matricula;

	public Alumno(String nombre, Integer edad, Integer dni, String matricula) {
		super(nombre, edad, dni);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
@Override	
public void imprimirDatos() {
		
	System.out.printf("Nombre: %-10s | Edad: %2d | Dni: %10d | Matricula: %10s \n",this.getNombre(),this.getEdad(),this.getDni(),this.getMatricula());

	}
	
}
