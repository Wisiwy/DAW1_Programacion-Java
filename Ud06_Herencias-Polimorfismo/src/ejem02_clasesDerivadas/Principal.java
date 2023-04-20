package ejem02_clasesDerivadas;

public class Principal {

	public static void main(String[] args) {

		Animal a = new Animal(2);
		a.visualizarAnimal();
		a.alimentar();
		Mamifero m = new Mamifero(1,0,24,2);
		m.visualizarMamifero();
	
		Persona p = new Persona(5,0,225,4,"jardinero");
		p.visualizarPersona();
		p.alimentar();
		
		
		
	}

}
