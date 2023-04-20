package ejerExtra;

public class HojaExtra02_CocheVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche[] coches = new Coche[3];
		coches[0] = new Coche("Peugeot", "206", "2331 GEW");
		coches[1] = new Coche("Renault", "Clio", "1231 DWQ");
		coches[2] = new Coche("Toyota", "Couple", "21541 WER");

//		Mostrar lista
		for (int i = 0; i < coches.length; i++)
			System.out.printf(" [%d] %s \n",(i+1), coches[i].toString());

	}

}
