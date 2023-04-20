package PersonaInterface;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//vector de personas
		Persona[] vector = new Persona[3];
		//Object[] vector = new Object[3];
				
		//////////////////////////////////////////////////INTERFACES
		
		for (int i = 0; i < vector.length; i++) {
			//cara profe cruz alumno
			double caraocruz = Math.random();
			if(caraocruz>0.5) {
				vector[i]=new Profe(0,null,null,null);
			}else {
				vector[i]=new Alumno(0, null, null, 0);
			}
			vector[i].pedirTodosLosDatos();
			vector[i].imprimeDatos();
			
			pintadatos(vector[i]);
		}
		
		
	}
	
	
	public static void pintadatos(Object o) {
		
		if(o instanceof Profe) {
			
			Profe p = (Profe) o;
			
			System.out.println("\n\n ------- PROFE ------- ");
			p.visualTodosLosDatos();
		}else if(o instanceof Alumno) {
			Alumno a = (Alumno) o;
			System.out.println("\n\n ------- ALUMNO ------- ");
			a.visualTodosLosDatos();
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
