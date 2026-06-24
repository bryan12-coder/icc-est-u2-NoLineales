package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Sets() {
    }

    public Set<String> contruirHasSets(){
        Set<String> hashSet= new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;

       

    }

    public Set<String> contruirLinkedHashSets(){
        Set<String> linkedHashSets= new LinkedHashSet<>();
        linkedHashSets.add("A");
        linkedHashSets.add("B");
        linkedHashSets.add("C");
        linkedHashSets.add("A");
        linkedHashSets.add("D");
        linkedHashSets.add("E");
        linkedHashSets.add("F");
        linkedHashSets.add("1Ggggggeegeg");
        linkedHashSets.add("2G2gggggeegeg");
        linkedHashSets.add("3Gggggeegeg");
        linkedHashSets.add("4Ggggggeegeg");
        linkedHashSets.add("5Ggggggeegeg");
        linkedHashSets.add("5Ggggggeegeg");
        linkedHashSets.add("6Ggggggeegeg");
        linkedHashSets.add("G7gggggeegeg");
        return linkedHashSets;


       

    }

    public Set<String> contruirTreeSets(){
        Set<String> tSet= new TreeSet<>();
        tSet.add("A");
        tSet.add("B");
        tSet.add("C");
        tSet.add("A");
        tSet.add("D");
        tSet.add("E");
        tSet.add("F");
        tSet.add("1Ggggggeegeg");
        tSet.add("2G2gggggeegeg");
        tSet.add("3Gggggeegeg");
        tSet.add("4Ggggggeegeg");
        tSet.add("5Ggggggeegeg");
        tSet.add("5Ggggggeegeg");
        tSet.add("6Ggggggeegeg");
        tSet.add("G7gggggeegeg");
        return tSet;


        

    }
    public Set<Contacto> contruirTreeSetsComparador(){

        //Set<Contacto> tCSet = new TreeSet<>((c1, c2)-> {return c1.getNombre().compareTo(c2.getNombre());});// estoy metiendo una funcion dentro de los parentesis utilizando la funcion flecha
        Set<Contacto> tCSet = new TreeSet<>();
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        tCSet.add(new Contacto("Juan", "Lopez", "123456789")); 
        return tCSet;

    }
    public Set<Contacto> construirHashSetContacto(){
        Set<Contacto> hCSet = new HashSet<>();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 =new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 =new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 =new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 =new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto c6 =new Contacto("Juan", "Lopez", "123456789"); 
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);

        return hCSet;

    }
    

    
}
