package colleciones;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {

//		Los mapas guardan dos clases: una representa clave y otra valor. 
//		
//		Map mapa = new HashMap();
		Map<Integer,String> mapa = new TreeMap();  //Map<Clave,Valor>
		
		//		1.Objetos tienen asignados una clave. 
		
		// ------METODOS QUE TIENE
//		.keySet: devuelve una colleccion 
//		.put equivalent al add en listas
		mapa.put(1,"Lunes");
		mapa.put(5,"Viernes");
		mapa.put(3,"Miercoles");
		mapa.put(2,"Martes");
		mapa.put(4,"Jueves");
		mapa.put(6,"Domingo");
		
//		Es un tree ordena por la clave
		mapa.remove(6);
		if(mapa.remove(4,"Jueves"));
			System.out.println("Se ha eliminado el jueves.");
		
//		------RECORRER UN MAPA
//			Tendremos que usar un <iterator>
			Iterator<Integer> it = mapa.keySet().iterator();
			while (it.hasNext()) {
				int clave = it.next();
				System.out.println(mapa.get(clave));
			}
			//Iterator: una interfaz
			//.keySet = recoje una coleccion set del mapa, se almacenan las claves del mapa. (cogemos coleccion de set)
			//.iterator() = convierte la coleccion en un interator de integers. Es un método de listas (coleciones)
			
			
			Iterator<Integer> it2 = mapa.keySet().iterator();
				while (it2.hasNext()){
					System.out.println(mapa.get(it2.next()));
					
				}
			
	}

}
