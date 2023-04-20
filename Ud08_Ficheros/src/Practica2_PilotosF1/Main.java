package Practica2_PilotosF1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		File f = new File("Files\\Practica2_12Pole.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			ArrayList<Marca> ranking = new ArrayList();
			while (linea!= null) {
				String[] pilotoInfo = linea.split("::");
				Marca aux = new Marca(); 
				aux.setRanking(pilotoInfo[0]);
				aux.setNom(pilotoInfo[1]);
				aux.setEscuderia(pilotoInfo[2]);
				aux.setCoche(pilotoInfo[3]);
				aux.setCircuito(pilotoInfo[4]);
				aux.setAnyo(pilotoInfo[5]);
				aux.setVelMedia(pilotoInfo[6]);
				ranking.add(aux);
				
			System.out.println(aux);
			System.out.println();
				
				linea =br.readLine();
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
