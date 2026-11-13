package ejerciciosSentenciasControl;

import java.util.Scanner;

public class Ejercicio4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que lee tres números y permite al usuario elegir si quiere verlos
ordenados en forma ascendente o descendente
 */
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce 3 numeros");
	int n_a = sc.nextInt();
	int n_b = sc.nextInt();
	int n_c = sc.nextInt();
	System.out.println("Desea verlos de forma ascendente o descendente? (A/a/D/d)");
	sc.nextLine();
	char confirmacion = sc.nextLine().charAt(0);
	int mayor;
	int medio;
	int menor;
	if (confirmacion != 'A' && confirmacion != 'a' && confirmacion !='d' && confirmacion != 'D') {
		System.out.println("Opción inválida reinicie el programa");
	}
	else {
	if (confirmacion == 'A' || confirmacion == 'a') {
		if (n_a < n_b && n_b < n_c) {
			menor = n_a;
			if (n_b < n_c) {
				medio = n_b;
				mayor = n_c;
			}
			else {
				medio = n_c;
				mayor = n_b;
			}
		}
		else if (n_b < n_a && n_b < n_c) {
			menor = n_b;
			if(n_a < n_c) {
				medio = n_a;
				mayor = n_c;
			}		
			else {
				medio = n_c;
				mayor = n_a;
			}
	}
		else {
			menor = n_c;
			if (n_a < n_b) {
				medio = n_a;
				mayor = n_b;
			}
			else {
				medio = n_b;
				mayor = n_a;
			}
		}
		System.out.println(menor+" "+medio+" "+mayor);
	}
	else {
		if (n_a > n_b && n_b > n_c) {
			mayor = n_a;
			if (n_b > n_c) {
				medio = n_b;
				menor = n_c;
			}
			else {
				medio = n_c;
				menor = n_b;
			}
		}
		else if (n_b > n_a && n_b > n_c) {
			mayor = n_b;
			if(n_a > n_c) {
				medio = n_a;
				menor = n_c;
			}		
			else {
				medio = n_c;
				menor = n_a;
			}
	}
		else {
			mayor = n_c;
			if (n_a > n_b) {
				medio = n_a;
				menor = n_b;
			}
			else {
				medio = n_b;
				menor = n_a;
			}
		}
		System.out.println(mayor+" "+medio+" "+menor);
	}
	}
	}
}
