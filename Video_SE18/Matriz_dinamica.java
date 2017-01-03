package Video_SE18;
import java.util.Scanner;

public class Matriz_dinamica {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("De cuantas filas quieres tu matriz?");
		int numFilas=entrada.nextInt();
		System.out.println("De cuantas columnas quieres tu matriz?");
		int numColumnas=entrada.nextInt();
		
		int matriz [][] = new int [numFilas][numColumnas];
		
		for(int fila=0; fila<numFilas; fila++){
			for(int columna=0; columna<numColumnas; columna++){
				System.out.println("Ingresa el valor de la Fila: "+fila+" Columna: "+columna);
				matriz[fila][columna]=entrada.nextInt();
			}
			
		}
		
		for(int impFila=0; impFila<numFilas; impFila++){
			for(int impColumna=0; impColumna<numColumnas; impColumna++){
				System.out.print(matriz[impFila][impColumna]+"\t");
			}
			System.out.print("\n");
		}
	}

}
