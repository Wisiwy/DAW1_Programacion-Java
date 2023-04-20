package parte2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class JuegosOlimpicos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Atleta> atletismo = new ArrayList<>();
		rellena(atletismo);
		atletismo.forEach(System.out::println);
		///////////////////////////////////////
		// .......contin�a a partir de aqu�
		///////////////////////////////////////
		
		ArrayList<Participante> sol1 = listado1(atletismo);
		
		//listado2(sol1);
		listado2_treeMap(sol1);
		
	}

	private static void listado2_treeMap(ArrayList<Participante> sol1) {

		String titulo="";
		int cont=0;
		TreeMap<String,Medalla> tmMedalla = new TreeMap();
		for(Participante p : sol1) {
			
			if(p.getPrueba().compareTo(titulo)!=0) {
				cont=0;
				titulo = p.getPrueba();
			}
			
			if(cont >=0 && cont <=2) {
				
				Medalla m;
				String key = p.getPais();
				if(tmMedalla.containsKey(key)) {
					m = tmMedalla.get(key);
				}else {
					m = new Medalla(key);
				}
				
				if(cont ==0)
					m.incOro();
				else if(cont ==1)
					m.incPlata();
				else if(cont ==2)
					m.incBronce();
				
				tmMedalla.put(key, m);
				
			}
			cont++;			
		}
		
		//tmMedalla.forEach((a,b)->System.out.println(a+" -- "+b));
		
		ArrayList<Medalla> sol2 = new ArrayList();
		for(String clave : tmMedalla.keySet()) {
			sol2.add(tmMedalla.get(clave));
		}
		
		Comparator<Medalla> cOro = (a,b) -> b.getOro()-a.getOro();
		Comparator<Medalla> cPla = (a,b) -> b.getPlata()-a.getPlata();
		Comparator<Medalla> cBro = (a,b) -> b.getBronce()-a.getBronce();
		sol2.sort(cOro.thenComparing(cPla).thenComparing(cBro));
		sol2.forEach(System.out::println);
		
	}

	private static void listado2(ArrayList<Participante> sol1) {
		
		String titulo="";
		int cont=0;
		ArrayList<Medalla> sol2 = new ArrayList();
		for(Participante p : sol1) {
			if(p.getPrueba().compareTo(titulo)!=0) {
				titulo = p.getPrueba();
				//System.out.println(titulo);
				cont=0;
			}
			System.out.println(p);
			
			if( cont >= 0 && cont <= 2) {
				Medalla m = new Medalla(p.getPais());
				//int pos=0;
				int pos = sol2.size();
				if(sol2.contains(m)) {
					//si existe esa medalla
					pos = sol2.indexOf(m);
					m=sol2.get(pos);
					sol2.remove(pos);
				}
				
				if(cont ==0)
					m.incOro();
				else if(cont ==1)
					m.incPlata();
				else if(cont ==2)
					m.incBronce();
				
				sol2.add(pos, m);
			}
			cont++;
		}
		
		sol2.forEach(System.out::println);
		
		Comparator<Medalla> cOro = (a,b) -> b.getOro()-a.getOro();
		sol2.sort(cOro);
		sol2.forEach(System.out::println);
	}

	private static ArrayList<Participante> listado1(List<Atleta> atletismo) {

		ArrayList<Participante> sol1 = new ArrayList<>();
		for(Atleta a : atletismo) {
			String n = a.getNombre();
			String p = a.getPais();
			
			for(int i=0; i < a.getPruebas().size() ; i++) {
				String prueba = a.getPruebas().get(i);
				double tiempo = a.getTiempos().get(i);
				
				//System.out.printf("%s %s %s %.2f \n",prueba,n,p,tiempo);
				sol1.add(new Participante(n,p,prueba,tiempo));
			}
		}
		
		Comparator<Participante> cPrueba = (a,b) -> a.getPrueba().compareTo(b.getPrueba());
		Comparator<Participante> cTiempo = (a,b) -> (int)(a.getTiempo()*100)-(int)(b.getTiempo()*100);
				
		sol1.sort(cPrueba.thenComparing(cTiempo));
		String titulo="";
		for(Participante p : sol1) {
			if(p.getPrueba().compareTo(titulo)!=0) {
				titulo = p.getPrueba();
				System.out.println(titulo);
			}
			System.out.println(p);
		}
		
		return sol1;
		
	}

	public static void rellena(List<Atleta> a) {
		String[] pruebas = { "100 m femeninos", "100 m masculinos", "200 m femeninos", "200 m masculinos",
				"400 m femeninos", "400 m masculinos" };
		String[] nombresm = { "Bruno Hortelano", "Usain Bolt", "Carl Lewis", "Armin Hary", "Valeri Borzov",
				"Linford Christie", "Michael Johnson", "Wayde van Niekerk", "Su Bingtian", "Christophe Lemaitre" };
		String[] nombresf = { "Salma Pallaruelo", "Merlene Ottey", "Marion Jones", "Heike Drechsler", "Irina Privalova",
				"Dina Asher-Smith", "Sanya Richards-Ross", "Caster Semenya", "Li Xuemei", "Marie-Josee Perec" };
		String[] paises = { "Espa�a", "Jamaica", "USA", "Alemania", "Rusia", "Gran Breta�a", "USA", "Sud-Africa",
				"China", "Francia" };
		double[] tiempos = { 10.5, 9.5, 21.3, 19.1, 47.5, 43. };
		Atleta at = null;
		for (int i = 0; i < pruebas.length; i++) {
			int j = 0;
			int dif = (i % 2 == 0 ? (i + 1) : i);
			while (j < 6) {
				int pos = (int) (Math.random() * 10);
				if (i % 2 == 0) {
					at = new Atleta(nombresf[pos], paises[pos]);
				} else {
					at = new Atleta(nombresm[pos], paises[pos]);
				}
				if (!a.contains(at)) {
					a.add(at);
				} else {
					at = a.get(a.indexOf(at));
				}
				if (at.anadeMarca(pruebas[i], (tiempos[i] + dif * Math.random())))
					j++;
			}
		}
	}

}
