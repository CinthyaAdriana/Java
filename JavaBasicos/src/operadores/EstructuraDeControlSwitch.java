package operadores;

import java.util.Scanner;

public class EstructuraDeControlSwitch {

	
	//Estructuras de control nos sirve para controlar el flujo de 
		// comportamiento de un programa. Para la toma de decisiones
		
		/*
		 switch(condicion_a_evaluar) {
		 	case "valor": 
		 		//codigo a ejecutar
		 		// break;
		 	...
		 	case "n":
		 		//codigo a ejecutar
		 		// break;
		 	default:
		 		// codigo a ejecutar
		 }
		 * 
		 */

	
	public static void main(String[]args) {
		System.out.println("Introduce un dia de la semana y recibe un bonito mensaje :)");
		Scanner sc = new Scanner(System.in); 
		String dia = sc.nextLine(); 
		
		//Solicitar al usuario un dia de la semana y
		//mostrar mensaje 
		
		
		switch(dia.toLowerCase()) {
		case "lunes": 
			System.out.println("Ya mero es viernes, toma un cafe");
			break; 
		case "martes":
			System.out.println("Lunes chiquito.Esta cansado, pero ya casi"); 
			break; 
		case "miercoles":
			System.out.println("Miercoles, pero a que costo"); 
			break;
		case "jueves": 
			System.out.println("Juebebes de sed peligrosa"); 
			break;
		case "viernes": 
			System.out.println("Viernes de fiesta hasta morir");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Basta de trabajacion");
			break;
			default: 
				System.out.println("Dia desconocido, Kha");
			
			
	}
		
	
	
	}
	
	
}
