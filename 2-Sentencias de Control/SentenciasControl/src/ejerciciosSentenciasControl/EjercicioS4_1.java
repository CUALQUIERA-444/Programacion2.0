package ejerciciosSentenciasControl;

import java.util.Scanner;

public class EjercicioS4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Crea un programa para calcular el precio de un parking:
Se pide por teclado:
Tipo de vehículo: 1 = Coche,2 = Moto,3 = Furgoneta
Horas estacionadas.
Día de la semana (L, M, X, J, V, S, D).
El precio base por hora es: (usa un switch)
Vehículo precio/hora
Coche 2 euros
Moto 1 euro
Furgoneta 3 euros
Descuentos
Si permanece más de 10 horas → descuento del 20%.
Si es sábado o domingo → descuento adicional del 15%.
Si el importe supera los 30 € → descuento extra del 5%.
Recargo
Si es furgoneta y permanece más de 15 horas → recargo de 10 €.
Mostrar
El precio sin descuentos, los descuentos aplicados y el precio final.
 */
	Scanner sc = new Scanner(System.in);
	char dia_semana;
	boolean bien;
	double precio_inicial = 0 ;
	double precio_final = 0;
	int tipo;
	int horas;
	double descuento_a, descuento_b, descuento_c,recarga; 
	System.out.println("Introduce el tipo de vehiculo (1 -> Coche, 2 -> Moto , 3 -> Furgoneta");
	tipo = sc.nextInt();
	if (tipo < 1 || tipo > 3) {
		System.out.println("Tipo no valido reinicie el programa");
	}
	else {
		System.out.println("Introduce las horas de estancia");
		horas = sc.nextInt();
		sc.nextLine(); //Limpiar buffer
		System.out.println("Introduce el dia de la semana");
		dia_semana = sc.nextLine().toUpperCase().charAt(0);
		switch(dia_semana) {
		case 'L':
		case 'M':
		case 'X':
		case 'J':
		case 'V':
		case 'S':
		case 'D': 
		bien = true;
		break;
		default:
		bien = false;
		}
		if(!bien) {
			System.out.println("El día no es válido reinicie el programa");
		}
		else {
			switch(tipo) {
			case 1: 
				precio_inicial = 2;
			break;
			case 2:
				precio_inicial = 1;
			break;
			case 3: 
				precio_inicial = 3;
			break;
			}
		System.out.println("Precio sin descuentos "+precio_inicial+"€");
		precio_final = precio_inicial;
		if(horas > 10) {
			descuento_a = precio_final * 20 / 100;
			System.out.printf("Descuento aplicado del 20%% por estar más de 10 horas %.2f€\n",descuento_a);
			precio_final = precio_final - descuento_a;
		}
		if(dia_semana == 'S' || dia_semana == 'D') {
			descuento_b = precio_final * 15 / 100;
			System.out.printf("Descuento aplicado del 15%% por ser fin de semana %.2f€\n",descuento_b);
			precio_final = precio_final - descuento_b;
		}
		if(precio_final > 30 )  {
			descuento_c = precio_final * 5 / 100;
			System.out.printf("Descuento aplicado del 5%% por superar los 30 euros %.2f€\n",descuento_c);
			precio_final = precio_final - descuento_c;
		}
		if(horas > 15 && tipo == 3) {
			recarga = 10;
			System.out.printf("Recarga aplicada por ser una furgoneta y estar más de 15 horas %.2f€\n",recarga);
			precio_final = precio_final + recarga;
		}
		System.out.println("Precio final "+precio_final+"€");
		}
	}
	}

}
