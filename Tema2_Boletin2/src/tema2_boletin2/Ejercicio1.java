package tema2_boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota; // Esta varible es la nota que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de la variable.
		System.out.println("Introduzca el número de su nota");
		// Asignamos a la variable nota el valor escrito por el usuario.
		nota=sc.nextInt();
		switch (nota) {
		// Si la nota es 0 mostramos mensaje diciendo que es insuficiente.
		case 0: 
			System.out.println("Insuficiente");
			break;
		// Si la nota es 0 mostramos mensaje diciendo que es insuficiente.
		case 1:
			System.out.println("Insuficiente");
			break;
		// Si la nota es 0 mostramos mensaje diciendo que es insuficiente.
		case 2:
			System.out.println("Insuficiente");
			break;
		// Si la nota es 0 mostramos mensaje diciendo que es insuficiente.
		case 3:
			System.out.println("Insuficiente");
			break;
		// Si la nota es 0 mostramos mensaje diciendo que es insuficiente.
		case 4:
			System.out.println("Insuficiente");
			break;
		// Si la nota es 5 mostramos mensaje diciendo que es suficiente.
		case 5:
			System.out.println("Suficiente");
			break;
		// Si la nota es 6 mostramos mensaje diciendo que es bien.
		case 6:
			System.out.println("Bien");
			break;
		// Si la nota es 7 mostramos mensaje diciendo que es notable.
		case 7:
			System.out.println("Notable");
			break;
		// Si la nota es 8 mostramos mensaje diciendo que es notable.
		case 8:
			System.out.println("Notable");
			break;
		// Si la nota es 9 mostramos mensaje diciendo que es sobresaliente.
		case 9:
			System.out.println("Sobresaliente");
			break;
		// Si la nota es 10 mostramos mensaje diciendo que es sobresaliente.
		case 10:
			System.out.println("Sobresaliente");
			break;
		// Si no se cumple ninguna de las condiciones anteriores mostramos mensaje diciendo que hay un error.
		default:
			System.out.println("Error: valor incorrecto");
		}
		// Cerramos escaner.
		sc.close();
	}

}
