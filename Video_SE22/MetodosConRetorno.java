package Video_SE22;

public class MetodosConRetorno {
	
	public String retornos (String nombre, int edad){ //Este metodo recibe 2 parametros y retorna un String
		return edad +"\t"+ nombre; //Lo que va a retornar es la edad concatenada un su nombre separados por un tabulador
	}
	
	
	public static void main (String[] args){
		
		MetodosConRetorno instancia = new MetodosConRetorno(); //tenemos que hacer una instancia a la clase creada
		
		String Regresa=instancia.retornos("Fernandita", 3); //aqui hacemos uso del metodo retornos pasandole los parametros de nombre y edad y lo que nos regrese lo guardamos en la variable Regresa 
		System.out.println(Regresa); //Aqui solo imprimimos el contenido de la variable Regresa
	} 

}
