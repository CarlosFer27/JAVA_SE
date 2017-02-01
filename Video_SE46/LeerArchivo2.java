package Video_SE46;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class LeerArchivo2 {
	public static void main(String[] args){
		//Aqui vamos a utilizar try y catch para el manejo de las excepciones en esta misma clase (Es el mismo ejemplo que LeerArchivo.java, solo que con try y catch)
		try{
			FileReader archivo = new FileReader("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\Video_SE46\\Chinas.txt");
			BufferedReader buffer = new BufferedReader(archivo);
			String contenido;
			
			while((contenido=buffer.readLine())!= null){
				System.out.println(contenido);
			}
			
			
		}catch(FileNotFoundException e){ //La excepcion FileNotFoundException es por que estamos utilizando FileReader
			System.out.println(e.getMessage());
		}catch(IOException e){ //La excepcion IOException es por que el readLine puede traer un error
			System.out.println(e.getMessage()); 
		}
		
		
	}
	

}
