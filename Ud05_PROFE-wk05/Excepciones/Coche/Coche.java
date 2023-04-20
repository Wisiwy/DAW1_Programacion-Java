package Coche;

public class Coche {

	private String color;
	private String marca;
	private int id;
	private String matricula;

	public String getColor() {
		return color;
	}

	public void setColor(String color) throws NoColor {

		boolean encontrado = false;
		String[] vColor = {"rojo","verde","azul","amarillo","blanco","negro"};

		for (int i = 0; i < vColor.length; i++) {

			if(vColor[i].compareTo(color) == 0)
				encontrado = true;
		}
		if (encontrado == false) {
			//Excepcion
			throw new NoColor();
		}
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) throws NoMarca {

		boolean encontrado = false;
		String[] vMarca = {"ford","nissan","toyota","lancia"};

		for (int i = 0; i < vMarca.length; i++) {

			if(marca.compareTo(vMarca[i]) == 0)
				encontrado = true;
		}
		if (encontrado == false) {
			//Excepcion
			throw new NoMarca();
		}
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) throws InvalidId {
		
		if(matricula.matches("[0-9]{4}[A-Z]{3}"))
			this.matricula = matricula;
		else
			throw new InvalidId();
	}

	public Coche(String color, String marca, int id, String matricula) throws NoColor, NoMarca {
		this.setColor(color);
		this.setMarca(marca);
		this.id = id;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + ", id=" + id + ", matricula=" + matricula + "]";
	}


}
