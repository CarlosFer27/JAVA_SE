package Video_SE14;

public class Vector {
	public static void main (String[] args){

		String[] arreglo = new String[2]; //Aquí estamos declarando un arreglo de 2 posiciones
		
		arreglo[0]="Fernanda"; //Se ingresa el valor de la posicion 0 del arreglo
		arreglo[1]="Flaca"; // Se ingresa el valor de la posicion 1 del arreglo
		
		int contador = 0; //Declaramos un contador para poder imprimir el numero de las posiciones 
		
		for(String contenidoArreglo : arreglo){ //Utilizamos un for each para imprimir el contenido del arreglo
			
			System.out.println("La posicion "+contador+" tiene el valor: "+contenidoArreglo);
			contador ++;
		}
			
	}

}
