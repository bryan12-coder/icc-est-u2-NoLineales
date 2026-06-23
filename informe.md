## Informe
## Ejercicio 1
## Insercion de un Bta y impresion de la consola de manera vertical
![alt text](image-5.png)

## Descripcion
El metodo insert permite llegar a crear un arbol nuevo y despues con los numeros que le dimos en el main va insertando uno por uno en las posiciones adecuadas para mostarlo en consola
## Descripcion del printTreeRecursivo
El metodo de printTree generalmente es como la base de donde empieza el arbol es el quien sabe a donde mandar cada elemento generado, es el que va a llamar al metodo recursivo para ir ubicando los elementos y imprimiendolos, el metodo printRecursivo
empieza con el caso base de que si el la raiz es igual a un null va a retornar la misma raiz, despues lo que hace es va a la derecha del arbol verifica si tiene hijos, como bajo tiene que sumar uno al nivel y imprime ese nodo con una tabulacion, y hace lo mismo con la izquierda, llega a regresar a la raiz y despues baja a la izquierda y se suma uno al nivel y va verificando y imprime el valor de la izquierda con su tabulacion.
## Salida de consola 
![alt text](<assents/image copy 4.png>)

## Segundo ejercicio
## Insercion con Inversion de un arbol Binario
![alt text](image-6.png)
![alt text](image-7.png)

## Descripcion
El metodo insert va insertando numero por numero de los valores que le dimos en el arbol, despues imprime el arreglo orginal y despues  creammos una varibale invertido el cual va a guardar al metodo va a llamar el metodo invert el cual por consiguiente tambien llame al metodo invert recuersivo va intercambiado a sus hijos y muestra el proceso invertido,

## Inver y invertRecursivo

en el invert recuersivo lo uno que hacemos es retornar en invertRecursivo con su raiz principal, y esta llama directamente al metodo recursivo, despues tenemos en mietodo invertRecursivo el cual genera una caso baso que si su raiz es igual a null returna su misma raiz, despues crea una varibale auxiliar de tipo Nodo para guardar el valor que esta a la izquiera, despues como esa izquiera queda vacia lo que hacemos es meter el valor que estaba a la derecha, y despues como esa derecha queda vacia metemos el auxiliar que como habiamos dicho guardaba el valor de la izquierda entonces mete ese valor a la derecha, desoues solo llamammos a la izquierda y a la derecha con sus nuevos valores y retornamos su raiz.
## Print tree y printTree recursivo
El print es el que directamente va a saber donde ubicar cada elemento, para imprimirlo, dependiendo de el metodo recursivo.
el metodo printTreeRecursivo valida que la raiz no sea nula, una vez que valida eso va recorriendo el lado derecho y baja y la va sumando uno al nivel y va imprimendo el valor que esta ahi, y asi hace lo mismo con el de la izquierda una vez que acabo con el de la derecha.

## Salida de consola 
![alt text](image-8.png)

| Ejercicio | Evidencia de código | Evidencia de consola | Observación |
|----------|---------------------|----------------------|-------------|
| Ejercicio 01: Insertar en BST | ![alt text](image-5.png) |![alt text](<assents/image copy 4.png>)  |Es un ejercicio que relamente ayuda a desarrollar la logica para poder poner el arbol de forma vertical y imprimir la raiz y sus hijos y nodos |
| Ejercicio 02: Invertir árbol binario | ![alt text](image-6.png)| ![alt text](image-8.png) | En este segundo codigo podemos ver que el arbol lo podemos invertier creando un auxiliar para guardar una varible y irle poniendo para que el que esta a la derecha se pase a la izquierda y viceversa y despues solo lo imprimimos.|
| Ejercicio 03: Listar niveles | Código de ListLevels y método listLevels | Salida mostrando una lista por cada nivel | |
| Ejercicio 04: Profundidad máxima | Código de Depth y método maxDepth | Salida mostrando la profundidad calculada | |


