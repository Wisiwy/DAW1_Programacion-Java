package Ejercicios_extra;

public class Ejer3 {
	
	public static void main(String[] args) {
		
		
		String[] nombre = {"Mario","Victor","Julio","Azucena","Susana","Rebeca","Max","Pancho","Alberto","Mari Carmen"};
		String[] apellido = {"Gutierrez","Cervantes","Ruiz","Gonzalez","Diaz","Murcia","Campillo","Martinez","Herrera","Bordeje"};
		
		boolean[] vnom = {false,false,false,false,false,false,false,false,false,false};
		boolean[] vapp = {false,false,false,false,false,false,false,false,false,false};
		
		for (int i = 1; i <= 10; i++) {
			
			int pos;
			String nom, app;
			
			do {
				pos = (int) (Math.random()*nombre.length);
			}while(vnom[pos] == true);
				
			nom = nombre[pos];
			vnom[pos] = true;
			
			
			do {
				pos = (int) (Math.random()*apellido.length);
			}while(vapp[pos]==true);
			
			app = apellido[pos];
			vapp[pos] = true;
			
			System.out.printf(" %2d - %-12s %-10s \n",i,nom,app);
			
		}
		
	}

}
