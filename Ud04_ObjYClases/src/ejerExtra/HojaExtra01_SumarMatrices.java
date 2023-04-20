package ejerExtra;

public class HojaExtra01_SumarMatrices {

	public static void main(String[] args) {

		Aleatorio[][] tabla1 = new Aleatorio[4][4];
		Aleatorio[][] tabla2 = new Aleatorio[4][4];

//tabla 1
		rellenarTabla(tabla1);
		mostrarTabla(tabla1);
		
		System.out.println();
//tabla 2
		rellenarTabla(tabla2);
		mostrarTabla(tabla2);
		
		System.out.println();
		System.out.println("---------------------SUMA---------");

		mostrarTabla(sumarTablas(tabla1, tabla2));
		
	}

	private static Aleatorio[][] sumarTablas(Aleatorio[][] tabla1, Aleatorio[][] tabla2) {
		
		Aleatorio[][] tablaAux = new Aleatorio[4][4];
		rellenarTabla(tablaAux);

		
		
		for (int i = 0; i < tablaAux.length; i++) {
			for (int j = 0; j < tablaAux[i].length; j++) {
				tablaAux[i][j].setNum( tabla1[i][j].getNum() + tabla2[i][j].getNum()); 
			}
		}
		
		
		return tablaAux;

	}

	private static void rellenarTabla(Aleatorio[][] tabla1) {
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1[i].length; j++) {
				tabla1[i][j] = new Aleatorio();
			}
		}
	}

	private static void mostrarTabla(Aleatorio[][] tabla1) {
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1[i].length; j++) {
				System.out.printf("%-3s ", tabla1[i][j].toString());
			}
			System.out.println();
		}

	}

}
