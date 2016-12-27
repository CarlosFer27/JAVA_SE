package Video_SE13;
import java.util.Scanner;

public class DoWhile_String {
	public static void main(String[] args){
		
		String usuario;
		
		do {
			Scanner leer= new Scanner(System.in);
			System.out.println("Ingresa usuario: ");
			usuario=leer.next();
		}while(!usuario.equals("CarlosFer27"));
	}

}
