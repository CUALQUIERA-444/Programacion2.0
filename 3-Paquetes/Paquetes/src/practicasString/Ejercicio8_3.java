package practicasString;

import java.util.Scanner;

public class Ejercicio8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *3. Programa que lee nombre y primer apellido de personas. Para cada una de ellas
genera un código con la primera letra del nombre y las tres primeras del apellido. Si
dicho apellido tiene una longitud inferior a 3, se le pide el segundo apellido y se cogen
sus tres primeras letras. Si éste, también tiene menos longitud se genera el código con
la primera del nombre y el apellido completo que sea más largo de los dos. El código se
genera en una función.
 */

	Scanner sc = new Scanner(System.in);
	String nombre;
	String primer_apellido;
	String segundo_apellido;
	System.out.println("Introduce tu nombre");
	nombre = sc.nextLine();
	System.out.println("Introduce tu primer apellido");
	primer_apellido = sc.nextLine();
	if(primer_apellido.length() < 3) {
		System.out.println("Introduce tu segundo apellido");
		segundo_apellido = sc.nextLine();
	}
	else {
		segundo_apellido = "???";
	}
	String codigo = GenerarCodigo(nombre,primer_apellido,segundo_apellido);
	System.out.println(codigo);
	}
	public static String GenerarCodigo(String n,String p_a, String s_a) {
		String codigo;
		if (p_a.length() >= 3) {
			codigo = n.charAt(0) + p_a.substring(0, 3);
					}
		else if(s_a.length() >= 3) {
			codigo = n.charAt(0) + s_a.substring(0,3);
		}
		else {
			if(p_a.length() < s_a.length()) {
				codigo = n.charAt(0) + s_a;
			}
			else {
				codigo = n.charAt(0) + p_a;
			}
		}
		return codigo;
	}
}
