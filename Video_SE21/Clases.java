package Video_SE21;

public class Clases {

	//Se declaran los atributos de la clase Clases
private String nombre;
private int edad;


	//Se esta definiendo un metodo que se llama saludar e imprime los valores que le dimos a las variables
public void saludar(){
	nombre="mi hermosa Fer";
	edad=3;
	
	System.out.println("Hola "+nombre);
	System.out.println("Tienes "+edad+" años");
}



public static void main(String[] args){ //Se crea el metodo main
	Clases instancia = new Clases(); // Se realiza una instancia de la clase Clases para poder obtener sus metodos o atributos
	instancia.saludar(); // Se hace uso del metodo Saludar que pertenece a la clase Clases
	
}
	
	
}


