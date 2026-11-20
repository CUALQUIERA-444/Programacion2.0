package ExamenJava;
//Antonio Aco Durand
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;


public class ExamenPatinetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Paso 1 identificar variables
	//Numero aleatorio de cada modelo 
	//Modelos super
	//Modelos básicos
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int basico = r.nextInt(4)+1;
	int minutos;
	int sup = r.nextInt(4)+1;
	LocalDate fecha_nacimiento = null;
	String fech;
	boolean fecha_valida = true;
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm");
	int edad;
	boolean alternativa;
	String tipo = "";
	String hor;
	String carnet_socio;
	LocalTime limite = LocalTime.of(23, 00);
	LocalTime hora = null;
	boolean hora_valida = true;
	double precio_alquiler;
	double recaudacion = 0; 
	double descuento;
	int contador_globalsup = 0;
	String regex = "^[A-Za-z]{3}-[0-9]{1,2}$";
	do {
		System.out.println("Stock básicos "+basico);
		System.out.println("Stock super "+sup);
	if(basico == 0 && sup == 0) {
		System.out.println("No queda stock terminando programa");
	}
	else {
	do {
	System.out.println("Introduce tu fecha de nacimiento");
	fech = sc.nextLine();
	try {
		fecha_nacimiento = LocalDate.parse(fech,p);
		if(fecha_nacimiento.isAfter(LocalDate.now())) {
			System.out.println("Usted no puede nacer despues vuelva a intentarlo");
			fecha_valida = false;
		}
		else {
			fecha_valida = true;
		}
	}
	catch (DateTimeParseException e) {
		System.out.println("Fecha no válida");
		fecha_valida = false;
	}
	} while (!fecha_valida);
	edad = calcularEdad(fecha_nacimiento);
	if(edad < 16) {
		System.out.println("No puede comprar SIGUIENTE!");
	}
	else {
		do {
		System.out.println("Introduce el tipo de patinete (Basico/Super)"); //Por el contexto no tendremos en cuenta la tilde
		tipo = sc.nextLine();
		if(!tipo.equalsIgnoreCase("Basico") && !tipo.equalsIgnoreCase("Super")) {
			System.out.println("El tipo no es valido");
		}
		} while (!tipo.equalsIgnoreCase("Basico") && !tipo.equalsIgnoreCase("Super"));
	if(tipo.equalsIgnoreCase("Basico")) {
		if(basico == 0) {
			System.out.println("No queda stock basico desea comprar el otro modelo? (true) o quiere cancelar? (false)");
			alternativa = sc.nextBoolean();
			sc.nextLine(); //Limpiar buffer Por si acaso
			if(alternativa) {
				sup--;
				contador_globalsup++;
			}
			else {
				System.out.println("MUY BIEN SIGUIENTE!");
				continue;
			}
		}
		else {
			basico--; //Se compra en caso contrario
		}
	}
	else if(tipo.equalsIgnoreCase("Super")) {
		if(sup == 0) {
			System.out.println("No queda stock super desea comprar el otro modelo? (true) o quiere cancelar? (false)");
			alternativa = sc.nextBoolean();
			if(alternativa) {
				basico--;
			}
			else {
				System.out.println("MUY BIEN SIGUIENTE!");
				continue;
			}
		}
		else {
			sup--; //Se compra en caso contrario
			contador_globalsup++;
		}
	}
	do {
		System.out.println("Introduce la hora en la que devolvera el patinete");
		hor = sc.nextLine();
		try {
			hora = LocalTime.parse(hor,h);
			if(hora.isAfter(limite)) {
				System.out.println("Se pasa de la hora vuelva a introducir la hora");
				hora_valida = false;
			}
			else {
			hora_valida = true;
			}
		}
		catch (DateTimeParseException e) {
			System.out.println("Hora no válida");
			hora_valida = false;
		}
		} while (!hora_valida);
	minutos = (int)ChronoUnit.MINUTES.between(LocalTime.now(),hora);
	precio_alquiler = calcularPrecioAlquiler(minutos,tipo);
	System.out.println("Introduzca su carnet de socio");
	carnet_socio = sc.nextLine();
	if(carnet_socio.matches(regex)) {
		String placeholder = carnet_socio.substring(carnet_socio.length()-2, carnet_socio.length());
		descuento = Double.parseDouble(placeholder);
		precio_alquiler = precio_alquiler - precio_alquiler * descuento / 100;
	}
	else if(!carnet_socio.matches(regex) && minutos > 180) {
		precio_alquiler = precio_alquiler - precio_alquiler * 10 / 100;
	}
	recaudacion += precio_alquiler;
	System.out.println("Importe total "+precio_alquiler+" euros");
	}
	}
	}
	while(basico > 0 || sup > 0);
	System.out.println("Recaudación total "+recaudacion+" euros");
	System.out.println("Cantidad alquiladas super "+contador_globalsup+" patinetas");
	}
	public static int calcularEdad(LocalDate fecha_nacimiento) {
		return (int)ChronoUnit.YEARS.between(fecha_nacimiento, LocalDate.now());
	}
	public static double calcularPrecioAlquiler(int minutos,String tipo) {
		final double basico_hora = 5, super_hora = 8;
		int resto = minutos % 60;
		int horas = minutos / 60;
		double precio = 0;
		if(resto > 0) { //Sobran 61
			if(resto > 60) {
			horas = horas + resto / 60;
			}
			horas = horas + 1;
		}
		if(tipo.equalsIgnoreCase("Basico")) {
			precio = horas * basico_hora;
		}
		else if(tipo.equalsIgnoreCase("Super")) {
			precio = horas * super_hora;
		}
		return precio;
	}
}
