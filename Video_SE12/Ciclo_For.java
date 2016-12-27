package Video_SE12;
import java.util.Scanner;

public class Ciclo_For {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Cuantas repeticiones quieres?");
		int repeticiones = leer.nextInt();
		
		for (int contador=1;contador<=repeticiones; contador++){
			System.out.println("Repeticion No: "+contador);
		}
		
	}

}
