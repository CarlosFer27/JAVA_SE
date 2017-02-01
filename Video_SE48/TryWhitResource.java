package Video_SE48;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TryWhitResource {
	public static void main(String[] args){
		try(FileWriter archivo = new FileWriter("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\Video_SE48\\Hermosas.txt")){
			PrintWriter escribe = new PrintWriter(archivo);
			
			escribe.println("Las amo chinas cochinas");
			
		}catch(Exception e){
			
		}
		
	}

}
