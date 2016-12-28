package Video_SE16;
import java.util.Scanner;

public class Encontrar_Menor {
	public static void main(String[] args){
		
		Scanner leer= new Scanner(System.in);
		
		System.out.println("De que tamaño van a ser tus arreglos:");
		int tamanio=leer.nextInt();
		
		String[] nombres = new String[tamanio];
		int[] edades = new int[tamanio];
		
		//Vamos a llenar los arreglos
		
		for(int contLlenado = 0; contLlenado<tamanio; contLlenado++){
			
			System.out.println("Ingresa tu nombre: ");
			nombres[contLlenado]=leer.next();
			
			System.out.println("Ingresa tu edad: ");
			edades[contLlenado]=leer.nextInt();
		}
		
	/*	//IMPRESION DE CONTENIDO DE LOS ARREGLOS (SOLO PARA CORROBORAR)
		for(int contador=0; contador<tamanio; contador ++){
			System.out.println(nombres[contador]+" "+edades[contador]);
		}
	eSTE FOR SE COMENTA YA QUE SOLO LO UTILICE PARA VALIDAR SI SE LLENARON LOS ARREGLOS	
	*/
		int comparar=edades[0];
		int posicion=0;
		
		for (int contadorComp=0; contadorComp<tamanio; contadorComp++){
			if (comparar>edades[contadorComp]){
				comparar=edades[contadorComp];
				posicion=contadorComp;
			}
		}
		
		System.out.println(nombres[posicion]+" es el menor con "+edades[posicion]+" años");
		
	}
	
}
