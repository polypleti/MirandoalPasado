package cl.fsj.infoclub;

import java.util.Map;
import java.util.TreeMap;

public class GolosinasMap {
	
	private TreeMap<String, Integer> golosinas = new TreeMap<String,Integer>();

	public GolosinasMap(TreeMap<String, Integer> golosinas) {
		this.golosinas = golosinas;
	}

	public TreeMap<String, Integer> getGolosinas() {
		return golosinas;
	}

	public void setGolosinas(TreeMap<String, Integer> golosinas) {
		this.golosinas = golosinas;
	}
	
	
	public void agregarGolosinas() {
		golosinas.put("Chocman", 100);
		golosinas.put("Trululu", 100);
		golosinas.put("Centella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-Miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tableton", 5);
	}
	 //Filtra el mapa creando uno nuevo con valores menores al que ingresa por parametro
	public TreeMap<String,Integer> filtrarGolosinas(int maximo) {
		TreeMap <String,Integer> mapaFiltrado = new TreeMap<String,Integer>();
		for(Map.Entry<String,Integer> entry : golosinas.entrySet()) {
			  String key = entry.getKey();
			  Integer value = entry.getValue();
			  if(value < 100)mapaFiltrado.put(key, value);
		}
		return mapaFiltrado;
	}
	
	
}
