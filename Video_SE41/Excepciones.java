package Video_SE41;

public class Excepciones {
	
	//Declaramos el metodo division inicializando los valores de sus variables	
	public void division(){
		int num1=27;
		int num2=0;
		int division=num1/num2; //Como cualquier division entre 0 es incorrecto el programa debe mandar un error
	}
	
	public static void main(String[] args){
		Excepciones exep = new Excepciones(); // declaramos un objeto del tipo de la clase Excepciones
		
		try{ //Aqui en el try vamos a intentar ejecutar el metodo division
			exep.division(); 
		} catch(Exception ex){ //Como la operacion va a marcar un error, lo vamos a cachar en el catch
			System.out.println("Causa de error: "+ex.getMessage());
		}
		finally{
			System.out.println("El finally se ejecuta siempre"); //Este bloque solo se puso para ejemplificar que finally siepre se ejecuta
		}
		
	}
}
