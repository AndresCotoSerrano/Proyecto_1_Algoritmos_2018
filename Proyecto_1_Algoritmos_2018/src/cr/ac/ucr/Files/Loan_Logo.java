
package cr.ac.ucr.Files;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Loan_Logo {

    
    public BufferedImage ImageChooser() throws IOException {

        BufferedImage bfimg = null;
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "PNG", "png", "jpeg", "JPEG", "pgn");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {

            File selected = file.getSelectedFile();
            String path = selected.getAbsolutePath();

            bfimg = ImageIO.read(selected);
            return bfimg;
        } else if (result == JFileChooser.CANCEL_OPTION) {

            System.out.println("No file selected");
        }

        return bfimg;
    }
    
    public BufferedImage resize(int newW, int newH, BufferedImage ImageToConverse) throws IOException {
        BufferedImage imageSlected = ImageToConverse;

        int w = imageSlected.getWidth();
        int h = imageSlected.getHeight();
        BufferedImage bufim = new BufferedImage(newW, newH, imageSlected.getType());
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(imageSlected, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return bufim;
    }
    
}
