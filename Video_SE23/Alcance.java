package Video_SE23;

public class Alcance {
	int edad=3;
	
	public void muestraEdad(){
		System.out.println(edad);
	}
	
	public void muestraAge(){
		int age=30;
		System.out.println(age);
	}
	
	public void intentoFallido(){
		System.out.println(edad);
	//	System.out.println(age); aqui intentamos hacer uso de la variable age, pero al no ser global no se puede utilizar
	}
	
	public static void main(String[] args){
		Alcance instancia = new Alcance();
		
		instancia.muestraEdad();
		instancia.muestraAge();
		instancia.intentoFallido();
	}

}
