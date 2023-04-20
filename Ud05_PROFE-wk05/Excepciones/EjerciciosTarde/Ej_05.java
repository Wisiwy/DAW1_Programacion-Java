package EjerciciosTarde;

public class Ej_05 {
	
	
	
	public static void main(String[] args)  {

	
		Persona per1 = null;	
		try {
			per1 = new Persona("Raúl",-5);
		} catch (EdadInvalidaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(per1);
		
		Persona per2 = null;	
		try {
			per2 = new Persona("Raúl",25);
		} catch (EdadInvalidaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(per2);
		
		try {
			per2.setEdad(-7);
		} catch (EdadInvalidaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(per2);
		
		System.out.println("Fin del programa.");
		
		
	}
	

}
