package Video_SE46;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo3 {
	public static void main(String[] args) throws FileNotFoundException{
		
		FileInputStream archivo = new FileInputStream("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\Video_SE46\\Chinas.txt");
		Scanner leer = new Scanner (archivo, "UTF-8");
		
		String contenido=leer.next();
	}

}
