package colectivo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Colectivo colectivo = new Colectivo(1, 0, false);
		
		Conductor pepe  = new Conductor(001,"Pepe");
		
		
		//Lista pasajeros
		
		ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();

		listaPasajeros.add(new Pasajero(1, "Juan", 50));
		listaPasajeros.add(new Pasajero(2, "Pablo", 10));
		listaPasajeros.add(new Pasajero(3, "Matias", 16));
		listaPasajeros.add(new Pasajero(4, "Franco", 27));
		listaPasajeros.add(new Pasajero(5, "Raul", 32));

		
		
		
		//AGREGAR A UNA NUEVA LISTA CON CONDICION
		
		ArrayList<Pasajero> listaPasajeros2 = new ArrayList<Pasajero>();

		System.out.println("LOS QUE PASAN SON:\n");

		for (Pasajero pasaje : listaPasajeros) {
			if (pasaje.getEdad() > 25) {
				listaPasajeros2.add(pasaje);
			}

		}

		for (int i = 0; i < listaPasajeros2.size(); i++) {
			System.out.println(listaPasajeros2.get(i).getNombre());
		}


	
		
		//MENU
		
		Scanner entrada = new Scanner(System.in);

		boolean salir = false;
		int opcion;

		System.out.println("Colectivo\n");

		while (!salir) {

			System.out.println("\n1. Encender colectivo.\n");
			System.out.println("2. Subir pasajeros.\n");
			System.out.println("3. Ver pasajeros.\n");
			System.out.println("4. Eliminar pasajeros.\n");
			System.out.println("5. Salir.\n");

			try {

				System.out.println("--> Elija una opcion (1 - 5)");
				opcion = entrada.nextInt();

				switch (opcion) {
				case 1:
					
					pepe.encenderColectivo(colectivo);

					break;
				case 2:
					
					System.out.println("El colectivo lleva " + colectivo.getCantidad() + " pasajeros"); 
					
					pepe.subirPasajeros(colectivo);

					break;
				case 3:
					
					for (int i = 0; i < listaPasajeros.size(); i++) {

						System.out.println(listaPasajeros.get(i).getNombre());
					}

					break;

				case 4:
					System.out.println("chau");
					break;
					
				case 5:
					salir = true;
					break;
				default:
					System.err.println("Porfavor, ingrese una opcion entre 1 y 4.");
					break;
				}

			} catch (InputMismatchException e) {
				System.err.println("No ingrese letras, debe que ser un numero entre 1 y 4.");
				entrada.nextInt();
				
			}
			
		}
		System.err.println("Termino su recorrido.");
		

		
		
		 String[ ] nombre = {"Mar??a", "Gerson"};   //Array de 2 elementos
		 
		 int[ ] edad = {45, 23};  //Array de 4 elementos
		 
		 for (int i = 0; i < 4; i++) {
			
			 System.out.println("su nombre es: " + nombre[i] + " " + "Su edad es: " + edad[i]);
		}
		 
		// String Colectivo {parada1, parada2}

		// StringValorBoleto {10, 14}
		 
	}

}


	


