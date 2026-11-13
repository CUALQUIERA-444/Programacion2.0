package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. En un museo se tienen las siguientes tarifas:

 		Normal Reducida
Adultos 3 euros 2 euros
Niños 	2 euros 1,2 euros

Hacer un programa en el que se simula la compra de entradas en el museo de la siguiente
forma:
Por cada grupo que llega se anota el número de adultos y el número de niños y si se aplica
tarifa reducida o no. Con esta información se calcula el importe total de las entradas de
cada grupo y se muestra por pantalla. El programa termina cuando se hayan recaudado
más de 100 euros.
Mostrar al final el número de entradas del grupo que más entradas ha comprado.
 */
		
//Nota se asume que el grupo completo puede tener reducidad O lo tiene todo el grupo o no lo tiene nadie
//Se usa While cuando la condición depende de un dato que ya existe antes de entrar al bucle 
//Se usa Do-While cuando el dato necesario para la condición se genera dentro del bucle (lectura interactiva con el usuario)
		Scanner sc = new Scanner(System.in);
		char confirmacion; 
		int cont_A = 0;
		int cont_N = 0;
		int cont_vueltas = 1;
		int entradas_recuento;
		double precioGrupo = 0 ,total = 0;
		int mayor_entradas = Integer.MIN_VALUE; //El minimo valor posible 
		final double AdultoNormal = 3, AdultoReducida = 2, NiñoNormal = 2, NiñoReducida = 1.2;
		do {
			System.out.println("Anota adultos:");
			cont_A = sc.nextInt();
			System.out.println("Anota niños:");
			cont_N = sc.nextInt();
			System.out.println("Tarifa reducida (S/s/N/n)");
			sc.nextLine();
			confirmacion = sc.nextLine().charAt(0);
			if (confirmacion != 'S' && confirmacion != 's' && confirmacion != 'N' && confirmacion != 'n') {
				while (confirmacion != 'S' && confirmacion != 's' && confirmacion != 'N' && confirmacion != 'n') {
				System.out.println("Error vuelva a introducir confirmacion");
				confirmacion = sc.nextLine().charAt(0);
				}
			}
			if (confirmacion == 'S' || confirmacion == 's') {
				precioGrupo = cont_A * AdultoReducida + cont_N * NiñoReducida;
				total += precioGrupo;
			}
			else {
				precioGrupo = cont_A * AdultoNormal + cont_N * NiñoNormal;
				total += precioGrupo;
			}
			System.out.println("Precio Grupo "+cont_vueltas+" "+precioGrupo+" euros");
			cont_vueltas++;
			entradas_recuento = cont_A + cont_N;
			if (entradas_recuento > mayor_entradas) {
				mayor_entradas = entradas_recuento;
			}
			} while ( total <= 100);
		System.out.println("Total "+total+" euros");
		System.out.println("Mayor cantidad de entradas "+mayor_entradas);
	}
}
