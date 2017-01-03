package Video_SE20;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int num1=0;
		int num2=0;
		int resultado=0;
		
		
		for (int ciclo=1; ciclo>0;ciclo++){
			
			System.out.println("\n Selecciona una opcion:");
			System.out.println("\n\t 1)Suma");
			System.out.println("\t 2)Resta");
			System.out.println("\t 3)Multiplicación");
			System.out.println("\t 4)Division");
			System.out.println("\t 5)Salir");
			
			int opcion = leer.nextInt();
			
			switch(opcion){
			case 1 :
				System.out.println("Ingresa el primer numero: ");
				num1=leer.nextInt();
				System.out.println("Ingresa el segundo numero: ");
				num2 = leer.nextInt();
				resultado=num1+num2;
				System.out.println("El resultado de "+num1+" + "+num2+" = "+resultado);
				break;
				
			case 2 :
				System.out.println("Ingresa el primer numero: ");
				num1=leer.nextInt();
				System.out.println("Ingresa el segundo numero: ");
				num2 = leer.nextInt();
				resultado=num1-num2;
				System.out.println("El resultado de "+num1+" - "+num2+" = "+resultado);
				break;
			
			case 3 :
				System.out.println("Ingresa el primer numero: ");
				num1=leer.nextInt();
				System.out.println("Ingresa el segundo numero: ");
				num2 = leer.nextInt();
				resultado=num1*num2;
				System.out.println("El resultado de "+num1+" * "+num2+" = "+resultado);
				break;
				
			case 4 :
				System.out.println("Ingresa el primer numero: ");
				num1=leer.nextInt();
				if (num1<=0){
					System.out.println("El primer numero debe ser mayor a 0");
				}else{
				System.out.println("Ingresa el segundo numero: ");
				num2 = leer.nextInt();
				resultado=num1/num2;
				System.out.println("El resultado de "+num1+" / "+num2+" = "+resultado);
				}
				break;
				
			case 5 :
				ciclo=-1;
				break;
				
				default: 
					System.out.println("Esa no es una opcion valida");
			
			}
			
		}
		
		
		
	}

}
