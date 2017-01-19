package Video_SE35;

public class Builder_example {
	
	public static void main(String[] args){
		
		String texto = "Hola Fernanda";
		texto +=" te amo"+" con todo mi corazon"; //Aqui se realiza una concatenacion como las emos realizado hasta ahorita
		
		System.out.println(texto);
		
		StringBuilder texto2 = new StringBuilder(); // aqui declaramos una variable de tipo StringBuilder
		texto2.append("Hola Jacke").append(" tu me caes mal").append(" no es cierto"); //aqui utilizamos la varieble con el metodo append
		
		System.out.println(texto2.toString());// Para imprimirla utilizamos el metodo toString para regresarla como String
	}

}
