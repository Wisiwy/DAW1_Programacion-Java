package ejem05_polimorfismo;

public class Main {
	public static void main(String[] args) {
//		Para que exista POLIMORFISMO TIENE que cumplirse
	//		• Que haya herencia.
	//		• Que haya sobrescritura de métodos.
	//		• Definir un objeto con una superclase e instanciarlo con una subclase:
	//			Empleado emp=new Jefe();
		
		
		
//		Persona per = new Persona ("Gaby", 19, 312138129);
//		per.imprimirDatos();
//		Profe p = new Profe ("Dani", 39, 889138129, "Programacion");
//		p.imprimirDatos();
//		Alumno alu = new Alumno ("Raul", 9, 41138129, "Matricula");
//		alu.imprimirDatos();

		// VECTOR DE PERSONAS
		Persona[] vector = new Persona[6];

		vector[0] = new Alumno("Alumno", 1, 41234123, "matricula");
		vector[1] = new Profe("Profe", 11, 41234123, "matricula");
		vector[2] = new Profe("Profe", 22, 41234123, "matricula");
		vector[3] = new Alumno("ALumno", 3, 41234123, "matricula");
		vector[4] = new Persona("Persona", 444, 41234123);
		vector[5] = new Persona("Persona", 555, 41234123);


//		*******Para crear aleatorio
//		String[] nom = {"Pepe", "Dani", "Jose","Raul"};
//		int ale, edad;
//		

//		for (int i = 0; i < vector.length; i++) {
//			ale = (int) (Math.random()*nom.length);
//			edad = (int) ((Math.random()*80)+18);
//			vector[i] = new Persona(nom[ale],edad,7771331);
//			vector[i].imprimirDatos();
//			
//		}
		// RECORRER ESE VECTOR IMPRIMIENDO SUS DATOS

		// RECONOCER OBJETOS EN FUNCIÓN DE LA INSTANCIA

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] instanceof Profe)
				System.out.println("Profe : ");
			else if (vector[i] instanceof Alumno)
				System.out.println("Alumno : ");
			else if (vector[i] instanceof Persona)
				System.out.println("Persona : ");
		}

		// ORDENAR EL RESULTADO DEL VECTOR PARA QUE APRAEZCAN
		// 1.PERSON--2.PROFE--3.ALUMNOS

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] instanceof Persona) {
				for (int j = 0; j < vector.length; j++) {
					if ((vector[j] instanceof Alumno) ||(vector[j] instanceof Profe)) {
						Persona aux = new Persona();
						aux  = vector [j]; 
						vector[j] = vector[i];
						vector[i] = aux;
					}
					else
						j++;
				}
			}else
				i++;
			
		}
		
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] instanceof Profe) {
				for (int j = 0; j < vector.length; j++) {
					if (vector[j] instanceof Alumno) {
						Persona aux = new Persona();
						aux  = vector [j]; 
						vector[j] = vector[i];
						vector[i] = aux;
					}
					else
						j++;
				}
			}else
				i++;
			
		}
		
		
		
		
		for (int i = 0; i < vector.length; i++) {
			
			vector[i].imprimirDatos();
			System.out.println();
			
		}
		
		
		
	}

}
