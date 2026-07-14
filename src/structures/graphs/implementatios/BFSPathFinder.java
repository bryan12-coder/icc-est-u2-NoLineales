package structures.graphs.implementatios;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


import structures.graphs.Graph;
import structures.graphs.PathFinder;
import structures.graphs.PathResult;
import structures.nodes.Node;

public class BFSPathFinder<T> implements PathFinder<T> {
    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end){
        Queue<T> queue = new LinkedList<>();
        Set<T> visitados = new LinkedHashSet<>();
        Map<Node<T> , Node<T>> parent = new LinkedHashMap<>();
        Set<T> viseted = new LinkedHashSet<>();

        queue.add(start);
        visitados.add(start);
        parent.put(new Node<>(start), null);
        while (!queue.isEmpty()) {
            T current = queue.poll();
            viseted.add(current);
            if(current.equals(end)){
                return new PathResult<>(viseted, buildPath(parent, end));
            }  
            for(Node<T> vecino: graph.getVecinos(current)){
                if(!visitados.contains(vecino.getValue())){
                    visitados.add(vecino.getValue());
                    parent.put(vecino, new Node<T>(current));
                    queue.add(vecino.getValue());
                }
            }
        }
        return new PathResult<>(viseted, new HashSet<>() );

    }

    private Set<T>  buildPath(Map<Node<T>, Node<T>> parent, T end) {
        Set<T> path= new LinkedHashSet<>();
        Node<T> nEnd= new Node<>(end);
        List<T> temp= new ArrayList<>();
        for(Node<T> at= nEnd; at !=null; at=parent.get(at)){// crea una unstancia de nodo at
            path.add(at.getValue());
        }
        while(path.isEmpty()){
            

        }


        return path;

        
    }
}

