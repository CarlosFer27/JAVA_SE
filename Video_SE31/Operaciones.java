package Video_SE31;
import java.util.Scanner;

public class Operaciones {
	
	//Atributos de la clase (Se declaran static para ejemplificar los metodos de clase)
	static int num1;
	static int num2;
	static int resultado;

	//Constructor
	public Operaciones(){
	}
	
	//getters y setters (Se generan estaticos)
	public static void setNum1(int num1){  
		Operaciones.num1=num1;  /* Como los metodos y los atributos son estaticos 
		se declaran con el nombre de la clase
		*/
	}
	
	public static int getNum1(){
		return Operaciones.num1;
	}
	
	public static void setNum2(int num2){
		Operaciones.num2=num2;
	}
	
	public static int getNum2(){
		return Operaciones.num2;
	}
	
	public static void setResultado(int resultado){
		Operaciones.resultado=resultado;
	}
	
	public static int getResultado(){
		return Operaciones.resultado;
	}
	
	
	//metodos estaticos
	
	public static void suma(){
		Operaciones.setResultado(Operaciones.num1+Operaciones.num2);
		System.out.println("El resultado de la suma es: "+Operaciones.getResultado());
	}
	
	public static void resta(){
		Operaciones.setResultado(Operaciones.num1-Operaciones.num2);
		System.out.println("El resultado de la resta es: "+Operaciones.getResultado());
	}
	
	public static void division(){
		Operaciones.setResultado(Operaciones.num1/Operaciones.num2);
		System.out.println("El resultado de la division es: "+Operaciones.getResultado());
	}
	
	public static void multiplicacion(){
		Operaciones.setResultado(Operaciones.num1*Operaciones.num2);
		System.out.println("El resultado de la multiplicacion es: "+Operaciones.getResultado());
	}
	
	public static void pedirNumero(){
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		Operaciones.setNum1(leer.nextInt());
		
		System.out.println("Ingresa otro numero");
		Operaciones.setNum2(leer.nextInt());
	}
	

}
