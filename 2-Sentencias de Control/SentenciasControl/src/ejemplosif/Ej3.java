package ejemplosif;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 3. Añadir al programa anterior el código necesario para cobrar
	 *  una comisión del
		0,2% si cambiamos menos de 100$
	*/
	final double euro_fijo = 0.88 , comision = 0.2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce los dolares que quiera cambiar");
	double dolares = sc.nextDouble();
	double euros;
	if(dolares < 100) {
		euros = dolares * euro_fijo + dolares * comision / 100 ;
	}
	else {
		euros = dolares * euro_fijo;
	}
	System.out.println("La cantidad de euros es de "+euros+"€");
	}

}
