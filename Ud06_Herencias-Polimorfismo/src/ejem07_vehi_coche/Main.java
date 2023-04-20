package ejem07_vehi_coche;

public class Main {

	public static void main(String[] args) {

		Vehiculo[] vector = new Vehiculo[4];

		vector[0] = new Coche("12354HIY", 123);
		vector[1] = new Moto("1234GAE", 250);
		vector[2] = new Coche("15234", 12);
		vector[3] = new Moto("232334AGAE", 125);

		int ale;
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i].mostrar());
		
			ale = (int) (Math.random() * 2);
			System.out.println(ale);
			if (ale == 1)
				vector[i].arrancar();

		}

	}

}
