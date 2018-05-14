
package cr.ac.ucr.Logic;

import cr.ac.ucr.Logic.ListException.ListException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CircularLinkedList {

    /**
 * Clase donde realizamos una lista circular doblemente enlazada y sus respectivos metodos
 *
 * @author Melvin
 * @version 1.0
 *
 */

public class ListaCircularDoble implements List {

    private Node start;
    private Node end;

    public ListaCircularDoble() {

        this.start = null;
        this.end = null;

    }

    /**
 * Metodo que nos devuelve el tamano de la lista
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public int getSize() throws ListException {
        int counter = -1;

        if (isEmpty()) {

            throw new ListException("La lista no contiene ningun elemento para evaluar");

        }

        counter = 1;

        Node auxNode = start;

        while (auxNode != end) {

            counter++;
            auxNode = auxNode.next;

        }

        return counter;
    }

        /**
 * Metodo que cancela o deshabilita la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public void cancel() throws ListException {
        this.start = null;
    }

    @Override
    public boolean isEmpty() {

        return start == null;
    }

    /**
 * Metodo que muestra la posicino de un elemento en la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public int getPosition(Object element) throws ListException {
        if (isEmpty()) {

            throw new ListException("La lista no contiene ningun elemento para evaluar");

        } else {

            Node auxNode = start;

            int position = 1;

            while (auxNode != end) {

                if (auxNode.element.equals(element)) {

                    return position;

                }
                auxNode = auxNode.next;

                position++;

            }

            // Es el ultimo nodo
            if (auxNode == end && auxNode.element.equals(element)) {

                return position;

            }

        }

        return -1;
    }

    /**
 * Metodo que inserta un elemento en la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public void insert(Object element) throws ListException {
        if (isEmpty()) {

            start = end = new Node(element);

        } else {

            Node auxNode = start;

            while (auxNode != end) {

                auxNode = auxNode.next;

            }

            // se sale cuando alcanza el nodo fin
            // Creamos un nuevo nodo
            Node newNode = new Node(element);

            auxNode.next = newNode;// Enlazamos el nuevo nodo

            // hacemos que fin apunte al nuevo nodo
            end = newNode;

            // Hacemos el enlace circular
            end.next = start;

            // Para que funcione el doble enlace
            newNode.previous = auxNode;

        }

    }

    /**
 * Metodo que inserta ordenadamente en la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public void ordererInsert(Object element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
 * Metodo que borra un elemento de la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public void delete(Object element) throws ListException {
        if (isEmpty()) {

            throw new ListException("La lista estÃ¡ vacÃ­a.");

        }

        // Aqui pasa si solo queda un nodo y es el que quiero eliminar?
        if (start == end && start.element.equals(element)) {

            this.delete(element);// Anulo la lista

        } else if (start.element.equals(element)) {// Elemento a
            // suprimir sea
            // el primero de la lista

            start = start.next;
            start.previous = end;

        } else {

            // Elemento a suprimir esta en el centro o final de la lista
            Node auxNode = start;
            Node previousNode = null;

            while (auxNode != end && !start.element.equals(element)) {

                previousNode = auxNode;// Para dejar un rastro del nodo anterior
                auxNode = auxNode.next;

            }
            // Se sale del while cuando alzanca el nodo fin o cuando encuentra
            // el elemento a suprimir

            // Debo asegurarme que fin apunte al ultimo nodo de la lista
            if (auxNode == end) {

                // Estamos en el ultimo nodo
                end = previousNode;// Para que quede apuntando al ultimo nodo valido

            }

        }

        // IMPORTANTE! debo mantener el enlace circular
        end.next = start;
    }

    /**
 * Metodo que muestra si existe o no un elemento en la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public boolean isElement(Object element) {
        try {
            if (isEmpty()) {

                throw new ListException("La lista no contiene ningun elemento para evaluar");
            } else {
                Node auxNode = this.start;
                while (auxNode != end.next) {
                    if (auxNode.element.equals(element)) {
                        return true;
                    } else {
                        auxNode = auxNode.next;
                    }
                }

            }
        } catch (ListException ex) {

            Logger.getLogger(LinkedList.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println("Funcion isElement se ejecuto correctamente");
        }
        return false;
    }

    /**
 * Metodo que devuelve el primer elemento de la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public Object first() throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista no contiene ningun elemento para evaluar");
        } else {
            return start.element;
        }
    }

    /**
 * Metodo que devuelve el ultimo elemento de la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public Object last() throws ListException {
        if (isEmpty()) {
            throw new ListException("La lista no contiene ningun elemento para evaluar");
        } else {
            return end.element;
        }
    }

    /**
 * Metodo que devuelve el elemento de una posicion especifica de la lista circular
 * 
 * @author Melvin
 * @version 1.0
 *
 */
    @Override
    public Object getNode(int position) throws ListException {
        
        if (isEmpty()) {

            throw new ListException("La lista no contiene ningun elemento para evaluar");

        }

        int counter = 1;

        Node auxNode = start;

        while (auxNode != end) {

            if (position == counter) {

                return auxNode;

            }

            auxNode = auxNode.next;
            counter++;

        }

        if (auxNode == end) {

            return auxNode;

        }

        throw new ListException("La lista no contiene ningun elemento para evaluar");
    }
    
}
}
