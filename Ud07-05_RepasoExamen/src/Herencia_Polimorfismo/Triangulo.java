package Herencia_Polimorfismo;

public class Triangulo extends aFigura {

	private double b, h;

	public Triangulo(String c, double b, double h) {
		super(c);
		this.b = b;
		this.h = h;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (b * h) / 2;
	}

}
