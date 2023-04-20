package ejem06_abstract1;

public class Triangulo extends Figura {
	private double b, h;

	public Triangulo(String c, double b, double h) {
		super(c);
		this.b = b;
		this.h = h;
	}
	@Override
	public double area() {
		return (b * h) / 2;
	}

}
