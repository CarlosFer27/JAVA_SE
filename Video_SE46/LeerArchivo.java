package Video_SE46;
import java.io.BufferedReader;
import java.io.FileReader;

//Se importan estas 2 librerias ya que se tienen que manejar excepcioes
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerArchivo {
	//Estamos utilizando throws para que se manejen las excepciones del FileReader y del readLine
	public static void main(String[] args) throws FileNotFoundException , IOException{
		
		FileReader archivo = new FileReader("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\Video_SE46\\Chinas.txt");
		BufferedReader buffer = new BufferedReader(archivo);
		String contenido;
			
		while((contenido= buffer.readLine()) != null){
			System.out.println(contenido);
		}
				
	}
}
