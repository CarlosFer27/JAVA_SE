package Video_SE17;
import java.util.Scanner;

public class Burbuja {
	
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		
		System.out.println("De que tamaño requieres tu arreglo?");
		int tamanio = leer.nextInt();
		
		int[] numeros = new int[tamanio];
		
		for (int contLlenado=0; contLlenado<tamanio; contLlenado++){
			System.out.println("Ingresa valor: ");
			numeros[contLlenado] =leer.nextInt();
		}
		/* validador de llenado de arreglo
		int contImpresion=0;
		for (int valor: numeros){
			System.out.println("El valor de la posicion "+contImpresion+" es "+valor);
			contImpresion++;
		}*/
		
		
		
		
	}

}
