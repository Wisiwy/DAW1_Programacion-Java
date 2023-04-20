package ejercBasicos;

import java.util.Iterator;
import java.util.TreeMap;

public class RepasoTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer,String> mapa = new TreeMap(); 
	
		mapa.put(2, "Martes");
		mapa.put(5, "Viernes");
		mapa.put(1, "Lunes");
		mapa.put(3, "Miercoles");
		
//		Listar los datos del mapa
//			**Con Iterador
		
		Iterator<Integer> it = mapa.keySet().iterator();
		while (it.hasNext()) {
//			Recogemos clave
			Integer clave = it.next();
			String valor = mapa.get(clave);//Recoge el valor string de la clave
			System.out.printf("Clave: %2d Valor:%s \n",clave,valor);
			//Saca los valore ordenados
		}
		
//		Seguimos añadiendo para ver doonde lo pone
		mapa.put(5, "V13rnes");
		mapa.put(5, "V13rnes");
		mapa.put(5, "V13rnes");
		mapa.put(5, "V13rnes");
		mapa.put(4, "Jueves");
		mapa.put(5, "V13rnes");
		mapa.put(5, "V13rnes");
		mapa.put(5, "V13rnes");
		mapa.put(5, "V13rnes");
		
//		Se sobreescribe y ordena. Lo comprobamos listando con un foreach.
		System.out.println();
		for(Integer c:mapa.keySet()) {
			String valor = mapa.get(c);
			System.out.printf("Clave: %2d Valor:%s \n",c,valor);

		}
		System.out.println();
//		Si existe miercoles quiero actualizarlo. 
		if (mapa.containsKey(3)) {
			String valor = mapa.get(3);
			System.out.println("Valor: "+ valor);
			valor = valor.toUpperCase(); //cambiamos el valor a mayusculas por cambiar algo.
			System.out.println("Valor: "+ valor);
			//actualizarlo en el treemap
			mapa.put(3, valor);
		}
		
//		LISTAR con forEach
		System.out.println();
		mapa.forEach((a,b)->System.out.printf("Clave:%2d Valor:%s \n",a,b));
		
	}

}
