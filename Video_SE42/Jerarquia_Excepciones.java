package Video_SE42;

public class Jerarquia_Excepciones {
	
	public static void main(String[] args){
		try{
			Division prueba = null;
			prueba.operacion();
		}/*catch(Exception ex){						//No podemos poner una Excepcion padre anter de las demas
			System.out.println(ex.getMessage());
		}*/catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}catch(NullPointerException ex){
			System.out.println(ex.getMessage());
		}catch(Exception ex){
			System.out.println(ex.getMessage());   //Aqui se muestra como se respeta la jerarquia de excepciones
		}
		
		
		
	}

}
