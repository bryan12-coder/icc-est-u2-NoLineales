import structures.nodes.Node;
import structurestrees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
            }
        
            private static void runIntTree() {
                IntTree arbolNumeros= new IntTree();

                //arbolNumeros.setRool(10);
                //System.out.println("Raiz" + arbolNumeros.getRool());

                //Node<Integer> node2= new Node<>(20);
               // Node<Integer> node3= new Node<>(30);
                //Node<Integer> node4= new Node<>(40);
               // Node<Integer> node5= new Node<>(50);


                //Node<Integer> root = arbolNumeros.getRool();

                //root.setLeft(node2);
                //root.setRight(node3);

               // node2.setLeft(node4);
               // node4.setLeft(node5);

               arbolNumeros.insert(10);
               arbolNumeros.insert(5);
               arbolNumeros.insert(3);
               arbolNumeros.insert(8);
               arbolNumeros.insert(20);
               arbolNumeros.insert(15);


               System.out.println("pre Order");

               arbolNumeros.preOrder();
               System.out.println("Pos Order");
               arbolNumeros.posOrder();
               System.out.println("In order");
               arbolNumeros.inOrden();
               System.out.println("niveles");
               arbolNumeros.niveles();
               System.out.println("altura");
               arbolNumeros.altura();
               System.out.println(arbolNumeros.altura());
       


                

            }
}
