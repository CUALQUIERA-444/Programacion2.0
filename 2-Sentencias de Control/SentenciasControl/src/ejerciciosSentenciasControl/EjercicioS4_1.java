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
	System.out.println("Introduce el tipo de vehiculo (1 -> Coche, 2 -> Moto , 3 -> Furgoneta");
	int tipo = sc.nextInt();
	if (tipo < 0 || tipo > 3) {
		System.out.println("Tipo no valido reinicie el programa");
	}
	else {
		System.out.println("Introduce el dia de la semana");
	}
	}

}
