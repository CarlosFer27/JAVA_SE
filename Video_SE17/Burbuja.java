package Video_SE17;
import java.util.Scanner;

public class Burbuja {
	
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		
		System.out.println("De que tamaño quieres tu arreglo:");
		int tamanio =leer.nextInt();
		
		int[] edades = new int[tamanio];
		
		for (int contLlenado=0; contLlenado<tamanio; contLlenado++){
			System.out.println("Ingresa la edad:");
			edades[contLlenado]=leer.nextInt();
		}
		
	/*	int contValor=0;
		for(int llenado: edades){
			System.out.println("El valor de la posicion "+contValor+" es "+llenado);
			contValor++;
		}*/
		
		int auxiliar =0;
		
		for (int contRecorrido=0; contRecorrido<(edades.length-1); contRecorrido++){
			for (int barrido=0; barrido<(edades.length-1); barrido ++){
				if (edades[barrido] > edades[barrido +1] ){
				auxiliar=edades[barrido];
				edades[barrido]=edades[barrido+1];
				edades[barrido+1]=auxiliar;
				}
			}
		}
		for(int llenado: edades){
			System.out.println(llenado);
		}
		
	}
	
}
		
		
		
	

