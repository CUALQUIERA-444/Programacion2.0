package practica5;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		/*
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		
		while(num!=0) {
			if (num>0)
				System.out.println("positivo");
			else
				System.out.println("negativo");
			System.out.println("Introduce un número:");
			num=sc.nextInt();
		}
		*/
		
		do {
			System.out.println("Introduce un número:");
			num=sc.nextInt();
			if (num!=0) {
				if (num>0)
					System.out.println("positivo");
				else
					System.out.println("negativo");
			}		
					
		}while(num!=0);
		
		
		
	}

}
