package Video_SE25;

public class Main {
	public static void main(String[] args){
		
		Zapato zapato1 = new Zapato(); //Se crea una instancia de la clase Zapato y se utiliza el constructor por default
		System.out.println("\n");
		
		Zapato zapato2 = new Zapato("Adidas"); //Se crea una instancia de la clase Zapato y se utiliza el segundo constructor
		zapato2.tienesZapato(); //Como este constructor solo asigna los valores, se hace uso del metodo tienesZapato para imprimir los valores asignados
		System.out.println("\n");
		
		Zapato zapato3 = new Zapato("Adidas", "Porshe 202", 6);
		zapato3.tienesZapato();
		System.out.println("\n");
	}

	
}
