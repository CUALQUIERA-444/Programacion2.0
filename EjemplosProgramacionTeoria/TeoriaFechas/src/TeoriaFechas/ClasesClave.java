package TeoriaFechas;
import java.time.*;
public class ClasesClave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate fecha; //Representa una fecha (año,mes,día) //yyyy-MM-dd
LocalTime hora; //Representa una hora (hora,minutos,segundos,nanosegundos) hh:mm:ss:ns
LocalDateTime fecha_hora; //Combina una fecha y hora ideal para registros logs yyy-mm-dd hh:mm:ss:ns
//Reglas extrañas de LocalDate LocalTime y LocalDateTime
/*
 * El error del DateTimeFormatter incompleto 
Si usas LocalDate.parse(), el patrón debe tener año, mes y día.
Si usas LocalTime.parse(), el patrón debe tener al menos hora y minuto.
Si usas LocalDateTime.parse(), el patrón debe tener TODO
La trampa: Si intentas parsear "2026-05" con un objeto LocalDate, aunque el patrón sea "yyyy-MM", 
el programa explotará. Para Java, un LocalDate sin un día concreto no existe.
Solución Si no tienes mes y año, existe una clase poco conocida llamada YearMonth
 */
/*
 * Duration.between y ChronoUnit.DAYS.between son muy estrictos con lo que significa "un día".
Para ChronoUnit.DAYS: Un día solo ha pasado si han transcurrido 24 horas exactas.
Ejemplo trampa:
Fecha 1: Lunes a las 23:00.
Fecha 2: Martes a las 08:00.
Para un humano ha pasado un día. Para Java, han pasado 0 días porque no han pasado 24 horas.

Period no entiende de horas
00:00 o 24:00? 
Java usa el formato hasta 00:00 si intentas 24:00 salta excepció

 */
	}
}
