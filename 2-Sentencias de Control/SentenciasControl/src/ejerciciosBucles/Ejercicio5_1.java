package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
un número negativo.
 */
	Scanner sc = new Scanner(System.in);
	int numero = 0;
	while (numero >= 0) {
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		int cuadrado = numero * numero;
		System.out.println(cuadrado);
	}
	System.out.println("Fin del programa");
	}
}
