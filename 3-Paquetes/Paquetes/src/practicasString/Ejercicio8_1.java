package practicasString;

import java.util.Scanner;

public class Ejercicio8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Programa que lee cadenas hasta anotar “fin” 
//y las muestra en mayúsculas.
 Scanner sc = new Scanner(System.in);
 String cadena;
 do {
	 System.out.println("Introduce una cadena");
	 cadena = sc.nextLine();
	 if(!cadena.equalsIgnoreCase("FIN")) {
	 System.out.println(cadena.toUpperCase());
	 }
 } while(!cadena.equalsIgnoreCase("FIN"));
 System.out.println("Fin del programa");
	}
}
