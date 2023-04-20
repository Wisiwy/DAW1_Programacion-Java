package parte1;


public class Mercancias extends Vagon{
	
	private final int max = 100;
	private int carbon;
	private int madera;
	private int hierro;
	
	//constructores
	public Mercancias() {
		carbon=0;madera=0;hierro=0;    //vacío
	}
	
	public Mercancias(int c, int m, int h) {
		carbon=c;madera=m;hierro=h;    //usuario
	}
	
	//funciones
	public void incCarbon() throws FullyException {
		if((carbon+madera+hierro) < max)
			carbon++;
		else
			throw new FullyException("Vagón completo");
	}
	public void incMadera() throws FullyException {
		if((carbon+madera+hierro) < max)
			madera++;
		else
			throw new FullyException("Vagón completo");
	}
	public void incHierro() throws FullyException {
		if((carbon+madera+hierro) < max)
			hierro++;
		else
			throw new FullyException("Vagón completo");
	}
	
	public void decCarbon() throws EmptyException {
		if(carbon > 0)
			carbon--;
		else
			throw new EmptyException("No se puede vaciar más");
	}
	public void decMadera() throws EmptyException {
		if(madera > 0)
			madera--;
		else
			throw new EmptyException("No se puede vaciar más");
	}
	public void decHierro() throws EmptyException {
		if(hierro > 0)
			hierro--;
		else
			throw new EmptyException("No se puede vaciar más");
	}
	
	
	//Getter y setter
	public int getCarbon() {
		return carbon;
	}

	public void setCarbon(int carbon) {
		this.carbon = carbon;
	}

	public int getMadera() {
		return madera;
	}

	public void setMadera(int madera) {
		this.madera = madera;
	}

	public int getHierro() {
		return hierro;
	}

	public void setHierro(int hierro) {
		this.hierro = hierro;
	}
	//métodos abstractos
	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descargar() {
		// TODO Auto-generated method stub
		
	}
	//salida por consola
	public void imprimir() {
		this.imprime();
		System.out.printf("[%02d,%02d,%02d]",carbon, madera, hierro);
		
	}
		

}
