package practicasString;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Anota una cadena:");
			cadena=sc.nextLine();
			cadena=cadena.toUpperCase();
			System.out.println(cadena);
		}while(cadena.equals("FIN")==false);

	}

}
