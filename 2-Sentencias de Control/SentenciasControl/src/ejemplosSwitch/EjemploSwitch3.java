package ejemplosSwitch;

import java.util.Scanner;

public class EjemploSwitch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Codificar un programa que simule el funcionamiento de una calculadora que puede
realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división)
con valores numéricos enteros. El usuario debe especificar la operación con el primer
carácter: S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d
para la división.
 */
	int a,b,resultado;
	char operacion;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce número:");
	a = sc.nextInt();
	System.out.println("Introduce segundo número");
	b = sc.nextInt();
	System.out.println("Introduce operación (S/R/D/P/M)");
	sc.nextLine(); //Estoy limpiando el buffer. Siempre limpio después de leer
	//un número y quiero leer un caracter posteriormente 
	operacion = sc.nextLine().charAt(0);
	switch(operacion) {
	case 's':
	case 'S':
		resultado = a+b;
		System.out.println("La suma es:"+ resultado);
		break;
	case 'r':
	case 'R':
		resultado = a-b;
		System.out.println("La resta es:"+ resultado);
		break;
	case 'P':
	case 'p':
	case 'M':
	case 'm':
		resultado = a*b;
		System.out.println("La multiplicacion es:"+ resultado);
		break;
	case 'd':
	case 'D':
		resultado = a/b;
		System.out.println("La división es:"+resultado);
		break;
	default:
		System.out.println("Error operación incorrecta");
	}
	}
}
