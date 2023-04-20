package EjemploAnimal;

public class Animal {
	private String nombreAA;
	private int crias;
	public Animal(String nombreAA, int crias) {
		super();
		this.nombreAA = nombreAA;
		this.crias = crias;
	}
	public void alimentar() {
		System.out.println("Am, am, am que rico esta");
	}
	public String getNombreAA() {
		return nombreAA;
	}
	public void setNombreAA(String nombreAA) {
		this.nombreAA = nombreAA;
	}
	public int getCrias() {
		return crias;
	}
	public void setCrias(int crias) {
		this.crias = crias;
	}
	
	public void imptimirA() {
		System.out.printf("Nombre: %s, Crias: %s \n", nombreAA,crias);
	
		
	}
	
	

}
