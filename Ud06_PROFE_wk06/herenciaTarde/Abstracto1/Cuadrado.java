package Abstracto1;

public class Cuadrado extends Figura {

	private double lado;
	
	public Cuadrado(String c, double l) {
		super(c);
		this.lado=l;	
	}
		
	//@Override
	public double area() {
		return lado*lado;
	}
	
	

}
