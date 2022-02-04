import java.util.Scanner;

public class EstructuradDeControIf { 
	
	public static void main(String[] args) {
		//Estructuras de control de flujo 
	    //Nos sirve para la toma de decisiones 
		
		//Estructuras de control de flujo nos sirven para 
		//cambiar el flujo de nuestro programa 
		//evaluando una condicion y a partir de la evaluacion 
		//se realiza una acción u otra.   
		
		/*
		if(condicion) {
			codigo 
		} else {
			codifo
		}
		*/ 
		
		System.out.println("Introduce tu edad"); //Mensaje 
		Scanner sc = new Scanner (System.in); //declarando scaner 
		int edad = sc.nextInt(); //Leyendo el valor del scanner 
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else { 
			System.out.println("Eres menor de edad"); 
		}
		
	}

}
