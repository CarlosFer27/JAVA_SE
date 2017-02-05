package Video_SE50;
import java.util.Scanner;

public class SolicitatDatos {
	
	//Variables de clase
	private String nombre;
	private String apellido;
	private String apodo;
	
	//Constructor
	public void SolicitaDatos(){
		
	}
	
	
	//getters y setters de las variables de clase
	protected void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	protected String getNombre(){
		return this.nombre;
	}
	
	protected void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	protected String getApellido(){
		return this.apellido;
	}
	
	protected void setApodo(String apodo){
		this.apodo=apodo;
	}
	
	protected String getApodo(){
		return this.apodo;
	}
	
	
	//Metodo que nos permite setear los valores de nuestras variables a insertar a la BD
	
	public void PedirDatos(){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa el nombre del familiar ");
		setNombre(leer.next());
		System.out.println("Ingresa el apellido del familiar: ");
		setApellido(leer.next());
		System.out.println("Ingresa el apodo del familiar: ");
		setApodo(leer.next());
	}

}
