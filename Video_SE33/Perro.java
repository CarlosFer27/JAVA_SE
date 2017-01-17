package Video_SE33;

public class Perro implements Animal, SerVivo{
	
	@Override
	public void muestraTipoAnimal(){
		System.out.println("Soy mamifero");
		
	}
	
	@Override
	public String muestraNombre(){
		return "Rufus";
	}
	
	@Override
	public void muestraVida(){
		System.out.println("Estoy vivo");
	}

}
