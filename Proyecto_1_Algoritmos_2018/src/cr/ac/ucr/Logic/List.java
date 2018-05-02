/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.Logic;

import cr.ac.ucr.Logic.ListException.ListException;

/**
 *
 * @author Melvin
 */
public interface List {
    
    //Interfaz, obliga a crear los metodos de aqui en las clases donde se implementan
    //se usan excepciones cuando hacemos movimientos o modificamos elementos o consultas
    
    public int getSize()throws ListException;
    public void cancel()throws ListException;
    public boolean isEmpty();
    //Object clase padre, clase principal, entra cualquier objeto
    public int getPosition(Object element) throws ListException;
    public void insert(Object element) throws ListException;
    public void ordererInsert(Object element)throws ListException;
    public void delete(Object element)throws ListException;
    public boolean isElement (Object element);
    public Object first()throws ListException;
    public Object last()throws ListException;
    public Object getNode(int position) throws ListException;
    
}
