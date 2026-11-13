package ejerciciosElementosDePrograma;
import java.io.*; //Librerias de java para utilizar objetos.
public class Ejercicio1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que calcula la longitud 
 * de una circunferencia de radio 3 metros (2πr)
 * Nota para calcular la longitud de la circunferencia
 * Formula con el diametro = pi * diametro
 * Formula con el radio = pi * 2 * radio
 *  */
	final int estatico = 2;
	final double pi = 3.1416;
	double radio = 3;
	double longitud = pi * estatico * radio;
	//Math.PI Es algo que existe 
	System.out.println(longitud+" m²");
	//Scanner sc = new Scanner(System.in) 
	//Se Puede leer o con buffered Reader o Scanner
	}
}
