package ejem02_clasesDerivadas;

public class Persona extends Mamifero {
	private String profesion;
	private Mamifero m;
	

	public Persona(Integer crias, Integer comida, Integer huesos, Integer extremidades, String profesion) {
		super(crias, comida, huesos, extremidades);
		this.profesion = profesion;
	}

	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public void visualizarPersona() {
		
		this.visualizarAnimal();
		this.visualizarMamifero();
		System.out.printf("\2t Profesion: %20s",profesion);
	};
	
	

}
