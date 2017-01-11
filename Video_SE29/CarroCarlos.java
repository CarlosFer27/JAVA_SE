package Video_SE29;

public class CarroCarlos extends Carro{
	//atributos de la clase
	String gasolina;
	
	//Constructor con parametros de la clase padre y propios
	public CarroCarlos (String marca,String modelo,String placa,int noPuertas,int tamanioRin, String gasolina){
		super(marca,modelo,placa,noPuertas,tamanioRin);
		this.gasolina=gasolina;
		
	}
	
	public void setGasolina(String gasolina){
		this.gasolina=gasolina;
	}
	
	public String getGasolina(){
		return gasolina;
	}
	
	//Se crea metodo para mostrar los datos de mi carro
	public void muestraCarro(){
		System.out.println("Al fin me compre mi: "+getMarca()+" modelo "+getModelo());
		System.out.println("Y le pude poner de placas: "+getPlaca());
		System.out.println("y es rin: " +getTamanioRin());
	}
	

	//Se sebre escribe el metodo abstracto de la clase padre
	@Override
	public void gasolina() {
		System.out.println("Uso "+getGasolina());
		
	}
	


}
