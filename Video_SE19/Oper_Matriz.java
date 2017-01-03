package Video_SE19;
import java.util.Scanner;

/*
 *  Ejercicio para imprimir solo la diagonal de una matriz dinamica
 *  
 */

public class Oper_Matriz {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int numFilas, numColumnas;
		
		System.out.println("De cuantas Filas quieres tu martiz?");
		numFilas=leer.nextInt();
		
		System.out.println("De cuantas Columnas quieres tu matriz?");
		numColumnas=leer.nextInt();
		
		int matriz[][] = new int[numFilas][numColumnas];
		
		for(int llenFila=0; llenFila<numFilas; llenFila++) {
			for(int llenColumna=0; llenColumna<numColumnas; llenColumna++ ){
				System.out.println("Ingresa el valor de la Fila: "+llenFila+" Columna: "+llenColumna);
				matriz[llenFila][llenColumna]=leer.nextInt();
			}
		}
		
		
		for(int impFila=0; impFila<numFilas; impFila++){
			for(int impColumna=0; impColumna<numColumnas;  impColumna++){
				if(impFila==impColumna){
					System.out.print(matriz[impFila][impColumna]+"\t");
				}else{
					System.out.print(0+"\t");
				}
				
			}
			
			System.out.print("\n");
		}
		
	}

}
