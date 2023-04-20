package ejerExtra;

import java.util.Scanner;

public class profe_PiedraPapelTijera {
	
	public static void main(String[] args) {
		
		boolean salir = false;
		String[] s1 = {"Jugar","Ver Score"};
		//Score[] sc = new Score[5];
		
		do {
			
			int opt = menu(s1);
			
			if(opt == 1) {
				//jugar
				int puntos = jugar();
			}else if(opt == 2) {
				//ver
				//listar(sc);
			}else if(opt == 0) {
				salir = true;
			}else {
				System.err.println("Error. Opci�n no v�lida");
			}
			
			
		}while(!salir);
		
		
	}
	
	private static int jugar() {
		int[][] clave = {{0,1,-1},{1,0,-1},{-1,1,0}};
		String[] s2 = {"Piedra","Papel","Tijera"};
		int puntos = 0, cont = 0;
		int x;
		
		do {
			x = menu(s2);
			int y = (int) (Math.random()*3)+1;
			
			
			if(x >= 1 && x <= 3) {
				switch (clave[x-1][y-1]) {
				case 0:
					System.out.println("Empate!!");
					break;
				case 1:
					System.out.println(s2[y-1]+" Ganas!!");
					puntos+=10;
					break;
				case -1:
					System.out.println(s2[y-1]+" Pierdees!!");
					puntos-=3;
					if(puntos < 0)
						puntos =0;
					break;
				}
			}else {
				System.err.println("Error. Opci�n no v�lida");
			}
			
			cont++;
			
		}while(cont < 10 && x != 0);
		
		return puntos;
	}

	public static int menu(String[] s) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println();
		for(int i=1; i<=s.length ; i++) 
			System.out.println(i+" - "+s[i-1]);
		System.out.println("0 - Salir");
		System.out.print("\n Opcion: ");
		int opt = t.nextInt();
		
		return opt;
		
	}

}
