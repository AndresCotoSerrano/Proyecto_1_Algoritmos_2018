package cr.ac.ucr.Files;


import com.csvreader.CsvWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class PruebaCSV {
    
 
    

   // public void writeCSV(ArrayList<Object> writeList) {
    public void writeCSV() {
   ArrayList<String> listaString = new ArrayList<>();
   listaString.add("PRUEBA1");
   listaString.add("PRUEBA2");
   listaString.add("PRUEBA3");
   listaString.add("PRUEBA4");
   listaString.add("PRUEBA5");
   listaString.add("PRUEBA6");
       

            try {

                CsvWriter csvOutput = new CsvWriter("daniel.csv",';', Charset.forName("UTF-8"));
               // CsvWriter csvOutput = new CsvWriter("YA.csv");

// csvOutput.setDelimiter(';');
               
                    csvOutput.write("Name");
                   

                    csvOutput.write("UserName");

                    csvOutput.write("Mail");

                    csvOutput.write("Password");

                    csvOutput.write("Code");

                    csvOutput.write("Kind of User");

                    csvOutput.endRecord();

                    for (int i = 0; i < 10; i++) {
                        System.out.println("ENTRE AL FOR");
                        csvOutput.write("MELVIN");
                        csvOutput.endRecord();
                    }
                     csvOutput.close();
//                    for (Object object : writeList) {
//
//                        User agent = (User) object;
//
//                        csvOutput.write(agent.getName());
//
//                        csvOutput.write(agent.getUserName());
//
//                        csvOutput.write(agent.getMail());
//
//                        csvOutput.write(agent.getPassword());
//
//                        csvOutput.write(agent.getCode() + "");
//
//                        csvOutput.write(agent.getKindUser());
//
//                        csvOutput.endRecord();
//
//                    }

//                } else {
//                    csvOutput.close();
//                }

            } catch (IOException e) {

                e.printStackTrace();

            }

    

    }


}
