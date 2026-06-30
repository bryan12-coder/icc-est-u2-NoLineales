import java.util.Random;
import java.util.Set;

import collections.maps.Maps;
import collections.sets.Sets;
import models.Contacto;
import models.Person;
import structures.nodes.Node;
import structurestrees.BynaryTree;
import structurestrees.Ejercicio1;
import structurestrees.Ejercicio2;
import structurestrees.Ejercicio3;
import structurestrees.Ejercicio4;
import structurestrees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        //runIntTree();
        //runPersonTree();
        //unEjercicio1();
        //runEjercicio2();
        //runEjercicio3();
        //runEjercicio4();
        //runSets();
        runMaps();
        
                        
                
                    }
                
                private static void runMaps() {
                    Maps maps= new Maps();
                    maps.construirHashMap();
                    System.out.println("--------");
                    maps.contruirLinkedHashMap();
                    System.out.println("----------");
                    maps.cTreeMap();
                
                }
        
                    private static void runSets() {
                Sets sets= new Sets();

                // Primera implementacion hashSet
                System.out.println("HastSet");
                Set<String> hashSet = sets.contruirHasSets();
                System.out.println(hashSet);
                System.out.println("Tamaño : " + hashSet.size());
                System.out.println(hashSet.contains("F"));


                //Segunda implementacion
                Set<String> lhSet= sets.contruirLinkedHashSets();
                System.out.println(lhSet);
                System.out.println("Tamaño : " + lhSet.size());
                System.out.println(lhSet.contains("D"));


                //Tercera implementacion
                System.out.println("Tree Set");
                Set<String> tSet= sets.contruirTreeSets();
                System.out.println(tSet);
                System.out.println("Tamaño : " + tSet.size());
                System.out.println(tSet.contains("D"));


                //Tree set con contacto
                //Tercera implementacion
                System.out.println("Tree Set");
                Set<Contacto> tCSet= sets.contruirTreeSetsComparador();
                System.out.println(tCSet);
                System.out.println("Tamaño : " + tCSet.size());

                //Quinta compracacion
                System.out.println("Has set Contacto");
                Set<Contacto> hCSet= sets.construirHashSetContacto();
                System.out.println(hCSet);
                System.out.println("Tamaño : " + hCSet.size());
                


            }
        
            private static void runEjercicio4() {

        Ejercicio4 ejercicio4 = new Ejercicio4();
        int[] numeros = new int[] { 4, 2, 7, 1, 3, 8 };
        ejercicio4.insert(numeros);

    }

    private static void runEjercicio3() {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int[] numeros = new int[] { 4, 7, 2, 9, 6, 3, 1 };
        ejercicio3.insert(numeros);

    }

    private static void runEjercicio2() {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros = new int[] { 4, 7, 2, 9, 6, 3, 1 };
        ejercicio2.insert(numeros);

    }

    private static void runEjercicio1() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        ejercicio1.insert(numeros);

    }

    private static void runPersonTree() {
        BynaryTree<Person> personTree = new BynaryTree<>();
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Diego", 35));
        personTree.insert(new Person("Rafael", 35));
        personTree.insert(new Person("Ana", 35));
        // Pregunta de prueba

        personTree.inOrden();
        System.out.println();
        personTree.preOrder();

    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree();

        // arbolNumeros.setRool(10);
        // System.out.println("Raiz" + arbolNumeros.getRool());

        // Node<Integer> node2= new Node<>(20);
        // Node<Integer> node3= new Node<>(30);
        // Node<Integer> node4= new Node<>(40);
        // Node<Integer> node5= new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRool();

        // root.setLeft(node2);
        // root.setRight(node3);

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
        System.out.println("peso");

        arbolNumeros.peso();
        System.out.println(arbolNumeros.peso());

    }

    private static void runIntComparativaPesos() {
        IntTree tree = new IntTree();
        Random random = new Random();

        final int TOTAL_NODOS = 50_000;
        final int MIN = 1;
        final int MAX = 50_000;

        // Insertar 50 000 números aleatorios entre 1 y 50 000
        for (int i = 0; i < TOTAL_NODOS; i++) {
            int value = random.nextInt(MAX - MIN + 1) + MIN;
            tree.insert(value);
        }

        // Medir peso con variable acumulada
        long inicioPesoVariable = System.nanoTime();

        int pesoVariable = tree.getPeso();

        long finPesoVariable = System.nanoTime();

        double tiempoPesoVariableMs = (finPesoVariable - inicioPesoVariable) / 1_000_000.0;

        // Medir peso recursivo
        long inicioPesoRecursivo = System.nanoTime();

        int pesoRecursivo = tree.peso();

        long finPesoRecursivo = System.nanoTime();

        double tiempoPesoRecursivoMs = (finPesoRecursivo - inicioPesoRecursivo) / 1_000_000.0;

        // Resultados
        System.out.println("Cantidad de nodos insertados: " + TOTAL_NODOS);
        System.out.println("Peso usando variable: " + pesoVariable);
        System.out.println("Peso usando recursion: " + pesoRecursivo);

        System.out.println();

        // System.out.println("Tiempo getPeso(): "
        // + tiempoPesoVariableMs + " ms");

        // System.out.println("Tiempo pesoRecursivo(): "
        // + tiempoPesoRecursivoMs + " ms");

    }

}
