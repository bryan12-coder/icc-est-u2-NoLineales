package structurestrees;

import java.util.ArrayList;
import java.util.List;

import structures.nodes.Node;



public class Ejercicio3 {
    

    public void insert(int[] numeros) {
        
        BynaryTree<Integer> binario = new BynaryTree<>();
        for (int numero : numeros) {
            binario.insert(numero);
        }

        
        List<List<Node<Integer>>> niveles = listLevels(binario.getRool());
        
        
        printFormat(niveles);
    }

    
    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {
        List<List<Node<Integer>>> result = new ArrayList<>();
        helper(root, result, 0);
        return result;
    }

    private void helper(Node<Integer> node, List<List<Node<Integer>>> result, int level) {
        if (node == null) 
            return;

        
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }

        
        result.get(level).add(node);

        
        helper(node.getLeft(), result, level + 1);
        helper(node.getRight(), result, level + 1);
    }

    
    private void printFormat(List<List<Node<Integer>>> niveles) {
        System.out.println("Output:");
        for (List<Node<Integer>> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                
                
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
    
}
