package practicasString;

import java.util.Scanner;

public class Ejercicio8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Programa que lee nombres de ciudades europeas 
 * y cuenta cuantas empiezan
por una letra introducida por teclado
//Nota no se puede guardar los nombres sin antes pedir la letra
 */
  String ciudad;
  char letra;
  int contador = 0;
  boolean confirmacion = true; 
  Scanner sc = new Scanner (System.in);
  System.out.println("Introduce la letra a comparar");
  letra = sc.nextLine().charAt(0);
  do {
  System.out.println("Introduce nombres de ciudades europeas");
  ciudad = sc.nextLine();
  if(!ValidarCiudad(ciudad)) {
	  System.out.println("Error ciudad invalida vuelva a intentarlo");
  }
  else {
	  if(Character.toUpperCase(letra) == ciudad.toUpperCase().charAt(0)) {
		  contador++;
	  }
	  System.out.println("Desea continuar? (true/false)");
	  confirmacion = sc.nextBoolean(); //El buffer se queda sucio cuando EL SCANNER NO ES NEXTLINE
	  sc.nextLine();
  }
  } while(confirmacion == true);
  System.out.println("Letras totales "+contador);
	}
public static boolean ValidarCiudad(String ciudad) {
	ciudad = ciudad.toUpperCase();
	switch(ciudad) {
	case "MADRID":
	case "BARCELONA":
	case "SEVILLA":
	case "ZARAGOZA":
	return true;
	default:
	return false;
	}
}
}
