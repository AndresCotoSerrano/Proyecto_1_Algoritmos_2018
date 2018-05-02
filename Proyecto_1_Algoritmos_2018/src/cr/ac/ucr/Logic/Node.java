
package cr.ac.ucr.Logic;


public class Node {
    
    //tiene un dato, y un  puntero, siguiente elemento (otro nodo)

public Object element;
//Un objeto de la misma clase... next pone el element y el proximo netx
public Node next;

public Node previous;
    
//Crear el constructor
public Node (Object element){
    this.element = element;
    this.next = null;
    this.previous = null;
}    

}
