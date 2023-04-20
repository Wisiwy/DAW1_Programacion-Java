package ejem06_abstract1;

public class Main {

	public static void main(String[] args) {
		
		//La calse abstracta te obliga

		// Crea un vector con 6 figuras geométricas
		
		Figura[] vector = new Figura [6];
		vector[0] = new Circulo("Amarillo", 2.1); 
		vector[1] = new Cuadrado("Azul", 3.1); 
		vector[2] = new Circulo("Verde", 2.1); 
		vector[3] = new Triangulo("Naranja", 6.7, 4.3); 
		vector[4] = new Circulo("Amarillo", 5.1); 
		vector[5] = new Triangulo("Negro", 2.1, 5); 
		
		
		//Calcula el area de todas ellas
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] instanceof Circulo )
				System.out.printf("El area de la Circulo es %.2f y color %-10s \n", vector[i].area(), vector[i].getColor());
			if (vector[i] instanceof Triangulo )
				System.out.printf("El area de la Triangulo es %.2f y color %-10s  \n", vector[i].area(),vector[i].getColor());
			if (vector[i] instanceof Cuadrado )
				System.out.printf("El area de la Cuadrado es %.2f y color %-10s  \n", vector[i].area(),vector[i].getColor());
		}

	}

}
