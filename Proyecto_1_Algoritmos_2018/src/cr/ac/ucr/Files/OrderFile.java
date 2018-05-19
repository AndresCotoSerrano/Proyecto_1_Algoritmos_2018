/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.Files;

import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Order;
import cr.ac.ucr.Logic.LinkedStack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author deltadragon
 */
public class OrderFile {
    public String writeOrder(Order order, boolean editable) {
        String message = "";
        File fl = new File("Order.txt");
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fl, editable));

            oos.writeObject(order);

            message = "La orden fue agregada";
        } //Final del Try
        catch (Exception ex) {
            message = "No se pudo agregar la orden";
        } // Final del Catch
        return message;
    } // Fin del metodo WriteBooks

    //Retorna un arreglo de libros
    public LinkedStack getArrayOrder() throws FileNotFoundException {

        LinkedStack stack = new LinkedStack();

        File fl = new File("Order.txt");
        Object ob = new Object();
        ObjectInputStream ois;
        FileInputStream fis = new FileInputStream(fl);
        try {
            //For que recorre el archivo hasta el final
            for (;;) {
                ois = new ObjectInputStream(fis);
                ob = (Order) ois.readObject();
                if (ob instanceof Order) {

                    stack.push((Order)ob);

                }
            }// Final del For 
        }//Final del try
        catch (Exception ex) {

        }//Final del cath
        return stack;
    }//Final del metodo getArrayBook    
}
