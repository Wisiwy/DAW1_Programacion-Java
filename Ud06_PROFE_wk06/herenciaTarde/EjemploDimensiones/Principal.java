package EjemploDimensiones;

public class Principal {
	public static void main(String[] args) {
		
		VerUnaDimension d1 = new VerUnaDimension(2);
		System.out.println();
		d1.linea();
		VerDosDimension d2 = new VerDosDimension(2,2);
		System.out.println();
		d2.area();
		d2.linea();
		VerTresDimension d3 = new VerTresDimension(2,2,2);
		System.out.println();
		d3.linea();
		d3.area();
		d3.volumen();
		System.out.println();
		System.out.println();
		System.out.printf("\t Autor: Raúl 'The card hacker'.");
		
		VerTresDimension d4 = new VerTresDimension(d2,2);
		
	}

}
