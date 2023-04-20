package herencias;

import java.util.ArrayList;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Main {

	public static void main(String[] args) {

		final String[] menu = { "Salir", "Crea Monstruo", "Borra Monsruo", "Lista de Monstruos", "Simulador" };
		ArrayList<Monstruo> monstruos = new ArrayList();

		// TEST: Incluir manualmente para
		Monstruo m1 = new Orco("Gorgorito", 100, 2, 2, 2, 3.15);
		Monstruo m2 = new Aranya("Gorgorito", 20, 6, 8, true, 300.45);
		monstruos.add(m1);
		monstruos.add(m2);
		// Menu 4 opciones

		int opcion = -1;
		while (opcion != 0) {
			switch (opcion) {

			case 1:// Añadir Monstruo
				Monstruo m = crearMonstruo();
				if (m != null)
					monstruos.add(m);
				break;
			case 2:// Borra monstruo
				listar(true, monstruos);
				System.out.println();
				int opt = Leer.leerIntPosi(null);
				if (opt < monstruos.size())
					monstruos.remove(opt);
				break;
			case 3: // Lista monstruos

				break;
			case 4: // Simula pelea
				simula(monstruos);
				break;

			default:
				break;
			}

			opcion = Dibujo.menu(menu);

		}

	}

	private static void simula(ArrayList<Monstruo> monstruos) {
		
		//Bucle mientras alla 1 que sigan luchano y queda 1 while (monstruso.size() >1)
 		
		// si se acaba la vida quitar de la lista
		
		//Definir defensa y ataque
		
		//Ataque defensa estado. 
		
		//Base de examen herencias borrar añadir y listar. 
		
	}

	private static Monstruo crearMonstruo() {

		System.out.println("1 - Orco");
		System.out.println("2 - Aranya");
		System.out.println("0 - Salir");
		int o1 = Leer.leerIntPosi("elige monstruo");
		if (o1 > 0) {
			if (o1 == 1) { //crear orico
				String r1 = Leer.leerString("Nombre: ");
				int r2 = Leer.leerInt("Vida: ");
				int r3 = Leer.leerInt("Brazon: ");
				int r4 = Leer.leerInt("Piernas: ");
				int r5 = Leer.leerInt("Ojos: ");
				int r6 = Leer.leerInt("Altura: ");
				 Monstruo m1 = new Orco(r1,r2,r3,r4,r5,r6);
				 
			} else if (o1 == 2) { //Crear araña
				String r1 = Leer.leerString("Nombre: ");
				int r2 = Leer.leerInt("Vida: ");
				int r3 = Leer.leerInt("Ojos: ");
				int r4 = Leer.leerInt("Patas: ");
				String r5 = Leer.leerString("Veneno (s/n): ");
				double r6 = Leer.leerDouble("Velocido: ");
				 
				 if(r5.compareToIgnoreCase("s")==0)
					 return new Aranya(r1,r2,r3,r4,true,r6);
				 else
					 return new Aranya(r1,r2,r3,r4,false,r6);
				 
			}  //Salir menu
				
		}

		return null;
	}

	private static void listar(boolean b, ArrayList<Monstruo> monstruos) {
		for (int i = 0; i < monstruos.size(); i++) {
			if (b)
				System.out.printf("%2d - ", i);
			if (monstruos.get(i) instanceof Orco) {
				Orco o = (Orco) monstruos.get(i);
				o.pintar();
			}
			if (monstruos.get(i) instanceof Aranya) {
				Aranya o = (Aranya) monstruos.get(i);
				o.pintar();
			}
			System.out.println(monstruos.get(i));

		}

	}

}
