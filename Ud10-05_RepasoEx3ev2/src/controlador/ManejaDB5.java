package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;

import modelo.Realiza;
import modelo.Ruta;
import modelo.Usuario;

public class ManejaDB5 {
	
Connection conn;

public ManejaDB5(Connection conn) {
	this.conn = conn;
}

public void cargaTXT(File fData) throws FileNotFoundException {
	
	if (fData.exists()) {
		BufferedReader br;
		
		br = new BufferedReader(new FileReader(fData));
		
		String linea = br.readLine();
		while(linea!= null) {
			String[] data = linea.split(",");
			if (data.length==2) {
				Usuario userAux = new Usuario(data);
				insertaUsuario(userAux);
			}else if(data.length == 3) {
				Realiza reaAux = new Realiza(data);
				
			}else {
				Ruta rutaAux = new Ruta(data);
				insertarRuta(rutaAux);
			}
			
		}
		
		
	}else {
		System.out.println("Fichero no encontrado.");
	}
	
	
	
	
}





}
