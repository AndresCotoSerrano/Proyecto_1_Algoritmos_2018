
package cr.ac.ucr.Domain;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser extends JFrame implements ActionListener {

    private JTextField txt;
    private JButton btn;

    public FileChooser() {
        super("JFileChooser Test");
        setLayout(new FlowLayout());

        txt = new JTextField(30);
        add(txt);

        btn = new JButton("Buscar...");
        btn.addActionListener(this);
        add(btn);
    }
    
    
public void actionPerformed(ActionEvent e) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    
    FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif"); 
    fileChooser.setFileFilter(imgFilter);

    int result = fileChooser.showOpenDialog(this);

    if (result != JFileChooser.CANCEL_OPTION) {

        File fileName = fileChooser.getSelectedFile();

        if ((fileName == null) || (fileName.getName().equals(""))) {
            txt.setText("...");
        } else {
            txt.setText(fileName.getAbsolutePath());
        }
    }
}
    
public String pathImage(){
    return txt.getText();
}
    
}
