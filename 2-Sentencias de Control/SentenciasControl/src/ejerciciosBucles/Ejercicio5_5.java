package ejerciciosBucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Realizar un juego para adivinar un número. 
 * Para ello pedir un número N, y luego ir
pidiendo números indicando “mayor” o “menor”
 según sea mayor o menor con
respecto a N. El proceso termina 
cuando el usuario acierta.
 */
	Scanner sc = new Scanner(System.in);
	Random r = new Random(); //Invocar clase
	int adivina = r.nextInt(10); //Generar numero Entre 0 y 9
	System.out.println("Adivina el numero");
	int numero = sc.nextInt();
	while(adivina != numero) {
		if(adivina != numero) {
		if(numero < adivina) {
			System.out.println("MENOR vuelva a intentarlo");
			 numero = sc.nextInt();
		}
		else {
			System.out.println("MAYOR vuelva a intentarlo");
			 numero = sc.nextInt();
		}
		}
	}
	System.out.println("Felicidades");
	}
}
