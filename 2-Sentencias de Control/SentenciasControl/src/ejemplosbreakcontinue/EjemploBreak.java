package ejemplosbreakcontinue;

import java.util.Scanner;

public class EjemploBreak {
/**
 * Programe que lee un número y me dice si es primo o no
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		boolean primo = true;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Anota un número:");
		numero=sc.nextInt();
		if(numero<=0) {
			System.out.println("Error, el número tiene que ser positivo");
		}
	} while(numero <= 0);
	for (int i = 2; i<numero; i++) {
		if(numero % i == 0) {
			primo = false;
			break;
		}
	}
	if(primo) {
		System.out.println("El número es primo");
	}
	else 
		System.out.println("El número no es primo");
}
}