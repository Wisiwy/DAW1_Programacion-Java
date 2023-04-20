package Menu;

public class Principal {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		//String[] s = {"Subir","Bajar","Entrar"};
		String[] s = {"abrir","cerrar","listar","Mover","Girar"};
		do {
			
			int o = Utilidad.menu(s);
			
			if(o == 1) {
				System.out.println("SUBO");
			}else if(o ==2) {
				System.out.println("BAJO");
			}else if(o == 3) {
				System.out.println("ENTRO");
			}else if(o==0) {
				menu = false;
			}else {
				System.err.println("Error. dato no valido.");
			}
			
		}while(menu==true);
		
		System.out.println("Salgo del programa.");
	}
	

}
