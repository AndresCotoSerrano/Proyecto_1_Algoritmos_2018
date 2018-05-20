/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.Logic;


import cr.ac.ucr.Logic.StackException.PilaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * implementacion de la interface stack
 *
 * @author deltadragon
 */
public class LinkedStack implements Stack {

    private Node top;
    private int cont;

    public LinkedStack() {
        this.top = null;
        this.cont = 0;
    }

    /**
     * devuelte el tama;o de la pila
     *
     * @return devuelte un entero
     */
    @Override
    public int getSize() {
        return this.cont;
    }

    /**
     * Devuelve si la pila esta vacia
     *
     * @return bolean
     */
    @Override
    public boolean isEmpty() {
        return this.cont == 0;
        // return this.top == null;
    }

    @Override
    public void delete() throws PilaException {
        this.top = null;
    }

    @Override
    public void push(Object element) throws PilaException {
        Node newNode = new Node(element);
        if (isEmpty()) {
            this.top = newNode;
            cont++;
        } else {
            newNode.next = this.top;
            this.top = newNode;
            cont++;
        }
    }

    /**
     * Consulta el valor del primer elemento sin retirarlo de la pula
     *
     * @return un object
     */
    @Override
    public Object peek() {
        return this.top;
    }

    @Override
    public Object pop() throws PilaException {
        if (isEmpty()) {
            throw new PilaException("Esta vacia");
        } else {
            Object temp = this.top.element;
            this.top = this.top.next;
            this.cont--;
            return temp;
        }
    }
/**
 * Metodo que busca un elemento en la pila
 * @param element
 * @return el elemento si esta, si no retorna un -1
 */
    @Override
    public Object search(Object element) {
        LinkedStack pila = new LinkedStack();
        Object temp;
        if (this.top.element.equals(element)) {
            try {
                temp = this.top.element;
                pop();
                return temp;
            } catch (PilaException ex) {
                Logger.getLogger(LinkedStack.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            while (!this.top.element.equals(element)) {
                try {
                    temp = this.top.element;
                    pop();
                    pila.push(temp);
                } catch (PilaException ex) {
                    Logger.getLogger(LinkedStack.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return this.top.element;
        }
        while (!pila.isEmpty()) {
            try {
                temp = pila.top.element;
                pila.pop();
                push(temp);
            } catch (PilaException ex) {
                Logger.getLogger(LinkedStack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
    }
}
