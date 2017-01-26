package Video_SE42;


public class ExcepcionNullPointer {
	public static void main(String[] args){
		
		try{
			Division prueba=null; //El NullPointerException salta cuando no instancias una clase 
			prueba.operacion();
		}catch(NullPointerException ex){
			System.out.println(ex.getMessage());
		}
		
	}

}
