package Repaso;

public class Ej_33 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//posicion pirata
		int x=0;
		int y=0;
		
		
		boolean jugar = true;
		
		while(jugar==true) {
			
			//hago tirada
			int num = (int) (Math.random()*200-10);
			System.out.println("\nnum: "+num);
			
			
			if(num < 0) {
				//se duerme el pirata
				jugar = false;
				System.out.println("El pirata se ha dormido.");
			}else if( num%2 == 0 ) {
				//dar un paso hacia delante
				y++;
				System.out.printf("(%02d,%02d)->Adelanto un paso.\n",x,y);
				if(y >= 15 ) {
					System.out.println("Ha llegado al barco");
					jugar=false;
				}
			}else if((num-1)%4==0) {
				//da un paso hacia la derecha
				x++;
				
				if(Math.abs(x) > 2) {
					System.err.printf("(%02d,%02d)->derecha.\n",x,y);
					System.err.println("Se ahoga");
					jugar=false;
				}else {
					System.out.printf("(%02d,%02d)->derecha.\n",x,y);
				}
			}else {
				//paso a la izquierda
				x--;
				
				if(Math.abs(x) > 2) {
					System.err.printf("(%02d,%02d)->derecha.\n",x,y);
					System.err.println("Se ahoga");
					jugar=false;
				}else {
					System.out.printf("(%02d,%02d)->derecha.\n",x,y);
				}
			}
			
			//Visual
			Thread.sleep(800);
			
		}//fin del while
		System.out.println("Fin del juego.");
		
		
		
		
		
		
	}//fin del main

}//fin de la clase
