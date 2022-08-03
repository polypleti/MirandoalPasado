package cl.fsj.infoclub;

import java.util.ArrayList;

public class MarcasList {
	
	public void marcasLista() {
		ArrayList<String> marcas = new ArrayList<String>();
		marcas.add("Blokbaster");
		marcas.add("Carrefour");
		marcas.add("Daewoo");
		marcas.add("Derby");
		marcas.add("Vine");
		marcas.add("Theranos");
		marcas.add("Modell's");
		marcas.add("Alta Motors");
		marcas.add("Pebble");
		marcas.add("Compaq");
	
		System.out.println("-Marcas desaparecidas del pasado-\n"+marcas);
	
		System.out.println("\n-Se corrige BlockBuster estaba mal escrito-");
	
		marcas.set(0,"Blockbuster"); 
	
		System.out.println(marcas);
		System.out.println("\n-Se elimina Carrefour de la lista, la marca aun existe");	
		marcas.remove("Carrefour"); 
	
		System.out.println(marcas);
	
		ArrayList<String> posiblesMarcas = new ArrayList<String>();
		posiblesMarcas.add("Coca Cola");
		posiblesMarcas.add("Pepsi");
		posiblesMarcas.add("Marquis");
		posiblesMarcas.add("Chanelle");
		posiblesMarcas.add("Soprole");
		System.out.println("\n-Se incorporan posibles marcas a collecion marcas");
		marcas.addAll(posiblesMarcas); 
	
		System.out.println(marcas);
	
		System.out.println("\nLa cantidad total de marcas es: "+marcas.size());
	
	}
}