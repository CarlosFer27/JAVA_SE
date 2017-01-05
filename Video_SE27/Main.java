package Video_SE27;

public class Main {
	
	public static void main(String[] args){ //Se crea clase main
		
		/*Se realiza una instancia de la clase Automovil con el constructor por 
		 * default */
		Automovil carro = new Automovil(); 
		
		//se asignan valores a los atributos de la clase Automovil con los metodos de acceso set
		carro.setMarca("Mazda");
		carro.setModelo("3");
		carro.setAnio(2017);
		
		//Se invoca el metodo tuCarro para que imprima los valores antes seteados 
		carro.tuCarro();
		
		//Se invoca el metodo elijoCarro el cual nos va a solicitar los valores del carro
		Automovil elijoCarro = new Automovil();
		
		elijoCarro.eligeCarro();
		
	}

}
