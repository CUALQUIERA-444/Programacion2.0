package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que calcula el factorial de un número, éste no debe ser negativo
4!= 4*3*2*1
 */
	Scanner sc = new Scanner(System.in);
	int numero; 
	int factorial;
	do {
		System.out.println("Introduce un número");
		numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("El número no es valido vuelva a intentarlo");
		}
	} while (numero < 0);
	factorial = CalcularFactorial(numero);
	System.out.println(factorial);
	}
	public static int CalcularFactorial(int numero) {
		int resultado = 1;
		for (int i = 1 ;i<=numero;i++) { //Nota factorial de 0 = 1 
		//El cero no entra como multimplicador
			resultado = resultado * i;
		}
		return resultado;
	}
}
