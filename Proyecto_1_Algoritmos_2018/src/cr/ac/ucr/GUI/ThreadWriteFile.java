package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Administrator;
import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Driver;
import cr.ac.ucr.Domain.Product;
import cr.ac.ucr.Domain.Restaurant;
import cr.ac.ucr.Files.ClientFile;
import cr.ac.ucr.Files.Write_Read_Files;
import cr.ac.ucr.Logic.CircularLinkedList;
import cr.ac.ucr.Logic.ListException.ListException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWriteFile extends Thread {

    LinkedList<Agent> fileLinkedListAgent;
    Write_Read_Files write;
    //Instancias de las ventanas de Insert de cada objeto.
    InsertClient insertClient = new InsertClient();
    InsertRestaurant insertRestaurant = new InsertRestaurant();
    InsertDriver insertDriver = new InsertDriver();
    //InsertAgent insertAgent = new InsertAgent();
    InsertAdministrator insertAdministrator = new InsertAdministrator();
    InsertProduct insertProduct = new InsertProduct();

    //Creacion de la respectiva TDA para cargar los datos guardados en la ejecucion a los 20 segundos.
//    LinkedList<Client> fileLinkedListClient = insertClient.getClientList();
//    LinkedList<Restaurant> fileLinkedListRestaurant = insertRestaurant.getRestaurantList();
//    LinkedList<Agent> fileLinkedListAgent = insertAgent.getAgentList();
//    LinkedList<Administrator> fileLinkedListAdministrator = insertAdministrator.getAdminList();
//    //Queue<Driver> = insertDriver.getDriverQueue();
//    CircularLinkedList fileProductCircularList = insertProduct.getProductCircularList();
//    CircularLinkedList fileCircularDrink = insertProduct.getDrinkList();
//    CircularLinkedList fileCircularFood = insertProduct.getFoodList();
//    CircularLinkedList fileCircularDessert = insertProduct.getDessertList();
//    CircularLinkedList fileCircularVarious = insertProduct.getVariousList();
    public void run() {

        //Client client=new Client(tft_ID.getText(), tft_Name.getText(),tft_LastName1.getText(),tft_LastName2.getText(),tft_Email.getText(), tft_Phone.getText(),tft_Province.getText(),tft_Address.getText());
        //clietfile =new ClientFile();
        write = new Write_Read_Files();
        PrintStream psClients = write.getPrintStream("clients.txt");
        PrintStream psRestaurant = write.getPrintStream("restaurant.txt");
        PrintStream psDriver = write.getPrintStream("driver.txt");
        PrintStream psAgent = write.getPrintStream("agent.txt");
        PrintStream psAdministrator = write.getPrintStream("administrator.txt");
        PrintStream psProduct = write.getPrintStream("product.txt");
        PrintStream prueba = write.getPrintStream("PRUEBA.txt");

        int iCliente = 0;
        int iRestaurante = 0;
        int iDrivers = 0;
        int iAgents = 0;
        int iAdministrator = 0;
        int iOrdenes = 0;

        int iProduct = 0;

        while (true) {

            LinkedList<Client> fileLinkedListClient = insertClient.getClientList();
            LinkedList<Restaurant> fileLinkedListRestaurant = insertRestaurant.getRestaurantList();
            LinkedList<Administrator> fileLinkedListAdministrator = insertAdministrator.getAdminList();
            fileLinkedListAgent = InsertAgent.linkedAgent;
            //Queue<Driver> = insertDriver.getDriverQueue();
            CircularLinkedList fileProductCircularList = insertProduct.getProductCircularList();
            System.out.println("AQUI " + fileLinkedListAgent.isEmpty());

            try {

                Thread.sleep(10000);

                System.out.println("PRUEBA DE HILO, pasaron 10 segundos MEEEEELVIIIN");

                prueba.println("PRUEBAAAAAAAAAAAAA");

                if (!fileLinkedListClient.isEmpty()) {
                    for (Client c : fileLinkedListClient) {
                        psClients.println(c.getID() + "   " + c.getName() + "   " + c.getLastName1() + "   " + c.getLastName2() + "   " + c.getEmail() + "   " + c.getPhone() + "   " + c.getProvince() + "   " + c.getAddress());
                    }
                }

                if (!fileLinkedListRestaurant.isEmpty()) {
                    for (Restaurant r : fileLinkedListRestaurant) {
                        psRestaurant.println(r.getID() + "   " + r.getLogo() + "   " + r.getName() + "   " + r.getProvince() + "   " + r.getLocation());
                    }
                }

//                for(Driver){
//                    
//                }
                if (!fileLinkedListAgent.isEmpty()) {
                    for (Agent a : fileLinkedListAgent) {
                        System.out.println("guardo correctamente");
                        psAgent.println(a.getID() + "   " + a.getName() + "   " + a.getLastName1() + "   " + a.getLastName2() + "   " + a.getEmail() + "   " + a.getPhone() + "   " + a.getAddress() + "   " + a.getUser() + "   " + a.getCode());
                        InsertAgent.linkedAgent.remove(a);
                    }
                }

                if (!fileLinkedListAdministrator.isEmpty()) {
                    for (Administrator adm : fileLinkedListAdministrator) {
                        psAdministrator.println(adm.getID() + "   " + adm.getName() + "   " + adm.getLastName1() + "   " + adm.getLastName2() + "   " + adm.getEmail() + "   " + adm.getPhone() + "   " + adm.getAddress() + "   ");
                    }
                }

                if (!fileProductCircularList.isEmpty()) {
                    System.out.println(fileProductCircularList.getNode(0).toString());
                    while (iProduct <= fileProductCircularList.getSize() - 1) {

                        Product product = (Product) fileProductCircularList.getNode(iProduct);
                        psProduct.println(product.getName() + "   " + product.getCost() + "   " + product.getType() + "   " + product.getPathImage());
                        iProduct++;
                    }
                }

            } catch (InterruptedException ex) {
            } catch (ListException ex) {
                Logger.getLogger(ThreadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Client client= fileLinkedListClient.
//   clietfile =new ClientFile();
//   lbl_Message.setText(clietfile.writeClients(client,true));

        }

    }

}
