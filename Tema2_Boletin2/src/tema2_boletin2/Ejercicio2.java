package tema2_boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia; // Esta varible es el día que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de la variable.
		System.out.println("Introduzca el número del día");
		// Asignamos a la variable dia el valor escrito por el usuario.
		dia=sc.nextInt();
		switch(dia) {
		// Si el dia es 1 mostramos un mensaje mostrando lunes.
		case 1:
			System.out.println("Lunes");
			break;
		// Si el dia es 2 mostramos un mensaje mostrando martes.
		case 2:
			System.out.println("Martes");
			break;	
		// Si el dia es 3 mostramos un mensaje mostrando miercoles.
		case 3:
			System.out.println("Miercoles");
			break;
		// Si el dia es 4 mostramos un mensaje mostrando jueves.
		case 4:
			System.out.println("Jueves");
			break;
		// Si el dia es 5 mostramos un mensaje mostrando viernes.
		case 5:
			System.out.println("Viernes");
			break;
		// Si el dia es 6 mostramos un mensaje mostrando sábado.
		case 6:
			System.out.println("Sábado");
			break;
		// Si el dia es 7 mostramos un mensaje mostrando domingo.
		case 7:
			System.out.println("Domingo");
			break;
		// Si no se cumple ninguna de las condiciones anteriores mostramos mensaje diciendo que hay un error.
		default:
				System.out.println("Error: Valor incorrecto");
		}
		// Cerramos escaner.
		sc.close();
	}

}
