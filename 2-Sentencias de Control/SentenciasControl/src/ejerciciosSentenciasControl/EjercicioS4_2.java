package ejerciciosSentenciasControl;

import java.util.Scanner;

public class EjercicioS4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Una atracción de un parque temático tiene restricciones según la edad,
		 * altura y acompañamiento. Datos de entrada: Edad Altura (en cm) ¿Va acompañado
		 * de un adulto? (S o N) Reglas Caso 1: Menores de 8 años No pueden entrar
		 * nunca. Caso 2: Entre 8 y 11 años Si miden al menos 120 cm y van acompañados →
		 * pueden entrar. Si no cumplen ambas condiciones → no pueden entrar. Caso 3:
		 * Entre 12 y 15 años Si miden al menos 140 cm → pueden entrar solos. Si miden
		 * entre 120 y 139 cm: Solo pueden entrar acompañados. Si miden menos de 120 cm:
		 * No pueden entrar. Caso 4: Entre 16 y 17 años Si miden al menos 130 cm →
		 * pueden entrar. Si no → no pueden entrar. Caso 5: Mayores de edad Entran
		 * siempre, excepto si miden menos de 110 cm por motivos de seguridad.
		 */
		Scanner sc = new Scanner(System.in);
		int edad;
		double altura;
		char acompañado;
		boolean entrar;
		System.out.println("Introduce tu edad");
		edad = sc.nextInt(); // Deja el buffer sucio
		if (edad < 0) {
			System.out.println("No puede tener esa edad reinicie el programa");
		} else {
			System.out.println("Introduce tu altura");
			altura = sc.nextDouble(); // Deja el buffer sucio
			sc.nextLine(); // Limpiar buffer
			if (altura < 0) {
				System.out.println("No puede tener esa altura reinicie el programa");
			} else {
				System.out.println("Vas acompañado de un adulto (S/N)");
				acompañado = sc.nextLine().toUpperCase().charAt(0);
				if (acompañado != 'S' && acompañado != 'N') {
					System.out.println("Opción inválida reinicie el programa");
				} else {
					if (edad < 8) {
						entrar = false;
					} else if (edad >= 8 && edad <= 11) {
						if (altura >= 120 && acompañado == 'S') {
							entrar = true;
						} else {
							entrar = false;
						}
					} else if (edad >= 12 && edad <= 15) {
						if (altura < 120) {
							entrar = false;
						} else if (altura >= 120 && altura <= 139 && acompañado == 'N') {
							entrar = false;
						} else {
							entrar = true;
						}
					} else if (edad >= 16 && edad <= 17) {
						if (altura >= 130) {
							entrar = true;
						} else {
							entrar = false;
						}
					} else {
						if (altura >= 110) {
							entrar = true;
						} else {
							entrar = false;
						}
					}
					if (entrar == true) {
						System.out.println("Puedes entrar");
					} else {
						System.out.println("No puedes entrar");
					}
				}
			}
		}
	}
}
