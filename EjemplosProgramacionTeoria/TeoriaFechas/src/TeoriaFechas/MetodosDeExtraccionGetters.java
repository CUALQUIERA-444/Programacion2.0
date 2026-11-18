package TeoriaFechas;

import java.time.LocalDate;
import java.time.LocalTime;

public class MetodosDeExtraccionGetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate fecha = LocalDate.now();
int hola = fecha.getYear(); 
/*
 * Obtiene el año como entero Devuelve (int)
 */
hola = fecha.getMonth().getValue();
//Obtiene el mes como ENUM 
//(Month) Devuelve (ENUM) (Lista de Strings)
//Usar .get Value para el valor numerico
hola = fecha.getMonthValue(); 
//Obtiene el mes en número (1-12) Devuelve (int)
hola = fecha.getDayOfMonth();
//Obtiene el día del mes Devuelve (int)
hola = fecha.getDayOfWeek().getValue();
/*
 * Obtiene el día de la semana
 *  (ENUM) Devuelve (ENUM) 
 *  (Lista de strings)
 *  Usar .getValue para el valor numerico
 */
LocalTime fech = LocalTime.of(22, 30);
int hola2 = fech.getHour();
hola2 = fech.getMinute();
/* 
 * Obtiene hora o minuto (LocalTime) Devuelve (int)
 */

	}
}
