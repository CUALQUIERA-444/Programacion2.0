package ejerciciosBucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 9. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la
cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más
de 1.75.
 */
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int contador = 1;
	int contador_b = 0;
	int contador_c = 0;
	double acumulador_estaturas = 0;
	int edad;
	int acumulador_edad = 0;
	double estatura;
	double estatura_media;
	int edad_media;
	do {
		if (contador <= 5) {
		edad = r.nextInt(19)+15; //Entre 15 y 33
		estatura = (100+r.nextInt(101))/100.0; //100 numeros entre 1
		System.out.println(estatura);
		acumulador_estaturas += estatura;
		acumulador_edad += edad;
		if (edad > 18) {
			contador_b++;
		}
		if (estatura > 1.75)  {
			contador_c++;
		}
		contador++;
		}
	} 
	while (contador <= 5);
	estatura_media = acumulador_estaturas / contador;
	edad_media = acumulador_edad / contador;
	System.out.println("Edad media "+edad_media+" años");
	System.out.println("Estatura media "+estatura_media+" m");
	System.out.println("Cantidad de mayores de 18 años "+contador_b);
	System.out.println("Cantidad de mayores de 1.75 m "+contador_c);
	}
}
