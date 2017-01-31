package Video_SE45;
import java.io.File;

public class Archivo {
	public static void main(String[] args){
		
		//Creamos un objeto tipo File
		File archivo = new File ("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\Prueba.txt");
		
		//Validamos si existe el archivo con el metodo exist de File
		boolean existe=archivo.exists();

		//impirmimos Si existe el archivo
		System.out.println("Existe el archivo? "+existe);

		if (existe==true){
			//Si el archivo existe se va a crear un directorio "directorioTrue" con el metodo mkdir de File
			File directorioTrue = new File ("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\directorioTrue");
			boolean dirTrue=directorioTrue.mkdir();
			System.out.println("Se crea dirTrue? "+dirTrue);
			//Aqui renombramos el archivo con el metodo renameTo
			boolean renombrar= archivo.renameTo(new File("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\renombrado.txt"));
			System.out.println("El archivo: "+archivo.getName()+" fue renombrado exitosamente");
		}else{
			//Si el archivo no existe se va a crear el directorio "dirFalse" con un sibdirectorio "False" con el metodo mkdirs de File
			File directorioFalse = new File ("C:\\Users\\SOA\\Documents\\Carlos\\Personal\\Cursos\\Java\\JavaSE_MitoCode\\Practicas\\dirFalse\\False");
			boolean dirFalse=directorioFalse.mkdirs();
			System.out.println("Se crea dirFalse?"+dirFalse);
		}
		
		
		
	}

}
	