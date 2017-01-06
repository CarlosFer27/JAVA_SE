package Video_SE28;

public class Animal {
	
	private String nombre;
	private String tipoAlimentacion;
	private int edad;
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setTipoAlimentacion(String tipoAlimentacion){
		this.tipoAlimentacion=tipoAlimentacion;
	}
	
	public String getTipoAlimentacion(){
		return tipoAlimentacion;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	public int getEdad(){
		return edad;
	}

}
