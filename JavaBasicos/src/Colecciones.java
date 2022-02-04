import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
 public static void main(String[]args) {
	 
	 /*Las colecciones nos sirven para almacenar 
	  * un conjunto de objetos 
	  */
	 //La diferencia de las colecciones y objetos 
	 //es que las colecciones son dinamicas, pueden cambiar  
	 // el numero de objetos agregados. 
	 
	 //Coleccion Set 
	 
	 //Set tiene 3 implementaciones, el set no puede contener elementos repetidos
	 
	 //HashSet 
	//los elementos no mantienen un orden 
	// Es la implementacion mas rapida 
	 /*Set <String> frutas = new HashSet<String>();
	 frutas.add("mango");
	 frutas.add("granada");
	 frutas.add("piña"); 
	 frutas.add("sandia"); 
	 frutas.add("mamey"); 
	 frutas.add("fresa"); 
	 
	 
	 
	 //foreach, puede recorrer una coleccion y en cada 
	 // recorrido recupera el valor y lo podemos almacenar 
	 //en una variable: 
	 //Sintaxis 
	 //for(tipoDeDatoElemento variable : elementoARecorrer)
	 for(String fruta : frutas) {
		 System.out.println(fruta); 
		 
	 }*/
 
	//TreeSet 
	//Esta implementacion ordena los elementos en funcion 
	// de sus valores 
	//Por ende es la implementacion mas lenta 
	 
 /*Set<String> frutas = new TreeSet<String>();
 frutas.add("mango");
 frutas.add("granada");
 frutas.add("piña"); 
 frutas.add("sandia"); 
 frutas.add("mamey"); 
 frutas.add("fresa"); 
 
 for(String fruta : frutas) {
	 System.out.println(fruta); 
	 
 }*/
 
		 //LinkedHashSet 
	 // Ordena los elementos en orden de insercion 
	 //es mas costoso (osea menos rapido) que HashSet
	 
	 
	 
	 /*Set<String> frutas = new LinkedHashSet<String>();
	 frutas.add("mango");
	 frutas.add("granada");
	 frutas.add("piña"); 
	 frutas.add("sandia"); 
	 frutas.add("mamey"); 
	 frutas.add("fresa"); 
	 
	 for(String fruta : frutas) {
		 System.out.println(fruta); 
		 
	 } */
	 
	 //List
	 // se permiten elementos duplicados 
	 // acceder a elementos especificos 
	 //buscar elementos 
	 
	 //ArrayList
	 
	 List<String> pokemones = new ArrayList<String>();
	 pokemones.add("chicorita"); 
	 pokemones.add("Eevee"); 
	 pokemones.add("patamon"); 
	 pokemones.add("Dragonite"); 
	 pokemones.add("Charizard"); 
	 pokemones.add("Gengard");
	 pokemones.add("Flygon"); 
	 
	 
	 //add si agregamos un indice y un elemento, posiciona 
	 // el elemento en el indice y realiza un desplazamiento 
	 // es decir no borra un elemento en la posicion sino 
	 // que lo desplaza
	 pokemones.add(2, "Pikachu"); //se hace una inseción y le ordenamos en que lugar queremos que aparezca 
	 
	 //remove, remueve el elemento de la posicion especificada 
	 pokemones.remove(5);
	 
	 //set reemplaza el elemento en la posicion que especifiquemos 
	 
	 pokemones.set(0, "Oddish");
	 
	 for(String pokemon : pokemones) {
		 System.out.println(pokemon);
	 }
	 
	 System.out.println("********************************");
	 System.out.println(pokemones.get(4)); //acceder a los elementos especificos como si fuera un arreglo
	 
	 //indexOf, nos va a devolver la posicion del elemento 
	 // y si el elemento no se encuentra nos devuelve -1 
	 
	 System.out.println(pokemones.indexOf("Gengard")); //si lo encuentra nos devuelve la posicion 
	 
	 System.out.println("**********************************"); 
	 
	 
	 //LinkedList, para carga de trabajos muy grandes en ese caso resulta mas eficiente  
	 //Es una lista doblemente enlazada 
	 // Es mas rapido para insertar y remover elementos 
	 List<String> digimones = new LinkedList<String>();
	 digimones.add("Agumon");
	 digimones.add("Patamon"); 
	 digimones.add("Angemon"); 
	 digimones.add("Andromon");
	 digimones.add("Greymon");
	 
	 //Colecciones Map 
	 //Asocia claves a valores, 
	 //No puede contener claves duplicadas
	 //Solo puede tener un valor asociado 
	 
	 //HashMap 
	 //Tiene mejor rendimiento, pero no garantiza un orden 
	 // a la hora de hacer iteraciones. 
	 
	 Map<Integer, String> usuarios = new HashMap<Integer, String>();
	 usuarios.put(1123, "Carlos Eduardo");
	 usuarios.put(3242, "Raul"); 
	 usuarios.put(3243, "Ro");
	 //HashMao no acepta claves duplicadas 
	 
	 System.out.println(usuarios.get(1123)); //clave con al que podemos llamar un elemento 
	 
	 //keySet
	 //Nos permite recuperar el nombre de la clave 
	 System.out.println(usuarios.keySet());
	 //values 
	 //Nos muestra todos los valores que hat en el HashMap 
	 System.out.println(usuarios.values());
	 
	 //TreeMap 
	 Map<Integer, String> tamales = new TreeMap<Integer, String>();
	 tamales.put(5, "Mole Rojo");
	 tamales.put(9, "Mole verde");
	 tamales.put(160, "Gansito"); 
	 tamales.put(1, "cochinita");
	 
	 System.out.println("********************************************************");
	 System.out.println(tamales.keySet());
	 System.out.println(tamales.values());
	 
	 System.out.println(tamales);
	 
	 tamales.entrySet().forEach(elemento ->{ 
	 System.out.println(elemento.getKey());
	 System.out.println(elemento.getValue());
	 
	 });
	 
	 //LinkedHashMap
	Map<Integer,String> carros = new LinkedHashMap<Integer,String>(); 
	//Guarda los elementos, segun 
	carros.put(1, "Volvo");
	carros.put(567, "Pointer");
	carros.put(8, "Mustang");
	
	System.out.println("****************************************"); 
	System.out.println(carros.keySet());
	System.out.println(carros.values());
	 
	 
	 }
	 
}
 
 
 
	

