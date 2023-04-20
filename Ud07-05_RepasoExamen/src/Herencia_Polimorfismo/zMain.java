package Herencia_Polimorfismo;

public class zMain {

	public static void main(String[] args) {
		// Abstract obliga a implementar metodos abstract.

		aFigura[] vector = new aFigura[6];
		vector[0] = new Circulo("Amarillo", 2.1);
		vector[1] = new Cuadrado("Azul", 3.1);
		vector[2] = new Circulo("Verde", 2.1);
		vector[3] = new Triangulo("Naranja", 6.7, 4.3);
		vector[4] = new Circulo("Amarillo", 5.1);
		vector[5] = new Triangulo("Negro", 2.1, 5);
		
		
		//**INSTANCE OF: Mirar los que son instance de algo
		for (int i = 0; i < vector.length; i++) {
			
			if(vector[i] instanceof Circulo)
				System.out.printf("Area circulo es %.2f , color %-10s \n", vector[i].area(),vector[i].getColor());
			if(vector[i] instanceof Triangulo)
				System.out.printf("Area circulo es %.2f , color %-10s \n", vector[i].area(),vector[i].getColor());
			if(vector[i] instanceof Cuadrado)
				System.out.printf("Area circulo es %.2f , color %-10s \n", vector[i].area(),vector[i].getColor());
			
		//**En cada clase hija se puede usar los metodos del PADRE
		}
		
	}

}
