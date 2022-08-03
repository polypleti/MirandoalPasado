package cl.fsj.infoclub;

import java.util.LinkedList;
import java.util.Queue;

public class JuegosQueue {
	public void juegos () {
	
	Queue <String> juegos = new LinkedList<>();
	
	juegos.add("Tombo");
	juegos.add("Congelado");
	juegos.add("Quemaditas");
	juegos.add("Cachipun");
	juegos.add("Pillarse");
	
	System.out.println("Juegos:"+juegos);
	System.out.println("Total: "+juegos.size());
	
	}
}
