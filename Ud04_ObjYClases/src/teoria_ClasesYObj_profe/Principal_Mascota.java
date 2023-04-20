package teoria_ClasesYObj_profe;

public class Principal_Mascota {

	public static void main(String[] args) {
		Dueno due1 = new Dueno("Raul", "Gomez", "345 345 345");
		Dueno due2 = new Dueno("Maria", "Gertr", "3215 1345 445");
		Dueno due3 = new Dueno("Fermin", "Hidalgo", "341 125 545");
		Dueno due4 = new Dueno("Joli", "Sanchez", "335 3125 5145");

		System.out.println(due1);
		System.out.println(due2);
		System.out.println(due3);

		Mascota mas1 = new Mascota("Leon", "Timon", 3);
		Mascota mas2 = new Mascota("Huron", "Julio", 2);
		Mascota mas3 = new Mascota("Capivara", "Pancracio", 3);

//		System.out.println(mas1);
//		System.out.println(mas1);
//		System.out.println(mas1);

		mas1.setPropietario(due1);

//		System.out.println(mas1);
//		System.out.println(mas1);
//		System.out.println(mas1);

		Dueno[] duenos =new Dueno[5];
		duenos[0] = due1;
		duenos[2] = due2;
		duenos[4] = due3;
		
		Mascota[] mascotas =new Mascota[5];
		mascotas[3] = mas1;
		mascotas[2] = mas2;
		mascotas[1] = mas3;
		
		System.out.println("-----LISTADO DE MASCOTAS ISN PROPIETARIO-----");
		for (int i = 0; i < mascotas.length; i++) {
			if (mascotas[i] !=null && mascotas[i].getPropietario() == null) 
				System.out.println(mascotas[i]);
		}
		System.out.println("-----LISTADO DE MASCOTAS CON PROPIETARIO-----");
		for (int i = 0; i < mascotas.length; i++) {
			if (mascotas[i] !=null && mascotas[i].getPropietario() != null) 
				System.out.println(mascotas[i]);
		}
		
		
	}
}
