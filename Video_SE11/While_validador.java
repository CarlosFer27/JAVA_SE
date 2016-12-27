package Video_SE11;
import java.util.Scanner;

public class While_validador {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
			
		String usuario="";
		
		while (!usuario.equals("CarlosFer27")){// en la condicion se esta poniendo ! para decir que sea distinto, el metodo equals, valida que sea el usuario o String CarlosFer27, pero con el ! es diferente a esa cadena
			System.out.println("Ingresa tu usuario: ");
			usuario=entrada.next();
			
			if(!usuario.equals("CarlosFer27")){
			System.out.println("Usuario invalido\n");}
		}
		
		System.out.println("\n Acceso Correcto, Hola Carlos");
		
		
	}

}
