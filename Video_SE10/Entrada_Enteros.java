package Video_SE10;
import java.util.Scanner;

public class Entrada_Enteros {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Hola, como te llamas?");
		String nombre = entrada.next();
		
		System.out.println("Que edad tienes?");
		int edad = entrada.nextInt();
		
		if(edad<10){
			System.out.println("Mucho gusto "+nombre+" eres aun muy niñ@");
		}else if(edad>=10 && edad<=20){
			System.out.println("Hola "+nombre+" ya eres un adolecente");
		}else {
			System.out.println("Hola "+nombre+", Ya eres todo un adult@");
		}
	}

}
