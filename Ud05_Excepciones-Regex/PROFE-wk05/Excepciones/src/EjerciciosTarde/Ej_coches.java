package EjerciciosTarde;

import java.awt.AWTException;
import java.awt.Robot;

public class Ej_coches {

	public static void main(String[] args) {
		
		
		String[] vColor = {"rojo","rosa","verde","amarillo","plateado","blanco","negro","cyan","gris","naranja","azul"};
		String[] vMarca = {"ford","nissan","toyota","lancia","opel","dacia","renault","skoda","ferrari"};
		
		for (int id = 1; id <= 10; id++){
		
			boolean repite= true;
			
			
			do {
				int p = (int) (Math.random()*vColor.length);
				String color = vColor[p];
		
				int m = (int) (Math.random()*vMarca.length);
				String marca = vMarca[m];
	
				String letra = "QWRTYPSDFGHJKLZXCVBNM";
				String matricula = "";
				matricula += (int) (Math.random()*10);
				matricula += (int) (Math.random()*10);
				matricula += (int) (Math.random()*10);
				matricula += (int) (Math.random()*10);
				matricula += letra.charAt((int)(Math.random()*letra.length()));
				matricula += letra.charAt((int)(Math.random()*letra.length()));
				matricula += letra.charAt((int)(Math.random()*letra.length()));
				
				//System.out.println(matricula);
		
				try{
					Coche c = new Coche (id, marca, color, matricula);
					System.out.println(c);
					repite=false;
				}catch(Exception e) {
					//System.out.println("Error: "+e.getMessage());
				}
			}while(repite);
		}
	}
}
