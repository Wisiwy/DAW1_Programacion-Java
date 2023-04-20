package Herencia_Polimorfismo;

public class Cuadrado extends aFigura {

	private double lado;

	public Cuadrado(String c, double lado) {
		super(c);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

}
