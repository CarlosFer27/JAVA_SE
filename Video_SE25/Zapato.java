package Video_SE25;

public class Zapato { //Se crea la clase Zapato
	//Se declaran sus atributos
	String marca; 
	String modelo;
	float talla;
	
	/* Se crea el constructor vacio, tambien conocido como constructor por default,
	 * si no es creado, Java lo genera automaticamente, NOTA: aquí se esta imprimiendo
	 * una leyenda solo para fines de la practica
	 */
	public Zapato(){
		System.out.println("Yo soy el constructor por default o vacio");
	}
	
	/* Ahora vamos a generar un segundo constructor que recibe un parametro
	 * Se asigna el valor que recibe a la variable global
	 * y se imprime una leyenda para fines de la practica.
	 * 
	 */
	public Zapato(String marca){
		this.marca=marca;
		System.out.println("Yo soy el constructor que recibe un solo parametro");
	}
	
	
	/* Por ultimo creamos un tercer constructor 
	 * el cual recibe 3 parametros y asigna sus valores a la variables globales
	 * igualmente imprimimos un mensaje para fines de la practica
	 */
	public Zapato(String marca, String modelo, float talla){
		this.marca=marca;
		this.modelo=modelo;
		this.talla=talla;
		System.out.println("Yo soy el constructor que recibe 3 parametros");
	}
	
	/*Creamos un metodo para imprimir los zapatos deacuerdo a los
	 * parametros recibidos
	 * 
	 */
	
	public void tienesZapato (){
		System.out.println("Hola, tu tienes tus tenis de marca: "+marca+ ", modelo: "+modelo+", y talla: "+talla);
	}
	

}
