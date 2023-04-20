package parte1;

public class Pasajeros extends Vagon{
	
	private final int maxPre = 30;
	private final int maxTur = 60;
	private boolean preferente;
	private int abordo;
	
	//constructores
	public Pasajeros() {
		preferente = false; //turista
		abordo=0;           //vacío
	}
	
	public Pasajeros(boolean pre) {
		preferente = pre;    //seleccionado por usuario
		abordo=0;           //vacío
	}
	
	public Pasajeros(boolean pre, int cant) {
		preferente = pre;    //seleccionado por usuario
		abordo=cant;         //vagón con cant pasajeros
	}

	//funciones
	public void incPasajero() throws FullyException {
		if(preferente && abordo < maxPre)
			abordo++;
		else if(!preferente && abordo < maxTur)
			abordo++;
		else
			throw new FullyException("Pasajeros completos");
	}
	
	public void decPasajero() throws EmptyException {
		if(abordo > 0)
			abordo--;
		else
			throw new EmptyException("No se puede vaciar más..");
	}
	
	//Getter y setter
	public boolean esPreferente() {
		return preferente;
	}

	public void setPreferente(boolean preferente) {
		this.preferente = preferente;
	}

	public int getAbordo() {
		return abordo;
	}

	public void setAbordo(int abordo) {
		this.abordo = abordo;
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
		if(preferente)
			System.out.printf("{***%02d***}",abordo);
		else
			System.out.printf("|***%02d***|",abordo);
	}
	

}
