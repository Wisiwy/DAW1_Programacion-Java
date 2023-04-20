package Coche;

public class Principal {
	
	public static void main(String[] args) {

		
		 String[] vColor = {"rojo","rosa","verde","amarillo","plateado","blanco","negro","cyan","gris","naranja","azul"};
		 String[] vMarca = {"ford","nissan","toyota","lancia","opel","dacia","renault","skoda","ferrari"};
		
		 //Crear 10 coches
		 
		 Coche[] coches = new Coche[10];
		 
		 System.out.println("Coches :");
		 System.out.println("-----------------");
		 
		 for (int i = 1; i <= 10; i++) {
			 
			 boolean creado = false;
			 
			do {
				 
				 int p = (int) (Math.random()*vColor.length);
				 String color = vColor[p];
				 String matricula = matricula();
				 int s = (int) (Math.random()*vMarca.length);
				 String marca = vMarca[s];
				 
				 //System.out.printf("%s %s %d %s \n",matricula,color,i,marca);
				 
				 try {
					 Coche c = new Coche(color,marca,i,matricula);
					 creado = true;
					 
					 System.out.println(c);
					 
				 } catch (NoColor | NoMarca e) {
					 //System.out.println(e.getMessage());
				 }
				 
			 }while (creado == false);
			 
			 
				
		 }

	
}


	private static String matricula() {

		String dato = "";
		
		for (int i = 0; i < 4; i++) {
			 int p = (int) (Math.random()*10);
			 dato += p ;

		}
		
		String vLetra = "BCDFGHJKLMNPQRSTVWXY";
		
		for (int i = 0; i < 3; i++) {
			 int p = (int) (Math.random()*vLetra.length());
			 dato += vLetra.charAt(p) ;

		}
		return dato;
	}

}
