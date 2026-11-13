package ejemplosbreakcontinue;

public class EjemploBreakEtiqueta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i = 0;
	buclesalir: while (i<100) {
		i++;
			for (int j=0; j<1;j++) {
				System.out.println("*");
				if(i == 5) {
					break buclesalir; //Rompe el bucle inicial caso contrario te saca del ultimo bucle
				}
			}
			System.out.println("Fuera del for");
	}
	System.out.println("Fuera del bucle principal");
	}
}
