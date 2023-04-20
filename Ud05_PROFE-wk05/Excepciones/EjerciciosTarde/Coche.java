package EjerciciosTarde;

public class Coche {
	
	private int id;
	private String marca;
	private String color;
	private String matricula;
	
	public Coche(int id, String marca, String color, String matricula) throws Exception {
		super();
		this.id = id;
		this.setMarca(marca);
		this.setColor(color);
		this.setMatricula(matricula);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) throws NoMarca {
		String[] vMarca= {"lancia", "ford", "nissan", "toyota"};
		boolean encontrado = true;
		for (int i = 0; i < vMarca.length; i++) {
		
			if(vMarca[i].compareTo(marca)==0) {
				encontrado = false;
				this.marca=marca;
			}
		} 
		
		if(encontrado) {
			throw new NoMarca();
		}
}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) throws NoColor {
		String[] vColor= {"rojo", "verde", "azul", "amarillo", "blanco", "negro"};
		boolean encontrado =true;
		for (int i = 0; i < vColor.length; i++) {
			
			if(vColor[i].compareTo(color)==0) {
				encontrado=false;
				this.color=color;
			}
		}
		
		if(encontrado) {
			throw new NoColor();
		}
		
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) throws Exception {
		if(matricula.matches("[0-9]{4}[A-Z]{3}")) {
			this.matricula = matricula;
		}else {
			throw new Exception("Matricula no válida");
		}
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return String.format("%02d  %6s  %8s  %7s", id,marca,color,matricula);
	}
	
	
	

}
