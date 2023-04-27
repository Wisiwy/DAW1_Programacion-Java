
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inserta la definición de la colección
		
		final String[] MENU = {"Salir", "Crea Producto", "Borra Producto", "Lista de Productos", "Compra y recibo"};
		// Crea una lista de productos en el método crea
		
		
		// de compra de productos
		int opcion = -1;
		while (opcion!=0) {
			switch(opcion) {
			case 1://Crea producto
				break;
			case 2://Borra producto
				break;
			case 3://Lista productos
				break;
			case 4://Compra y recibo
				break;
			}
			opcion = Leer.menu(MENU);
		}

	}

//	public static void crea(........) {
//		// crea 8 productos de los dos tipos y añadelos a la lista
//
//		
//	}
	
}
