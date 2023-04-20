package Abstracto1;

public class Principal {
	
	public static void main(String[] args) {
		
		
		
		//crea un vector con 6 figuras geométricas
		Figura[]vector = new Figura [6];
		vector[0] = new Circulo("Amarillo canario", 2.7);
		vector[1] = new Cuadrado("Azul cielo", 6.2);
		vector[2] = new Triangulo("Rojo comunista", 1.3, 5);
		vector[3] = new Circulo("Amarillo intenso", 4);
		vector[4] = new Cuadrado("Azul mar", 3);
		vector[5] = new Triangulo("Rojo sangre", 7, 24);
		
		
		//calcula el area de todas ellas
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] instanceof Circulo) {
				System.out.printf("El área de este círculo es %.2f y su color es %s \n", vector[i].area(), vector[i].getColor());
			}
			if (vector[i] instanceof Cuadrado) {
				System.out.printf("El área de este cuadrado es %.2f y su color es %s \n", vector[i].area(), vector[i].getColor());
			}	
			if (vector[i] instanceof Triangulo) {
				System.out.printf("El área de este triángulo es %.2f y su color es %s \n", vector[i].area(), vector[i].getColor());
			}
		}
			
		
	}

}
