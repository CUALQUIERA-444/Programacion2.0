package ejerciciosSentenciasControl;

import java.util.Scanner;

public class Ejercicio4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que lea una hora expresada en segundos transcurridos desde las 12
de la noche y la convierta en horas, minutos y segundos o viceversa. Lee una
hora como horas, minutos y segundos y la transforma en segundos.
 */
	Scanner sc = new Scanner(System.in);
	final int max_sh = 3600, max_sm = 60;
	System.out.println("Introduzca los segundos transcurridos");
	int segundos_t = sc.nextInt();
	int horas = 0;
	int minutos = 0;
	int segundos_resto = 0;
	if(segundos_t < 0) {
		System.out.println("Error");
	}
	else {
	if (segundos_t >= max_sh) {
		horas = segundos_t / max_sh;
		segundos_t = segundos_t % max_sh;
	}
	if (segundos_t >= max_sm) {
			minutos = segundos_t / max_sm;
			segundos_resto = segundos_t % max_sm;
	}
	if(segundos_t < 60 && segundos_t != 0) {
			segundos_resto = segundos_t;
	}
		//1 hora son 3600 segundos 
		//Si es mayor que eso ej 3700 / 3600 = 1 Resto 100 (Si el resto es mayor que los segundos que un minuto entonces 100 / 60 = 1 Resto 40 Sobran 40 segundos
	System.out.println(horas+":"+minutos+":"+segundos_resto);
	}
	System.out.println("Introduce las horas transcurridas");
	horas = sc.nextInt();
	System.out.println("Introduce los minutos que han transcurrido");
	minutos = sc.nextInt();
	System.out.println("Introduce los segundos");
	segundos_resto = sc.nextInt();
	if (horas < 0 || minutos < 0 || segundos_resto < 0) {
		System.out.println("ERROR");
	}
	else {
		if (horas > 0) {
			segundos_t = horas * max_sh; 
		}
		if (minutos > 0) {
			segundos_t += minutos * max_sm;
		}
		if (segundos_resto > 0) {
			segundos_t += segundos_resto;
		}
	}
	System.out.println(segundos_t+" segundos");
	}
}
