package practicasString;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dni;
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		String regex="[0-9]{8}[A-Za-z]";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce dni:");
		dni=sc.nextLine();
		
		if (!dni.matches(regex))
			System.out.println("Formato incorrecto");
		else {
			int num=Integer.parseInt(dni.substring(0,8));
			//System.out.println(num);
			int resto=num%23;
			//System.out.println(resto);
			char letra=letras.charAt(resto);
			if (letra==dni.charAt(8))
				System.out.println("Correcto");
			else
				System.out.println("Letra incorrecta");
		}
		
		

	}

}
