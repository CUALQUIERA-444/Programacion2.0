package ejerciciosElementosDePrograma;

public class Ejercicio1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Programa que dadas dos variables a y b,
 *  intercambie sus valores
 */
	int a = 3;
	int b = 4;
	System.out.println("Valor inicial A "+a);
	System.out.println("Valor inicial B "+b);
	int auxiliar = b;
	b = a;
	a = auxiliar;
	System.out.println("Valor final A "+a);
	System.out.println("Valor final B "+b);
	}
}
