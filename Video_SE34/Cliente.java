package Video_SE34;
import java.util.Scanner;

public class Cliente {
	
	//Atributos de la clase cliente
	private int cuenta;
	private String nombre;
	private int saldo;

	Scanner leer = new Scanner(System.in);
	
	//Constructores
	
	public void Cliente(){
		
	}
	
	public void Cliente (int cuenta, String nombre, int saldo){
		this.cuenta=cuenta;
		this.nombre=nombre;
		this.saldo=saldo;
	}
	
	// Getters y Setters
	
	public void setCuenta(int cuenta){
		this.cuenta=cuenta;
	}
	
	public int getCuenta(){
		return cuenta;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setSaldo(int saldo){
		this.saldo=saldo;
	}
	
	public int getSaldo(){
		return saldo;
	}
	

	//Metodos
	
	public void muestraSaldo(){
		System.out.println("Tu saldo es de: $"+getSaldo());
	}
	
	
	public void deposito(){
		System.out.println("Ingresa el monto a depositar: ");
		int depo=leer.nextInt();
		if(depo <= 0){
			System.out.println("El deposito no puede ser negativo o igual a cero.");
		} else {
			setSaldo(getSaldo()+depo);
			System.out.println("El deposito fue realizado con éxito");
			System.out.println("Tu nuevo saldo es de: $"+getSaldo());
		}
	}
	
	public void retiro(){
		System.out.println("Tu saldo es de: "+getSaldo());
		System.out.println("Ingresa el monto a retirar: ");
		int ret = leer.nextInt();
		if (saldo < ret){
			System.out.println("No tienes suficientes fondos para retirar esa cantidad");
		} else{
			setSaldo(getSaldo()-ret);
			System.out.println("Retiro éxitoso");
			System.out.println("Tu nuevo saldo es de: $"+getSaldo());
		}
	}
	
	
}
