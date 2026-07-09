package structures.graphs;

import java.util.List;
import java.util.Set;

import structures.nodes.Node;

public class PathResult <T>{

    private final Set<T> visitados;
    private final Set<T> paht;

    public PathResult(Set<T> visitados, Set<T> paht) {
        this.visitados = visitados;
        this.paht = paht;
    }
    public Set<T> getVisitados() {
        return visitados;
    }
    public Set<T> getPaht() {
        return paht;
    }
    @Override
    public String toString() {
        return "PathResult [\n visitados=" + visitados + 
        (!paht.isEmpty() 
        ?  "Path= " + paht
        :" \n No se encontro camino entre los nodos ");
    }
    
    



    


    
}
