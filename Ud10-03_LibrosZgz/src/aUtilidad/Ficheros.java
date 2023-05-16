package aUtilidad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros {
	
	public static BufferedReader abrirBR (File f ) throws FileNotFoundException {
		BufferedReader br;
		return br = new BufferedReader(new FileReader(f));
	}
	
	public static BufferedWriter abrirBW (File f ) throws IOException {
		BufferedWriter bw;
		return bw = new BufferedWriter(new FileWriter(f));
	}
	

}
