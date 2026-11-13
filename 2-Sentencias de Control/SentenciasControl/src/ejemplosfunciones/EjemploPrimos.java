package ejemplosfunciones;

import java.util.Scanner;

/**
 * Programa que lee un número y me dice si es primo o no 
 */
public class EjemploPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num; 
	boolean primo;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Anota número:");
	num=sc.nextInt();
	primo = esPrimo(num);
	if(primo==true) {
		System.out.println("El número es primo");
	}
	else {
		System.out.println("El número no es primo");
	}
	}
	public static boolean esPrimo(int num) {
		boolean primo = true;
		for (int i = 2; i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
