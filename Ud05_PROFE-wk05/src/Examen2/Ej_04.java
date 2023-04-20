package Examen2;

public class Ej_04 {
	
	public static void main(String[] args) {
		
		Datos d1 = new Datos("Felipe","Rodriguez","Rando");
		Direccion d2 = new Direccion("calle la oca","22","50003","Zaragoza","Zaragoza");
		Persona per1 = new Persona(d1,d2);
		
		Persona per2 = new Persona(new Datos("Raul","Sobreviela","Bielsa"),new Direccion("avenida los monegros","35","52003","Zaragoza","Zaragoza"));
	
		System.out.println(per1);
		System.out.println();
		System.out.println(per2);
		
	}
	
	public static String getUser(Persona p) {
		
		
		return p.getD1().getUsuario();
	}

}
