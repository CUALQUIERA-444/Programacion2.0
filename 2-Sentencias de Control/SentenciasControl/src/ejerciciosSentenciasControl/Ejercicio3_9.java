package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 9. Programa que recibe como datos de entrada una hora expresada en horas, minutos y
segundos y nos devuelve la hora, minutos y segundos que serán transcurridos un segundo
más tarde
 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce una hora (Formato Hora)");
		int hora = sc.nextInt();
		System.out.println("Introduce los minutos");
		int minutos = sc.nextInt();
		System.out.println("Introduce los segundos");
		int segundos = sc.nextInt();
		if (hora >= 24 || minutos >= 60 || segundos >= 60) {
			System.out.println("Lo siento no esta permitido reinicie el programa");
		}
		else {
			segundos = segundos + 1;
			if(segundos == 60) {
				minutos = minutos + 1;
				segundos = 0;
			}
			if(minutos == 60) {
				hora = hora + 1;
				minutos = 0;
				segundos = 0;
			}
			if (hora == 24) {
				hora = 0;
				minutos = 0;
				segundos = 0;
			}
			System.out.println(hora+":"+minutos+":"+segundos);
		}
		}
	}
	

