package ejem06_abstract1;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado(String c, double l) {
		super(c);
		this.lado = l;
	}

	@Override
	public double area() {
		return lado * lado;
	}
//	Si comento este método me oblica a implementarlo porque es abstracto 
//	y eso te oblica a definir en cada hijo el metodo abstracto definido en el padre

}
