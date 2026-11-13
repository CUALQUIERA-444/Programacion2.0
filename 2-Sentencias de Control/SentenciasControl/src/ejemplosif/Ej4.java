package ejemplosif;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que lee dos números enteros 
 * y nos dice si son iguales o distintos
 */
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce dos numeros");
	int numero1 = sc.nextInt();
	int numero2 = sc.nextInt();
	if (numero1 == numero2) {
		System.out.println("Son iguales");
	}
	else {
		System.out.println("Son distintos");
	}
	}
}
