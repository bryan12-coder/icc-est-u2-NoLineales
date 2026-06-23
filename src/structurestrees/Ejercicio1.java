package structurestrees;

import structures.nodes.Node;

public class Ejercicio1 {

    public void insert(int[] numeros){
        BynaryTree<Integer> binario= new BynaryTree<>();
        for (int numero : numeros) {
            binario.insert(numero);
            printTree(binario.getRool());

            
        }
    }

    private void printTree(Node<Integer> rool) {
        System.out.println("Imprimiendo el arbol");
        printTreeRecursivo(rool,0);
                
            }
        
    private void printTreeRecursivo(Node<Integer> rool, int actual) {
        if(rool == null){
            return;
        }
        
            printTreeRecursivo(rool.getRight(), actual + 1);
            System.out.println("\t".repeat(actual) + rool.getValue());
            printTreeRecursivo(rool.getLeft(), actual + 1);
                
    }
    
}
