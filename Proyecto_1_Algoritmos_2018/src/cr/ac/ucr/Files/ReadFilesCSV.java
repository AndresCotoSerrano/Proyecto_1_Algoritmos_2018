package cr.ac.ucr.Files;

import com.csvreader.CsvReader;
import cr.ac.ucr.Domain.Administrator;
import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Driver;
import cr.ac.ucr.Domain.Order;
import cr.ac.ucr.Domain.Product;
import cr.ac.ucr.Domain.Restaurant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFilesCSV {

    public LinkedList<Agent> readCSVAgent() throws FileNotFoundException, IOException {

        String outputFile = "Agent.csv";

        try {

            LinkedList<Agent> agentList = new LinkedList<>();

            File alreadyExists = new File("Agent.csv");

            if (alreadyExists.exists()) {

                CsvReader readFile = new CsvReader(outputFile, ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    if ("Agent.csv".equals("Agent.csv") || "Agent.csv".equals("Agent.csv")) {

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

                        agentList.add(new Agent(ID, name, lastName1, lastName2, email, phone, province, address, user, code));

                    }

                    readFile.close();

                }
            }

            return agentList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
    
     public LinkedList<Administrator> readCSVAdministrator() throws FileNotFoundException, IOException {

        String outputFile = "Administrator.csv";

        try {

            LinkedList<Administrator> adminList = new LinkedList<>();

            File alreadyExists = new File("Administrator.csv");

            if (alreadyExists.exists()) {

                CsvReader readFile = new CsvReader(outputFile, ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    if ("Administrator.csv".equals("Administrator.csv") || "Administrator.csv".equals("Administrator.csv")) {

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

                }
            }

            return adminList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
     
      public LinkedList<Client> readCSVClient() throws FileNotFoundException, IOException {

        String outputFile = "Client.csv";

        try {

            LinkedList<Client> clientList = new LinkedList<>();

            File alreadyExists = new File("Client.csv");

            if (alreadyExists.exists()) {

                CsvReader readFile = new CsvReader(outputFile, ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    if ("Client.csv".equals("Client.csv") || "Client.csv".equals("Client.csv")) {

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

                }
            }

            return clientList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
      
       public LinkedList<Driver> readCSVDriver() throws FileNotFoundException, IOException {

        String outputFile = "Driver.csv";

        try {

            LinkedList<Driver> driverList = new LinkedList<>();

            File alreadyExists = new File("Driver.csv");

            if (alreadyExists.exists()) {

                CsvReader readFile = new CsvReader(outputFile, ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    if ("Driver.csv".equals("Driver.csv") || "Driver.csv".equals("Driver.csv")) {

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

                }
            }

            return driverList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
       
        public LinkedList<Restaurant> readCSVRestaurant() throws FileNotFoundException, IOException {

        String outputFile = "Restaurant.csv";

        try {

            LinkedList<Restaurant> restaurantList = new LinkedList<>();

            File alreadyExists = new File("Restaurant.csv");

            if (alreadyExists.exists()) {

                CsvReader readFile = new CsvReader(outputFile, ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    if ("Restaurant.csv".equals("Restaurant.csv") || "Restaurant.csv".equals("Restaurant.csv")) {

                        String ID = readFile.get(0);

                        String logo = readFile.get(1);

                        String name = readFile.get(2);

                        String province = readFile.get(3);

                        String location = readFile.get(4);

                      


                        restaurantList.add(new Restaurant(ID, logo, name, province, location));
        

                    }

                    readFile.close();

                }
            }

            return restaurantList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
        
         public LinkedList<Product> readCSVProduct() throws FileNotFoundException, IOException {

        String outputFile = "Product.csv";

        try {

            LinkedList<Product> productList = new LinkedList<>();

            File alreadyExists = new File("Product.csv");

            if (alreadyExists.exists()) {

                CsvReader readFile = new CsvReader(outputFile, ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    if ("Product.csv".equals("Product.csv") || "Product.csv".equals("Product.csv")) {

                        String name = readFile.get(0);

                        String cost = readFile.get(1);

                        String type = readFile.get(2);

                        String image = readFile.get(3);

                        

                        productList.add(new Product(name, cost, type, image));
       

                    }

                    readFile.close();

                }
            }

            return productList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
         
          public LinkedList<Order> readCSVOrder() throws FileNotFoundException, IOException {

        String outputFile = "Order.csv";

        try {

            LinkedList<Order> orderList = new LinkedList<>();

            File alreadyExists = new File("Order.csv");

            if (alreadyExists.exists()) {

                CsvReader readFile = new CsvReader(outputFile, ';', Charset.forName("UTF-8"));

                readFile.setDelimiter(';');

                readFile.readHeaders();

                while (readFile.readRecord()) {

                    if ("Order.csv".equals("Order.csv") || "Order.csv".equals("Order.csv")) {

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

                }
            }

            return orderList;

        } catch (FileNotFoundException ex) {

            // Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            //   Logger.getLogger(DataCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

}
