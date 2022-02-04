package operadores;

import java.util.Scanner;

public class ScannerYBuffer { 
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce un numero");
		int numero1 = sc.nextInt();
		sc.nextLine();
		System.out.println("	Tu nombre es: " + nombre + ". Tu numero es:"+ numero1);
		int numero2 = sc.nextInt(); 
		//System.out.println("Numero1:" + numero1 + "Numero 2:" + numero2);
		
		
	}

}
