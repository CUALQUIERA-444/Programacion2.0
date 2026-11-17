package practicasString;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		String nombre, apellido1, codigo, apellido2;
		char seguir;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce nombre:");
			nombre = sc.nextLine();
			System.out.println("Introduce apellido1:");
			apellido1 = sc.nextLine();
			if (apellido1.length() < 3) {
				System.out.println("Anota apellido2:");
				apellido2 = sc.nextLine();
			} else
				apellido2 = "";
			codigo = generarCodigo(nombre, apellido1, apellido2);
			System.out.println("El código obtenido es:" + codigo);
			System.out.println("Quieres seguir(S/N");
			seguir = sc.nextLine().charAt(0);
			seguir = Character.toUpperCase(seguir);
		} while (seguir == 'S');

	}

	private static String generarCodigo(String nombre, String apellido1, String apellido2) {

		String codigo;
		if (apellido1.length() >= 3)
			codigo = nombre.substring(0, 1) + apellido1.substring(0, 3);
		else {

			if (apellido2.length() >= 3)
				codigo = nombre.substring(0, 1) + apellido2.substring(0, 3);
			else if (apellido1.length() > apellido2.length())
				codigo = nombre.substring(0, 1) + apellido1;
			else
				codigo = nombre.substring(0, 1) + apellido2;
		}
		return codigo;
	}

}
