package h2_ejer03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

//		CREAR LA LISTA DE LOS ALUMNOS
		List<Alumno> listAlum = new ArrayList();

		for (int i = 0; i < 50; i++) {
			Alumno aux = new Alumno();
			int ale = (int) (Math.random() * 11);
			aux.setNota1(ale);
			ale = (int) (Math.random() * 11);
			aux.setNota2(ale);
			ale = (int) (Math.random() * 11);
			aux.setNota3(ale);
			listAlum.add(aux);
		}

//		System.out.println();
//		System.out.println("-------------LISTA ALUMNOS--------------------");
//		System.out.println();
//		impriList(listAlum);

//		CREAR UN TREEMAP CON LAS NOTAS COMO CLAVES
		Map<Integer, List<Alumno>> n1Map = new TreeMap();

		for (Alumno alumno : listAlum) {
			List<Alumno> auxList = new ArrayList();
			int notaClave = alumno.getNota1();

			for (Alumno alumno2 : listAlum) {
				if (alumno2.getNota1() == notaClave) {
					auxList.add(alumno2);
				}
				n1Map.put(notaClave, auxList);
			}
		}
//		EL METODO FUNCIONA PERO ES MEJOR CON EL METODO .containsKey. 
//		Mi metodo hace un mapa con key 2 y luego lo sobreescribe al encontrar otra clave 2 y crea de
//		nuevo el mapa, asi hasta encontrar el ultimo key 2 comprobada.  
//		Con containsKey. creo un unico mapa una vez para cada clave. 

//		NOTA 2: METODO containsKey
		Integer clave;
		Map<Integer, List<Alumno>> n2Map = new TreeMap();

		for (Alumno alumno : listAlum) {
			int n2 = alumno.getNota2();

			if (n2Map.containsKey(n2)) {
				n2Map.get(n2).add(alumno);
			} else {
				List<Alumno> auxList = new ArrayList();
				auxList.add(alumno);
				n2Map.put(n2, auxList);
			}
		}
		
		
//		NOTA 3: Metodo contains key simplificado
		Map<Integer, List<Alumno>> n3Map = new TreeMap();
		List<Alumno> auxList;
		for (Alumno alumno : listAlum) {
			int n3 = alumno.getNota3();
			if(n3Map.containsKey(n3)) {
				auxList = n3Map.get(n3);
			}else
				auxList=new ArrayList();
			
			auxList.add(alumno);
			n3Map.put(n3, auxList);
		}
		

//		++++++++++++++++++++++++++++IMPRIMIR MAPA+++++++++++++++++++++++
		System.out.println();
		System.out.println("-------------TREE MAP: NOTA1--------------------");
		System.out.println();
		impriTree(n1Map);
		System.out.println();
		System.out.println("-------------TREE MAP: NOTA2--------------------");
		System.out.println();
		impriTree(n2Map);
		System.out.println();
		System.out.println("-------------TREE MAP: NOTA3--------------------");
		System.out.println();
		impriTree(n3Map);
		System.out.println();
	}

	private static void impriTree(Map<Integer, List<Alumno>> mp) {
		Iterator<Integer> it = mp.keySet().iterator();
		while (it.hasNext()) {
			int clave = it.next();

			System.out.printf("NOTA: %s.\n %s ",clave, mp.get(clave));
			System.out.println();
		}

	}

	private static void impriList(List<Alumno> ls) {

		for (Alumno alumno : ls) {
			System.out.println(alumno);
		}

	}

}