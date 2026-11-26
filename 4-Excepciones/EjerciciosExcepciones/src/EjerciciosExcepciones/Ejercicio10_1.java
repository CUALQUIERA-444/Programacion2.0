package EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Haced una función que lee un double, controlando que no anoten letras
usando excepciones.
 */
	Scanner sc = new Scanner(System.in);
	boolean valido;
	double numero = 0;
	sc.useLocale(Locale.ENGLISH);
	do {
		System.out.println("Introduce un número de tipo decimal");
		try {
			numero = sc.nextDouble();
			valido = true;
		} 
		catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("No es un número vuelva a intentarlo");
			valido = false;
		}
	} while (valido == false);
	System.out.println(numero);
	}
}
