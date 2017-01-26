package Video_SE39;
import java.util.HashMap;
public class Mapa {
	public static void main(String[] args){
		
		HashMap mapa = new HashMap();
		
		mapa.put(1, "Fernanda");
		mapa.put(2, "Jacke");
		mapa.put(3, "Luz");
		mapa.put(4, "Shrek");
		mapa.put(5,"Muñeka");
		
		for (int cont=1; cont <= mapa.size(); cont++){
			System.out.println(mapa.get(cont));
			
		}
		
		
		//Para eliminar un elemento del mapa utilizamos el metodo remove
		//mapa.remove(6);
	}

}
