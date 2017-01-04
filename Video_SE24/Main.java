package Video_SE24;

public class Main {

	public static void main(String[] args){
		
		Celular objeto1 = new Celular("Xiaomi", "Redmi Note 3 Pro"); //Creamos la instancia de la clase celular y le pasamos los parametros solicitados
		objeto1.llamar(); //hacemos uso de nuestra instancia y utilizamos el metodo llamar
		
		Celular objeto2 = new Celular("LG", "G4 Stylus"); //Creamos otra instancia para objeto 2 con distintos parametros
		objeto2.llamar();
		
		objeto2.llamarEspecial(objeto1); //Aquí utilizamos la instancia del objeto 2, pero mandamos el objeto 1 para no escribir los parametros.
	}
	
}
