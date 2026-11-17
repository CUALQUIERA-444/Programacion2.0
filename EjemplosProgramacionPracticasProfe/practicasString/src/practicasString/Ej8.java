package practicasString;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1,cad2;
		int pos;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce cadena:");
		cad1=sc.nextLine();
		System.out.println("Introduce otra cadena:");
		cad2=sc.nextLine();
		
		if (cad1.length()>cad2.length()) {
			pos=cad1.indexOf(cad2);
			if (pos==-1)
				System.out.println("La cadena \""+cad2+"\" no está incluida en \""+cad1+"\"");
			else
				System.out.println("La cadena \""+cad2+"\" está en la posición "+pos+" de \""+cad1+"\"");		
		}
		else {
			pos=cad2.indexOf(cad1);
			if (pos==-1)
				System.out.println("La cadena \""+cad1+"\" no está incluida en \""+cad2+"\"");
			else
				System.out.println("La cadena \""+cad1+"\" está  en la posición "+pos+" de \""+cad2+"\"");	
		}

	}

}
