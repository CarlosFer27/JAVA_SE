package Video_SE28;
public class Main {
	
	public static void main(String[] args){
		Perro uno = new Perro();
		Perro dos = new Perro("Armin","Carnivoro", 8,"Chihuahua");
		
		
		uno.setNombre("Rufus");
		uno.setTipoAlimentacion("Carnivoro");
		uno.setEdad(4);
		uno.setRaza("Snaweser");
		
		uno.MuestraPerro(uno.getNombre(), uno.getTipoAlimentacion(), uno.getEdad(), uno.getRaza());
		dos.MuestraPerro(dos.getNombre(), dos.getTipoAlimentacion(), dos.getEdad(), dos.getRaza());
		
	}

}
