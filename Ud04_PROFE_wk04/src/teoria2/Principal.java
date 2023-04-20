package teoria2;

public class Principal {
	
	
	public static void main(String[] args) {
		
		String str;
		Persona per1 = new Persona();
		
		per1.setNombre("Dani"); 
		
		System.out.println("Nombre: "+per1.getNombre());
		System.out.println("Apellido: "+per1.getApellido());
		
		miMetodo(per1);
		
		System.out.println("Nombre: "+per1.getNombre());
		System.out.println("Apellido: "+per1.getApellido());
		
	}

	private static void miMetodo(Persona perico) {
		
		
		perico.setNombre("Raul"); 
		perico.setApellido("Lopez"); 
		
		
	}

}
