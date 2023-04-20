package EjemploAnimal;

public class Persona extends Mamifero {
	private String dNI;
	private String profesion;
	
	public Persona(String nombreAA, int crias, int numHue, int numExt, String dNI, String profesion) {
		super(nombreAA, crias, numHue, numExt);
		this.dNI = dNI;
		this.profesion = profesion;
	}
	public Persona(Mamifero a,String dNI, String profesion) {
		super(a.getNombreAA(),a.getCrias(),a.getNumHue(),a.getNumExt());
		this.dNI = dNI;
		this.profesion = profesion;
	}
	public String getdNI() {
		return dNI;
	}
	public void setdNI(String dNI) {
		this.dNI = dNI;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public void imptimirP() {
		//this.imptimirA();
		this.imptimirM();
		System.out.printf("DNi: %s, Profesión: %s \n", this.dNI,this.profesion);
	
		
	}
	

	
}
