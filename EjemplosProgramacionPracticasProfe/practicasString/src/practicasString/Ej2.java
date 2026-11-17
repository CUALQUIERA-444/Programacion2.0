package practicasString;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ciudad;
		char letra;
		int cont=0;
		boolean seguir=true;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce letra:");
		letra=sc.nextLine().charAt(0);
		letra=Character.toUpperCase(letra);
		
		while(seguir) {
			System.out.println("Introduce ciudad:");
			ciudad=sc.nextLine();
			ciudad=ciudad.toUpperCase();
			if (letra==ciudad.charAt(0))
				cont++;
			System.out.println("Otra ciudad?(true/false");
			seguir=sc.nextBoolean();
			sc.nextLine(); //Limpio buffer
		}
		
		System.out.println(cont + " ciudades empiezan por "+ letra);
		
		
	}

}
