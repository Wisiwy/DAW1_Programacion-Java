package parte2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class JuegosOlimpicos_v4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Atleta> atletismo = new ArrayList<>();
		rellena(atletismo);
		//atletismo.forEach(System.out::println);
		///////////////////////////////////////
		// .......continua a partir de aqu�
		///////////////////////////////////////
		TreeMap<String, ArrayList<Participante>> tmPar = new TreeMap();
		for(Atleta a : atletismo) {
			
			String nom = a.getNombre();
			String pais = a.getPais();
			
			for(int i=0; i<a.getPruebas().size() ; i++) {
				String pru = a.getPruebas().get(i);
				Double tie = a.getTiempos().get(i);
				
				Participante par = new Participante(nom,pais,pru,tie);
				//System.out.println(par.getPrueba()+ "  "+ par);
				
				ArrayList<Participante> datoTree;
				if(tmPar.containsKey(pru)) {
					//si ya existe la prueba
					datoTree = tmPar.get(pru);
					//datoTree.add(par);
					//tmPar.put(pru, datoTree);
				}else {
					datoTree = new ArrayList();
					//datoTree.add(par);
					//tmPar.put(pru, datoTree);
				}
				datoTree.add(par);
				tmPar.put(pru, datoTree);
				//participantes.add(new Participante(nom,pais,pru,tie));
			}
			
		}//fin bucle atletas
		
		//ordeno participantes por prueba y tiempo
		
		//for(String clave : tmPar.keySet())
		//medallero
		ArrayList<Medalla> medallas = new ArrayList();
		
		Iterator<String> it = tmPar.keySet().iterator();
		while(it.hasNext()) {
			String clave = it.next();
			System.out.println(clave);
			ArrayList<Participante> value = tmPar.get(clave);
			Comparator<Participante> cTiempo = (a,b) -> (int)(a.getTiempo()*100)-(int)(b.getTiempo()*100);
			value.sort(cTiempo);
			int cont=0;
			for(Participante p : value) {
				System.out.println(p);
				
				Medalla m = new Medalla(p.getPais());
				if(medallas.contains(m)){//si existe esa medalla
					int index = medallas.indexOf(m);
					m = medallas.get(index);
					medallas.remove(index);
				}
				medallas.add(m);
				
				if(cont==0)//oro
					m.incOro();
				else if(cont ==1)//plata
					m.incPlata();
				else if(cont==2)//bronce
					m.incBronce();
					
				cont++;
			}
		}
		
		
		//ordenar y pintar medallas
		Comparator<Medalla> cOro = (a,b) -> b.getOro()-a.getOro();
		medallas.sort(cOro);
		medallas.forEach(System.out::println);

		
		/*Comparator<Participante> cPrueba = (a,b) -> a.getPrueba().compareTo(b.getPrueba());
		Comparator<Participante> cTiempo = (a,b) -> (int)(a.getTiempo()*100)-(int)(b.getTiempo()*100);
		participantes.sort(cPrueba.thenComparing(cTiempo));
		
		String titulo="";
		for(Participante p: participantes) {
			if(p.getPrueba().compareTo(titulo)!=0) {
				titulo=p.getPrueba();
				System.out.println(titulo);
			}
			System.out.println(p);
			//System.out.println(p.getPrueba()+ "  "+ p);
		}
		
		*/
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
