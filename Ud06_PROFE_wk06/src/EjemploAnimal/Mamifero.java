package EjemploAnimal;

public class Mamifero extends Animal{
	private int numHue;
	private int numExt;
	
	public Mamifero(String nombreAA, int crias, int numHue, int numExt) {
		super(nombreAA, crias);
		this.numHue = numHue;
		this.numExt = numExt;
	}
	public Mamifero(Animal a, int numHue, int numExt) {
		super(a.getNombreAA(),a.getCrias());
		this.numHue = numHue;
		this.numExt = numExt;
	}
	public int getNumHue() {
		return numHue;
	}
	public void setNumHue(int numHue) {
		this.numHue = numHue;
	}
	public int getNumExt() {
		return numExt;
	}
	public void setNumExt(int numExt) {
		this.numExt = numExt;
	}
	public void imptimirM() {
		this.imptimirA();
		System.out.printf("Huesos: %d, Ext: %d \n", this.numHue,this.numExt);
	//this.imptimirA();
	
	}
	
	
	
	
}
