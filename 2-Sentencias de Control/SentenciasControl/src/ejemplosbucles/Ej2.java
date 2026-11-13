package ejemplosbucles;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num=sc.nextInt();
		int par;
		if (num<=2) {
			System.out.println("Error, el número tiene que ser mayor que 2");
		}
		else {
			System.out.println("Los pares menores o iguales que "+num+" son:");
			par=2;
			while(par <= num) {
				System.out.println(par);
				par=par+2;
			}
		}
	}

}
