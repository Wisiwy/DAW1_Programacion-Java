package Herencia_Polimorfismo;

public abstract class aFigura {
	
	private String color;

	public aFigura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double area();

}
