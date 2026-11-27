package EjerciciosExcepciones;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que lee números de teclado hasta anotar un 0 y calcula su media.
Usa excepciones para que si el usuario se equivoca al introducir un número se
muestre un error y se vuelva a pedir, también usa una excepción para controlar
la división por cero.
 */
//Nota ArithmeticException SOLO FUNCIONA CON ENTEROS
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	int numero = 0;
	int media = 0; 
	boolean valido;
	int contador = 0;
	do {
		do {
		System.out.println("Introduce un número");
		try {
		numero = sc.nextInt();
		valido = true;
		if(numero != 0) {
		contador++;
		media += numero;
		}
		}
		catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("El número no es valido vuelve a introducir el número");
			valido = false;
		}
		} while(valido == false);
	} while(numero != 0);
	try {
		media = media / contador;
		System.out.println(media);
	}
	catch (ArithmeticException e) {
		System.out.println("No ha introducido ningún numero reinicie el programa");
	}
	}
}
