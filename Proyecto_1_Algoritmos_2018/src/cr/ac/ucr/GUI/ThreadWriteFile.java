package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Administrator;
import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Driver;
import cr.ac.ucr.Domain.Product;
import cr.ac.ucr.Domain.Restaurant;
import cr.ac.ucr.Files.ClientFile;
import cr.ac.ucr.Files.Write_Read_Files;
import cr.ac.ucr.Files.readFiles;
import cr.ac.ucr.Logic.CircularLinkedList;
import cr.ac.ucr.Logic.ListException.ListException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWriteFile extends Thread {

    LinkedList<Agent> fileLinkedListAgent;
    LinkedList<Administrator> fileLinkedAdministrator;
    LinkedList<Restaurant> fileLinkedRestaurant;
    CircularLinkedList fileCircularProduct;
    Queue<Driver> fileLinkedDriver;
            
       //LinkedList<Administrator> fileLinkedListAdministrator = insertAdministrator.getAdminList();
    readFiles read = new readFiles();
    Write_Read_Files write;
    //Instancias de las ventanas de Insert de cada objeto.
    InsertClient insertClient = new InsertClient();
  // InsertDriver insertDriver = new InsertDriver();
   


    public void run() {

     
        write = new Write_Read_Files();
        PrintStream psClients = write.getPrintStream("clients.txt");
        PrintStream psRestaurant = write.getPrintStream("restaurant.txt");
        PrintStream psDriver = write.getPrintStream("driver.txt");
        PrintStream psAgent = write.getPrintStream("agent.txt");
        PrintStream psAdministrator = write.getPrintStream("administrator.txt");
        PrintStream psProduct = write.getPrintStream("product.txt");
       // PrintStream prueba = write.getPrintStream("PRUEBA.txt");


        int iProduct = 0;

        while (true) {

            LinkedList<Client> fileLinkedListClient = insertClient.getClientList();
           // LinkedList<Restaurant> fileLinkedListRestaurant = insertRestaurant.getRestaurantList();
            
            //LinkedList<Administrator> fileLinkedListAdministrator = insertAdministrator.getAdminList();
            fileLinkedRestaurant = InsertRestaurant.linkedListRestaurant;
            fileLinkedListAgent = InsertAgent.linkedAgent;
            fileLinkedAdministrator = InsertAdministrator.linkedAdministrator;
            fileCircularProduct = InsertProduct.circularListProduct;
            fileLinkedDriver = InsertDriver.driversQueue;
            
            //CircularLinkedList fileProductCircularList = insertProduct.getProductCircularList();
           
            System.out.println("AQUI " + fileLinkedListAgent.isEmpty());

            try {

                Thread.sleep(10000);

                System.out.println("PRUEBA DE HILO, pasaron 10 segundos MEEEEELVIIIN");


                if (!fileLinkedListClient.isEmpty()) {
                    for (Client c : fileLinkedListClient) {
                        psClients.println(c.getID() + "   " + c.getName() + "   " + c.getLastName1() + "   " + c.getLastName2() + "   " + c.getEmail() + "   " + c.getPhone() + "   " + c.getProvince() + "   " + c.getAddress());
                    }
                }

                if (!fileLinkedRestaurant.isEmpty()) {
                    for (Restaurant r : fileLinkedRestaurant) {
                        psRestaurant.println(r.getID() + "   " + r.getLogo() + "   " + r.getName() + "   " + r.getProvince() + "   " + r.getLocation());
                        InsertRestaurant.linkedListRestaurant.remove(r);
                    }
                }

                if(!fileLinkedDriver.isEmpty()){
                    for (Driver d : fileLinkedDriver){
                        psDriver.println(d.getID()+"   "+d.getName()+"   "+d.getLastName1()+"   "+d.getLastName2()+"   "+d.getEmail()+"   "+d.getPhone()+"   "+d.getProvince()+"   "+d.getAddress()+"   "+d.getTypeVehicule()+"   "+d.getAge());
                        InsertDriver.driversQueue.remove(d);
                    }
                   
                }

                if (!fileLinkedListAgent.isEmpty()) {

                    System.out.println("PRUEBA111");

                    LinkedList<Agent> agentList = read.readAgent();
                   

                        for (Agent a : this.fileLinkedListAgent) {
                            psAgent.println(a.getID() + ";" + a.getName() + ";" + a.getLastName1() + ";" + a.getLastName2() + ";" + a.getEmail() + ";" + a.getPhone() + ";" + a.getProvince() + ";" + a.getAddress() + ";" + a.getUser() + ";" + a.getCode());

                            InsertAgent.linkedAgent.remove(a);
                        }
                    
                }

              
                if (!fileLinkedAdministrator.isEmpty()) {
                    for (Administrator adm : fileLinkedAdministrator) {
                        psAdministrator.println(adm.getID() + "   " + adm.getName() + "   " + adm.getLastName1() + "   " + adm.getLastName2() + "   " + adm.getEmail() + "   " + adm.getPhone() +"   "+adm.getProvince()  +"   " + adm.getAddress() + "   ");
                        InsertAdministrator.linkedAdministrator.remove(adm);
                    }
                }

                if (!fileCircularProduct.isEmpty()) {
                    System.out.println(fileCircularProduct.getNode(0).toString());
                    while (iProduct <= fileCircularProduct.getSize() - 1) {

                        Product product = (Product) fileCircularProduct.getNode(iProduct);
                        psProduct.println(product.getName() + "   " + product.getCost() + "   " + product.getType() + "   " + product.getPathImage());
                        //InsertProduct.circularListProduct.delete(product);
                        iProduct++;
                       
                    }
                }

            } catch (InterruptedException ex) {
            } catch (ListException ex) {
                Logger.getLogger(ThreadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        }

    }

}
