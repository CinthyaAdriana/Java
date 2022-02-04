import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) { 
		/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el
		 * número mayor
		 * */

		
		System.out.println("Introduce el primer numero");
		Scanner primernumero = new Scanner (System.in); 
		int numero1 = primernumero.nextInt(); 
	
		int segundonumero;
		if(numero1 >= 25) {
		System.out.println("Es mayor");
		} else { 
			System.out.println("Es menor"); 
		}
		
		
		System.out.println("Introduce el segundo numero");
		Scanner numerosegundo = new Scanner (System.in); 
		int numero2 = numerosegundo.nextInt();  
		
		int tercernumero;
		if(numero2 >= 85) {
		System.out.println("Es mayor");
		} else { 
			System.out.println("Es menor"); 
		}
		
		System.out.println("Introduce el tercer numero");
		Scanner numerotercero = new Scanner (System.in); 
		int numero3 = numerotercero.nextInt();
		
		int numerotres;
		if(numero3 >= 100 ) {
		System.out.println("Es mayor");
		} else { 
			System.out.println("Es menor"); 
		}
		
		
	}
	
	


} 


