package Abstracto1;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(String c, double radio) {
		super (c);
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI*radio*radio;
	}
	
}
