package parte1;

import java.util.Objects;

public abstract class Vagon {
	
	private static int next=10;
	private int id;
	
	public Vagon() {
		id = next;
		next+=10;
	}
	
	public Vagon(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Vagón: " + id;
	}
	
	public void imprime() {
		System.out.printf("---(%02d):",id);
	}
	
	public abstract void cargar();
	public abstract void descargar();


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vagon other = (Vagon) obj;
		return id == other.id;
	}
	
	

}
