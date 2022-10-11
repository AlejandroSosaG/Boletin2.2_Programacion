package tema2_boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las variables que vamos a utilizar.
		int num, num2, eleccion, result;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de dos variables.
		System.out.println("Introduzca dos números");
		// Asignamos a las variables num y num2 los valores escritos por el usuario.
		num=sc.nextInt();
		num2= sc.nextInt();
		// Mostramos un menú con las distintas opciones que el usuario puede elegir.
		System.out.println("Elija una de las siguientes opciones:"
				+ "1. SUMAR LOS NÚMEROS"
				+ "2. RESTAR LOS NÚMEROS"
				+ "3. MULTIPLICAR LOS NÚMEROS"
				+ "4. DIVIDIR LOS NÚMEROS");
		// Asignamos a la variable eleccion el valor elegido por el usuario.
		eleccion=sc.nextInt();
		switch(eleccion) {
		// Si la elección es 1 asignamos a result la suma de los dos números y lo mostramos en un mensaje.
		case 1:
			result= num + num2;
			System.out.println("El resultado de la suma es " + result);
			break;
		// Si la elección es 2 asignamos a result la resta de los dos números y lo mostramos en un mensaje.
		case 2:
			result = num - num2;
			System.out.println("El resultado de la resta es " + result);
			break;
		// Si la elección es 3 asignamos a result la multiplicación de los dos números y lo mostramos en un mensaje.
		case 3:
			result = num*num2;
			System.out.println("El resultado de la multiplicación es " + result);
			break;
		// Si la elección es 4 asignamos a result la división de los dos números y lo mostramos en un mensaje.
		case 4:
			result = num/num2;
			System.out.println("El resultado de la división es " + result);
			break;
		// Si no se cumple ninguna de las condiciones anteriores mostramos mensaje diciendo que hay un error.	
		default:
				System.out.println("Error: Opción incorrecta");
		}
		// Cerramos escaner.
		sc.close();
	}

}
