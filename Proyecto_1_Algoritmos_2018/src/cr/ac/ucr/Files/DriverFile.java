/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.Files;

import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Driver;
import cr.ac.ucr.Domain.Order;
import cr.ac.ucr.Logic.LinkedStack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author UsuarioPC
 */
public class DriverFile {
     public String writeDrivers(Driver driver, boolean editable) {
         FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("Driver.txt");
            pw = new PrintWriter(fichero);

            
                pw.println(driver);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
         return null;
    

    } // Fin del metodo WriteBooks

    
   public LinkedStack getArrayOrder() throws FileNotFoundException {

        LinkedStack stack = new LinkedStack();

        File fl = new File("Driver.txt");
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
