package ejerciciosBucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Programa que lee una secuencia de 50 letras y escribe el número de veces que se repite la
primera de ellas.
 */
//Vamos a descarta la opcion de los aleatorios porque es algo complejo y por lo menos con lo que debería usar no puedo
//Poner la ñ
	Scanner sc = new Scanner(System.in);
	int contador = 49;
	char letra; 
	char auxiliar;
	int contador_letra = 0;
	System.out.println("Introduce una letra");
	auxiliar = sc.nextLine().toLowerCase().charAt(0); //Ugh
	while (contador > 0) {
		System.out.println("Introduce "+contador+" letras más");
		 letra = sc.nextLine().toLowerCase().charAt(0);
		 if (auxiliar == letra) {
			 contador_letra++;
		 }
		 contador--;
	}
	System.out.println("La primera letra se repite un total de "+contador_letra+" veces");
	}
}
