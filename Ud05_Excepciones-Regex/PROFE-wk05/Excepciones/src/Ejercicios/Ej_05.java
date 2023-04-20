package Ejercicios;

public class Ej_05 {
	
	public static void main(String[] args){
		
		
		Persona per1 = null;
		
		try {
			per1 = new Persona("Miguel",-2);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(per1);
		
		Persona per2 = null;
		
		try {
			per2 = new Persona("María",3);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(per2);
		
		try {
			per2.setEdad(-4);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(per2);
	}

}
