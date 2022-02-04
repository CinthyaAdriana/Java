import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main(String[] args) { 
		//Pedirle 3 ángulos a un usuario
		//y decirle si es un triangulo válido 
		
		System.out.println("Introduce el primer angulo");
		Scanner primernumero = new Scanner (System.in); 
		int NumeroUno = primernumero.nextInt(); 
		
		System.out.println("Introduce el segundo angulo");
		Scanner segundonumero = new Scanner (System.in); 
		int NumeroDos = primernumero.nextInt();  
		
		System.out.println("Introduce el tercer angulo");
		Scanner tercernumero = new Scanner (System.in); 
		int NumeroTres = primernumero.nextInt();  
		
		int suma = NumeroUno + NumeroDos + NumeroTres;
		
		if(suma == 180 ) {
			System.out.println("Es un triangulo");
		} else { 
			System.out.println( "No es un triangulo");
		}


	}
}
