package tema2_boletin2;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String carnet;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tipo de carnet de conducir");
		carnet = sc.nextLine();
		switch(carnet) {
		case "E":
			System.out.println("El carnet es de remolques");
			break;
		case "D":
			System.out.println("El carnet es de autobuses");
			break;
		case "C1":
			System.out.println("El carnet es de camiones");
			break;
		case "C2":
			System.out.println("El carnet es de camiones");
			break;
		case "C3":
			System.out.println("El carnet es de camiones");
			break;
		case "C4":
			System.out.println("El carnet es de camiones");
			break;
		case "C5":
			System.out.println("El carnet es de camiones");
			break;
		case "A":
			System.out.println("El carnet es de motocicletas");
			break;
		case "B1":
			System.out.println("El carnet es de automóviles");
			break;
		case "B2":
			System.out.println("El carnet es de automóviles");
			break;
			default:
				System.out.println("Categoría no contemplada");
		}
		sc.close();
	}

}
