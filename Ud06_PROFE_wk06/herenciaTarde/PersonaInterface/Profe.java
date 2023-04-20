package PersonaInterface;
import java.util.Scanner;
public class Profe extends Persona{
	private String asig;

	public Profe(int edad, String nombre, String dni, String asig) {
		super(edad, nombre, dni);
		this.asig = asig;
	}

	

	public String getAsig() {
		return asig;
	}

	public void setAsig(String asig) {
		this.asig = asig;
	}
	
	@Override
	public void imprimeDatos()
	{
		System.out.printf("Profe: %s DNI: %s Asig: %s \n",this.getNombre(),this.getDni(),asig);
	}

	@Override
	public void pedirTodosLosDatos() {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		//edad nombre dni asig
		super.pedirTodosLosDatos();
		System.out.println("Dime la asignatura: ");
		setAsig(t.nextLine());
	}

	@Override
	public void visualTodosLosDatos() {
		// TODO Auto-generated method stub
		System.out.printf("Edad %d Nombre %s Dni %s Asignatura %s\n",getEdad(),getNombre(),getDni(),getAsig());
	}
}
