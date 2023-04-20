package abstracto_vehiculo;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo []vector = new Vehiculo [4];
		vector[0] = new Coche("1234XYZ", 4, 5); 
		vector[1] = new Coche("4321ZYX", 4, 5); 
		vector[2] = new Moto("1325ABC", 2, 150); 
		vector[3] = new Moto("9876CBA", 4, 5); 
		
		for (int i = 0; i < vector.length; i++) {
			double d = Math.random();
			if (d > 0.5) {
				vector[i].ponerEnMarcha();
			}
		}
	} //fin del main
}//fin de la clase
