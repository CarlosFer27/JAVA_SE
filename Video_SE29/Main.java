package Video_SE29;

public class Main {
	
	public static void main(String[] args){
		
		//Se realiza una variable de tipo Carro y se apunta a la instancia de CarroCarlos
		Carro carlos = new CarroCarlos("mazda","3","FER2707",4,36,"Diesel");
		
		/*Como el metodo muestraCarro esta dentro de la clase Carro 
		 * Se tubo que castear la variabla carlos
		 */
		((CarroCarlos)(carlos)).muestraCarro();
		carlos.gasolina();
		carlos.arranca();
		
		Carro jacke = new CarroJacke();
		jacke.gasolina();
		jacke.arranca();
		
		CarroCarlos otro = new CarroCarlos("mazda","3","FER2707",4,36,"Diesel");
		otro.arranca();
		
	}

}
