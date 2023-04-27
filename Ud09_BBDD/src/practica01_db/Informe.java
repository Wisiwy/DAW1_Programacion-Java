package practica01_db;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import aUtilidad.Dibujo;

public class Informe {

	private static ManejaDB DB;
	private static File f;
	private static Integer cont = 1;

	public Informe(ManejaDB DB) {

//		this.f = new File("/files/informe_" + cont);
		this.f = new File("files\\informe_" + cont + ".txt");
		System.out.println(f.getAbsolutePath());
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
		cont++;
		this.DB = DB;
	}

	public static void escribirFichero() {
		try {
			FileWriter fwInf = new FileWriter(f);
			fwInf.append(Dibujo.titulo(f.getName()));
			
			try {
				DatabaseMetaData tables = DB.getConexion().getMetaData();
				ResultSet rs = tables.getTables(null, null, "%", null);
				while (rs.next()) {
					String tableName = rs.getString(3).toUpperCase();
					//formato
					System.out.println(tableName); fwInf.append(tableName + " \n ------------------------------\n" );
					System.out.println("---------------------------");
					DB.escribeTabla(fwInf, tableName);
					System.out.println(contarCampos(tableName)+ " tuplas"); fwInf.append(contarCampos(tableName)+ " tuplas \n");
					if(tableName.toUpperCase().compareTo("EMPLEADOS") == 0) {
						System.out.println(sumarSueldo() + " salario total"); 
						fwInf.append(sumarSueldo() + " salario total \n");
					}
					System.out.println();
					fwInf.flush();
				}
				fwInf.close();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String contarCampos(String table) {
		Statement senten;
		try {
			senten = DB.getConexion().createStatement();
			ResultSet numCampos = senten.executeQuery("SELECT COUNT(*) FROM " + table);
			while (numCampos.next()) {
				numCampos.getString(1);
				return numCampos.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static String sumarSueldo() {
		Statement senten;
		ResultSet sumSalario;
		try {
			senten = DB.getConexion().createStatement();
			sumSalario = senten.executeQuery("SELECT SUM(salario) FROM empleados");
			while (sumSalario.next()) {
				sumSalario.getString(1);
				return sumSalario.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
