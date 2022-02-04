package operadores;

public class Ciclos {
public static void main(String[] args) {
	//while
	/*
	int control = 0;
	
	while(control < 10) {
		System.out.println("control =" + control);
		control++;
	}*/
	
	
	//do while 
	/*
	int control = 3; 
	
	do {
		//codigo a ejecutar 
		System.out.println("control =" + control);
		// modificador de la variable control 
		control++;
	}while(control < 3); */
	
	
	//for 
	/*
	for(int i = 0;i < 3;i++){
		System.out.println("control =" + i);
	}*/
	
	/* //break & continue 
	for(int i = 0;i < 10;i++){ //solo se ejecuta cuando el valor de i sea numero par
		if(i % 2 == 0) {
		System.out.println("Control =" + i);
		break; //termina el ciclo 
		//solo deja que se ejecute */
	
	for(int i = 0;i < 10;i++){ //solo se ejecuta cuando el valor de i sea numero par
		if(i % 2 == 0) {
		
			continue; //permite saltarnos una ejecucion del ciclo
			//deja que continue el ciclo 
			
  }
	System.out.println("Control =" + i);
}
	/*
	for(int i = 0;i < 3;i++) {
		System.out.println("Control2 =" + i);
		continue;
	}*/
	
}

}

