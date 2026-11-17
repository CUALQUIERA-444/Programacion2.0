package practica5;

import java.util.Scanner;

public class Ej18_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num,max;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Anota número:");
			max=sc.nextInt();
			
			for(int i=1;i<=4;i++) {
				System.out.println("Anota número:");
				num=sc.nextInt();
				if (num>max)
					max=num;
				
			}
			
			System.out.println("El número más alto es:"+max);

	}

}
