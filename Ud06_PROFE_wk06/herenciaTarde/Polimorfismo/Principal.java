package Polimorfismo;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//vector de personas
		Persona[] vector = new Persona[6];
		
		vector[0] = new Alumno(19,"Alejandro","45678912J",2231);
		vector[1] = new Persona(18,"Miguel","47178912J");
		vector[2] = new Profe(21,"Pedro","42778912J","Matemáticas");
		vector[3] = new Alumno(20,"Lucia","45678912J",2231);
		vector[4] = new Persona(20,"Carlota","78478912J");
		vector[5] = new Profe(19,"Teresa","43678912J","Valores");
		
		/*Alumno
		String[] nom = {"Pepe","Algo","Jose","Raul"};
		String[] dni = {"1234365X","1234365A","1234365V","1234365F"};
		int aleat;
		for (int i = 0; i < arrP.length; i++) {
			aleat = (int)(Math.random()*nom.length);
			arrP[i]= new Persona(i, nom[aleat], dni[aleat]);
		}*/
		
		
		//recorrer ese vector imprimiendo sus datos
		
		for (int i = 0; i < vector.length; i++) {
			vector[i].imprimeDatos();
			//System.out.println(vector[i].getClass());
		}
		
		
		System.out.println("\n\n\n");
		//reconocer objetos en funcion de la instancia
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] instanceof Profe) {
				System.out.println("Profe: ");
			}else if (vector[i] instanceof Alumno) {
				System.out.println("Alumno: ");
			}else if (vector[i] instanceof Persona) {
				System.out.println("Persona: ");
			}
			vector[i].imprimeDatos();
			//System.out.println(vector[i].getClass());
		}
		
		///Ordena el resultado del vector para que aparezcan
		//Primero Persona, luego Profe y por último Alumno
		System.out.println("\n\n\n");
		
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] instanceof Profe == false && vector[i] instanceof Alumno == false)
				vector[i].imprimeDatos();
		}
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] instanceof Profe)
				vector[i].imprimeDatos();
		}
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] instanceof Alumno)
				vector[i].imprimeDatos();
		}
		
		
	}

}
