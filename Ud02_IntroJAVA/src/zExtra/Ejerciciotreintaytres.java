package zExtra;


public class Ejerciciotreintaytres {

	public static void main(String[] args) throws InterruptedException {
	
		int x = 2;
		int y = 0;
		int turno = 1;
		boolean vivo = true;
		
		System.out.println("EL JUEGO DEL MARINERO BORRACHO");
		System.out.println("El marinero comienza se tambalea.");
		
		for (int row = 0; row<15; row++) {
			for (int column = 0; column<5; column++) {
		
				if (column == x && row==y) {
					System.out.print("X,");
				} else {System.out.print(" ,");}
			}
			System.out.println();
		}
		Thread.sleep(1000);
		
		do {
			System.out.println("Turno " + turno + ":");
			turno++;

			int paso = (int) (Math.random()*200-10);
			if (paso < 0) {
				vivo = false;
				System.out.println("El marinero se ha dormido.");
			} else if (paso%2==0) {
				y++;
				System.out.println("El marinero da un paso adelante.");
			} else if ((paso-1)%4==0) {
				x++;
				System.out.println("El marinero da un paso a la derecha.");
			} else {
				x--;
				System.out.println("El marinero da un paso a la izquierda.");
			}
			
			if (x<0 || x>4) {
				vivo=false;
				System.out.println("El marinero se ha caido.");
			} else if (y>15) {
				vivo=false;
				System.out.println("El marinero ha llegado al barco.");
			}

			

			
			for (int row = 0; row<15; row++) {
				for (int column = 0; column<5; column++) {
			
					if (column == x && row==y) {
						System.out.print("X,");
					} else {System.out.print(" ,");}


					
				}
			System.out.println();
			} 

			
			Thread.sleep(1000);
		} while (vivo);
		
		
		System.out.println("Lo dejamos aqu�.");
		
	}
	
}
