package ejerciciosBucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int contador_pares = 0;
	int contador_impares = 0;
	int contador_nulos = 0;
	int numero;
	for (int i = 1; i<= 100; i++) {
		numero = r.nextInt(101);
		if (numero % 2 == 0 && numero != 0) {
			contador_pares++;
		}
		else if(numero % 2 != 0) {
			contador_impares++;
		}
		else {
			contador_nulos++;
		}
	}
	System.out.println("Pares "+contador_pares);
	System.out.println("Impares "+contador_impares);
	System.out.println("Nulos "+contador_nulos);
	}
}
