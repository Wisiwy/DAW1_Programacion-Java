package Ejemplo5_Poli;

public class Principal {

	public static void main(String[] args) {
		
		//1.	Instancia un vector para 6 Personas (2 objetos de cada tipo)
		Persona[] p = new Persona[6];
		
		p[0] = new Alumno(19,"Federico","12312312G","2213");
		p[1] = new Profe(22,"Bartolo","12312312G","Matematicas");
		p[2] = new Persona(19,"María","12456753G");
		p[3] = new Alumno(21,"Violeta","19517512G","3323");
		p[4] = new Profe(33,"Jesús","78122312G","Informática");
		p[5] = new Persona(21,"Marta","65212312G");
		
		//2.	Recorre el vector imprimiendo los datos de cada tipo. “método imprimeDatos()”
		for (int i = 0; i < p.length; i++) {
			p[i].imprimirDatos();
		}

		System.out.println("\n\n");
		//3.	Recorre el vector reconociendo la instancia de cada tipo. (instanceof)
		for (int i = 0; i < p.length; i++) {
			//System.out.println(p[i].getClass());
			
			if(p[i] instanceof Profe) {
				System.out.println("Clase Profe!");
			}else if(p[i] instanceof Alumno) {
				System.out.println("Clase Alumno!");
			}else if(p[i] instanceof Persona) {
				System.out.println("Clase Persona!");
			}
			
			p[i].imprimirDatos();
			
		}
		System.out.println("\n\n");
		//4.	Saca los datos de las personas, luego los profes y por último los alumnos.
		for (int i = 0; i < p.length; i++) {
			if(p[i] instanceof Profe == false && p[i] instanceof Alumno == false) {
				p[i].imprimirDatos();
			}
		}
		for (int i = 0; i < p.length; i++) {
			if(p[i] instanceof Profe) {
				p[i].imprimirDatos();
			}
		}
		for (int i = 0; i < p.length; i++) {
			if(p[i] instanceof Alumno) {
				p[i].imprimirDatos();
			}
		}
		
	}

}
