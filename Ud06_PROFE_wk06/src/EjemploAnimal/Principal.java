package EjemploAnimal;

public class Principal {
	public static void main(String[] args) {
		
		Animal a1 = new Animal("Adrián", 1);
		
		a1.imptimirA();
		
		Mamifero m1 = new Mamifero("Roberto", 4, 2, 2);
		
		m1.imptimirM();
		m1.alimentar();
		Persona p1 = new Persona("Norberto", 1, 3, 1, "12334556X", "Informático");
		
		p1.imptimirP();
		p1.alimentar();
		
	}
}
