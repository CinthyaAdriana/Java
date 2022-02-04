import java.util.Scanner;

public class EjercicioDescuentos { 
	public static void main(String[] args) {
		// solicitar el total de una compra por consola.
				// si la cuenta es de menos de 1000 no hay descuento 
				// sila cuenta es de 1001 - 4999 10%
				// si la cuenta es de 5001 a 9999 20%
				// si la copra es de 10000 o más 30%
		// imprimir el total con los descuentos incluidos 
		
		System.out.println("Introduce el total de tu compra");
		Scanner compra = new Scanner (System.in); 
		float total = 0; 
		int descuento = 0; 
		int compras = (int)compra.nextFloat();
		
		 
		if (compras <= 1000) {
			System.out.println("No hay descuento"); 
			} else if(compras >= 1000 && compras < 5000) { 
				total = (float) (compras * 0.10);
				descuento = 10; 
				System.out.println("Descuento de " + total);
			}else if(compras >= 5000 && compras < 10000) {
				total = (float) (compras * 0.20);
				descuento = 20;
				System.out.println("Descuento de " + total);
				
			}else if (compras >= 10000) {
				total = (float)(compras * 0.30); 
				descuento = 30;
				System.out.println("Descuento de " + total);
			}
	          
				}
				
		
		
	}
		
		
		
		
