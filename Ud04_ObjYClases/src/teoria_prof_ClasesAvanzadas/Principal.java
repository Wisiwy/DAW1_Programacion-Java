package teoria_prof_ClasesAvanzadas;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Persona per1 = new Persona("Raul","Gomez","345 345 345"); 
		Persona per2 = new Persona("Eustaquio","Laguna","332 332 332"); 
		Persona per3 = new Persona("Minerva","Perez","233 233 233"); 
		
		//System.out.println(per1);
		//System.out.println(per2);
		//System.out.println(per3);
		
		Mascota mas1 = new Mascota("Le�n","Tim�n",3);
		Mascota mas2 = new Mascota("Hur�n","Julio",1);
		Mascota mas3 = new Mascota("Capibara","Pancracio",2);
		
		//System.out.println(mas1);
		//System.out.println(mas2);
		//System.out.println(mas3);
		
		System.out.println();
		mas1.setPropietario(per1);
		//System.out.println(mas1);
		
		Persona[] personas = new Persona[5];
		personas[0] = per1;
		personas[2] = per3;
		personas[4] = per2;
		Mascota[] mascotas = new Mascota[5];
		mascotas[3]=mas1;
		mascotas[2]=mas2;
		mascotas[1]=mas3;
		
		System.out.println("   LISTADO DE MASCOTAS SIN PROPIETARIO");
		for (int i = 0; i < mascotas.length; i++) {
			if(mascotas[i] != null && mascotas[i].getPropietario() == null)
				System.out.println(mascotas[i]);
		}
		System.out.println("   LISTADO DE MASCOTAS CON PROPIETARIO");
		for (int i = 0; i < mascotas.length; i++) {
			if(mascotas[i] != null && mascotas[i].getPropietario() != null)
				System.out.println(mascotas[i]);
		}
	}

}
