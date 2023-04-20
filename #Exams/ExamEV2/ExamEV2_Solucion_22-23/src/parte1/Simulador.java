package parte1;

import java.util.ArrayList;

public class Simulador {
	
	private int id;
	private ArrayList<Vagon> tren;
	private String destino;
	private int coste;
	
	public Simulador(int id, ArrayList<Vagon> tren, String destino, int coste) {
		super();
		this.id = id;
		this.tren = tren;
		this.destino = destino;
		this.coste = coste;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Vagon> getTren() {
		return tren;
	}

	public void setTren(ArrayList<Vagon> tren) {
		this.tren = tren;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}
	
	
	public void estado() {
		System.out.printf(":\n: Tren: %02d Destino: %15s Coste: %3d\n",id,destino,coste);
	}
	
	public void pintaTren() {
		System.out.print("/ooo#88T|");
		for(Vagon v : tren) {
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
	
	public int decCoste() {
		coste--;
		return coste;
	}
	
	public void descargo() {
		for(Vagon v : tren)
			v.descargar();
	}
	
	public void cargo() {
		for(Vagon v : tren)
			v.cargar();
	}
	
	public void actualizoDestino() {
		
		String estaciones[][] = {{"Sants (Barcelona)","Santa Justa (Sevilla)","Joaquin Sorolla (Valencia)","Delicias (Zaragoza)"},
			     {"150","150","200","80"}};
		
		if(destino.compareTo("Atocha (Madrid)")==0) {
			//generar nuevo destino
			int aleat = (int)(Math.random()*estaciones[0].length);
			destino = estaciones[0][aleat];
			coste = Integer.parseInt(estaciones[1][aleat]);
			
		}else {
			//volver a Madrid
			for(int i=0;i<estaciones[0].length;i++) {
				if(destino.compareTo(estaciones[0][i])==0) {
					coste = Integer.parseInt(estaciones[1][i]);
					destino = "Atocha (Madrid)";
					i=estaciones[0].length; //para que pare
				}
			}
			
		}
	}
	
	

}
