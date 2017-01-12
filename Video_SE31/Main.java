package Video_SE31;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Seleccione una opcion: ");
		System.out.println("1)Suma");
		System.out.println("2)Resta");
		System.out.println("3)Multiplicacion");
		System.out.println("4)Division");
		int opcion = leer.nextInt();
		
		
		switch (opcion) {
			case 1: 
				Operaciones.pedirNumero();
				Operaciones.suma();
				break;
			case 2: 
				Operaciones.pedirNumero();
				Operaciones.resta();
				break;
			case 3:
				Operaciones.pedirNumero();
				Operaciones.multiplicacion();
				break;
			case 4:
				Operaciones.pedirNumero();
				Operaciones.division();
				break;
			default: 
				System.out.println("Elegiste una Opcion incorrecta");
		}
		
		
	}

}
