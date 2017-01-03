package Video_SE22;

public class Metodos_Vacios {

	public void saludar(String nombre){ // Aquí declaramos un metodo que recibe como parametro un string
		System.out.println("Hola "+nombre);
	}
	
	public void despedir(String nombre){
		System.out.println("Adios "+nombre);
	}
	
	public static void main(String[] args){
		Metodos_Vacios instancia = new Metodos_Vacios(); //realizamos la instancia de la clase Metodos_Vacios
		
		instancia.saludar("Fernandita"); // al invocar el metodo debemos incluir el parametro que nos solicita
		instancia.despedir("Fernandita");
		
		
	}

}
