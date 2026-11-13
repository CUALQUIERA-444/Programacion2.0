package ejemplosbucles;

import java.util.Scanner;

public class Ej0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		while (numero<=10) {
			System.out.println(numero);
			numero++;
		}
		System.out.println("Fin del programa");
		//Debugear 
		}
	}
