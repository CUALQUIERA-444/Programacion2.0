package TeoriaFechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
// DateTimeFormatter no está en java.time.*, sino en el subpaquete format:
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParsingYFormatting {

    public static void main(String[] args) {

        /* ============================================================================
         * MÉTODOS DE CONVERSIÓN (Parsing y Formatting)
         * ============================================================================
         * - format(formatter)      | LocalDate, LocalTime, LocalDateTime | Objeto -> String
         * Convierte la fecha en texto usando un patrón. (Devuelve un String)
         *
         * - parse(texto)           | LocalDate, LocalTime, LocalDateTime | String -> Objeto
         * Lee un String en formato ISO (yyyy-MM-dd). (Devuelve un objeto)
         *
         * - parse(texto,formatter) | LocalDate, LocalTime, LocalDateTime | String -> Objeto
         * Lee un String con un formato personalizado. (Devuelve un objeto)
         * ============================================================================
         */

        // 1. parse(texto) -> De String ISO a Objeto
        LocalDate fechaISO = LocalDate.parse("2026-04-02");
        LocalTime horaISO = LocalTime.parse("18:45:08");

        // 2. parse(texto, formatter) -> De String personalizado a Objeto
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaPersonalizada = LocalDate.parse("02/04/2026", formatoEntrada);

        // 3. format(formatter) -> De Objeto a String usando un patrón
        DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
        String textoFormateado = fechaISO.format(formatoSalida);
        System.out.println("Fecha formateada: " + textoFormateado);


        /* ============================================================================
         * ESTILOS DEL FORMATTER (Patrones con ofPattern("..."))
         * ============================================================================
         * TABLA DE SÍMBOLOS DE FECHA (Ejemplo: 2 de abril de 2026, jueves)
         * ----------------------------------------------------------------------------
         * Símbolo | Significado                 | Ejemplo
         * --------|-----------------------------|---------
         * d       | Día del mes (1 dígito)      | 2
         * dd      | Día del mes (2 dígitos)     | 02
         * E       | Nombre del día (corto)      | jue.
         * EEEE    | Nombre del día (completo)   | jueves
         * M o L   | Mes (número)                | 4
         * MM      | Mes (número con 0)          | 04
         * MMM     | Mes (nombre corto)          | abr.
         * MMMM    | Mes (nombre completo)       | abril
         * yy      | Año (2 dígitos)             | 26
         * yyyy    | Año (4 dígitos)             | 2026
         * ============================================================================
         */

        DateTimeFormatter patronFechaCorto = DateTimeFormatter.ofPattern("E d/M/yy");
        DateTimeFormatter patronFechaLargo = DateTimeFormatter.ofPattern("EEEE dd-MMM-yyyy");

        System.out.println("Patrón fecha corto: " + fechaPersonalizada.format(patronFechaCorto));
        System.out.println("Patrón fecha largo: " + fechaPersonalizada.format(patronFechaLargo));


        /* ============================================================================
         * TABLA DE SÍMBOLOS DE TIEMPO (LocalTime / LocalDateTime)
         * ----------------------------------------------------------------------------
         * Símbolo | Significado                         | Ejemplo
         * --------|-------------------------------------|----------------
         * H       | Hora (0-23)                         | 18
         * HH      | Hora con cero inicial (00-23)       | 09
         * h       | Hora en formato 12h (1-12)          | 6
         * m       | Minutos                             | 45
         * mm      | Minutos con cero inicial            | 05
         * s       | Segundos                            | 30
         * ss      | Segundos con cero inicial           | 08
         * S       | Fracción de segundo (Milisegundos)  | SSS -> 123
         * n       | Nanosegundos (Precisión total)      | nnnnnnnnn -> 123456789
         * a       | Marcador AM/PM                      | PM
         * ============================================================================
         */

        LocalDateTime fechaHora = LocalDateTime.of(2026, 4, 2, 18, 5, 8, 123456789);

        // Ejemplo formato 24h con milisegundos
        DateTimeFormatter patron24h = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        System.out.println("Formato 24h: " + fechaHora.format(patron24h));

        // Ejemplo formato 12h con AM/PM (usamos Locale.ENGLISH para que salga "PM" limpio)
        DateTimeFormatter patron12h = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.ENGLISH);
        System.out.println("Formato 12h: " + fechaHora.format(patron12h));

        // Ejemplo completo combinando fecha y tiempo con nanosegundos
        DateTimeFormatter patronCompleto = DateTimeFormatter.ofPattern("dd/MM/yyyy 'a las' H:m:s (nnnnnnnnn)");
        System.out.println("Completo: " + fechaHora.format(patronCompleto));
    }
}
