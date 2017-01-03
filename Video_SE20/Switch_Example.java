package Video_SE20;
import java.util.Scanner;

public class Switch_Example {
	public static void main(String[] args){
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Selecciona una opcion: ");
		System.out.println("\t 1) Jacqueline");
		System.out.println("\t 2) Fernanda");
		System.out.println("\t 3) Carlos");
		
		
		int opcion= leer.nextInt();
		
		
		switch (opcion){
		
		case 1 :
			System.out.println("Hola Flaquita bonita");
			break;
			
		case 2 :
			System.out.println("Hola mi chinita, mi niña, mi princesa");
			break;
			
		case 3 : 
			System.out.println("Hola panzon");
			break;
			
			default:
				System.out.println("Tu no eres de mi familia");
				
		
		}
		
		
		
	}
	

}
