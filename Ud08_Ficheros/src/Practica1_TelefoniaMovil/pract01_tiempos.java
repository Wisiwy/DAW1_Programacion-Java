package Practica1_TelefoniaMovil;

import java.io.*;

public class pract01_tiempos {

	public static void main(String[] args) {

		System.out.println("------FACTURACIÓN MOVIL---------");

		// leer h, m ,s del documentos y asignarlo

		// la URL esta puest desde linux ¿se puede relativa y que se compartaa para los
		// dos SO?
		File f1 = new File(
				"/home/molossguay/Documents/Pro_wk_bajar-y-borrar/Ud08_Ficheros/Fichers/Practica1_tiempos.txt");
		int h = 0, m = 0, s = 0;

		File f2 = new File("/home/molossguay/Documents/Pro_wk_bajar-y-borrar/Ud08_Ficheros/Fichers/tarifas.txt");

		if (f2.exists()) {
			System.out.println("Existe el archivo: " + f2.getAbsolutePath());
			try {
				//borramos el contenido del archivo
				FileWriter borrar = new FileWriter(f2,false);
				borrar.write(" ");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else
			try {
				if (f2.createNewFile())
					System.out.println("Archivo creado correctamente.");
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		
		
		
		
//		*******LECTURA -> CALCULO -> ESCRITURA DE TIEMPOS 

		System.out.println(h + "h-" + m + "m-" + s + "s");
		try {
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			int numCliente = 1;
			while (linea != null) {
				System.out.println(linea + " test");
				
				// separamos y leemos las h, m y s
				String[] strArray = linea.split(":");
				h = Integer.parseInt(strArray[0]);
				m = Integer.parseInt(strArray[1]);
				s = Integer.parseInt(strArray[2]);
				
				// segundos totales
				int segTotal = pasarASeg(h, m, s);
				System.out.println("Segundos Totales: " + segTotal);
				
				// pasar a segundos totales -> centimos -> euros
				double tarifa = 0.5;
				double coste = calcuCoste(segTotal, tarifa);
				System.out.println(coste + " centimos");
				double euros = pasaAEuros(coste);
				System.out.printf("%.2f euros \n", euros);

				// escribir en un nuevo fichero
				FileWriter fw = new FileWriter(f2, true);
				fw.write("\n Cliente" + numCliente);
				fw.write("\n-------------");
				fw.write("\n" + segTotal + " seg hablados. Tarifa: " + tarifa + " cent/min \n");
				fw.write(coste + " centimos. // " + euros + " euros \n");
				fw.flush();
				fw.close();

//				leer la siguiente linea
				linea = br.readLine();

				numCliente++;
				System.out.println();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ++++++++++++++++++++++++++++++++++ METODOS +++++++++++++++++++
	private static double pasaAEuros(double coste) {
		return coste / 100;
	}

	private static double calcuCoste(int segTotal, double tarifa) {
		return segTotal * tarifa;
	}

	private static int pasarASeg(int h, int m, int s) {
		return (h * 3600) + (m * 60) + s;
	}

}
