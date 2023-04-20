package h2_tarde;

import java.util.ArrayList;
import java.util.Iterator;

public class Oficina {
	
	private ArrayList<Cola> oficina;
	
	public Oficina(int ventanas) {
		
		oficina = new ArrayList<Cola>();
		
		for (int i = 0; i < ventanas; i++) {
			oficina.add(new Cola());
		}
	}
	
	public void pintar() {
		
		for (int i = 0; i < oficina.size(); i++) {
			Cola aux = oficina.get(i);
			System.out.printf("=========\n");
			System.out.printf("| V%02d |",i);
			for (int j = 0; j < aux.size(); j++) {
				System.out.printf(" %02d |",aux.get(j));
			}
			System.out.printf("\n=========\n");
		}
	}
	
	public void servirColas() {
		//decrementar cabeceras
		for (int i = 0; i < oficina.size(); i++) {
			Cola aux = oficina.get(i);
			if(aux.decrementa() == 0)
				aux.extraerTarea();
		}
	}
	
	public void asignarCola(int tarea) {
		//busca la ventana más libre y le asigna la tarea.
		
		int min=0,pos=0;
		
		for (int i = 0; i < oficina.size(); i++) {
			Cola aux = oficina.get(i);
			if(i==0 || aux.medirCola() < min ) {
				min = aux.medirCola();
				pos=i; //posición donde asignare el valor
			}
		}
		
					
		oficina.get(pos).insertarTarea(tarea);
		
		
		
	}
	

}
