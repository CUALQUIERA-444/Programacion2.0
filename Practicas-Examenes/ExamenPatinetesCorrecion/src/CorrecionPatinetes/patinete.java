package CorrecionPatinetes;

import java.util.Scanner;

public class patinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Nota esto es sin paquetes
	int nS = 2, nB = 2, edad,contadorSuper = 0,minutos;
	Boolean otro;
	double precio;
	double total = 0;
	String tipo,carnet;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Dime tu edad:");
		edad = sc.nextInt();
		if(edad < 16) {
			System.out.println("Tienes que tener al menos 16 años para poder alquilar");
		}
		else {
			do {
			System.out.println("Anota tipo de patín (basico/super)");
			tipo = sc.nextLine();
			if(!tipo.equalsIgnoreCase("basico") && !tipo.equalsIgnoreCase("super")) {
				System.out.println("Tipo de patin incorrecto");
			}
			} while(!tipo.equalsIgnoreCase("basico") && !tipo.equalsIgnoreCase("super"));
		if(tipo.equalsIgnoreCase("basico")) {
			if(nB == 0) {
			System.out.println("No quedan patines basicos, quieres uno super(true/false)");
			otro = sc.nextBoolean();
			if(otro) {
				System.out.println("Te damos un patín super");
			}
			else {
				System.out.println("Otra vez será");
				continue;
			}
			}
			else {
				nB--;
			}
		}
		else {
			if(nS == 0) {
				System.out.println("No quedan patines super, quieres uno básico (true/false)");
				otro = sc.nextBoolean();
			if(otro) {
				System.out.println("Te damos un patín básico");
				nB--;
			}	else {
				System.out.println("Otra vez será");
				continue;
			}
			}
			else {
				nS--;
				contadorSuper++;
			}
		}
		System.out.println("Anota por cuántos minutos quieres alquilar el patín");
		minutos = sc.nextInt();
		precio=calcPrecio(tipo,minutos);
		System.out.println("El precio inicial es de: "+precio);
		System.out.println("Anota carnet de socio: ");
		carnet = sc.nextLine();
		if(carnet.matches("^[A-Za-z]{3}-[0-9]{1,2}$")) {
			double descuento = Double.parseDouble(carnet.substring(4));
			precio = precio - precio * descuento / 100;
		}
		else 
			if(minutos/60 > 3) {
				precio=precio*0.9;
			}
			else {
				System.out.println("No tienes descuento");
			}
		System.out.println("El precio final es "+precio);
		total+=precio;
			}
		} while(nS != 0 || nB != 0);
	//}while (ns !=0 || nB != 0);
	//Salgo porque nS == 0 && nB == 0
	System.out.println("El importe recaudado ha sido de:"+total);
	System.out.println("La cantidad de personas que han comprado super son:"+contadorSuper);
	}
	public static double calcPrecio(String tipo, int minutos) {
		int horas = minutos/60; //Pasarte de 1 minutos cuenta como una hora
		final double BAS = 5, SUP = 8;
		double precio;
		if(minutos % 60 > 0) 
			horas++;
		if(tipo.equalsIgnoreCase("basico")) {
			precio= horas * BAS;
		}
		else {
			precio = horas * SUP;
		}
		return precio;
	}
}
