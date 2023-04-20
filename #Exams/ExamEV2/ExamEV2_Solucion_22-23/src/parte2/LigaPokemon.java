package parte2;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class LigaPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pokemon> ligasPokemon = new ArrayList<>();
		rellena(ligasPokemon);
		ligasPokemon.forEach(System.out::println);
		///////////////////////////////////////
		// .......continúa a partir de aquí
		///////////////////////////////////////
		
		ArrayList<Participante> listaParticipantes = new ArrayList();
		
		for(Pokemon p : ligasPokemon) {
			String equipo = p.getEquipo();
			String loc = p.getLocalidad();
			Set<String> pok = p.getPokemon();
			
			for (int i = 0; i < p.getLigas().size(); i++) {
				
				String liga = p.getLigas().get(i);
				double puntos = p.getPuntos().get(i);
				
				Participante par = new Participante(equipo,loc,liga,puntos,pok);
				//System.out.println(par);
				listaParticipantes.add(par);
				//listaParticipantes.add(new Participante(equipo,loc,liga,puntos,pok));
			}
			
		}
		Comparator<Participante> cLigas = (a,b) -> a.getLigas().compareTo(b.getLigas());
		Comparator<Participante> cPunto = (a,b) -> (int)(b.getPuntos()*100)-(int)(a.getPuntos()*100);
		listaParticipantes.sort(cLigas.thenComparing(cPunto));
		String titulo = "";
		int cont = 1;
		
		ArrayList<Medalla> listadoMedalla = new ArrayList();
		
		//listado 1
		for (Participante participante : listaParticipantes) {
			
			if(participante.getLigas().compareTo(titulo)!=0) {
				titulo = participante.getLigas();
				System.out.println(titulo);
				cont=1;
			}
			
			//imprimo participante
			System.out.println(participante);
			
			//recorrer sus pokemon
			for (String pokemon : participante.getPok()) {
				Medalla m = new Medalla(pokemon);
				
				if(listadoMedalla.contains(m)) {
					int pos = listadoMedalla.indexOf(m);
					m = listadoMedalla.get(pos);
					listadoMedalla.remove(pos);
				}
				
				if(cont == 1) {
					//medalla oro
					m.incOro();
				}else if(cont == 2) {
					//medalla plata
					m.incPlata();
				}else if(cont == 3) {
					//medalla bronce
					m.getBronce();
				}
				
				listadoMedalla.add(m);
				
			}
						
			cont++;
				
		}
		
		Comparator<Medalla> c1 = (a,b) -> b.getOro()-a.getOro();
		Comparator<Medalla> c2 = (a,b) -> b.getPlata()-a.getPlata();
		Comparator<Medalla> c3 = (a,b) -> b.getBronce()-a.getBronce();
		Comparator<Medalla> c4 = c1.thenComparing(c2).thenComparing(c3);
		listadoMedalla.sort(c4);
		System.out.println(" ");
		System.out.println("\n\n        Pokemon     Oro  Plata Bronce");
		System.out.println("-------------------------------------------");
		for (Medalla medalla : listadoMedalla) {
			System.out.println(medalla);
		}
		
		
		
		
	}
	
	public static void rellena(List<Pokemon> a) {
		String[] ligas = { "Liga Master Ball", "Liga Escarlata", "Liga Purpura", "Liga Pokemon Go",
				"Liga Ultra Ball", "Liga Mega Ball" };
		String[] equipos = { "Alohomora", "Accio", "Brackium Emendi", "Confundus", "Engorgio",
				"Expecto Patronum", "Expelliarmus", "Lumos", "Petrificus Totalus", "Riddikulus" };
		String[] pokemon = { "Bulbasaur", "Venusaur", "Pikachu", "Raichu", "Squirtle",
				"Blastoise", "Charmander", "Chameleon", "Dragonite", "Snorlax",
				"Metapod","Pidgeotto","Zubat","Psyduck","Geodude","Haunter","Onix",
				"Gengar","Drowzee","Cubone","Rhydon","Gyarados","Ditto","Vaporeon"};
		String[] loc = { "Huesca", "Zaragoza", "Teruel", "Castellon", "Soria", "Toledo", "Granada", "Sevilla",
				"Palencia", "Lugo" };
		double[] puntos = { 50.5, 9.5, 10.3, 5.1, 47.5, 48. };
		Pokemon at = null;
		for (int i = 0; i < ligas.length; i++) {
			int j = 0;
			int dif = (i % 2 == 0 ? (i + 1) : i);
			while (j < 6) {
				int pos = (int) (Math.random() * 10);
				at = new Pokemon(equipos[pos], loc[pos]);
				if (!a.contains(at)) {
					a.add(at);
					Set<String> pok = new LinkedHashSet();
					while(pok.size() < 5)
						pok.add(pokemon[(int) (Math.random() * pokemon.length)]);
					at.setPokemon(pok);
				} else {
					at = a.get(a.indexOf(at));
				}
				if (at.anadeMarca(ligas[i], (puntos[i] + dif * Math.random())))
					j++;
			}
		}
	}

}
