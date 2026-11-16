package ejerciciosSentenciasControl;

import java.util.Scanner;

public class EjercicioS4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. En una isla viven dos tipos de personas:
Los honestos, que siempre dicen la verdad.
Los mentirosos, que siempre mienten.
Se entrevista a una persona A sobre sí misma y sobre otra persona B.
El programa recibe:
La respuesta de A a la pregunta:
"¿Eres honesto?"
S
N
La respuesta de A a la pregunta:
"¿B es honesto?"
S
N
Debes determinar:
Si A es honesto o mentiroso.
Si B es honesto o mentiroso.
Si las respuestas son imposibles.
 */
//Si A es honesto Esta diciendo la verdad Y puede decir sin problema si b es honesto o mentiroso
//Si A dice que no es honesto las respuestas son imposibles no puede ser honesto por que dice que no lo es y tampoco puede ser 
//mentiroso porque seria honesto cuando realmente esta mintiendo
Scanner sc = new Scanner(System.in);
char respuesta;
System.out.println("Hola A ¿eres honesto? (S/N)");
respuesta = sc.nextLine().toUpperCase().charAt(0);
	if(respuesta == 'S') {
		System.out.println("Respecto a B ¿es honesto?");
		respuesta = sc.nextLine().toUpperCase().charAt(0);
		 if(respuesta == 'S') {
			 System.out.println("A y B son honestos");
		 }
		 else if(respuesta == 'N') {
			 System.out.println("A es honesto y B un mentiroso");
		 }
		 else {
			 System.out.println("La letra no es correcta");
		 }
	}
	else if(respuesta == 'N') {
		System.out.println("Las respuestas son imposibles");
	}
	else {
		System.out.println("La letra no es correcta");
	}
	}
}
