package operadores;

public class Operadores { 
	public static void main(String[] args) {
		//Operadores Aritmeticos 
		//+, -, /, *, %
		int a = 10; 
		int b = 20; 
		int c = 10;
		
		//suma 
		int suma = a + b; 
		System.out.println(suma);
		
		String strl = "El resultado de la suma es: ";
		System.out.println(strl + suma);
		
		//Resta 
		System.out.println("El resultado de la resta" + ( a - b));
		
		//division 
		int division= a / b;
		System.out.println("El resultado de la division es" + division); 
		
		double division2 = (double) a/b; // el casteo es porque anteriormente no habiamos declarado double en estas variables, de lo contrario es posible hacerlo son el casteo  
        // por lo menos uno de los datos debe ser de tipo double
		// 10.0 / 20 = 0.5 es el resultado correcto 
		System.out.println("El resultado de la division es:" + division2);
		
		//multiplicacion 
		double multiplicacion = c * a; 
		System.out.println("El resultado de la multiplicacion es:" + multiplicacion);
		
		//modulo
		int modulo = a % b; 
		System.out.println("El modulo de la operacion es:" + modulo);
		
		/*
		 * Operador de asignacion, es el igual 
		 *  =
		 */ 
		
		int d = 5, e; //inicializar variables vacias 
		e = 6;
		System.out.println(d + " - " + e);
		
		//Operadores de declaracion compuesta 
		// +=, -=, *=, %=
		//una operacion simplificada 
		
		int f = 0, g = 5;
		
		f += 5; 
		// f = f + 5, lo de arriba es una simplificacion de esto 
		
		System.out.println(f); 
		
		//Operadores relacionales 
		/* <, >, <=, >=
		 * == igualdad 
		 * != diferencia 
		 * Resultado en un valor tipo boolean/ booleano (true, false) */
		 
		 int h = 15, i = 25; 
		 String j = "Hola"; 
		 
		 System.out.println(h>i); //false 
		 System.out.println(i != h);
		 //System.out.println(i != j); // Este error es porque nos valores distintos y no se pueden comparar 
		 
		 //Operador Uniario 
		 
		 /* ++, --
		  * preasignacion -- ++k Se le asigna un valor antes de usarse 
		  * postasignacion -- k++ primero lee el valor y despues le suma 1 
		  */ 
		 
		 int k =0, l =0; 
		 k++; //post asignacion le suma el 1 
		 System.out.println(k); 
		 System.out.println(--l);
		 
		 //Precedencia de operadores  
		 
		 int operacion = 4 + 5 * 6 / 3; // 14 poner bien el orden de los operadores 
		 //  5 * 6 = 30
		 // 30 / 3 = 10 
		 // 4 + 10 = 14
		 
		 
		 System.out.println(operacion);  
		 
		 int x = 0, y = 0; 
		 int operacion2 = ++x + y--; 
		 // x = 1, y = 0; 
		 System.out.println(operacion2);  
		 
		 //Operador ternario 
		  
		 int edad = 19, valor1 = 0, valor2 = 1; 
		 
		 int resultado = (edad <= 18) ? (valor1 = 2): (valor1 = 3);
		//Los parentesis son opcionales, aunque es recomendable siemrpe ponerlos
		 
		 String resultado1 = (edad <= 18) ? "Uno" : "dos"; 
		 System.out.println(resultado1);
		 
		 //Operadores lógicos 
		 //And - &&
		 //or -||
		 //Nor !
		 
		 
	}

}
