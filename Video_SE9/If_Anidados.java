package Video_SE9;

public class If_Anidados {
	public static void main(String[] args){
		int edad=17;
		
		if(edad<10){
			System.out.println("Eres un niño");
		} else if(edad>=10 && edad<=20){
				System.out.println("Eres un adolecente");
		  } else if(edad>20 && edad <=40){
				System.out.println("Eres adulto");
			}
		else {
			  System.out.println("Eres adulto mayor ANCIANO");
		}
		
	}

}
