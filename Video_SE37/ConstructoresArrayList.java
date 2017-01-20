package Video_SE37;
import java.util.List;
import java.util.ArrayList;

public class ConstructoresArrayList {
    public static void main(String[] args){
        
        //Creamos una lista con el constructor vacio
        List<Integer> constVacio = new ArrayList();
        constVacio.add(1); //Consulta 1 vez el procesador y reserva un bloque en memoria
        constVacio.add(3); //Consulta 1 vez el procesador y reserva un bloque en memoria
        constVacio.add(4); //Consulta 1 vez el procesador y reserva un bloque en memoria
        constVacio.add(5); //Consulta 1 vez el procesador y reserva un bloque en memoria
        constVacio.add(6); //Consulta 1 vez el procesador y reserva un bloque en memoria
        constVacio.add(7); //Consulta 1 vez el procesador y reserva un bloque en memoria        
        
        //imprimimos nuestra primer lista
        
        System.out.println("Lista primer lista");
        for(int cont : constVacio){
            System.out.println(cont);
        }
        System.out.println("\n");
        
       //Creamos una segunda lista con el constructor tomando en cuenta la lista anterior
       List<Integer> segundConst = new ArrayList(constVacio);
       segundConst.add(30);
       
       //Imprimimos nuestra segunda lista
       System.out.println("Lista segunda lista");
       for(int cont : segundConst){
            System.out.println(cont);
        }
       System.out.println("\n");
       
       
       //Creamos una tercera lista con el constructor donde especificamos la capacidad inicial
       List<String> tercConst = new ArrayList(10);
       tercConst.add("Ferchis");
       tercConst.add("Jacke");
       tercConst.add("Las amo chinas");
       
       //Imprimimos nuestra tercer lista
       System.out.println("Lista tercer lista");
       for(String cont:tercConst){
           System.out.println(cont);
       }
    }
    
}
