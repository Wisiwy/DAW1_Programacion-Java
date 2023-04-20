package h1_ejer_E_S;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RGReader {

	/**
	 * Abre Writer
	 * @param fnom (File)
	 * @return FileWeriter
	 */
	private static FileWriter abrirWriter(File fnom) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(fnom);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fw;
	}
/**
 * Saltar lineas
 * @param br buffered reader
 * @param i num de lineas a saltar
 * @return buffered reader con el puntero en las lineas saltadas
 */
	private static BufferedReader saltasLineas(BufferedReader br, int i) {
		for (int j = 0; j < i; j++) {
			try {
				br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return br;
	}
	/**
	 * Abre reader de un fichero
	 * @param fnom (File)
	 * @return BufferedReader
	 */
	private static BufferedReader abrirReader(File fnom) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fnom));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return br;
	}
	
	
}
