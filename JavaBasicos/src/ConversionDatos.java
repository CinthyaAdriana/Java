
public class ConversionDatos { 
	
	public static void main(String[] args) {
		byte numeroByte = 10;
		
		short numeroShort = numeroByte;
		
		int numeroInt = numeroShort;
		
		long numeroLong = numeroInt; 
		
		int otroInt = (int) numeroLong; //hacer que este numero quepa en un ligar mas pequeño con Int, aunque no es tan remendable 
		
		short otroShort = (short) otroInt; 
		
		short numero1 = 123;
		short numero2 = 7343; 
		byte numero3 = 12; 
		byte numero4 = 33;
		
		short suma = (short) (numero1 + numero2); //Aqui le estamos indicando el tipo de dato que utilizaremos 
		byte suma2 = (byte)(numero3 + numero4); 
		int suma3 = (numero3 + numero4);
		short suma4 = (short) (numero1 +numero3);
		
		
	}

}
