package ejercBasicos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Ejer07_TreemapNotasAlumnosPorApellido {

	public static void main(String[] args) {
//	 TreemapNotasAlumnosPorApellido
//	Escribe un programa en Java que:
//		 Pida el apellido (se supone que no se repiten) y la calificación obtenida por un alumno.
//		La entrada de datos terminará cuando se introduzca como apellido “*”.
//		 Muestre un listado por orden alfabético de los datos de cada alumno.
	
//		TreeMap<String, Integer> mapa = new TreeMap();
//		String nom;
//		do {
//			nom = Leer.leerString("Intro nombre alumno: ");
//			if(nom.compareTo("*")!=0) {
//			Integer nota = Leer.leerInt("Intro nota alumno: ");
//			mapa.put(nom, nota);
//			}
//		}while (nom.compareTo("*")!=0);
//		
//		for(String key:mapa.keySet()) {
//			System.out.printf("%s // Nota: %2d \n",key, mapa.get(key));
//		}
//		System.out.println();
//		System.out.println(mapa);
		
		
		
		
		
		
		//MODIFICAR PARA ORDENAR POR NOTA: ****EJERCICIO 08
//		8) TreemapNotasAlumnosPorNota
//		Modifica el programa del ejercicio anterior para que podamos mostrar un listado ordenado
//		por notas, teniendo en cuenta que puede haber repeticiones de notas.
		Dibujo.titulo("EJER8: COMPARADOR DE NOTAS");
		
		TreeMap<Integer, ArrayList<String>> mapaNota = new TreeMap();
		String nom2;
		
		do {
			nom2 = Leer.leerString("Intro nombre alumno: ");
			Integer nota2 = 0;
			//Leemos nombre
			if(nom2.compareTo("*")!=0) {	
			nota2 = Leer.leerInt("Intro nota alumno: ");
			}
			//Si la nota forma parte de las clave
			
			ArrayList<String> aux;
			if (mapaNota.containsKey(nota2)) {
				aux = mapaNota.get(nota2);
			}else {//Si no esta creamos y añadimos el nombre al array list
				aux = new ArrayList();
			}
			aux.add(nom2);
			mapaNota.put(nota2,aux);
			Comparator<String> comp = (a,b) -> a.compareTo(b); //No hace falta crearlo
//			si tiene su metodo comparable la clase (String) no necesitamos crearlo. Dejarlo nulo
			mapaNota.get(nota2).sort(comp);
			mapaNota.get(nota2).sort(null); //Mejor. 
			
		}while (nom2.compareTo("*")!=0);
		
		
		
		for(Integer key:mapaNota.keySet()) {
			System.out.printf("Nota: %-2d // %s \n", key,mapaNota.get(key));
		}
		System.out.println();
		System.out.println(mapaNota);
		
		
	}

}
