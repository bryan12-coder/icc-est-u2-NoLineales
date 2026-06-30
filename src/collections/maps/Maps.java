package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {
    //Map<K, V> datos genericos
    //Map<Tipo clave, Tipo valor>
    // La interfaz no se puede implementar
    // El set no se puede instanciar porque es una interface
    //Interfaz no se pueden instanciar
    // Mapa es una interfaz

    public Map<String, Integer> construirHashMap(){
        Map<String, Integer> map= new HashMap<>(); //Instancia de mapa de tipo hasMap de tipos string y su valores enteros
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);// Actualiza al valor de A

        System.out.println(map.size());
        System.out.println(map.values().toArray());// El arreglo no tiene to String
        //Mapa tiene sobre escrito el to String 

        for (int i = 0; i < map.size(); i++) {//Mapa y set es size no lenght
            //Valores que se tramformaron en arreglos y imprimimos el arreglo con las posiciones
            //Map-> V -> Valores->Array->Array[pos]
            System.out.println(map.values().toArray()[i]);// El values devuelve una colleccion de tipo Integer, una colleccion podria ser listas,set etc
        } // 50,20,30
        //Map-> K -> Keys-> Set -> valor de set
        //¿Porque los valores se pasan a un arreglo y las llaves se pasan a un set?
        //Porque las llaves no se puede repetir y la garantiza un set
        //Los valores se pasan a un arreglo porque permiten repetir
        for (String key : map.keySet()) {// Llaves se tranforman en set porque 
            System.out.println(key);

            
        }// A,B,C
        // T= Entry<K,V>
        // T= Entry<S,I>
        // T= set
        //Set cuantos genericos tenemos solo uno <T>
        //Set<T>
        //ENtry --> convinacion de clave y valor
        //Convinaciones no se pueden repetir
        //Va de tipo ser para que no se repita
        map.entrySet();

        for (Map.Entry<String,Integer> entry : map.entrySet()) { //(E1,E2,E3)-->(A,50,B,20,C,50) //imprimivos el set Del entry,Clave Valor
            System.out.println(entry);
            
        }


        return map;

        
        
    }
    public LinkedHashMap<String,Integer> contruirLinkedHashMap(){//Se guardan la entradas segun como hayan ingresado los valores
        LinkedHashMap<String,Integer> lMap= new LinkedHashMap<>();
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;

        


    }
    public Map<String,Integer> cTreeMap(){
        Map<String,Integer> tMap= new TreeMap<>();
        tMap.put("A", 2);
        tMap.put("B", 3);
        tMap.put("A", 5);
        tMap.put("C", 50);
        tMap.put("D", 5);
        tMap.put("F", 3);
        tMap.put("G", 8);
        tMap.put("H", 85);
        tMap.put("I", 5);
        System.out.println(tMap);
        System.out.println(tMap.entrySet());
        return tMap;

    }

    public void eliminarDuplicadosAndSort(List<Contacto> contactos){
        Set<Contacto> tset= new TreeSet<>();
        for (Contacto contacto : contactos) {
            tset.add(contacto);
            
        }
        
    }
    
}
