package Video_SE42;

public class ExcepcionAritmetic {
	public static void main(String[] args){
		
		try{
			Division operacion = new Division();
			operacion.operacion();
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		
		
	}

}
