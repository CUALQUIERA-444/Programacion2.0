package ejemplosif;

import java.util.Locale;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 8. Construir un programa que calcule el índice de masa corporal de una persona
(IMC = peso [kg] / altura² [m]) e indique el estado en el que se encuentra esa
persona en función del valor de IMC:

Valor de IMC Diagnóstico
< 16 Criterio de ingreso en hospital
de 16 a 17 infrapeso
de 17 a 18 bajo peso
de 18 a 25 peso normal (saludable)
de 25 a 30 sobrepeso (obesidad de grado I)
de 30 a 35 sobrepeso crónico (obesidad de grado
II)
de 35 a 40 obesidad premórbida (obesidad de
grado III)

>40 obesidad mórbida
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduce tu peso en kg");
	double peso = sc.nextDouble();
	System.out.println("Introduce tu altura en m");
	double altura = sc.nextDouble();
	double IMC = peso/(altura*altura);
	if(IMC < 16) {
		System.out.println("Criterio de ingreso en hospital");
	}
	else if(IMC < 17)  {
		System.out.println("Infrapeso");
	}
	else if(IMC < 18)  {
		System.out.println("Bajo peso");
	}
	else if(IMC < 25)  {
		System.out.println("Peso normal (saludable)");
	}
	else if(IMC < 30)  {
		System.out.println("Sobrepeso (Obesidad de grado I)");
	}
	else if(IMC < 35)  {
		System.out.println("Sobrepeso crónico (Obesidad de grado II)");
	}
	else if(IMC < 40)  {
		System.out.println("Obesidad premórbida (Obesidad de grado III)");
	}
	else {
		System.out.println("Obesidad mórbida");
	}
	}
}
