package teoria_ClasesYObj_profe;

public class Principal_valorDefecto {
	
	 private final double pi = 3.1416; //
	/**<strong>Variable global</strong>. Se podra usar en cualquier metodo de esta clase
	 * private = solo lo lee esta clase
	 * final = no se puede modificar el valor. 	 * 
	 */
	public static void main(String[] args) {
		Persona per1 = new Persona("Fran", "Fernandez", 25);
		System.out.println(per1); //Por defecto esta estipulado Julian.
		
		Persona per2 = new Persona("Javier", "Fernandez", 25);
		System.out.println(per2);
		Persona per3 = new Persona("andres", "Fernandez", 25);
		System.out.println(per3);
		
		
	}
	/**Dar formato con String.format
	 * 
	 */
	//String str = String.format("%2d:%2d:%2d %n",hora,min,seg); // clase string tiene format que es equivalen al printf
	//String str = String.format("%02d:%02d:%02d %n",hora,min,seg); //Si no tiene dos decimales rellena con 0.


}
