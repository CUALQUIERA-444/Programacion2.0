package practicasString;

import java.util.Scanner;

public class Ejercicio8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que valida un DNI introducido por teclado. Utilizar una función para
validarlo
 */
 Scanner sc = new Scanner(System.in);
 String DNI;
 boolean valido;
 System.out.println("Introduce el DNI");
 DNI = sc.nextLine().toUpperCase();
 valido = ValidarDNI(DNI);
 if(valido) {
	 System.out.println("EL DNI es válido");
 }
 else {
	 System.out.println("El DNI no es válido");
 }
	}
public static boolean ValidarDNI(String DNI) {
	String combinacion = "^[0-9]{8}[A-Z]$";
	if(!DNI.matches(combinacion)) {
		return false;
	}
	//Como validar el ultimo caracter introducido 
	//1.Declaramos el patron de validacion
	String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	//2.Extraemos la parte numerica del DNI y la letra en 2 variables distintas
	int numero = Integer.parseInt(DNI.substring(0, 8));
	char letra_or = DNI.charAt(8);
	//3. Hacemos el modulo del numero que dará un número entre 0 y 22 (Representa las posiciones)
	int posicion = numero % 23;
	//4 Usamos la posicion para buscar el numero y lo comparamos con la letra 
	char buscar_letra = letras.charAt(posicion);
	if (buscar_letra != letra_or) {
		return false;
	}
	return true;
}
}
