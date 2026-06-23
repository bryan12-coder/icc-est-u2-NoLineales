package structurestrees;

import structures.nodes.Node;

public class Ejercicio2 {
    public void insert(int[] numeros){
        BynaryTree<Integer> binario= new BynaryTree<>();
        for (int numero : numeros) {
            binario.insert(numero);
        }

        System.out.println("Árbol original:");
        printTree(binario.getRool());

        
        Node<Integer> invertido = invert(binario.getRool());

        System.out.println("\nÁrbol invertido:");
        printTree(invertido);
    }

            
    private Node<Integer> invert(Node<Integer> rool) {
        return invertRecursively(rool);
                        
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
