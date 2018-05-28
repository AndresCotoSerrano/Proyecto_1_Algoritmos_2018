
package cr.ac.ucr.Files;

import cr.ac.ucr.Domain.Client;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ClientFile {
    
    public String writeClients(Client client, boolean editable) {
        String message = "";
        File fl = new File("Clients.txt");
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fl, editable));

            oos.writeObject(client);

            message = "El cliente fue agregado";
        } //Final del Try
        catch (Exception ex) {
            message = "No se pudo agregar el cliente";
        } // Final del Catch
        return message;
    } // Fin del metodo WriteBooks

    //Retorna un arreglo de libros
    public ArrayList getArrayClients() throws FileNotFoundException {

        ArrayList<Client> arrayClients = new ArrayList<Client>();

        File fl = new File("Clients.txt");
        Object ob = new Object();
        ObjectInputStream ois;
        FileInputStream fis = new FileInputStream(fl);
        try {
            //For que recorre el archivo hasta el final
            for (;;) {
                ois = new ObjectInputStream(fis);
                ob = (Client) ois.readObject();
                if (ob instanceof Client) {

                    arrayClients.add((Client) ob);

                }
            }// Final del For 
        }//Final del try
        catch (Exception ex) {

        }//Final del cath
        return arrayClients;
    }//Final del metodo getArrayBook

  

}
