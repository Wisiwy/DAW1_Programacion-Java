package parte1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inserta la definición de la colección
		TreeMap<Integer, ArrayList<Vagon>> trenes = new TreeMap();
		
		final String[] MENU = {"Salir", "Añade Vagón", "Borrar Vagón", "Ver Trenes", "Simulación"};
		// Crea dos trenes en el método crea
		crea(trenes);
		
		// de compra de productos
		int opcion = -1;
		while (opcion!=0) {
			switch(opcion) {
			case 1://Crea vagon
				pintar(true,trenes);
				int opt = leer("¿En qué tren?: ");
				if(trenes.containsKey(opt)) {
					
					System.out.println("1: Pasajeros\n2: Mercancias");
					int tipo = leer("¿De qué tipo?: ");
					if(tipo >=1 && tipo <=2) {
						ArrayList<Vagon> aux = trenes.get(opt);
						if(tipo == 1)
							aux.add(new Pasajeros());
						else
							aux.add(new Mercancias());
					}
						
				}
					
				break;
			case 2://Borra vagon
				pintar(true,trenes);
				int optb = leer("¿De qué tren?: ");
				if(trenes.containsKey(optb)) {
					pintar(optb,trenes);
					int id = leer("¿Qué id?: ");
					for(int i=0;i<trenes.get(optb).size();i++) {
						if(trenes.get(optb).get(i).getId() == id) {
							trenes.get(optb).remove(i);
						}
					}
				}
				break;
			case 3://ver trenes
				pintar(false,trenes);			
				break;
			case 4://Simulación
				System.out.println("\n\n");
				System.out.println("Simulador...");
				simular(trenes);
				System.out.println("\n\n");
				break;
			}
			opcion = Leer.menu(MENU);
		}

	}
	
	private static void simular(TreeMap<Integer, ArrayList<Vagon>> trenes) {
		
		String estaciones[][] = {{"Sants (Barcelona)","Santa Justa (Sevilla)","Joaquin Sorolla (Valencia)","Delicias (Zaragoza)"},
							     {"150","150","200","80"}};
		
		ArrayList<Simulador> sim = new ArrayList();
		for(Integer id : trenes.keySet()) {
			int aleat = (int)(Math.random()*estaciones[0].length);
			sim.add(new Simulador(id,trenes.get(id),estaciones[0][aleat],Integer.parseInt(estaciones[1][aleat])));
		}
		
		for(int tempo=1;tempo<=1000;tempo++) {
			
			if(tempo%100==0) {
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::");
				for(Simulador s : sim) {
					s.estado();
				}
				System.out.println(":\n:::::::::::::::::::::::::::::::::::::::::::::::\n");
			}
			
			
			//decrementar costes
			for(Simulador s : sim) {
				if(s.decCoste() == 0) { //llega a destino
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
					//datos de la llegada
					System.out.printf("+\n+  Tren: %02d          Llegada a:  %-15s \n",s.getId(),s.getDestino());
					
					//descargo
					s.descargo();
					
					//cargo
					s.cargo();
					
					//actualizo destino
					s.actualizoDestino();
					
					System.out.printf("+\n+  Cargado con próximo destino:  %-15s \n",s.getDestino());
					s.pintaTren(); //pinto estado
					System.out.println("+\n+++++++++++++++++++++++++++++++++++++++++++++");
				}
			}
		}
		
	}

	public static int leer(String str) {
		Scanner t = new Scanner(System.in);
		System.out.print(str);
		int out = t.nextInt();
		
		return out;
	}
	
	public static void pintar(int id, TreeMap<Integer, ArrayList<Vagon>> trenes) {
		
		System.out.println("\n");
		if(trenes.containsKey(id)) {
			System.out.print("/ooo#88T|");
			for(Vagon v : trenes.get(id)) {
				if(v instanceof Mercancias) {
					Mercancias m = (Mercancias) v;
					m.imprimir();
				}
				if(v instanceof Pasajeros) {
					Pasajeros p = (Pasajeros) v;
					p.imprimir();
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void pintar(boolean conId, TreeMap<Integer, ArrayList<Vagon>> trenes) {
		
		System.out.println("\n");
		for(Integer i : trenes.keySet()) {
			
			if(conId)
				System.out.print(i+":  ");
			
			System.out.print("/ooo#88T|");
			for(Vagon v : trenes.get(i)) {
				if(v instanceof Mercancias) {
					Mercancias m = (Mercancias) v;
					m.imprimir();
				}
				if(v instanceof Pasajeros) {
					Pasajeros p = (Pasajeros) v;
					p.imprimir();
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public static void crea(TreeMap<Integer, ArrayList<Vagon>> t) {
		// crea 2 composiciones de trenes (vagones)

		ArrayList<Vagon> c1 = new ArrayList();
		c1.add(new Pasajeros(true,20));
		c1.add(new Pasajeros(true,18));
		c1.add(new Pasajeros(false,43));
		c1.add(new Pasajeros(false,31));
		
		ArrayList<Vagon> c2 = new ArrayList();
		c2.add(new Mercancias(20,30,40));
		c2.add(new Mercancias(10,10,10));
		c2.add(new Mercancias(30,30,40));
		c2.add(new Mercancias(20,30,20));
		
		t.put(1, c1);
		t.put(2, c2);
	}
	
}
