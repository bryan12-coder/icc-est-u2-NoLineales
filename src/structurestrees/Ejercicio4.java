package structurestrees;

import structures.nodes.Node;

public class Ejercicio4 {
    public void insert(int[] numeros){
        BynaryTree<Integer> binario = new BynaryTree<>();
    for (int numero : numeros) {
        binario.insert(numero);
    }

    System.out.println("Input (Árbol completo):");
    printTree(binario.getRool());

    int profundidadMaxima = maxDepth(binario.getRool());

    System.out.println("La profundidad máxima del árbol es: " + profundidadMaxima);
    }

    public int maxDepth(Node<Integer> rool){
        if(rool==null){
            return 0; 
        }
        

        int profundidadIzquierda= maxDepth(rool.getLeft());

        int profundidadDerecha= maxDepth(rool.getRight());

        return Math.max(profundidadIzquierda, profundidadDerecha)+1;


    }
    public static void printTree(Node<Integer> rool) {
        System.out.println("Imput");
        printTreeRecursivo(rool,0);
                
            }
        
    private static void printTreeRecursivo(Node<Integer> rool, int actual) {
        if(rool == null){
            return;
        }
        
        printTreeRecursivo(rool.getRight(), actual + 1);
    
        System.out.println("    ".repeat(actual) +  rool.getValue());
        
        printTreeRecursivo(rool.getLeft(), actual + 1);
        
    


                
    }
    

    
}
