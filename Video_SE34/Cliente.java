package Video_SE34;

public class Cliente {
	
	//Atributos de la clase cliente
	private int cuenta;
	private String nombre;
	private int saldo;
	
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
	

}
