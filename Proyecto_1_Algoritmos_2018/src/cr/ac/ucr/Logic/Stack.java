/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.Logic;

import cr.ac.ucr.Logic.StackException.PilaException;



/**
 *
 * @author deltadragon
 */
public interface Stack {
    public int getSize();
    public boolean isEmpty();
    public void delete() throws PilaException;
    public void push(Object element) throws PilaException;// inserta un elemento en la pila
    public Object peek(); //consulta el inicio de una pila, top()
    public Object pop() throws PilaException;//saca el ultimo elemento ingresado de la pila
    public Object search(Object element);//
    
}
