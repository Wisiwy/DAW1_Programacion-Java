package teoria_ClasesYObj_profe;

public class Persona {

	//objeto = structutra de datos no es un tio de datos igual. Eje persona
	// sera nombre + apellido + int edad
	private String nombre = "Julian";
	private String apellido; 
	private int edad;
	private int id; //Id sera una var autoincremental para identificar las tuplas de persona.
	private static int sig = 1; //la creamos estatica valdra para todas los obj persona creados
	//Crear variable estatica 
	
	//++++++++++++++++++CONSTRUCTOR+++++++++++++++++
	public Persona() {
		//con parametros vacios para jugar
	}
	//generar constructor: btndrch/source/generate Constructor using fields
	public Persona(String nombre, String apellido, int edad) {
		this.id = sig; //identificador incremental para cada una de los objetos personasl construidos
		//Cada vez que llamemos al constructor se incrementara el id que para identificar cada uno de los objetos.
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		sig++;
	}
	//*****************GETTER AND SETTER*************
	//btn drch/source/generate setters and getters
	//Se juega con getter y setter para recoger y escribir los valores de la clase.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
		
	}
	//***********************METODO TO STRING
	//Metodo toString generar : btn drch/source/generate toString
	//Convierte a strings los datos de la clase cuando los llamenos
	@Override
	public String toString() {
		return nombre + "," + apellido +  "," + edad +"," +"id: " + id;
	}
	
	
	
	
	
}
