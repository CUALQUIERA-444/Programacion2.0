package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. En unos multicines se están proyectando dos películas en dos salas distintas. Cada persona
que llega compra varias entradas para la misma película. Realizar un programa en el que se
anota por cada persona que llega a la taquilla el número de sala y el número de entradas
que compra para esa sala, el programa finaliza al anotar la sala 0. Mostrar el número total
de entradas vendidas y decir para que sala se han vendido más entradas. Decir además si
ha habido alguien que haya comprado más de 10 entradas.
 */
//Nota se proyecta una pelicula por sala (En una sala se proyecta una pelicula) 
Scanner sc = new Scanner(System.in);
int sala,sala1 = 0, sala2 = 0, entradas; 
boolean masDe10 = false;
System.out.println("Introduce sala:");
sala = sc.nextInt();

while(sala != 0) {
	if (sala != -1 && sala != 2) {
		System.out.println("Error, número de sala incorrecto");
	}
	else {
		System.out.println("Introduce el número de entradas:");
		entradas = sc.nextInt();
		if(entradas > 10) {
			masDe10 = true;
		}
		if(sala == 1) {
			sala1 = sala1 + entradas;
		}
		if(sala == 2) {
			sala2 = sala2 + entradas;
		}
	}
	System.out.println("Introduce sala:");
	sala = sc.nextInt();
}
System.out.println("Total entradas:"+(sala1+sala2));
if(masDe10 == true) 
	System.out.println("Algún grupo ha comprado más de 10");
if(sala1 > sala2)
	System.out.println("La sala1 ha vendido mas");
else {
	if(sala2 > sala1)
		System.out.println("La sala2 ha vendido mas");
	else 
		System.out.println("Mismo número de entradas");
}
	}
}
