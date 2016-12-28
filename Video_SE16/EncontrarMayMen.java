package Video_SE16;

import java.util.Scanner;

public class EncontrarMayMen {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantas personas son?");
		int noPersonas=entrada.nextInt();
		//Aquí retomamos el ejemplo del ejercicio anterior para hacer dos vectores dinamicos
		String[] nombres = new String[noPersonas];
		int[] edades = new int[noPersonas];
		
		//LLENANDO EL ARREGLO
		for(int contador=0; contador<noPersonas; contador++){
			
			System.out.println("Ingresa tu nombre: ");
			nombres[contador]=entrada.next();
			
			System.out.println("Que edad tienes?");
			edades[contador]=entrada.nextInt();
	
		}
		
		//ENCONTRANDO EL VALOR MAYOR O MENOR DEL ARREGLO EDADES
		
		int comparar =edades[0];
		int posicion =0;
		
		for (int contValorMay=0; contValorMay<noPersonas; contValorMay++){
			
			if(comparar < edades[contValorMay]){
				comparar=edades[contValorMay];
				posicion=contValorMay;
			}
		}
		
		System.out.println("El de valor mayor es: "+comparar);
		System.out.println("Su nombre es: " +nombres[posicion]);
		
		
		
		
	}

}
