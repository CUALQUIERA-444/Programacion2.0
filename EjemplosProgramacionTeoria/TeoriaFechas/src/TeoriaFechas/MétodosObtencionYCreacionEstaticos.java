package TeoriaFechas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MétodosObtencionYCreacionEstaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime hoy = LocalDateTime.now(); //Obtiene la fecha/hora actual del sistema
System.out.println(hoy);
LocalDate.of(2026,4,2); //Crea una instancia a partir de valores especificos (o más sencillo una fecha)
//(Caso contrario devuelve una excepción)
LocalDate.parse("2026-04-02"); //Convierte un texto (String) en un objeto de fecha
//(Caso contrario devuelve una excepción)
LocalDate.from(LocalDateTime.now()); //Crea una instancia a partir de otro objeto temporal
//Estos metodos pueden ser muy quisquillosos
	}
}
