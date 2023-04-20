
public class Version {
    private double numero;
    private String nombre;
    private int api;

	//constructor por defecto
    public Version() {
    }

	//boton derecho, geters y seters
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getApi() {
        return api;
    }

    public void setApi(int api) {
        this.api = api;
    }

	//metodo para mostrar el objeto por consola
    @Override
    public String toString() {
        return "Version{" + "numero=" + numero + ", nombre=" + nombre + ", api=" + api + '}';
    }
    
    
}
