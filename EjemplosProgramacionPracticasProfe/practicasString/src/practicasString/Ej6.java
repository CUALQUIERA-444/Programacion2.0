package practicasString;

import java.util.Scanner;

public class Ej6 {
	public static void main(String [] st) {
		String palabra;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Anota la palabra:");
		palabra=sc.nextLine();
		if (palindromo(palabra))
			System.out.println("Es un palíndromo");
		else
			System.out.println("No es un palíndromo");
	}
	
	public static boolean palindromo(String palabra) {
		palabra=palabra.toUpperCase();
		for(int i=0, j=palabra.length()-1; i<j  ; i++,j--) {
			if (palabra.charAt(i)!=palabra.charAt(j))
				return false;
		}
		
		return true;
			
	}
	
}
