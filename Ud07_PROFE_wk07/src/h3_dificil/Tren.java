package h3_dificil;

import java.util.ArrayList;

public class Tren {

	private static int contTren=1;
	private int numTren;
	private String hora, eSalida,eLlegada;
	private ArrayList<Vagon> vagones;
	
	public Tren(String h, String salida, String llegada) {
		numTren = contTren;
		contTren++;
		
		hora = h;
		eSalida = salida;
		eLlegada = llegada;
		
		vagones = new ArrayList();
	}

	public int getNumTren() {
		return numTren;
	}
	
	public void anadeVagon() {
		vagones.add(new Vagon());
	}
	
	public void pintar() {
		System.out.printf("Tren: %2d          HoraSalida: %s\n",this.numTren,hora);
		System.out.printf("eSalida: %s  ELlegada: %s\n",eSalida,eLlegada);
		for(Vagon v : vagones)
			System.out.println(v);
	}

	public void venderBillete() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
