package colectivo;

public class Colectivo {

	private int id_colectivo;
	private int cantidad;
	private boolean mortor;

	public Colectivo(int id_colectivo, int cantidad, boolean mortor) {
		super();
		this.id_colectivo = id_colectivo;
		this.cantidad = cantidad;
		this.mortor = mortor;
	}

	public int getId_colectivo() {
		return id_colectivo;
	}

	public void setId_colectivo(int id_colectivo) {
		this.id_colectivo = id_colectivo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isMortor() {
		return mortor;
	}

	public void setMortor(boolean mortor) {
		this.mortor = mortor;
	}

	
	
	
	public void descuento(Pasajero pasajero) {

		
		if (pasajero.getEdad() <= 18 || pasajero.getEdad() >= 60) {
			
		} else {

		}
		

		

	}
	
	

}
