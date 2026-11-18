package practicasString;

import java.util.Scanner;

public class Ejercicio8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Programa que nos dice si una palabra se lee igual del
 *  derecho que del revés.
 */
	Scanner sc = new Scanner(System.in);
	String linea;
	System.out.println("Introduce una palabra y te diremos si se escribe igual al derecho que al reves");
	linea = sc.nextLine().toUpperCase();
	int limitador = 1;
	boolean palindromo = true;
	//Ana = 3 -1 = 2 / 2 = 1 
	for (int i = 0; i<(linea.length()-1)/2;i++) {
		if(linea.charAt(i) != linea.charAt(linea.length()-limitador)) {
		palindromo = false;
		break;
	}
		else {
			limitador++;
		}
	}
	if(!palindromo) {
		System.out.println("No se leen igual");
	}
	else {
		System.out.println("Se leen igual");
	}
	}
}
