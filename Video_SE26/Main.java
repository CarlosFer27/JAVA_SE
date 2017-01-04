package Video_SE26;

import Video_SE25.Zapato; //Se importa del paquete Video_SE25 la Clase Zapato para que se pueda instanciar 
import Video_SE24.Celular; //Se importa del paquete Video_SE24 la Clase Celular para que se pueda instanciar 

public class Main {
	public static void main(String[] args){
		
		Zapato instancia = new Zapato(); //Se realiza una instancia de la clase Zapato con su constructor por default
		String marcaLocal=instancia.marca; // notese que podemos invocar el atributo marca por que en la clase zapato esta declarado con ambito publico
		instancia.tienesZapato(); // invocamos el metodo tienesZapato de la clase Zapato
		
		Celular instCel = new Celular("Xiaomi","Redmi Note 3"); //Realizamos otra instancia pero para la clase Celular
		instCel.llamar(); //Aqui solamente nos permitio accesar a su metodo llamar por que es publico, pero sus atributos tienen el abmito package
		
	}

}
