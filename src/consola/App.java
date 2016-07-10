package consola;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		
//		listas
		List<String> lista = new ArrayList<>();
		lista.add("cadena1"); 
		lista.add("cadena2"); 
		lista.add("cadena3"); 
		
		for(String s: lista){
			System.out.println(s) ;
		}
		
		System.out.println(lista.toString().substring(1,26));
		
		//conjuntos
		Set<Integer> numeros = new HashSet<>();//No Garantiza ordenación
		numeros.add(3);
		numeros.add(1);
		numeros.add(2);
		numeros.add(1); //el repetido no se incluye en el conjunto
		numeros.add(null); //el repetido no se incluye en el conjunto
		
		System.out.println("Elementos del conjunto ordenado: " + numeros);
		//clase consola.App
		
		Set<Integer> numerosOrdenados = new TreeSet<>();//Garantiza ordenación
		numerosOrdenados.add(3);
		numerosOrdenados.add(1);
		numerosOrdenados.add(2);
		numerosOrdenados.add(1); //el repetido no se incluye en el conjunto
		
		System.out.println("Elementos del conjunto: " + numerosOrdenados);
		
		//Cambiamos ordenación al TreeSet, que ordene al revés
		Set<Integer> numerosOrdenados2 = new TreeSet<>(new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				int ret = 0;
				if (o1 < o2)
					ret = 1;
				else if (o1 == o2)
						ret = 0;
					else
						ret = -1;
				return ret;
			}
		});
		
		numerosOrdenados2.add(3);
		numerosOrdenados2.add(1);
		numerosOrdenados2.add(2);
		
		System.out.println("Elemento del conjunto ordenado 2: " + numerosOrdenados2);
		
		//mapas
		Map<Integer, Persona> personas = new TreeMap<>(); 
		personas.put(1, new Persona(1, "Pepito")); 
		personas.put(2, new Persona(2, "Manganito")); 
		personas.put(3, new Persona(3, "Juanito")); 
		
		System.out.println("Todo el contenido del mapa: "+personas);
		System.out.println("Todas las clave del mapa: "+personas.keySet());
		System.out.println("Todos los valores del mapa: "+personas.values());
		System.out.println("Una persona clave 2: "+personas.get(2));
		
		//Iterator
		Persona p = new Persona(10,"Persona 10");
		for(String cadena: p){
			System.out.println("PERSONA: " + cadena);
		}
		
		Iterator<String> it = p.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}//fin class consola.App
