package parte2;


public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola<Integer> colas[] = new Cola[5];// Vector de 5 colas
		Integer[] mesas = new Integer[5];// Puestos de atenci�n
		for (int i = 0; i < colas.length; i++) {
			colas[i] = new Cola<>();// Creo cada cola
		}
		int nodo;
		int vueltas = 60;
		while (vueltas > 0) {// atenci�n en bloques de 5 minutos hasta los 300 minutos
			nodo = genera();// Llega un cliente
			colas[busca(colas, mesas)].anadir(nodo);//El cliente se pone en la cola que devuleve busca
			for (int i = 0; i < mesas.length; i++) {
				if (mesas[i] == null || mesas[i] == 0) {
					mesas[i] = colas[i].sacar();//Saco al primero de la fila y pasa a la mesa
				} else {
					mesas[i] = mesas[i] - 5;//descuento 5 minutos de la atenci�n en la mesa
				}
			}
			muestra(colas, mesas);//Observo como est�n las filas y las mesas
			System.out.println("------");
			vueltas--;
		}
		muestra(colas, mesas);

	}

	private static void muestra(Cola<Integer>[] ventanillas, Integer[] atendidos) {
		for (int i = 0; i < ventanillas.length; i++) {
			System.out.println("cola " + i + " " + ventanillas[i].toString());
		}
		for (int i = 0; i < atendidos.length; i++) {
			System.out.println("Ventanilla " + i + " " + atendidos[i]);

		}
	}

	public static int genera() {// Genera el tiempo que va a estar siendo atendido cada cliente
		int valor = (int) (Math.random() * 100 + 1);
		if (valor < 61) {
			valor = 15;
		}
		if (valor > 60 && valor < 86) {
			valor = 20;
		}
		if (valor > 85) {
			valor = 30;
		}
		return valor;
	}

	public static int busca(Cola<Integer> v[], Integer[] m) {
		if (m[0] == null) {
			return 0;
		}
		int tam = v[0].tamano();
		int pos = 0;
		for (int i = 1; i < v.length; i++) {
			if (m[i] == null || m[i] == 0) {
				return i;
			}
			if (v[i].tamano() < tam) {
				pos = i;
				tam = v[i].tamano();
			}
		}
		return pos;
	}
}
