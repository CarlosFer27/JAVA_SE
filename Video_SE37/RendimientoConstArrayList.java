package Video_SE37;
import java.util.List;
import java.util.ArrayList;

public class RendimientoConstArrayList {
    
    public static void main(String[] args){
        
                //Creamos una lista con el constructor vacio
        List<Integer> constVacio = new ArrayList();
        
        long init1 = System.nanoTime();
        for(int cont=0; cont<150000; cont++){
            constVacio.add(cont);
        }
        long fin1 = System.nanoTime();
        System.out.println("Tiempo constructor vacio: "+(fin1-init1));

           
       //Creamos una segunda lista con el constructor tomando en cuenta la lista anterior
       List<Integer> segundConst = new ArrayList(constVacio);
       
        long init2 = System.nanoTime();
        for(int cont=0; cont<10; cont++){
            segundConst.add(cont);
        }
        long fin2 = System.nanoTime();
        System.out.println("Tiempo segundo constructor: "+(fin2-init2));
       
      
       
       //Creamos una tercera lista con el constructor donde especificamos la capacidad inicial
       List<String> tercConst = new ArrayList(10);

        long init3 = System.nanoTime();
        for(int cont=0; cont<150000; cont++){
            segundConst.add(cont);
        }
        long fin3 = System.nanoTime();
        System.out.println("Tiempo tercer constructor: "+(fin3-init3));
        System.out.println("\n");
        System.out.println(fin1-init1);
        System.out.println(fin2-init2);
        System.out.println(fin3-init3);
        
       
       
    }
    
}
