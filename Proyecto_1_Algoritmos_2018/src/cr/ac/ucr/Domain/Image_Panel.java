package cr.ac.ucr.Domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Image_Panel extends JPanel {

    BufferedImage image = null;

    public Image_Panel(BufferedImage img) {
        
        this.image = img;
        this.setVisible(true);
    }

    public void paint(Graphics g) {
//        System.out.println(colums + "ll");
 this.setBackground(Color.red);
        g.toString();
        System.out.println(g.toString());
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.clearRect(0, 0, this.getWidth(), this.getHeight());
     

    }
    
}
