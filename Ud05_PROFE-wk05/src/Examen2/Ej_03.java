package Examen2;

import java.util.Scanner;

public class Ej_03 {
	
	public static void main(String[] args) {
		
		
		int[] bombo1 = new int[1000];
		boolean[] vB1 = new boolean[1000];
		int[] bombo2 = new int[23];
		boolean[] vB2 = new boolean[23];
		
		//rellenar bombo1
		for (int i = 0; i < bombo1.length; i++) {
			bombo1[i] = i+1;
		}
		
		//iniciar vB1
		for (int i = 0; i < vB1.length; i++) {
			vB1[i] = false;
		}
		
		//rellenar bombo2
		bombo2[0] = 10000;
		bombo2[1] = 5000;
		bombo2[2] = 1000;
		for (int i = 3; i < bombo2.length; i++) {
			bombo2[i] = 500;
		}
		
		//iniciar vB2
		for (int i = 0; i < vB2.length; i++) {
			vB2[i] = false;
		}
		
		///////////////////////////////////////////////
		
		Sorteo[] resultados = new Sorteo[23];//vector para guardar los datos del sorteo
		
		for (int i = 0; i < bombo2.length; i++) {
			
			
			//numero aleatorio
			int num;
			
			do {
				num = (int) (Math.random()*bombo1.length);
			}while(vB1[num] == true);
			
			vB1[num] = true;
			
			//premio aleatorio
			int pre;
			
			do {
				pre = (int) (Math.random()*bombo2.length);
			}while(vB2[pre] == true);
			
			vB2[pre] = true;
			
			//saco por pantalla
			System.out.printf(" %04d - %5d\n",bombo1[num],bombo2[pre]);
			
			//guardo los datos
			resultados[i] = new Sorteo(bombo1[num],bombo2[pre]);
			
			
		}//fin del bucle que genera premios
		
		////MENU
		boolean menu = true;
		do {
			
			System.out.println("1 - Mostrar resultados.");
			System.out.println("2 - Buscar número.");
			System.out.println("3 - Salir");
			
			System.out.print("\n\tOpcion:");
			Scanner t = new Scanner(System.in);
			int opt = Integer.parseInt(t.nextLine());
			
			
			if(opt == 1) {
				System.out.println("Mostrar Datos");
				for(Sorteo s : resultados)
					System.out.println(s);
				
			}else if(opt == 2) {
				System.out.println("Consulta datos:");
				System.out.print("Número: ");
				int num = Integer.parseInt(t.nextLine());
				
				for(Sorteo s : resultados) {
					
					if(s.getNum() == num) {
						System.out.println("Enhorabuena!! te ha tocado "+s.getPre());
						break;
					}
					
				}
				
			}else if(opt == 3) {
				menu = false;
			}else {
				System.out.println("Opción invalida.");
			}
			
			
		}while(menu == true);
		
		
	}

}
