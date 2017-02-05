package Video_SE50;

public class Main {
	public static void main(String[] args){
		SolicitatDatos datos = new SolicitatDatos();
		InsertarConParametros inserta = new InsertarConParametros();
		
		datos.PedirDatos();
		
		inserta.Insercion(datos.getNombre(), datos.getApellido(), datos.getApodo());
		
		
	}

}
