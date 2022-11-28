package colectivo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conductor {

	private int id_conductor;
	private String nombre;

	public Conductor(int id_conductor, String nombre) {
		super();
		this.id_conductor = id_conductor;
		this.nombre = nombre;
	}

	public int getId_conductor() {
		return id_conductor;
	}

	public void setId_conductor(int id_conductor) {
		this.id_conductor = id_conductor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Conductor [id_conductor=" + id_conductor + ", nombre=" + nombre + "]";
	}

	public void encenderColectivo(Colectivo colectivo) {

		if (colectivo.isMortor() == true) {
			System.out.println(this.getNombre() + " el motor ya esta encendido");
		} else {
			colectivo.setMortor(true);
			System.out.println(this.getNombre() + " acaba de encender el motor");
		}

	}

	public void subirPasajeros(Colectivo colectivo) {

		do {

		Scanner entrada = new Scanner(System.in);

		int nueva_cantidad;
		
		System.out.println("Ingrese cantidad de pasajeros que van a subir");
		
		nueva_cantidad = entrada.nextInt();
		
				
		colectivo.setCantidad(nueva_cantidad);

		System.out.println(this.getNombre() + " hay " + colectivo.getCantidad() + " pasajeros en el colectivo");

		} while (colectivo.getCantidad() < 50);

		System.out.println(this.getNombre() + " el colectivo esta lleno");
	}

}
