package teoria_defecto;

public class Principal {
	
	final static double pi = 3.1416;
	static String nombre = "Dani";
	
	public static void main(String[] args) {
		
		Persona per1 = new Persona("Francisco","Fernandez",25);
		System.out.println(per1);
		Persona per2 = new Persona("Javier","Fernandez",25);
		System.out.println(per2);
		per2 = new Persona("Raul","Hernandez", 23);
		System.out.println(per2);
		Persona per3 = new Persona("Raul","Fernandez",25);
		System.out.println(per3);
		nombre = "Jorge";
		metodo1();
		nombre = "Juanjo";
		System.out.println(nombre);
		Integer num = 4;
		
	}
	
	public static void metodo1() {
		System.out.println("Pi: "+pi);
		System.out.println(nombre);
	}

}
