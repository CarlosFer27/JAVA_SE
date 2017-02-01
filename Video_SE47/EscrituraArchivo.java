package Video_SE47;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraArchivo {
	public static void main(String[] args) throws IOException{
		
		FileWriter archivo= null;
		PrintWriter impresion= null;
		
		try {
			archivo= new FileWriter("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\Video_SE47\\LasAmo.txt");
			impresion=new PrintWriter(archivo);
			
			impresion.println("Las amo chinas hermosas (Escrito desde Java)");
			
		}catch(Exception e){
			
		}finally{
			if(archivo != null){
				archivo.close();
			}
		}
		
		
		
	}

}
