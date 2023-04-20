package Herencia_Polimorfismo;

public class Circulo extends aFigura {

	private double r; //Radio

	public Circulo(String c, double radio) {
		super(c);
		this.r = radio;
	}

	@Override
	//Todos los metodos marcados como abstract te obliga a implementarlos. 
	public double area() {
		return (Math.PI * r * r);

	}
	
	
	
	
}
