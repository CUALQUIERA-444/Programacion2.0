package ejemplosif;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Programa que lee desde el teclado la nota de programación de un alumno y nos
dice si ha aprobado o no
 */
		double nota;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota");
		nota = sc.nextDouble();

		if (nota >= 5)
			System.out.println("Aprobado");
		else {
			System.out.println("Suspenso");
			System.out.println("Recuperamos la próxima semana");
	}
}
}