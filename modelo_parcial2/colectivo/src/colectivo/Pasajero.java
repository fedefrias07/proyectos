package colectivo;

public class Pasajero {

	private int id_pasajero;
	private String nombre;
	private int edad;

	public Pasajero(int id_pasajero, String nombre, int edad) {
		super();
		this.id_pasajero = id_pasajero;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getId_pasajero() {
		return id_pasajero;
	}

	public void setId_pasajero(int id_pasajero) {
		this.id_pasajero = id_pasajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pasajero [id_pasajero=" + id_pasajero + ", nombre=" + nombre + ", edad=" + edad + "]";
	}




}
