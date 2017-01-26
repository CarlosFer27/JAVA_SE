package Video_SE44;
import java.util.Scanner;

public class main2 {
	
	public static void main(String[] args) throws ExcepcionPersonalisada{
		Scanner leer = new Scanner(System.in);
		final int EDAD_MAXIMA=100;
		
		System.out.println("Ingresa tu edad");
		int edad=leer.nextInt();
		
		if(edad<EDAD_MAXIMA){
			System.out.println("Bienvenido");
		}else{
			throw new ExcepcionPersonalisada("Edad mayor a la permitida"); //Aquí muestra la excepción pero como error en la consola
		}
		
	}

}
