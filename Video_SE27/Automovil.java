package Video_SE27;
import java.util.Scanner;

public class Automovil {
	
	//Se declaran los atributos de forma private
	private String marca;
	private String modelo;
	private int anio;
	
	//Se declara Constructor ... en este caso es el default
	public Automovil(){
		
	}
	
	//Se declaran getters y setters por cada uno de los atributos
	public void setMarca(String marca){
		this.marca=marca;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setModelo(String modelo){
		this.modelo=modelo;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setAnio(int anio){
		this.anio=anio;
	}
	
	public int getAnio(){
		return anio;
	}
	
	
	/*Se crea metodo tuCarro el cual solamente imprime los valores
	 * del modelo, marca y año del carro seteados de forma manual
	 * en la clase main 
	 */
	public void tuCarro(){
		System.out.println("Felicidades!!\n tu carro es un "+getMarca()+" modelo "+getModelo()+" del año "+getAnio());
	}
	
	/*Se crea metodo eligeCarro el cual solicita de forma dinamica
	 * la marca, modelo y año del carro haciendo uso de los 
	 * setters y getters
	 */	
	public void eligeCarro(){
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Buenas tardes!\nIngresa la marca de tu carro: ");
		setMarca(leer.next());
		
		System.out.println("Ingresa el modelo de tu carro: ");
		setModelo(leer.next());
		
		System.out.println("Ingresa el año de tu carro: ");
		setAnio(leer.nextInt());
		
		System.out.println("Eres poosedor de un fabuloso: "+getMarca()+" modelo: "+getModelo()+" del año: "+getAnio());
		
	}
	
}
