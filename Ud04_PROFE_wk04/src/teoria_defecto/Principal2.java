package teoria_defecto;

public class Principal2 {
	
	public static void main(String[] args) {
		
		
		Persona per1 = new Persona("Rubén","García",22);
		Persona per2 = new Persona("Gabriel","García",29);
		Persona per3 = new Persona("Sabrina","García",21);
		Persona per4 = new Persona("Eugenia","García",20);
		
		Persona per5 = new Persona();
		
		per1.imprimir();
		per2.imprimir();
		per3.imprimir();
		per4.imprimir();
		per5.imprimir();
		
	}

}
