package cr.ac.ucr.Files;

import com.csvreader.CsvReader;
import cr.ac.ucr.Domain.Administrator;
import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Driver;
import cr.ac.ucr.Domain.Order;
import cr.ac.ucr.Domain.Product;
import cr.ac.ucr.Domain.Restaurant;
import cr.ac.ucr.Logic.CircularLinkedList;
import cr.ac.ucr.Logic.ListException.ListException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFilesCSV {

    public static LinkedList<Agent> readCSVAgent() {

       // String outputFile = "Agent.csv";

        try {

            LinkedList<Agent> agentList = new LinkedList<>();

            //File alreadyExists = new File("Agent.csv");
System.out.println("ENTRE AL TRY AGENTE");
            

                CsvReader readFile = new CsvReader("Agent.csv", ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {
System.out.println("ENTRE AL WHILE DEL AGENTE");
                   

                        String ID = readFile.get(0);

                        String name = readFile.get(1);

                        String lastName1 = readFile.get(2);

                        String lastName2 = readFile.get(3);

                        String email = readFile.get(4);

                        String phone = readFile.get(5);

                        String province = readFile.get(6);

                        String address = readFile.get(7);

                        String user = readFile.get(8);

                        String code = readFile.get(9);

                        Agent agent = new Agent(ID, name, lastName1, lastName2, email, phone, province, address, user, code);
                        
                        agentList.add(agent);

                  }
            readFile.close();
            System.out.println("ESTOY LEYENDO AGENTES");
            return agentList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

       // return null;
       System.out.println(" NOO ESTOY LEYENDO AGENTES");
       LinkedList<Agent> agentList = new LinkedList<>();
return agentList;
    }
    
     public static LinkedList<Administrator> readCSVAdministrator(){

        String outputFile = "Administrator.csv";

        try {

            LinkedList<Administrator> adminList = new LinkedList<>();

            File alreadyExists = new File("Administrator.csv");

            

                CsvReader readFile = new CsvReader("Administrator.csv", ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    

                        String ID = readFile.get(0);

                        String name = readFile.get(1);

                        String lastName1 = readFile.get(2);

                        String lastName2 = readFile.get(3);

                        String email = readFile.get(4);

                        String phone = readFile.get(5);

                        String province = readFile.get(6);

                        String address = readFile.get(7);


                        adminList.add(new Administrator(ID, name, lastName1, lastName2, email, phone, province, address));
        
}
                
                readFile.close();
            
System.out.println("ESTOY LEYENDO ADMINISTRADORES");
            return adminList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
LinkedList<Administrator> adminList = new LinkedList<>();
System.out.println("NOO ESTOY LEYENDO ADMINISTRADORES");
        return adminList;

    }
     
      public static LinkedList<Client> readCSVClient()  {

        String outputFile = "Client.csv";

        try {

            LinkedList<Client> clientList = new LinkedList<>();

            File alreadyExists = new File("Client.csv");

           

                CsvReader readFile = new CsvReader("Client.csv", ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    

                        String ID = readFile.get(0);

                        String name = readFile.get(1);

                        String lastName1 = readFile.get(2);

                        String lastName2 = readFile.get(3);

                        String email = readFile.get(4);

                        String phone = readFile.get(5);

                        String province = readFile.get(6);

                        String address = readFile.get(7);
;

                        clientList.add(new Client(ID, name, lastName1, lastName2, email, phone, province, address));
        
}
                
                 readFile.close();
            
System.out.println("ESTOY LEYENDO CLIENTES");
            return clientList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
LinkedList<Client> clientList = new LinkedList<>();
System.out.println("NO ESTOY LEYENDO CLIENTES");
        return clientList;

    }
      
       public static LinkedList<Driver> readCSVDriver() {

        String outputFile = "Driver.csv";

        try {

            LinkedList<Driver> driverList = new LinkedList<>();

            File alreadyExists = new File("Driver.csv");

            

                CsvReader readFile = new CsvReader("Driver.csv", ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    

                        String ID = readFile.get(0);

                        String name = readFile.get(1);

                        String lastName1 = readFile.get(2);

                        String lastName2 = readFile.get(3);

                        String email = readFile.get(4);

                        String phone = readFile.get(5);

                        String province = readFile.get(6);

                        String address = readFile.get(7);

                        String vehicle = readFile.get(8);

                        String age = readFile.get(9);

                        driverList.add(new Driver(ID, name, lastName1, lastName2, email, phone, province, address, vehicle, age));
        
                     }
                
                readFile.close();
            
System.out.println("ESTOY LEYENDO CONDUCTORES");
            return driverList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
LinkedList<Driver> driverList = new LinkedList<>();
System.out.println("NO ESTOY LEYENDO CONDUCTORES");
        return driverList;

    }
       
        public static LinkedList<Restaurant> readCSVRestaurant() {

        String outputFile = "Restaurant.csv";

        try {

            LinkedList<Restaurant> restaurantList = new LinkedList<>();

            File alreadyExists = new File("Restaurant.csv");

            

                CsvReader readFile = new CsvReader("Restaurant.csv", ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    

                        String ID = readFile.get(0);

                        String logo = readFile.get(1);

                        String name = readFile.get(2);

                        String province = readFile.get(3);

                        String location = readFile.get(4);

                      


                        restaurantList.add(new Restaurant(ID, logo, name, province, location));
                         }
                
                readFile.close();
            
System.out.println("ESTOY LEYENDO RESTAURANTES");
            return restaurantList;

            
        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

                    LinkedList<Restaurant> restaurantList = new LinkedList<>();
System.out.println("NOO ESTOY LEYENDO RESTAURANTES");
        return restaurantList;

    }
        
         public static CircularLinkedList readCSVProduct() {

        String outputFile = "Product.csv";

        try {

            CircularLinkedList productList = new CircularLinkedList();

            File alreadyExists = new File("Product.csv");

            

                CsvReader readFile = new CsvReader("Product.csv", ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    

                        String name = readFile.get(0);

                        String cost = readFile.get(1);

                        String type = readFile.get(2);

                        String image = readFile.get(3);

                        

                        productList.insert(new Product(name, cost, type, image));
       

                    }
                
                readFile.close();
            
System.out.println("ESTOY LEYENDO PRODUCTOS");
            return productList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListException ex) {
            Logger.getLogger(ReadFilesCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        CircularLinkedList productList = new CircularLinkedList();
        System.out.println("NO ESTOY LEYENDO PRODUCTOS");
        return productList;

    }
         
          public static LinkedList<Order> readCSVOrder() {

        String outputFile = "Order.csv";

        try {

            LinkedList<Order> orderList = new LinkedList<>();

            File alreadyExists = new File("Order.csv");

            

                CsvReader readFile = new CsvReader("Order.csv", ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                   

                        String client = readFile.get(0);

                        String numOrder = readFile.get(1);

                        String agent = readFile.get(2);

                        String date = readFile.get(3);

                        String province = readFile.get(4);

                        String driver = readFile.get(5);

                        String restaurant = readFile.get(6);

                        String product = readFile.get(7);

                        String quantity = readFile.get(8);

                        String amount = readFile.get(9);

                        orderList.add(new Order(client, Integer.parseInt(numOrder), agent, date, province, product, restaurant, product, Integer.parseInt(quantity), Integer.parseInt(amount)));
      

                      }
                
                readFile.close();
            
System.out.println("ESTOY LEYENDO ORDENES");
            return orderList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

            LinkedList<Order> orderList = new LinkedList<>();
            System.out.println("NOO ESTOY LEYENDO PRODUCTOS");
        return orderList;

    }

}
