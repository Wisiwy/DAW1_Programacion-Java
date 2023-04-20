package h2_ejer03;

public class Alumno {
	
	private final String[] arNom = {"Raul","Pedro","Silvia","Andres","Daniel","Victor", "Sara","Ariadna","Julia","Andrea"};
	private final String[] arApe = {"Gomez","Sanchez","Banos","Gonzalez","Villagrasa","Willis", "Defoe","Pitt","Roberts","Wallace"};

	private String nom;
	private String ape;
	private Integer nota1; 
	private Integer nota2; 
	private Integer nota3;
	
	
	public Alumno() {
		int ale = (int)(Math.random()*10);
		nom = arNom[ale];
		ale = (int)(Math.random()*10);
		ape = arApe[ale];
	}


	public Alumno(Integer nota1, Integer nota2, Integer nota3) {
		int ale = (int)(Math.random()*10);
		nom = arNom[ale];
		ale = (int)(Math.random()*10);
		nom = arApe[ale];
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}


	public Integer getNota1() {
		return nota1;
	}


	public void setNota1(Integer nota1) {
		this.nota1 = nota1;
	}


	public Integer getNota2() {
		return nota2;
	}


	public void setNota2(Integer nota2) {
		this.nota2 = nota2;
	}


	public Integer getNota3() {
		return nota3;
	}


	public void setNota3(Integer nota3) {
		this.nota3 = nota3;
	}


	@Override
	public String toString() {
		return String.format("%7s %-10s \n \t Nota 1: %3d | Nota2: %3d |Nota3: %3d |\n",nom,ape,nota1,nota2,nota3);
	}
	
	
	
	
	
	
}
