package teoria_ClasesYObj_profe;

public class Principal_alumno {
	
	public static void main(String[] args) {
		
//		Objeto es estructura de datos (atributos). Definidos en las clases. 
//		Para crearlo llamamos al constructor "new". Constructor guarda espacion en memoria.
//		En este caso 2 strings (nombre apellido) y un entero (edad)
		
		Alumno a1 = new Alumno();
		
		//a1.nombre = "Dani";
		
		a1.setNombre("Epifanio");
		a1.setApellido("Hernandez");
		a1.setEdad(21);
		
		Alumno a2 = new Alumno("Gabi","Sanchez",22);
		
		a2.setNombre("Claudia");
		
		System.out.println(a1);
		System.out.println(a2);
		
		Alumno a3 = new Alumno("Claudia","Sanchez",22);
		
		System.out.println(a3);
		
		System.out.println();
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		
		if(a2.equals(a3))
			System.out.println("son iguales");
		else
			System.out.println("Son distintos");
		
	}

}
