package Abstracto1;

public class Triangulo extends Figura {

	private double base, altura;
	
	public Triangulo (String c, double b, double h) {
		super(c);
		this.base=b;
		this.altura=h;
	}

	public double area() {
		return (base*altura)/2;
		}
}