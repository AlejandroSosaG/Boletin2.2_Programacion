package tema2_boletin2;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String carnet; // Esta es la variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de la variable.
		System.out.println("Introduzca el tipo de carnet de conducir");
		// Asignamos a carnet el valor escrito por el usuario.
		carnet = sc.nextLine();
		switch(carnet) {
		// Si el valor de carnet es E mostraremos un mensaje con el tipo de carnet de conducir.
		case "E":
			System.out.println("El carnet es de remolques");
			break;
		// Si el valor de carnet es D mostraremos un mensaje con el tipo de carnet de conducir.
		case "D":
			System.out.println("El carnet es de autobuses");
			break;
		// Si el valor de carnet es C1 mostraremos un mensaje con el tipo de carnet de conducir.
		case "C1":
			System.out.println("El carnet es de camiones");
			break;
		// Si el valor de carnet es C2 mostraremos un mensaje con el tipo de carnet de conducir.
		case "C2":
			System.out.println("El carnet es de camiones");
			break;
		// Si el valor de carnet es C3 mostraremos un mensaje con el tipo de carnet de conducir.
		case "C3":
			System.out.println("El carnet es de camiones");
			break;
		// Si el valor de carnet es C4 mostraremos un mensaje con el tipo de carnet de conducir.
		case "C4":
			System.out.println("El carnet es de camiones");
			break;
		// Si el valor de carnet es C5 mostraremos un mensaje con el tipo de carnet de conducir.
		case "C5":
			System.out.println("El carnet es de camiones");
			break;
		// Si el valor de carnet es A mostraremos un mensaje con el tipo de carnet de conducir.
		case "A":
			System.out.println("El carnet es de motocicletas");
			break;
		// Si el valor de carnet es B1 mostraremos un mensaje con el tipo de carnet de conducir.
		case "B1":
			System.out.println("El carnet es de automóviles");
			break;
		// Si el valor de carnet es B2 mostraremos un mensaje con el tipo de carnet de conducir.
		case "B2":
			System.out.println("El carnet es de automóviles");
			break;
			// Si no se cumple ninguna de las condiciones anteriores mostramos mensaje diciendo que esa categoría no está contemplada.
		default:
				System.out.println("Categoría no contemplada");
		}
		// Cerramos escaner.
		sc.close();
	}

}
