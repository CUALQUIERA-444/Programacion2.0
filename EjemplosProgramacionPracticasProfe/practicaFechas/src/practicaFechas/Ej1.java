package practicaFechas;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate hoy=LocalDate.now();
		System.out.println(hoy);
		System.out.println("Hoy es:"+ hoy.getDayOfMonth()+ " del mes "+ hoy.getMonthValue()+ " del año:"+ hoy.getYear());
		System.out.println("El día de la semana es:"+ hoy.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));

	}

}
