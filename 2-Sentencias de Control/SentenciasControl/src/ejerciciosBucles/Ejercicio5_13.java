package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 13. Programa que lee un número y escribe todos los anteriores a él
 */
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un numero y te decimos todos los anteriores a el");
	int numero = sc.nextInt();
	for (int i = 0; i<=numero;i++) {
		System.out.println(i);
	}
	}
}
