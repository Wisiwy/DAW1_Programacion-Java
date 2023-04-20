package Excepciones;

import java.util.Iterator;

public class Coche {

	private String color, marca, matricula;

	private String[] colores = {"rojo", "rosa", "verde", "amarillo", "plateado", "blanco", "negro", "cyan", "gris",
			"naranja", "azul" };
	@Override
	public String toString() {
		return String.format("Marca: %6s || Color: %6s || Matricula: %8s", marca,color, matricula);
	}



	private String[] marcas = { "ford", "nissan", "toyota", "lancia", "opel", "dacia", "renaul", "skoda", "ferrari" };

	public Coche() {

	}

	public Coche(String color, String marca, String matricula) throws NoColor, NoMarca, Exception {
		this.setColor(color);
		this.setMarca(marca);
		this.setMatricula(matricula);
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) throws NoColor {
		for (int i = 0; i < colores.length; i++) {
			if (color.compareTo(colores[i]) != 0)
				throw new NoColor();
			else
				this.color = color;
		}

	}

	

	public void setMarca(String marca) throws NoMarca {
		boolean encontrado = false;
		for (int i = 0; i < marcas.length; i++) {
			if (marca.compareTo(marcas[i]) == 0)
				encontrado = true; // Si lo encuentra dentro del vector sale del bucle.
		}
		if(encontrado) 
			this.marca=marca;
		else 
			throw new NoMarca();
		
	}
	

	
	public void setMatricula(String matricula) throws Exception {
		if(matricula.matches("[0-9]{4}[A-Z]{3}"))
			this.matricula = matricula;
		else
			throw new Exception("Matricula no valida");
	}

	

}
