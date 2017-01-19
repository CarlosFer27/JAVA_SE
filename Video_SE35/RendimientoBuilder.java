package Video_SE35;

import java.util.function.ToIntFunction;

public class RendimientoBuilder {

	public static void main(String[] args){
		
		//////Rendimiento StringBuilder//////////
		
		long tiempoIni= System.nanoTime();
		StringBuilder textBuilder= new StringBuilder();
		
		for(int cont=1; cont<=100000; cont++){
			textBuilder.append(cont);
		}
		
		long tiempoFin=System.nanoTime();
		
		long difBuilder=tiempoFin-tiempoIni;
		
		System.out.println("El tiempo en nanosegundos que se tarda en concatenar el StringBuilder: "+difBuilder);
		
		//////Rendimiento String ////////////////////////////////////
		
		long inString = System.nanoTime();
		String string="";
		
		for(int contS=1; contS<100000; contS++){
			string+=contS;
		}
		
		long finString = System.nanoTime();
		
		long difString = finString-inString;
		
		
		System.out.println("El tiempo en nanosegundos que se tarda en concatenar el String: "+difString);
		
		long vecesMejor = (difString)/(difBuilder);
		
		System.out.println("El StringBuilder es "+vecesMejor+" veces mas rapido que el String");
		
		
		
	}
}
