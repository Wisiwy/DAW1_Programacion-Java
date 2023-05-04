package aUtilidad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ficheros {
	
	public static BufferedReader abrirBR (File f ) throws FileNotFoundException {
		BufferedReader br;
		return br = new BufferedReader(new FileReader(f));
	}

}
