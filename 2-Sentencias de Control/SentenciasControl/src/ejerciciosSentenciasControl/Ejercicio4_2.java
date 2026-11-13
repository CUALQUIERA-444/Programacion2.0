package ejerciciosSentenciasControl;

import java.util.Scanner;

public class Ejercicio4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Dado un número entero positivo de tres cifras (leído como tal), escríbase un
programa que escriba en pantalla sus cifras en orden inverso.
 */
//Desde el punto de vista numerico 001 es 1 
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un numero de tres cifras");
	int n = sc.nextInt();
	if(n < 100 || n > 999) {
		System.out.println("El numero debe tener 3 cifras");
	}
	else {
		int centena = n / 100;
		int decena = n % 100 / 10;
		int unidad = n % 10;
		System.out.println(unidad+""+decena+""+centena);
	}
	}
}
