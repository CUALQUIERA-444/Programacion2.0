package practica5;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,resultado;
		char operacion;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce número:");
		a=sc.nextInt();
		System.out.println("Introduce segundo número:");
		b=sc.nextInt();
		System.out.println("Introduce operación (S/R/D/P):");
		sc.nextLine(); //Estoy limpiando el buffer. Siempre limpio cuando después de leer
		               //un número leo un caracter
		operacion=sc.nextLine().charAt(0);
		switch(operacion) {
		 case 's':
		 case 'S':
			 resultado=a+b;
			 System.out.println("La suma es:"+ resultado);
			 break;
		 case 'r':
		 case 'R':
			 resultado=a-b;
			 System.out.println("La resta es:"+ resultado);
			 break;
		 case 'D':
		 case 'd':
			 resultado=a/b;
			 System.out.println("La divison es:"+resultado);
			 break;
		 case 'P':
		 case 'p':
		 case 'M':
		 case 'm':
			 resultado=a*b;
			 System.out.println("El producto es:"+resultado);
			 break;
		 default:
			 System.out.println("Error, operación incorrecta");
			 
		}
		

	}

}
