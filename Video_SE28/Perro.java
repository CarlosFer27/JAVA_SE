package Video_SE28;

public class Perro extends Animal {
	
	private String raza;
	
	public Perro (String nombre, String tipoAlimentacion, int edad, String raza){
		super(nombre, tipoAlimentacion,edad);
		this.raza=raza;
		
	}
	
	public Perro(){
		
	}
	
	public void setRaza (String raza){
		this.raza=raza;
	}
	
	public String getRaza (){
		return raza;
	}
	
	public void MuestraPerro(String nombre, String tipoAlimentacion, int edad, String raza){
		System.out.println("Tu perro se llama: "+getNombre());
		System.out.println("Es: "+getTipoAlimentacion());
		System.out.println("Tiene: "+getEdad()+" años");
		System.out.println("Es de raza: "+getRaza());
		
	}
	

}
