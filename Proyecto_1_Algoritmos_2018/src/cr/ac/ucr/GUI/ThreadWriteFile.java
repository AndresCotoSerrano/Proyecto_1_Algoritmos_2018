
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Files.ClientFile;
import cr.ac.ucr.Files.Write_Read_Files;
import java.io.PrintStream;
import java.util.LinkedList;


public class ThreadWriteFile extends Thread {
    
       ClientFile clietfile;
       Write_Read_Files write;
    
    Insert_Client insertClient = new Insert_Client();
    
    LinkedList<Client> fileLinkedListClient = insertClient.clientList();
    
    public void run() {
        
   //Client client=new Client(tft_ID.getText(), tft_Name.getText(),tft_LastName1.getText(),tft_LastName2.getText(),tft_Email.getText(), tft_Phone.getText(),tft_Province.getText(),tft_Address.getText());
   //clietfile =new ClientFile();
   write = new Write_Read_Files();
        PrintStream ps = write.getPrintStream("clients.txt");
   int i = 0;
   
   try{
   
       Thread.sleep(20000);
       
   while(!fileLinkedListClient.isEmpty()){
       
      Client client = fileLinkedListClient.get(i);
      ps.println(client.getID()+"   "+client.getName()+"   "+client.getLastName1()+"   "+client.getLastName2()+"   "+client.getEmail()+"   "+client.getPhone()+"   "+client.getProvince()+"   "+client.getAddress());
       i++;
       
       //clietfile.writeClients(client,true);
   }
   
   }catch (InterruptedException ex) {
            }
  // Client client= fileLinkedListClient.
//   clietfile =new ClientFile();
//   lbl_Message.setText(clietfile.writeClients(client,true));
        
    }

    
    

}
