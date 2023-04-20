package OTROS;

public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		
		final int veces = 50;
		String nac[] = {"Francesa","Portuguesa","Espanola","Alemana","Holandesa",
				"Rumana","Danesa","Estadounidense","Colombiana","Peruana","China","Japonesa",
				"Inglesa","Italiana","Irlandesa","Ucraniana","Tailandesa","Dominicana"};
		
		Colegio cole= new Colegio();
		
		
		
		for (int i = 1; i <= veces; i++) {
			
			int p = (int) (Math.random()*nac.length);
			//System.out.printf("%02d - %-15s \n",i,nac[p]);
			//System.out.println(nac[p].toUpperCase());
			cole.addAlumno(nac[p].toUpperCase());
			
		}
		cole.showAll();
		System.out.println("Hay "+cole.cuantos()+" nacionalidades");
		
		cole.showNacionalidad("alemana");
		
		cole.borra();
		cole.showAll();
		System.out.println("Hay "+cole.cuantos()+" nacionalidades");
		//cole.showAll();

	}

}
