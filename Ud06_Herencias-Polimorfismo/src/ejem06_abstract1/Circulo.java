package ejem06_abstract1;

public class Circulo extends Figura {

	private double r;

	public Circulo(String c, double r) {
		super(c);
		this.r = r;
	}
	@Override
	public double area() {
		return (Math.PI * r * r);
	}

}
