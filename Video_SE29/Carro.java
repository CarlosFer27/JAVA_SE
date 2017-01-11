package Video_SE29;

public abstract class Carro {
	
	//creación de atributos
	String marca;
	String modelo;
	String placa;
	int noPuertas;
	int tamanioRin;
	
	//creacion de constructores
	
	//Constructor vacio
	public Carro(){
		
	}
	
	//Constructor con parametros
	public Carro(String marca, String modelo, String placa, int noPuertas, int tamanioRin){
		this.marca=marca;
		this.modelo=modelo;
		this.placa=placa;
		this.noPuertas=noPuertas;
		this.tamanioRin=tamanioRin; 
		
	}
	
	
	//Metodos getters y setters de cada atributo
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
	
	public void setPlaca(String placa){
		this.placa=placa;
	}
	
	public String getPlaca(){
		return placa;
	}
	
	public void setNoPuertas(int noPuertas){
		this.noPuertas=noPuertas;
	}
	
	public int getNoPuertas(){
		return noPuertas;
	}
	
	public void setNoRin(int noRin){
		this.tamanioRin=noRin;
	}
	
	public int getTamanioRin(){
		return tamanioRin;
	}
	
	//Se crea metodo abstracto Gasolina, por lo cual no se implementa
	public abstract void gasolina();
	
	//Tambien se pueden crear metodos que no son abstractos y aqui si se deben implementar
	
	public void arranca(){
		System.out.println("Arrancando");
	}

}
