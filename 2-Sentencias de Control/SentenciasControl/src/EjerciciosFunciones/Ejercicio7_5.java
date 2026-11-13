package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. En un cine las entradas cuestan 5 euros. Se hace el 50% de descuento los
martes a los mayores de 65 años, los miércoles el 20% a todos los públicos y el
fin de semana el 15% a los menores de 18 años. Hacer un programa que simule
el siguiente proceso : se pide por teclado el día de la semana , se valida que sea
correcto (L,M,X,J,V,S o D). Se van pidiendo las edades de la gente que llega a la
taquilla, si es necesario, y se muestra el precio de la entrada.
Utilizar un método para validar el día y otro para calcular el precio de cada entrada
 */
//Recomendable usar double para porcentajes
	Scanner sc = new Scanner(System.in);
	boolean continuar;
	char dia;
	int edad;
	double precio;
	char mas;
	do {
	System.out.println("Introduce el dia en el que nos encontramos");
	dia = sc.nextLine().toUpperCase().charAt(0);
	continuar = ValidarDia(dia);
	if(continuar == false) {
		System.out.println("Dia no valido vuelva a intentarlo");
	}
	} while (continuar == false);
	do {
		edad = 0;
		if (dia =='M' || dia == 'S' || dia == 'D') {
			System.out.println("Dime tu edad");
			edad = sc.nextInt();
			sc.nextLine();
		}
		precio = calcPrecio(dia,edad);
		System.out.println("El precio a pagar es de:"+precio+" euros");
		System.out.println("Hay más personas:(S/N)");
		mas = sc.nextLine().toUpperCase().charAt(0);
		} while(mas == 'S');
	}
	public static boolean ValidarDia(char dia) {
		switch(dia) {
		case 'L':
		case 'M':
		case 'X':
		case 'J':
		case 'V':
		case 'S':
		case 'D':
		return true;
		default:
		return false;
		}
	}
	public static double calcPrecio(char dia, int edad) {
		final double precio = 5;
		double precio_final = 0;
		if(edad > 65 && dia == 'M') {
			precio_final = precio - precio * 0.5;
		}
		else if (dia == 'X') {
			precio_final = precio - precio * 0.2;
		}
		else if (dia == 'S' || dia == 'D' && edad < 18) {
			precio_final = precio - precio * 0.15;
		}
		return precio_final;
			}
}
