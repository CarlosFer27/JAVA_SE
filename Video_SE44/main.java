package Video_SE44;
import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		int edad= leer.nextInt();
		final int EDAD_MAXIMA=100;
		
		try{
			if(edad < EDAD_MAXIMA){
				System.out.println("Bienvenido");
			}else{
				throw new ExcepcionPersonalisada("Edad mayor a la permitida");
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
