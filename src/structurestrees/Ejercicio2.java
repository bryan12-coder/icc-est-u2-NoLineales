package structurestrees;

import structures.nodes.Node;

public class Ejercicio2 {

            
    private Node<Integer> invert(Node<Integer> rool) {

        
       
        invertRecursively(rool);
        return rool;
                        
    }
        
    private Node<Integer> invertRecursively(Node<Integer> rool) {
        if(rool==null){
            return rool;
        }
        
        
                
        Node <Integer> aux = rool.getLeft();
        rool.setLeft(rool.getRight());
        rool.setRight(aux);

        rool.getLeft();
        rool.getRight();


        return rool;


    }
    public static void printTree(Node<Integer> rool) {
        System.out.println("Imprimiendo el arbol");
        printTreeRecursivo(rool,0);
                
            }
        
    private static void printTreeRecursivo(Node<Integer> rool, int actual) {
        if(rool == null){
            return;
        }
        
            printTreeRecursivo(rool.getRight(), actual + 1);
            System.out.println("\t".repeat(actual) + rool.getValue());
            printTreeRecursivo(rool.getLeft(), actual + 1);
        
    


                
    }

    
    
}
