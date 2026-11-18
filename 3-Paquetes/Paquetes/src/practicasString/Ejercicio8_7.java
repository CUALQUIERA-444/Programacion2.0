package practicasString;

import java.util.Scanner;

public class Ejercicio8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Programa que lee una cadena y un carácter y cuenta el número de veces que
aparece dicho carácter en la cadena.
 */
//Necesitamos un String y un caracter 
//Y una funcion que devolvera el numero de veces que aparece dicho caracter en la cadena
String cadena;
char caracter;
int veces;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una cadena");
	cadena = sc.nextLine().toUpperCase();
	System.out.println("Introduce un caracter");
	caracter = sc.nextLine().toUpperCase().charAt(0);
	veces = CalcularApariciones(cadena,caracter);
	System.out.println("Apariciones "+veces);
	//Substring a partir de 0 no hace nada 
	}
	public static int CalcularApariciones(String cadena, char  caracter) {
		int apariciones = 0;
			for(int i = 0; i<cadena.length();i++) {
				if(cadena.charAt(i) == caracter) {
					apariciones++;
				}
			}
		return apariciones;
	}
}
