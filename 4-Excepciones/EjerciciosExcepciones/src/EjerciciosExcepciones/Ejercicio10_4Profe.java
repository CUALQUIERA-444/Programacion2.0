package EjerciciosExcepciones;

import java.util.Scanner;

public class Ejercicio10_4Profe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String dni;
	String letras ="TRWAGMYFPDXBNJZSQVHLCKE";
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce dni:");
	dni = sc.nextLine();
	
	try {
		int num = Integer.parseInt(dni.substring(0,8));
		int resto = num % 23;
		char letra = letras.charAt(resto);
		if(letra == dni.charAt(8)) {
			System.out.println("Correcto");
		}
		else 
			System.out.println("Letra incorrecta");
	}
	catch (NumberFormatException e) {
		System.out.println("Formato incorrecto, espera dígitos");
	}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("Formato incorrecto");
	}
	}
}
