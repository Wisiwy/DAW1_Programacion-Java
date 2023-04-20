package ejer_ClasesYObj;

import java.util.Scanner;


public class TragaBolas {
	private String color;
	private Integer bolasComidas = 0;
	private Integer maxBolas;

//	************CONSTRUCTOR******************

	public TragaBolas() {

	}

	// Constructor de obj tragabolas con max de bolar y color
	public TragaBolas(String color, Integer maxBolas) {
		this.color = color;
		this.maxBolas = maxBolas;
	}

//	*******GETER / SETTERS*******
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getBolasComidas() {
		return bolasComidas;
	}

	public void setBolasComidas(Integer bolasComidas) {
		this.bolasComidas = bolasComidas;
	}

	public Integer getMaxBolas() {
		return maxBolas;
	}

	public void setMaxBolas(Integer maxBolas) {
		this.maxBolas = maxBolas;
	}

//	************TO STRING*******
	@Override
	public String toString() {
		return "TragaBolas: [color: " + color + ", bolasComidas:" + bolasComidas + ", maxBolas:" + maxBolas + "]";
	}

//	************METODOS CLASE********

	public void visualizar() {
		System.out.println("-------------------------------");
		System.out.println("Tu tragabolas");
		System.out.printf(" -Color: %s %n -Bolas comidas: %2d %n -Maximo de bolas: %2d %n", color,bolasComidas, maxBolas);
		System.out.println("-------------------------------");
	}

	public void comer() {
		if (bolasComidas < maxBolas) {
			bolasComidas++;
			System.out.println("He comido una bola.");
		} else
			System.err.println("Tu tragabolas esta jarto. No puede comer mas");
	}
	public void trotar() {
		if (bolasComidas >= 1) {
			System.out.println("Estoy trotando");
			bolasComidas--;
		}else
			System.err.println("Tengo hambre, no puedo trotar.");
	}
	public void dormir() {
		if (bolasComidas == maxBolas) {
			System.out.println("Tripa llena. ZZZZZZ");
			bolasComidas = bolasComidas/2;
		}else
			System.err.println("No quiero dormir.");
	}
	
	
}
