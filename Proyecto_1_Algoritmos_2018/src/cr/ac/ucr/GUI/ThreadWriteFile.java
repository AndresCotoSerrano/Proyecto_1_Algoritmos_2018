package cr.ac.ucr.GUI;

import com.csvreader.CsvWriter;
import cr.ac.ucr.Domain.Administrator;
import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Driver;
import cr.ac.ucr.Domain.Order;
import cr.ac.ucr.Domain.Product;
import cr.ac.ucr.Domain.Restaurant;
import cr.ac.ucr.Files.ClientFile;
import cr.ac.ucr.Files.ReadFilesCSV;
import cr.ac.ucr.Files.Write_Read_Files;
import cr.ac.ucr.Files.readFiles;
import cr.ac.ucr.Logic.CircularLinkedList;
import cr.ac.ucr.Logic.ListException.ListException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
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
    ArrayList<Product> listProduct;

    readFiles read = new readFiles();
    Write_Read_Files write;
    //Instancias de las ventanas de Insert de cada objeto.
    InsertClient insertClient = new InsertClient();
<<<<<<< HEAD
 
   
 public void run() {

     
//        write = new Write_Read_Files();
//        PrintStream psClients = write.getPrintStream("clients.txt");
//        PrintStream psRestaurant = write.getPrintStream("restaurant.txt");
//        PrintStream psDriver = write.getPrintStream("driver.txt");
//        PrintStream psAgent = write.getPrintStream("agent.txt");
//        PrintStream psAdministrator = write.getPrintStream("administrator.txt");
//        PrintStream psProduct = write.getPrintStream("product.txt");
     


       // int iProduct = 0;
=======

    public void run() {
>>>>>>> dd5aab91202de4138fb1da5d40421a301cb3a0da

//        write = new Write_Read_Files();
//        PrintStream psClients = write.getPrintStream("clients.txt");
//        PrintStream psRestaurant = write.getPrintStream("restaurant.txt");
//        PrintStream psDriver = write.getPrintStream("driver.txt");
//        PrintStream psAgent = write.getPrintStream("agent.txt");
//        PrintStream psAdministrator = write.getPrintStream("administrator.txt");
//        PrintStream psProduct = write.getPrintStream("product.txt");
        // int iProduct = 0;
        while (true) {

            LinkedList<Client> fileLinkedListClient = insertClient.getClientList();

            InsertRestaurant.linkedListRestaurant = ReadFilesCSV.readCSVRestaurant();
            InsertAgent.linkedAgent = ReadFilesCSV.readCSVAgent();
            InsertAdministrator.linkedAdministrator = ReadFilesCSV.readCSVAdministrator();
            InsertProduct.circularListProduct = ReadFilesCSV.readCSVProduct();
            InsertDriver.driversQueue = ReadFilesCSV.readCSVDriver();

            fileLinkedRestaurant = InsertRestaurant.linkedListRestaurant;
            fileLinkedListAgent = InsertAgent.linkedAgent;
            fileLinkedAdministrator = InsertAdministrator.linkedAdministrator;
            fileCircularProduct = InsertProduct.circularListProduct;
            fileLinkedDriver = InsertDriver.driversQueue;
<<<<<<< HEAD
            
           
            
=======
>>>>>>> dd5aab91202de4138fb1da5d40421a301cb3a0da

            try {
                
           

                Thread.sleep(10000);

                System.out.println("PRUEBA DE HILO, pasaron 20 segundos MEEEEELVIIIN");

                if (!fileLinkedListAgent.isEmpty()) {
                    writeAgent();
                }
<<<<<<< HEAD
//                if (!fileLinkedListClient.isEmpty()) {
//                    for (Client c : fileLinkedListClient) {
//                        psClients.println(c.getID() + "   " + c.getName() + "   " + c.getLastName1() + "   " + c.getLastName2() + "   " + c.getEmail() + "   " + c.getPhone() + "   " + c.getProvince() + "   " + c.getAddress());
//                    }
//                }
//
//                if (!fileLinkedRestaurant.isEmpty()) {
//                    for (Restaurant r : fileLinkedRestaurant) {
//                        psRestaurant.println(r.getID() + "   " + r.getLogo() + "   " + r.getName() + "   " + r.getProvince() + "   " + r.getLocation());
//                        InsertRestaurant.linkedListRestaurant.remove(r);
//                    }
//                }
//
//                if(!fileLinkedDriver.isEmpty()){
//                    for (Driver d : fileLinkedDriver){
//                        psDriver.println(d.getID()+"   "+d.getName()+"   "+d.getLastName1()+"   "+d.getLastName2()+"   "+d.getEmail()+"   "+d.getPhone()+"   "+d.getProvince()+"   "+d.getAddress()+"   "+d.getTypeVehicule()+"   "+d.getAge());
//                        InsertDriver.driversQueue.remove(d);
//                    }
//                   
//                }
//
//                if (!fileLinkedListAgent.isEmpty()) {
//
//                    System.out.println("PRUEBA111");
//
//                    LinkedList<Agent> agentList = read.readAgent();
//                   
//
//                        for (Agent a : this.fileLinkedListAgent) {
//                            psAgent.println(a.getID() + ";" + a.getName() + ";" + a.getLastName1() + ";" + a.getLastName2() + ";" + a.getEmail() + ";" + a.getPhone() + ";" + a.getProvince() + ";" + a.getAddress() + ";" + a.getUser() + ";" + a.getCode());
//
//                            InsertAgent.linkedAgent.remove(a);
//                        }
//                    
//                }
//
//              
//                if (!fileLinkedAdministrator.isEmpty()) {
//                    for (Administrator adm : fileLinkedAdministrator) {
//                        psAdministrator.println(adm.getID() + "   " + adm.getName() + "   " + adm.getLastName1() + "   " + adm.getLastName2() + "   " + adm.getEmail() + "   " + adm.getPhone() +"   "+adm.getProvince()  +"   " + adm.getAddress() + "   ");
//                        InsertAdministrator.linkedAdministrator.remove(adm);
//                    }
//                }
//
//                if (!fileCircularProduct.isEmpty()) {
//                    System.out.println(fileCircularProduct.getNode(0).toString());
//                    while (iProduct <= fileCircularProduct.getSize() - 1) {
//
//                        Product product = (Product) fileCircularProduct.getNode(iProduct);
//                        System.out.println(product.getName());
//                       // listProduct.add(product);
//                        psProduct.println(product.getName() + "   " + product.getCost() + "   " + product.getType() + "   " + product.getPathImage());
//                        InsertProduct.circularListProduct.delete(product);
//                        iProduct++;
//                        System.out.println("A" +iProduct);
//                    }
//                    iProduct = 0;
//                    while (iProduct<=listProduct.size() ){
//                        Product p = listProduct.get(iProduct);
//                           psProduct.println(p.getName() + "   " + p.getCost() + "   " + p.getType() + "   " + p.getPathImage());
//                            listProduct.remove(iProduct);
//                    }
                }

             catch (InterruptedException ex) {
                 
             } 
        }
  
        }

 //Metodos de escritura de Archivos .csv
 //metodo que escribe Agentes
  public void writeAgent() {

      
            try {

                CsvWriter csvOutput = new CsvWriter("Agent.csv",';', Charset.forName("UTF-8"));
               
                    csvOutput.write("ID");
                   
                    csvOutput.write("Name");

                    csvOutput.write("LastName1");

                    csvOutput.write("LastName2");

                    csvOutput.write("Email");

                    csvOutput.write("Phone");
                    
                    csvOutput.write("Province");
                    
                    csvOutput.write("Address");
                    
                    csvOutput.write("User");
                    
                    csvOutput.write("Code");

                    csvOutput.endRecord();

                    for (Agent a : this.fileLinkedListAgent) {
                      csvOutput.write(a.getID());
                      csvOutput.write(a.getName());
                      csvOutput.write(a.getLastName1());
                      csvOutput.write(a.getLastName2());
                      csvOutput.write(a.getEmail());
                      csvOutput.write(a.getPhone());
                      csvOutput.write(a.getProvince());
                      csvOutput.write(a.getAddress());
                      csvOutput.write(a.getUser());
                      csvOutput.write(a.getCode());
                       csvOutput.endRecord();
                    }
                    
                     csvOutput.close();
//                   

            } catch (IOException e) {

                e.printStackTrace();

            }

    

    }
 
  
  public void writeAdministrator() {

      
            try {

                CsvWriter csvOutput = new CsvWriter("Administrator.csv",';', Charset.forName("UTF-8"));
               
                    csvOutput.write("ID");
                   
                    csvOutput.write("Name");

                    csvOutput.write("LastName1");

                    csvOutput.write("LastName2");

                    csvOutput.write("Email");

                    csvOutput.write("Phone");
                    
                    csvOutput.write("Province");
                    
                    csvOutput.write("Address");
                    

                    csvOutput.endRecord();

                    for (Administrator adm : this.fileLinkedAdministrator) {
                      csvOutput.write(adm.getID());
                      csvOutput.write(adm.getName());
                      csvOutput.write(adm.getLastName1());
                      csvOutput.write(adm.getLastName2());
                      csvOutput.write(adm.getEmail());
                      csvOutput.write(adm.getPhone());
                      csvOutput.write(adm.getProvince());
                      csvOutput.write(adm.getAddress());
                     
                       csvOutput.endRecord();
                    }
                    
                     csvOutput.close();
//                   

            } catch (IOException e) {

                e.printStackTrace();

            }

    }
  
  
  public void writeDriver() {

      
            try {

                CsvWriter csvOutput = new CsvWriter("Driver.csv",';', Charset.forName("UTF-8"));
               
                    csvOutput.write("ID");
                   
                    csvOutput.write("Name");

                    csvOutput.write("LastName1");

                    csvOutput.write("LastName2");

                    csvOutput.write("Email");

                    csvOutput.write("Phone");
                    
                    csvOutput.write("Province");
                    
                    csvOutput.write("Address");
                    
                    csvOutput.write("Vehicle");
                    
                    csvOutput.write("Age");
                    

                    csvOutput.endRecord();

                    for (Driver d : this.fileLinkedDriver) {
                      csvOutput.write(d.getID());
                      csvOutput.write(d.getName());
                      csvOutput.write(d.getLastName1());
                      csvOutput.write(d.getLastName2());
                      csvOutput.write(d.getEmail());
                      csvOutput.write(d.getPhone());
                      csvOutput.write(d.getProvince());
                      csvOutput.write(d.getAddress());
                      csvOutput.write(d.getTypeVehicule());
                      csvOutput.write(d.getAge());
                     
                       csvOutput.endRecord();
                    }
                    
                     csvOutput.close();
//                   

            } catch (IOException e) {

                e.printStackTrace();

            }

    }
  public void writeRestaurant() {

      
            try {

                CsvWriter csvOutput = new CsvWriter("Restaurant.csv",';', Charset.forName("UTF-8"));
               
                    csvOutput.write("ID");
                   
                    csvOutput.write("Logo");

                    csvOutput.write("Name");

                    csvOutput.write("Province");

                    csvOutput.write("Location");

                    csvOutput.endRecord();

                    for (Restaurant r : this.fileLinkedRestaurant) {
                        
                        csvOutput.write(r.getID());
                        csvOutput.write(r.getLogo());
                        csvOutput.write(r.getName());
                        csvOutput.write(r.getProvince());
                        csvOutput.write(r.getLocation());
                        
                     csvOutput.endRecord();
                    }
                    
                     csvOutput.close();
//                   

            } catch (IOException e) {

                e.printStackTrace();

            }

    }
  
  public void writeProduct() throws ListException {

      
            try {

                     int i = 0;
           while (i<= fileCircularProduct.getSize()){
              Product product= (Product) fileCircularProduct.getNode(i);
              listProduct.add(product);
               i++;
           } 
                
                CsvWriter csvOutput = new CsvWriter("Product.csv",';', Charset.forName("UTF-8"));
               
                    csvOutput.write("Name");
                   
                    csvOutput.write("Cost");

                    csvOutput.write("Type");

                    csvOutput.write("Image");

                    csvOutput.endRecord();

                    for (Product p : this.listProduct) {
                        
                        csvOutput.write(p.getName());
                        csvOutput.write(p.getCost());
                        csvOutput.write(p.getType());
                        csvOutput.write(p.getPathImage());
                     
                     csvOutput.endRecord();
                    }
                    
                     csvOutput.close();
//                   

            } catch (IOException e) {

                e.printStackTrace();

            }
=======

                if (!fileLinkedListClient.isEmpty()) {

                }

                if (!fileLinkedRestaurant.isEmpty()) {
                    writeRestaurant();
                }

                if (!fileLinkedDriver.isEmpty()) {
                    writeDriver();
                }

                if (!fileLinkedAdministrator.isEmpty()) {
                    writeAdministrator();
                }

                if (!fileCircularProduct.isEmpty()) {
                    writeProduct();
                }

//                  if (!fileLinkedOrder.isEmpty()) {
//                      
//                  } 
            } catch (InterruptedException ex) {

            } catch (ListException ex) {
                Logger.getLogger(ThreadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
>>>>>>> dd5aab91202de4138fb1da5d40421a301cb3a0da

    }
  
  
  public void writeOrder() {

      
            try {

            CsvWriter csvOutput = new CsvWriter("Order.csv",';', Charset.forName("UTF-8"));
               
                    csvOutput.write("Name");
                   
                    csvOutput.write("Cost");

                    csvOutput.write("Type");

                    csvOutput.write("Image");

                    csvOutput.endRecord();

                    for (Product p : this.listProduct) {
                        
                        csvOutput.write(p.getName());
                        csvOutput.write(p.getCost());
                        csvOutput.write(p.getType());
                        csvOutput.write(p.getPathImage());
                     
                     csvOutput.endRecord();
                    }
                    
                     csvOutput.close();
//                   

            } catch (IOException e) {

                e.printStackTrace();

            }

    }
  
  
  
//  public void writeClient() {
//
//      
//            try {
//
//                CsvWriter csvOutput = new CsvWriter("Client.csv",';', Charset.forName("UTF-8"));
//               
//                    csvOutput.write("ID");
//                   
//                    csvOutput.write("Name");
//
//                    csvOutput.write("LastName1");
//
//                    csvOutput.write("LastName2");
//
//                    csvOutput.write("Email");
//
//                    csvOutput.write("Phone");
//                    
//                    csvOutput.write("Province");
//                    
//                    csvOutput.write("Address");
//                    
//
//                    csvOutput.endRecord();
//
//                    for (Client c : this.fileLinkedAdministrator) {
//                      csvOutput.write(c.getID());
//                      csvOutput.write(c.getName());
//                      csvOutput.write(c.getLastName1());
//                      csvOutput.write(c.getLastName2());
//                      csvOutput.write(c.getEmail());
//                      csvOutput.write(c.getPhone());
//                      csvOutput.write(c.getProvince());
//                      csvOutput.write(c.getAddress());
//                     
//                       csvOutput.endRecord();
//                    }
//                    
//                     csvOutput.close();
//                   
//
//            } catch (IOException e) {
//
//                e.printStackTrace();
//
//            }
//
//    }
 
  
  
    }


<<<<<<< HEAD
=======
    //Metodos de escritura de Archivos .csv
    //metodo que escribe Agentes
    public void writeAgent() {

        try {

            CsvWriter csvOutput = new CsvWriter("Agent.csv", ';', Charset.forName("UTF-8"));

            csvOutput.write("ID");

            csvOutput.write("Name");

            csvOutput.write("LastName1");

            csvOutput.write("LastName2");

            csvOutput.write("Email");

            csvOutput.write("Phone");

            csvOutput.write("Province");

            csvOutput.write("Address");

            csvOutput.write("User");

            csvOutput.write("Code");

            csvOutput.endRecord();

            for (Agent a : this.fileLinkedListAgent) {
                csvOutput.write(a.getID());
                csvOutput.write(a.getName());
                csvOutput.write(a.getLastName1());
                csvOutput.write(a.getLastName2());
                csvOutput.write(a.getEmail());
                csvOutput.write(a.getPhone());
                csvOutput.write(a.getProvince());
                csvOutput.write(a.getAddress());
                csvOutput.write(a.getUser());
                csvOutput.write(a.getCode());
                csvOutput.endRecord();
            }

            csvOutput.close();
//                   

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public void writeAdministrator() {

        try {

            CsvWriter csvOutput = new CsvWriter("Administrator.csv", ';', Charset.forName("UTF-8"));

            csvOutput.write("ID");

            csvOutput.write("Name");

            csvOutput.write("LastName1");

            csvOutput.write("LastName2");

            csvOutput.write("Email");

            csvOutput.write("Phone");

            csvOutput.write("Province");

            csvOutput.write("Address");

            csvOutput.endRecord();

            for (Administrator adm : this.fileLinkedAdministrator) {
                csvOutput.write(adm.getID());
                csvOutput.write(adm.getName());
                csvOutput.write(adm.getLastName1());
                csvOutput.write(adm.getLastName2());
                csvOutput.write(adm.getEmail());
                csvOutput.write(adm.getPhone());
                csvOutput.write(adm.getProvince());
                csvOutput.write(adm.getAddress());

                csvOutput.endRecord();
            }

            csvOutput.close();
//                   

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public void writeDriver() {

        try {

            CsvWriter csvOutput = new CsvWriter("Driver.csv", ';', Charset.forName("UTF-8"));

            csvOutput.write("ID");

            csvOutput.write("Name");

            csvOutput.write("LastName1");

            csvOutput.write("LastName2");

            csvOutput.write("Email");

            csvOutput.write("Phone");

            csvOutput.write("Province");

            csvOutput.write("Address");

            csvOutput.write("Vehicle");

            csvOutput.write("Age");

            csvOutput.endRecord();

            for (Driver d : this.fileLinkedDriver) {
                csvOutput.write(d.getID());
                csvOutput.write(d.getName());
                csvOutput.write(d.getLastName1());
                csvOutput.write(d.getLastName2());
                csvOutput.write(d.getEmail());
                csvOutput.write(d.getPhone());
                csvOutput.write(d.getProvince());
                csvOutput.write(d.getAddress());
                csvOutput.write(d.getTypeVehicule());
                csvOutput.write(d.getAge());

                csvOutput.endRecord();
            }

            csvOutput.close();
//                   

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public void writeRestaurant() {

        try {

            CsvWriter csvOutput = new CsvWriter("Restaurant.csv", ';', Charset.forName("UTF-8"));

            csvOutput.write("ID");

            csvOutput.write("Logo");

            csvOutput.write("Name");

            csvOutput.write("Province");

            csvOutput.write("Location");

            csvOutput.endRecord();

            for (Restaurant r : this.fileLinkedRestaurant) {

                csvOutput.write(r.getID());
                csvOutput.write(r.getLogo());
                csvOutput.write(r.getName());
                csvOutput.write(r.getProvince());
                csvOutput.write(r.getLocation());

                csvOutput.endRecord();
            }

            csvOutput.close();
//                   

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public void writeProduct() throws ListException {

        try {

            int i = 0;
            while (i <= fileCircularProduct.getSize()) {
                Product product = (Product) fileCircularProduct.getNode(i);
                listProduct.add(product);
                i++;
            }

            CsvWriter csvOutput = new CsvWriter("Product.csv", ';', Charset.forName("UTF-8"));

            csvOutput.write("Name");

            csvOutput.write("Cost");

            csvOutput.write("Type");

            csvOutput.write("Image");

            csvOutput.endRecord();

            for (Product p : this.listProduct) {

                csvOutput.write(p.getName());
                csvOutput.write(p.getCost());
                csvOutput.write(p.getType());
                csvOutput.write(p.getPathImage());

                csvOutput.endRecord();
            }

            csvOutput.close();
//                   

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

//  public void writeOrder() {
//
//      
//            try {
//
//            CsvWriter csvOutput = new CsvWriter("Order.csv",';', Charset.forName("UTF-8"));
//               
//                    csvOutput.write("NumOrder");
//                   
//                    csvOutput.write("Client");
//
//                    csvOutput.write("Agent");
//
//                    csvOutput.write("Date");
//                    
//                    csvOutput.write("Province");
//                    
//                    csvOutput.write("Driver");
//                    
//                    csvOutput.write("Restaurant");
//                    
//                    csvOutput.write("Product");
//                    
//                    csvOutput.write("Quantity");
//                    
//                    csvOutput.write("Amount");
//
//                    csvOutput.endRecord();
//
//                    for (Order o : this.fileLinkedListOrders) {
//                        
//                        csvOutput.write(o.getCliente());
//                        csvOutput.write(o.getNumOrder()+"");
//                        csvOutput.write(o.getAgente());
//                        csvOutput.write(o.getDate());
//                        csvOutput.write(o.getProvincia());
//                        csvOutput.write(o.getDriver());
//                        csvOutput.write(o.getRestaurant());
//                        csvOutput.write(o.getProduct());
//                        csvOutput.write(o.getQuantity()+"");
//                        csvOutput.write(o.getAmount()+"");
//                     
//                     csvOutput.endRecord();
//                    }
//                    
//                     csvOutput.close();
//                  
//
//            } catch (IOException e) {
//
//                e.printStackTrace();
//
//            }
//
//    }
//  public void writeClient() {
//
//      
//            try {
//
//                CsvWriter csvOutput = new CsvWriter("Client.csv",';', Charset.forName("UTF-8"));
//               
//                    csvOutput.write("ID");
//                   
//                    csvOutput.write("Name");
//
//                    csvOutput.write("LastName1");
//
//                    csvOutput.write("LastName2");
//
//                    csvOutput.write("Email");
//
//                    csvOutput.write("Phone");
//                    
//                    csvOutput.write("Province");
//                    
//                    csvOutput.write("Address");
//                    
//
//                    csvOutput.endRecord();
//
//                    for (Client c : this.fileLinkedAdministrator) {
//                      csvOutput.write(c.getID());
//                      csvOutput.write(c.getName());
//                      csvOutput.write(c.getLastName1());
//                      csvOutput.write(c.getLastName2());
//                      csvOutput.write(c.getEmail());
//                      csvOutput.write(c.getPhone());
//                      csvOutput.write(c.getProvince());
//                      csvOutput.write(c.getAddress());
//                     
//                       csvOutput.endRecord();
//                    }
//                    
//                     csvOutput.close();
//                   
//
//            } catch (IOException e) {
//
//                e.printStackTrace();
//
//            }
//
//    }
}
>>>>>>> dd5aab91202de4138fb1da5d40421a301cb3a0da
