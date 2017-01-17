package Video_SE32;

import java.util.Calendar;

public class Calendario {
	
	public static void main(String[] args){
		
		Calendar calendario = Calendar.getInstance(); //Este es un metodo de clase (de Calendar que es una clase abstracta)
		
		int anio=calendario.get(Calendar.YEAR); //Es una variable estatica de Calendar
		
		System.out.println(anio);
	}

}
