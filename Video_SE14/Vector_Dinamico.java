package Video_SE14;
import java.util.Scanner;

public class Vector_Dinamico {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in); //creamos un scanner para poder recibir los valores del teclado
		
		System.out.println("Ingresa el tamaño del arreglo:");
		int tamanioArreglo=entrada.nextInt(); //Guardamos en una variable el tamaño de nuestro arreglo
		
		String[] arreglo = new String[tamanioArreglo]; //creamos nuestro arreglo con la variable del tamaño que recibimos por teclado
		
		for(int contador=0;contador<tamanioArreglo; contador++){//creamos un for tradicional con un contador que nos va a permitir tener el control de las posiciones de nuestro arreglo 
			
			System.out.println("Ingresa el valor de la posicion "+contador+":");
			arreglo[contador]=entrada.next();//asignamos el valor insertado por teclado a la posicion del arreglo que se lleve en ese momento
		}
		
		System.out.println("\n***************************************");
		System.out.println("***   El contenido de tu arreglo es   ***");
		System.out.println("***************************************\n");
		
		int contadorContenido=0;
		for(String contenido : arreglo){
			System.out.println("El valor de la posicion "+contadorContenido+" es: "+contenido);
			contadorContenido++;
			//Aqui como en tutoriales pasados utilizamos un for each para la impresion del contenido de nuestro arreglo
		}
		
	}

}
