package Video_SE43;

public class ManejarExcepciones {
	
	public void metodo1(){
		try{
			metodo2();
			
		}catch(Exception ex){
			System.out.println("Metodo1: "+ex.getMessage());
		}
	}
	
	public void metodo2() throws Exception{
		try{
			metodo3();
		}catch(Exception ex){
			throw ex;
		}
	}
	
	public void metodo3() throws Exception{
		try{
			int division=27/0;
		}catch(Exception ex){
			throw ex;
		}
	}
	
	public static void main(String[] args){
		ManejarExcepciones prueba = new ManejarExcepciones();
		prueba.metodo1();
		
	}

}
