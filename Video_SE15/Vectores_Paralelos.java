package Video_SE15;

import java.util.Scanner;

public class Vectores_Paralelos {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantas personas son?");
		int noPersonas=entrada.nextInt();
		//Aquí retomamos el ejemplo del ejercicio anterior para hacer dos vectores dinamicos
		String[] nombres = new String[noPersonas];
		int[] edades = new int[noPersonas];
		
		for(int contador=0; contador<noPersonas; contador++){
			
			System.out.println("Ingresa tu nombre: ");
			nombres[contador]=entrada.next();
			
			System.out.println("Que edad tienes?");
			edades[contador]=entrada.nextInt();
			//llenamos los valores con datos ingresados desde el teclado
		}
		
		System.out.println("\n***********************");
		System.out.println("***   Bienvenidos   ***");
		System.out.println("***********************\n");
		
		for (int contador=0; contador<noPersonas;contador++){
			System.out.println(nombres[contador]+" "+edades[contador]);
			//Imprimimos nuestros arreglos
		}
		
		
	}

}
