package practicasString;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1,cad2,cad3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Anota cadena:");
		cad1=sc.nextLine();
		System.out.println("Anota cadena:");
		cad2=sc.nextLine();
		System.out.println("Anota cadena:");
		cad3=sc.nextLine();
		
		if (cad1.compareToIgnoreCase(cad2)<=0 && cad1.compareToIgnoreCase(cad3)<=0) {
			System.out.println(cad1);
			if (cad2.compareToIgnoreCase(cad3)<=0) {
				System.out.println(cad2);
				System.out.println(cad3);
			}
			else {
				System.out.println(cad3);
				System.out.println(cad2);
			}
				
		}
		if (cad2.compareToIgnoreCase(cad1)<=0 && cad2.compareToIgnoreCase(cad3)<=0) {
			System.out.println(cad2);
			if (cad1.compareToIgnoreCase(cad3)<=0) {
				System.out.println(cad1);
				System.out.println(cad3);
			}
			else {
				System.out.println(cad3);
				System.out.println(cad1);
			}
				
		}
		
		if (cad3.compareToIgnoreCase(cad1)<=0 && cad3.compareToIgnoreCase(cad2)<=0) {
			System.out.println(cad3);
			if (cad1.compareToIgnoreCase(cad2)<=0) {
				System.out.println(cad1);
				System.out.println(cad2);
			}
			else {
				System.out.println(cad2);
				System.out.println(cad1);
			}
				
		}
		
	}

}
