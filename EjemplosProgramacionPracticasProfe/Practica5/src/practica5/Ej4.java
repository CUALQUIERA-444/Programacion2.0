package practica5;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int num;
		int cont=0;
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		
		while(num>=0) {
			cont++;
			System.out.println("Introduce un número:");
			num=sc.nextInt();
		}
		
		System.out.println("El total de números no negativos leidos es:"+cont);
	}

}
