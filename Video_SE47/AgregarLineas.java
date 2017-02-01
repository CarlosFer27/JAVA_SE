package Video_SE47;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class AgregarLineas {
	public static void main(String[] args) throws IOException{
		FileWriter archivo =null;
		PrintWriter impresion = null;
		
		try{
			archivo= new FileWriter("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\Video_SE47\\LasAmoChinas.txt");
			impresion= new PrintWriter(archivo);
			
			impresion.println("Las amo con todo mi corazo");
			impresion.append("son mi corazon");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}finally{
			archivo.close();
		}	
	}

}
