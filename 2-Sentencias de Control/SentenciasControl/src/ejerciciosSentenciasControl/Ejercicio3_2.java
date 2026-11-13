package ejerciciosSentenciasControl;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Programa que lee dos números (distintos) 
 * y nos dice cual es el mayor
 */
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce dos numeros (ASEGURESE QUE SEAN DISTINTOS)");
	int numero_A = sc.nextInt();
	int numero_B = sc.nextInt();
	if (numero_A == numero_B) {
		System.out.println("ERROR los números no pueden ser iguales REINICIE EL PROGRAMA");
	}
	else {
		if(numero_A > numero_B) {
			System.out.println("EL MAYOR ES EL PRIMERO "+numero_A);
		}
		else {
			System.out.println("EL MAYOR ES EL SEGUNDO "+numero_B);
		}
	}
}
}
