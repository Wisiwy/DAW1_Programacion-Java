package h2_tarde;

public class Ejer05 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//parámetros
		int ventanillas = 4;  //número de ventanillas
		int t[][] = {{10,20,30,40},{60,25,10,5}}; //{posibles tareas} , {ponderación}
		
		Oficina ofi = new Oficina(ventanillas);
		//simulación
		for (int i=1; i<=300 ; i++) {
			
			if(i%5==0) {
				int tarea = nuevaTarea(t); //generar tarea
				System.out.println("Tarea de : "+tarea);
				ofi.asignarCola(tarea); //asignar la tarea a la cola más óptima
			}
			/*if(i%15==0) {
				ofi.pintar();
				Thread.sleep(5000);
			}*/
			ofi.pintar(); //muestra el estado de las colas
			Thread.sleep(1000);
			ofi.servirColas(); //restar 1 a las cabeceras, si es 0, se quita
		}
		
	}
	
	/**
	 * Algoritmo que genera una tarea aleatoria a partir de un vector de tareas
	 * en la fila 0 se encuentran las tareas
	 * en la fila 1 se encuentran las ponderaciones
	 * 
	 * @param t es el vector de tareas
	 * @return devuelve una tarea aleatoria
	 */
	public static int nuevaTarea(int[][] t) {
		
		int total=0;
		for (int i = 0; i < t[1].length; i++) {
			total+=t[1][i];
		}
		
		int aleat = (int)(Math.random()*total)+1;
		
		int num=0;
		for (int i = 0; i < t[1].length; i++) {
			num += t[1][i];
			if(num >= aleat)
				return t[0][i];
		}
		
		
		return 0;
	}

}
