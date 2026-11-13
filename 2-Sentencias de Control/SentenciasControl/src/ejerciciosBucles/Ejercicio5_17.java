package ejerciciosBucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 17. Repetir el ejemplo del "simulador de calculadora" para poder realizar todas las
operaciones que el usuario quiera.
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	double numero1;
	double numero2;
	double operacion = 0;
	char operador;
	do {
	System.out.println("Introduce dos numeros");
	numero1 = sc.nextDouble();
	numero2 = sc.nextDouble();
	System.out.println("Introduce un operador (Finaliza la Calculadora introduciendo cero");
	sc.nextLine();
	operador = sc.nextLine().charAt(0);
	if (operador != '+' && operador != '-' && operador !='*' && operador!='/' && operador !='%' && operador != '0') {
		System.out.println("Operador no válido vuelva a intentarlo");
	}
	else {
		if(operador != '0') {
			switch(operador) {
			case '+':
			operacion = numero1 + numero2;
			break;
			case '-':
			operacion = numero1 - numero2;
			break;
			case '*':
			operacion = numero1 * numero2;
			break;
			case '/':
			operacion = numero1 / numero2;
			break;
			case '%':
			operacion = numero1 % numero2;
			break;
			}
			System.out.println(operacion);
		}
	}
	}
	while(operador != '0');
	System.out.println("Fin del programa");
	/*
	char e = '0';
	// char b = 0; Si pones el numero sin comillas esto seria su valor ascii 
	//Al ser de tipo char no tiene una forma de representarlo visualmente si se quisiera ver se usa un casting
	if (e == '0') {
	System.out.println(e);
	}
	*/
	}
}
