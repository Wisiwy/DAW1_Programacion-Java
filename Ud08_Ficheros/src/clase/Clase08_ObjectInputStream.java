package clase;

import java.io.*;

import clasesAux.User;

public class Clase08_ObjectInputStream {
	
	public static void main(String[] args) {
		String archivo = " .\\Ud08_Ficheros\\Binarios\\binarioData08.dat";
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
			
			User u1 = new User(01,"HAckerOscuro","1234");
			User u2 = new User(02,"Hisildur","34cacahuete");
			oos.writeObject(u1);
			oos.writeObject(u2);
			
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//***LECTURA**
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
			
			while(true) {
				User aux = (User) ois.readObject();
				System.out.println(aux);
			}
			
		
		}catch(EOFException e) {
			System.out.println("Fin datos, no mas.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
