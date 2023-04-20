package ejem06_abstract1;

public abstract class Figura {

	
	private String color;
	public Figura(String c) {
		this.color = c;
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double area();
//	Los métodos abstractos no definidos en padre obligan a sus hijos a implementarlo en su clase. 
//	Solamente define
	
}
