package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Programa que determina cuantas cifras tiene un número. Utilizar un método
que recibe el número y nos retorna la cantidad de cifras que tiene
 */
	Scanner sc = new Scanner(System.in);
	int numero;
	int cifras;
	boolean confirmacion;
	do {
	System.out.println("Introduce un número y te diremos cuantas cifras tiene");
	numero = sc.nextInt();
	cifras = SacarCifras(numero);
	System.out.println("El "+numero+" tiene "+cifras+" cifras");
	System.out.println("Desea continuar? (true/false)");
	confirmacion = sc.nextBoolean();
	} while (confirmacion == true);
	}
	public static int SacarCifras(int numero) {
		int cifras = 1;
		while (numero >= 10) {
			numero = numero / 10;
			cifras++;
		}
		return cifras;
	}
}
