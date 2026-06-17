package structurestrees;

import structures.nodes.Node;

public class BynaryTree<T extends Comparable<T>> {
    private Node<T> rool;
    private int peso;//Para hacer la complejidad en O(1)

    public BynaryTree() {
        this.rool = null;
    }

    //public void insertar(int value){
       // rool=insertRec(rool , value);
    //}

    public boolean isEmpty(){
        return rool==null;
    }
    public Node<T> getRool(){
        return rool;
    }
    public void setRool(Node<T> node){
        rool=node;

    }
    public void setRool(T value){
        Node<T> node = new Node<T>(value);
        rool=node;
    }

    public void insert(T value){//Aqui inserto los nodos
        Node<T> node = new Node<T>(value);
        rool= insertRecursivo(rool,node);
        peso++;//AQUI SUMO EL PESO PARA QUE SE VEA
        
    }
    //Recursivo para insertar valores ArbolBinario
    private Node<T> insertRecursivo(Node<T> actual, Node<T> node) {
        if(actual==null){
            return node;

        }
        //Validar si es mayor o menor para ver si va a derecha o izquiera
        if(actual.getValue().compareTo(node.getValue())>0){
            actual.setLeft(insertRecursivo(actual.getLeft(),node));

        }else{
            actual.setRight(insertRecursivo(actual.getRight(),node));

        }

        return actual;

    }

    public void preOrder(){
        preOrderRecursivo(rool);
    }
        
    private void preOrderRecursivo(Node<T> actual) {
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
        
    private void posOrdenRecursivo(Node<T> actual) {
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
        
    private void inOrdenRecursivo(Node<T> actual) {
        if(actual==null){
            return;
        }
        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual +  " ");
        inOrdenRecursivo(actual.getRight());
              
    }
    public void niveles() {
        int h = altura();

        for(int i=0; i<h;i++){
            imprimirniveles(rool, i);


        }
    }

    public void imprimirniveles(Node<T> rool2, int nivel){
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

    public int altura(Node<T> actual){
        if(actual==null){
            return 0;
        }
        int izquiera=altura(actual.getLeft());
        int derecha=altura(actual.getRight());

        return  1+ Math.max(izquiera, derecha);
    }
    //Cantidad de nodos totales
    public int peso(){
        return pesoRecursivo(rool);
            }
        
    private int pesoRecursivo(Node<T> rool2) {
        if(rool2==null){
            return 0;
        }
            int izquierda=pesoRecursivo(rool2.getLeft());
            int derecha=pesoRecursivo(rool2.getRight());
        
            return (izquierda+derecha) + 1;
    }
    public int getPeso(){//CREE EL GET Y YA 
        return peso;
    }
}
