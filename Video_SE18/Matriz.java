package Video_SE18;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		
		//Declaracion de una matriz de 3 x 3
		int [][] matriz = new int [3][3];

		//llenado de la matriz
		for (int filas=0; filas<3; filas++ ){
			for (int columnas=0; columnas<3; columnas++){
				System.out.println("Ingresa el valor de la fila: "+filas+" columna: "+columnas);
				matriz[filas][columnas]=leer.nextInt();
			}
			
		}
		
		//Impresion de la matriz
		for (int impFilas=0; impFilas<3; impFilas++){
			for (int impColumnas=0; impColumnas<3; impColumnas++){
				System.out.print(matriz[impFilas][impColumnas]+"\t"); //Se va a ir imprimiendo y se separa por un tabulador
			}
			System.out.print("\n"); //Cuando termina el for de las columnas se imprime un salto de linea para darle forma de la matriz
		}
		
		
		
		
	}

}
