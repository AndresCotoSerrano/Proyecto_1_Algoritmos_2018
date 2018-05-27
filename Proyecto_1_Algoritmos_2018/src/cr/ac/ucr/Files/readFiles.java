
package cr.ac.ucr.Files;

import cr.ac.ucr.Domain.Administrator;
import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Driver;
import cr.ac.ucr.Domain.Order;
import cr.ac.ucr.Domain.Product;
import cr.ac.ucr.Domain.Restaurant;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.LinkedList;


public class readFiles {
    
     public LinkedList readAgent() {
        Write_Read_Files read = new Write_Read_Files();
        LinkedList<Agent> list = new LinkedList();
        Agent agent = null;
        BufferedReader br = null;
        try {
            //Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = read.getBufferReader("agent.txt");
            //Leer la primera línea, guardando en un String
            String text = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while (text != null) {
                //Hacer lo que sea con la línea leída
                String[] agentA = text.split("-");
                agent  = new Agent(agentA[0], agentA[1], agentA[2], agentA[3], agentA[4], agentA[5], agentA[6], agentA[7], agentA[8], agentA[9]);
               // Agent a1 = new Agent(text, text, text, text, text, text, text, text, text, text)
               
                       // = new Account(account[0], account[1], Boolean.parseBoolean(account[2]));
                
                list.add(agent);
                //Leer la siguiente línea
                text = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
     
     public LinkedList readAdministrator() {
        Write_Read_Files read = new Write_Read_Files();
        LinkedList<Administrator> list = new LinkedList();
        Administrator administrator = null;
        BufferedReader br = null;
        try {
            //Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = read.getBufferReader("administrator.txt");
            //Leer la primera línea, guardando en un String
            String text = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while (text != null) {
                //Hacer lo que sea con la línea leída
                String[] admin = text.split("   ");
                administrator  = new Administrator(admin[0], admin[1], admin[2], admin[3], admin[4], admin[5], admin[6], admin[7]);
                       // = new Account(account[0], account[1], Boolean.parseBoolean(account[2]));
                
                list.add(administrator);
                //Leer la siguiente línea
                text = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
     
     public LinkedList readDriver() {
        Write_Read_Files read = new Write_Read_Files();
        LinkedList<Driver> list = new LinkedList();
         Driver driver = null;
        BufferedReader br = null;
        try {
            //Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = read.getBufferReader("driver.txt");
            //Leer la primera línea, guardando en un String
            String text = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while (text != null) {
                //Hacer lo que sea con la línea leída
                String[] driverA = text.split("   ");
                driver  = new Driver(driverA[0], driverA[1], driverA[2], driverA[3], driverA[4], driverA[5], driverA[6], driverA[7], driverA[8], driverA[9]);
                       // = new Account(account[0], account[1], Boolean.parseBoolean(account[2]));
                
                list.add(driver);
                //Leer la siguiente línea
                text = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
     
      public LinkedList readRestaurant() {
        Write_Read_Files read = new Write_Read_Files();
        LinkedList<Restaurant> list = new LinkedList();
         Restaurant restaurant = null;
        BufferedReader br = null;
        try {
            //Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = read.getBufferReader("restaurant.txt");
            //Leer la primera línea, guardando en un String
            String text = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while (text != null) {
                //Hacer lo que sea con la línea leída
                String[] restaurantA = text.split("   ");
                restaurant  = new Restaurant(restaurantA[0], restaurantA[1], restaurantA[2], restaurantA[3], restaurantA[4]);
                       // = new Account(account[0], account[1], Boolean.parseBoolean(account[2]));
                
                list.add(restaurant);
                //Leer la siguiente línea
                text = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
      
      public LinkedList readProduct() {
        Write_Read_Files read = new Write_Read_Files();
        LinkedList<Product> list = new LinkedList();
         Product product = null;
        BufferedReader br = null;
        try {
            //Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = read.getBufferReader("product.txt");
            //Leer la primera línea, guardando en un String
            String text = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while (text != null) {
                //Hacer lo que sea con la línea leída
                String[] productA = text.split("   ");
                product  = new Product(productA[0], productA[1], productA[2], productA[3]);
                       // = new Account(account[0], account[1], Boolean.parseBoolean(account[2]));
                
                list.add(product);
                //Leer la siguiente línea
                text = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
          System.out.println("PRODUCTOS EN LISTA: "+list.size());
        return list;
    }
      
      public LinkedList readClient() {
        Write_Read_Files read = new Write_Read_Files();
        LinkedList<Client> list = new LinkedList();
         Client client = null;
        BufferedReader br = null;
        try {
            //Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = read.getBufferReader("clients.txt");
            //Leer la primera línea, guardando en un String
            String text = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while (text != null) {
                //Hacer lo que sea con la línea leída
                String[] clientA = text.split("   ");
                client  = new Client(clientA[0], clientA[1], clientA[2], clientA[3], clientA[4], clientA[5], clientA[6], clientA[7]);
                       // = new Account(account[0], account[1], Boolean.parseBoolean(account[2]));
                
                list.add(client);
                //Leer la siguiente línea
                text = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        return list;
    }//Fin metodo lee clientes
      
       public LinkedList readOrder() {
        Write_Read_Files read = new Write_Read_Files();
        LinkedList<Order> list = new LinkedList();
         Order order = null;
        BufferedReader br = null;
        try {
            //Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = read.getBufferReader("order.txt");
            //Leer la primera línea, guardando en un String
            String text = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while (text != null) {
                //Hacer lo que sea con la línea leída
                String[] orderA = text.split("   ");
                order  = new Order(orderA[0], Integer.parseInt(orderA[1]), orderA[2], orderA[3], orderA[4], orderA[5], orderA[6], orderA[7],  Integer.parseInt(orderA[8]),  Integer.parseInt(orderA[9]));
                       // = new Account(account[0], account[1], Boolean.parseBoolean(account[2]));
                
                list.add(order);
                //Leer la siguiente línea
                text = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        return list;
    }//Fin metodo lee ordenes
     
}

 
