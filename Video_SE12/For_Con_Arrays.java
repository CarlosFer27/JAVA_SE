package Video_SE12;

public class For_Con_Arrays {
	public static void main(String[] args){
		
		String[] lista = {"Fer","Jacke","Luz","Shrek"};
		
		System.out.println(lista); // Aqui nos va a imprimir el id con el que Java guardo nuestro array
		
		for(int contador=0;contador<lista.length;contador++){
			//Si aquí jugamos con el contador, se van a impimir los valores desde la posicion que indiques en el contador
			System.out.println("Valor de la lista: "+contador+" "+lista[contador]);
			
		}
		
	}

}
