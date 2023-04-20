package parte2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class JuegosOlimpicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Atleta> atletismo = new ArrayList<>();
		rellena(atletismo);
		atletismo.forEach(System.out::println);
		///////////////////////////////////////
		// .......continua a partir de aqu�
		///////////////////////////////////////
		ArrayList<Participante> preg1 = new ArrayList();
		for(Atleta a : atletismo) {
			String nombre = a.getNombre();
			String pais = a.getPais();
			List<String> pruebas = a.getPruebas();
			List<Double> tiempos = a.getTiempos();
			
			Iterator<String> it = pruebas.iterator();
			Iterator<Double> it2 = tiempos.iterator();
			while(it.hasNext()) {
				String p = it.next();
				Double t = it2.next();
				//System.out.println("Participante: Nombre: "+nombre+" Pais: "+ pais +" Prueba: "+p+" Tiempo: "+t);
				preg1.add(new Participante(nombre, pais, p, t));
			}
			
		}
		
		Comparator<Participante> cPrueba = (a,b) -> a.getPrueba().compareTo(b.getPrueba());
		Comparator<Participante> cTiempo = (a,b) -> (int)(a.getTiempo()*100)-(int)(b.getTiempo()*100);
		preg1.sort(cPrueba.thenComparing(cTiempo));
		//preg1.forEach(System.out::println);
		String titulo="";
		int cont =0;
		//TreeMap<String,Medalla> preg2 = new TreeMap();
		ArrayList<Medalla> preg2 = new ArrayList();
		for(Participante p: preg1) {
			if(p.getPrueba().compareTo(titulo)!=0) {
				titulo = p.getPrueba();
				System.out.println(titulo);
				cont =0;
			}
			System.out.println( p);
			
			//listado 2
			String pais = p.getPais();
			Medalla m =new Medalla(pais);
			int index=preg2.size();
			if(preg2.contains(m)) {
				index = preg2.indexOf(m);
				m = preg2.get(index);
				preg2.remove(index);
			}
			
			/*if(preg2.containsKey(pais))
				m = preg2.get(pais);
			else
				m = new Medalla(pais);*/
			
			if(cont == 0)
				m.incOro();
			else if(cont == 1)
				m.incPlata();
			else if(cont == 2)
				m.incBronce();
			
			//preg2.put(pais, m);
			preg2.add(index, m);
			cont++;
		}
		
		//listado2
		Comparator<Medalla> cOro = (a,b) -> b.getOro()-a.getOro();
		preg2.sort(cOro);
		preg2.forEach(System.out::println);
		//ArrayList<Medalla> aLMedalla = new ArrayList();
		//for(String p : preg2.keySet())
			//aLMedalla.add(preg2.get(p));
			//System.out.println(preg2.get(p));
		
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
