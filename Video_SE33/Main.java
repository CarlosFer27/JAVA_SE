package Video_SE33;

public class Main {
	
	public static void main(String[] args){
		
		Perro rufus = new Perro();
		
		rufus.muestraTipoAnimal();
		
		String nombre=rufus.muestraNombre();
		
		System.out.println(nombre);
		
		rufus.muestraVida();
	}

}
