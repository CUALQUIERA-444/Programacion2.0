package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4. Ampliar el ejercicio anterior para calcular el factorial de todos los números que
// quiera el usuario.
		Scanner sc = new Scanner(System.in);
		int numero; 
		int factorial;
		boolean continuacion = true;
		do {
			System.out.println("Introduce un número");
			numero = sc.nextInt();
			if (numero < 0) {
				System.out.println("El número no es valido vuelva a intentarlo");
			}
			else {
			factorial = CalcularFactorial(numero);
			System.out.println(factorial);
			System.out.println("Desea continuar? (true/false)");
			continuacion = sc.nextBoolean();
			}
		} while (continuacion == true);
		System.out.println("Fin del programa");
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
