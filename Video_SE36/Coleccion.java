package Video_SE36;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Coleccion {
    public static void main(String[] args){
        /* Estamos creando un objeto llamado lista de tipo List(de String) y estamos instanciando su clase ArrayList*/
        List<String> lista = new ArrayList();
        
        //Con el metodo add agregamos nuestro string a la lista
        lista.add("Fernanda");
        lista.add("Jacqueline");
        lista.add("Las amo chinas");
        
        //For para mostrar la lista (es la forma implicita de usar el iterator)
        for(String cont :lista){
            System.out.println(cont);
        }
        
        //Para ejemplificar el iterator
        Iterator<String> iterador = lista.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
        
    }
    
}
