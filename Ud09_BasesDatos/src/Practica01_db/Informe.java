package Practica01_db;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Informe {

	private static ManejaDB DB;
	private static File f;
	private static Integer cont = 1;

	public Informe(ManejaDB DB) {
		
		this.f = new File("/files/informe_" + cont);
		System.out.println(f.getAbsolutePath());
//		this.f = new File("\\files\\informe_" + cont);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		cont++;
		this.DB = DB;
	}
	
	public static void contarCampos(String table) {
		Statement senten;
		try {
			senten = DB.getConexion().createStatement();
			ResultSet numCampos = senten.executeQuery("SELECT COUNT(*) FROM " + table);
			System.out.println(numCampos);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void sumarSueldo() {
		Statement senten;
		try {
			senten = DB.getConexion().createStatement();
			ResultSet sumSalario = senten.executeQuery("SELECT SUM(salario) FROM empleados");
			System.out.println(sumSalario);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
