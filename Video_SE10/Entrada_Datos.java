package Video_SE10;
import java.util.Scanner; //Se importa la libreria util.Scanner para poder utilizar Scanner

public class Entrada_Datos {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);//Al declarar un scanner se instancia
		
		System.out.println("Como te llamas??");
		String nombre = leer.next();//el metodo .next recibe un string
		
		System.out.println("Hola "+nombre+", mucho gusto.");
	}

}
