package operadores;

import java.util.Scanner;

public class CalculadoraSwitch {
	
	/*
	 *Pedir al usuario 2 numeros por consola y preguntarle que opracion desea realizar 
	 *1)Suma 
	 *2) Resta 
	 *3) Division 
	 *4) Multiplicacion 
	 *y despues imprimir el resultado  
	 */
	
	public static void main(String[]args){
		System.out.println("¿Que operacion deseas realizar suma, resta,  multiplizacion o division? ");
		Scanner sc = new Scanner(System.in);
	    int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int operacion = sc.nextInt();
		
		
		switch(operacion){
		case 1 :
			System.out.println(numero1 + numero2);
			break;
		case 2 :
			System.out.println(numero1 - numero2);
		break;
		case 3 :
			System.out.println(numero1 * numero2);
			break; 
		case 4 : 
			System.out.println(numero1 / numero2);
			break;
		}
	}
}
