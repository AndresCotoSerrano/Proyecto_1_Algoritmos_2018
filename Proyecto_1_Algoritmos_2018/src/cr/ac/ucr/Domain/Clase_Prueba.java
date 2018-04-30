package cr.ac.ucr.Domain;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Clase_Prueba  {

    private JFrame frame;
    private JLabel labelImagen;
    private JButton boton;
    private JPanel panelComponentes, panelImagen;
    private JFileChooser fileChooser;

    //Construtor de la clase
    public JLabel Clase_Prueba() {
        //Creando frame principal y obteniendo un Contenedor y un manejador BorderLayout

        /**
         * Creacion de componentes
         */
        //Label
        labelImagen = new JLabel();

        //Creando FileChooser
        fileChooser = new JFileChooser();
        //Añadiendole un filtro
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
        fileChooser.setFileFilter(filter);

        //Valor que tomara el fileChooser
        int regresaValor = fileChooser.showOpenDialog(null);
        //Accion del fileChooser
        
            //Crear propiedades para ser utilizadas por fileChooser
            File archivoElegido = fileChooser.getSelectedFile();
            //Obteniendo la direccion del archivo
            String direccion = archivoElegido.getPath();
            //Bloque try-catch para errores
            
                //Obtiene la direccion del archivo y lo instancia en icon
                ImageIcon icon = new ImageIcon(direccion);
                //Setea el labelImagen con el archivo obtenido
                labelImagen.setIcon(icon);
              
           
        
return labelImagen;
    }
}
