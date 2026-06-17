package structurestrees;

import structures.nodes.Node;

public class IntTree {

    private Node<Integer> rool;

    public IntTree() {
        this.rool = null;
    }

    //public void insertar(int value){
       // rool=insertRec(rool , value);
    //}

    public boolean isEmpty(){
        return rool==null;
    }
    public Node<Integer> getRool(){
        return rool;
    }
    public void setRool(Node<Integer> node){
        rool=node;

    }
    public void setRool(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        rool=node;
    }

    public void insert(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        rool= insertRecursivo(rool,node);
        
    }
    //Recursivo para insertar valores ArbolBinario
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> node) {
        if(actual==null){
            return node;

        }
        //Validar si es mayor o menor para ver si va a derecha o izquiera
        if(actual.getValue()> node.getValue()){
            actual.setLeft(insertRecursivo(actual.getLeft(),node));

        }else{
            actual.setRight(insertRecursivo(actual.getRight(),node));

        }

        return actual;

    }

    public void preOrder(){
        preOrderRecursivo(rool);
    }
        
    private void preOrderRecursivo(Node<Integer> actual) {
        if(actual==null){
            return;
        }
        System.out.println(actual + " ");
        //Visitar todo el sub arbol izquierdo
        preOrderRecursivo(actual.getLeft());
         preOrderRecursivo(actual.getRight());
                
    }
    public void posOrder(){
        posOrdenRecursivo(rool);
    }
        
    private void posOrdenRecursivo(Node<Integer> actual) {
        if(actual==null){
            return;
        }
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRight());
        System.out.println(actual + "");

                
    }
    public void inOrden(){
        inOrdenRecursivo(rool);
    }
        
    private void inOrdenRecursivo(Node<Integer> actual) {
        if(actual==null){
            return;
        }
        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual + "");
        inOrdenRecursivo(actual.getRight());
              
    }
    public void niveles() {
        int h = altura();

        for(int i=0; i<h;i++){
            imprimirniveles(rool, i);


        }
    }

    public void imprimirniveles(Node<Integer> rool2, int nivel){
        if(rool2==null){
            return;
        }
        if (nivel == 0) {
            System.out.println(rool2);
        } else {
            imprimirniveles(rool2.getLeft(), nivel - 1);
            imprimirniveles(rool2.getRight(), nivel - 1);
        }
        
    }
    
    public int altura() {
        return altura(rool);
    }

    public int altura(Node<Integer> actual){
        if(actual==null){
            return 0;
        }
        int izquiera=altura(actual.getLeft());
        int derecha=altura(actual.getRight());

        return  1+ Math.max(izquiera, derecha);
    }

        

    
}
