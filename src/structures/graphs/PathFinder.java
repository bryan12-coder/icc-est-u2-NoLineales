package structures.graphs;

//Interface --> No contiene logica interna
// Define los metodos
// No se puede instanciar
// Estructura de metodo, el objetivo de mi sistema es encontrar una ruta
// Define una accion, la accion define el resultado

public interface PathFinder <T>{
    PathResult<T> find(Graph<T> graph, T start, T end);

    
}
