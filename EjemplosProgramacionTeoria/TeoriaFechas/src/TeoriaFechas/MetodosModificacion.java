package TeoriaFechas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MetodosModificacion {

    public static void main(String[] args) {

        // Creamos una fecha y hora base para probar todos los métodos
        LocalDateTime fechaHora = LocalDateTime.of(2026, 11, 17, 18, 30, 0);
        System.out.println("Fecha base: " + fechaHora + "\n");

        // ==========================================
        // CATEGORÍA: Suma (Fechas)
        // ==========================================

        // plusDays(long): Suma una cantidad de días (Devuelve la modificación de la fecha)
        LocalDateTime masDias = fechaHora.plusDays(5);

        // plusMonths(long): Suma una cantidad de meses (Devuelve la modificación de la fecha)
        LocalDateTime masMeses = fechaHora.plusMonths(2);

        // plusWeeks(long): Suma semanas (Devuelve la modificación de la fecha)
        LocalDateTime masSemanas = fechaHora.plusWeeks(3);

        // plusYears(long): Suma el número de años (Devuelve la modificación de la fecha)
        LocalDateTime masAnios = fechaHora.plusYears(1);

        // ==========================================
        // CATEGORÍA: Suma (Tiempo)
        // ==========================================

        // plusHours(long): Suma el número de horas (Devuelve la modificación de la fecha)
        LocalDateTime masHoras = fechaHora.plusHours(4);

        // plusMinutes(long): Suma el número de minutos (Devuelve la modificación de la fecha)
        LocalDateTime masMinutos = fechaHora.plusMinutes(15);

        // plusSeconds(long): Suma el número de segundos (Devuelve la modificación de la fecha)
        LocalDateTime masSegundos = fechaHora.plusSeconds(30);

        // plusNanos(long): Suma el número de nanosegundos (Devuelve la modificación de la fecha)
        LocalDateTime masNanos = fechaHora.plusNanos(500);

        // ==========================================
        // CATEGORÍA: Resta (Fechas)
        // ==========================================

        // minusDays(long): Resta el número de días (Devuelve la modificación de la fecha)
        LocalDateTime menosDias = fechaHora.minusDays(5);

        // minusWeeks(long): Resta el número de semanas (Devuelve la modificación de la fecha)
        LocalDateTime menosSemanas = fechaHora.minusWeeks(2);

        // minusMonths(long): Resta el número de meses (Devuelve la modificación de la fecha)
        LocalDateTime menosMeses = fechaHora.minusMonths(1);

        // minusYears(long): Resta el número de años (Devuelve la modificación de la fecha)
        LocalDateTime menosAnios = fechaHora.minusYears(10);

        // ==========================================
        // CATEGORÍA: Resta (Tiempo)
        // ==========================================

        // minusHours(long): Resta el número de horas (Devuelve la modificación de la fecha)
        LocalDateTime menosHoras = fechaHora.minusHours(2);

        // minusMinutes(long): Resta el número de minutos (Devuelve la modificación de la fecha)
        LocalDateTime menosMinutos = fechaHora.minusMinutes(45);

        // minusSeconds(long): Resta el número de segundos (Devuelve la modificación de la fecha)
        LocalDateTime menosSegundos = fechaHora.minusSeconds(10);

        // minusNanos(long): Resta el número de nanosegundos (Devuelve la modificación de la fecha)
        LocalDateTime menosNanos = fechaHora.minusNanos(100);

        // ==========================================
        // CATEGORÍA: Ajuste (with)
        // ==========================================

        // withDayOfMonth(int): Cambia el día del mes al valor indicado (Devuelve la modificación de la fecha)
        LocalDateTime ajusteDiaMes = fechaHora.withDayOfMonth(1);

        // withDayOfYear(int): Cambia el día del año (1-366) (Devuelve la modificación de la fecha)
        LocalDateTime ajusteDiaAnio = fechaHora.withDayOfYear(100);

        // withMonth(int): Cambia el mes al valor indicado (1-12) (Devuelve la modificación de la fecha)
        LocalDateTime ajusteMes = fechaHora.withMonth(12);

        // withYear(int): Cambia el año al valor indicado (Devuelve la modificación de la fecha)
        LocalDateTime ajusteAnio = fechaHora.withYear(2030);

        // withHour(int): Cambia la hora (0-23) (Devuelve la modificación de la fecha)
        LocalDateTime ajusteHora = fechaHora.withHour(9);

        // withMinute(int): Cambia los minutos (0-59) (Devuelve la modificación de la fecha)
        LocalDateTime ajusteMinuto = fechaHora.withMinute(0);

        // withSecond(int): Cambia los segundos (0-59) (Devuelve la modificación de la fecha)
        LocalDateTime ajusteSegundo = fechaHora.withSecond(0);

        // withNano(int): Cambia los nanosegundos (Devuelve la modificación de la fecha)
        LocalDateTime ajusteNano = fechaHora.withNano(0);

        // ==========================================
        // CATEGORÍA: Genéricos
        // ==========================================

        // plus(long, Unit): Suma cualquier unidad (ChronoUnit) (Devuelve la modificación de la fecha)
        LocalDateTime sumaGenerica = fechaHora.plus(10, ChronoUnit.DAYS);

        // Ejemplo de impresión para comprobar resultados
        System.out.println("Ejemplo suma días: " + masDias);
        System.out.println("Ejemplo ajuste año: " + ajusteAnio);
        System.out.println("Ejemplo genérico (+10 días): " + sumaGenerica);
    }
}