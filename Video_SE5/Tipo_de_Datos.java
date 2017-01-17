package Video_SE5;

public class Tipo_de_Datos {
	public static void main(String[] args){
		//Aqui se declaran las variables de tipo primitivos y no primitivos
		int var1;
		Integer var2;
		String cadena;
		
		//Se asigna el valor a las variables
		var1=27;
		var2=null; //var2 es no primitiva por lo cual si acepta nulos
		cadena ="Te amo mi Fernandita";
		
		//cadena.endsWith(arg0); aquí observamos como cadena al ser no primitivo permite invocar metodos a este objeto
		
		// se imprime los valores de las variables	
		System.out.println("El valor de la variable 1 es: " +var1);
		System.out.println("La variable Integer permite nulos: "+var2);
		System.out.println(cadena);
		
	}

}

