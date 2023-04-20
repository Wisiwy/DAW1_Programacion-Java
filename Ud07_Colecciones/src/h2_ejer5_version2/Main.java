//package h2_ejer5_version2;
//
//public class Main {
//	public static void main(String[] args) {
//
//		int ventanillas = 5; //numero ventanillas
//		int t[][] = {{10,20,30},{60,25,15}};//Para parametrizar y poder hacer otras simulaciones
//		
//		Oficina ofi = new Oficina(ventanillas);
//		
//		for (int i = 0; i < 300; i++) {
//			if(i%5==0 ) {
//				int tarea = nuevaTarea(t); //generar Tarea
//				System.out.println("Tarea de : " + tarea);
//				ofi.asignarCola(tarea); //Asignar la tarea a la cola más optima
//			}
//			if(i%15==0) {
//				ofi.pintarOfi();
//				Thread.sleep(500);
//			}
//			ofi.pintarOfi();//pintar cada segundo
//			Thread.sleep(1000);
//			ofi.ServirCola();//restar 1 a las cabeceras, si es 0, se quita.
//		}
//		
//	}
//}
