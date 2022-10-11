package tema2_boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las variables que vamos a utilizar.
		int num = 0, num2 = 0, suma;
		String tirada, tirada2;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de la primera tirada de dado.
		System.out.println("Diga cual es el número de la primera tirada");
		// Asignamos a la variable tirada el valor escrito por el usuario.
		tirada=sc.nextLine();
		switch(tirada) {
		// Si el valor de tirada es uno le asignamos a num el valor 1.
		case "uno":
			num=1;
			break;
		// Si el valor de tirada es dos le asignamos a num el valor 2.
		case "dos":
			num=2;
			break;
		// Si el valor de tirada es tres le asignamos a num el valor 3.
		case "tres":
			num=3;
			break;
		// Si el valor de tirada es cuatro no le asignamos a num el valor 4.
		case "cuatro":
			num=4;
			break;
		// Si el valor de tirada es cinco no le asignamos a num el valor 5.
		case "cinco":
			num=5;
			break;
		// Si el valor de tirada es seis no le asignamos a num el valor 6.
		case "seis":
			num=6;
			break;
		// Si no se cumple ninguna de las condiciones anteriores mostramos mensaje diciendo que hay un error.	
		default:
				System.out.println("Error: Valor incorrecto");
		}
		// Le pedimos al usuario el valor de la segunda variable.
		System.out.println("Diga cual es el número de la segunda tirada");
		// Asignamos a tirada2 el valor escrito por el usuario.
		tirada2= sc.nextLine();
		switch(tirada2) {
		// Si el valor de tirada2 es una no le asignamos a num2 el valor 1.
		case "uno":
			num2=1;
			break;
		// Si el valor de tirada2 es dos no le asignamos a num2 el valor 2.
		case "dos":
			num2=2;
			break;
		// Si el valor de tirada2 es tres no le asignamos a num2 el valor 3.
		case "tres":
			num2=3;
			break;
		// Si el valor de tirada2 es cuatro no le asignamos a num2 el valor 4.
		case "cuatro":
			num2=4;
			break;
		// Si el valor de tirada2 es cinco no le asignamos a num2 el valor 5.
		case "cinco":
			num2=5;
			break;
		// Si el valor de tirada2 es seis no le asignamos a num2 el valor 6.
		case "seis":
			num2=6;
			break;
		// Si no se cumple ninguna de las condiciones anteriores mostramos mensaje diciendo que hay un error.
		default:
				System.out.println("Error: Valor incorrecto");
		}
		// Asignamos a suma el valor de num mas el de num2.
		suma = num+num2;
		// Mostramos por pantalla un mensaje con la suma de las dos tiradas.
		System.out.println("La suma de las dos tiradas es " + suma);
		// Cerramos escaner.
		sc.close();
	}

}
