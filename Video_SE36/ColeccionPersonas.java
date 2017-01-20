package Video_SE36;
import java.util.List;
import java.util.ArrayList;

public class ColeccionPersonas {
    public static void main(String[] args){
        //Declaramos 3 Objetos de tipo persona
      Persona per1 = new Persona();
      per1.setNombre("Fernanda");
      per1.setSexo("Femenino");
      per1.setEdad(3);
      
      Persona per2 = new Persona();
      per2.setNombre("Jacqueline");
      per2.setSexo("Femenino");
      per2.setEdad(30);
      
      Persona per3 = new Persona();
      per3.setNombre("Carlos");
      per3.setSexo("Macho Alfa Lomo plateado");
      per3.setEdad(27);
      
      //Definimos una lista
      
      List<Persona> listaPersonas = new ArrayList();
      listaPersonas.add(per1);
      listaPersonas.add(per2);
      listaPersonas.add(per3);
      
      //Vamos a recorrer la lista
      for(Persona list: listaPersonas){
          System.out.println(list); //Como aqui no especificamos que elemento traer de la lista nos arroja el id del objeto
      }
      
      for(Persona cont: listaPersonas){
          System.out.println(cont.getNombre()+" "+cont.getEdad());
      }
    }
}
