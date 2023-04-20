package h3_dificil;

import java.util.ArrayList;

public class Vagon {
	
	private static int contVagon=10;
	private ArrayList<Integer> vagon;
	
	
	public Vagon(){
		vagon = new ArrayList();
		vagon.add(0,contVagon);
		contVagon+=10;
		
		//relleno ceros pos 1-10?
		for(int i=1;i<=10;i++)
			vagon.add(0);
	}


	@Override
	public String toString() {
		String salida = "ID: "+vagon.get(0)+" -- ";
		/*for(Integer i : vagon)
			salida += i+ " - ";*/
		for(int i=1;i<=10;i++)
			salida += vagon.get(i)+" ";
		
		return salida;
	}
	
	

}
