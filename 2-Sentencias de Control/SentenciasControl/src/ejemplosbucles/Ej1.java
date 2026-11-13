package ejemplosbucles;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		
		while (num<=2) {
			System.out.println("Introduce un número:");
			num=sc.nextInt();
		}
	}
}
