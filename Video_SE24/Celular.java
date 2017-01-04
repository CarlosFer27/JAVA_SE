package Video_SE24;

public class Celular { //Aqui se crea la clase
	String marca;  //atributo marca (GLOBAL)
	String modelo; //atributo modelo (GLOBAL)
	
	
	/*Continuación vamos a crear el constructor
	 * Este tiene como caracteristica que tiene el mismo nombre de la clase*/
	
	public Celular(String constMarca, String constModelo){   //Va a recibir 2 parametros
		this.marca=constMarca;   //Con la palabra reservada this indicamos que 
		this.modelo=constModelo; // las variables globales van a ser sobre escritas con los valores de las variables locales (parametros)
	}
	
	public void llamar(){ //La clase tiene el metodo llamar
		System.out.println(marca+" - "+modelo+" esta llamando......");
	}
	
	public void llamarEspecial(Celular ce){ //En esta linea se esta enviando un objeto al metodo, se crea el objeto ce de tipo celular
		System.out.println(ce.marca +" - " +ce.modelo + " esta llamando ......");
		
	}

}
