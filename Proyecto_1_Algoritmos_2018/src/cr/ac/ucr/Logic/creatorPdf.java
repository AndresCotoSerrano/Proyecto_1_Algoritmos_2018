/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.Logic;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.pdf.PdfContentByte;
//import com.itextpdf.text.pdf.PdfTemplate;
//import com.itextpdf.text.pdf.PdfWriter;
import cr.ac.ucr.GUI.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

 /**
     * metodo encargado de exportar los graficos aun pdf
     *
     * @return void
     */
//public class creatorPdf {
//     /**
// * Metodo que exporta datos a PDF
// * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin Picado
// */
//    public void pdfCreator(JPanel jPanel_graphics){
//            JFileChooser fileChooser = new JFileChooser(new File("c:\\"));
//        fileChooser.setDialogTitle("Save pdf");
//
//        FileNameExtensionFilter filtroExtension = new FileNameExtensionFilter("Documento(*.pdf)", "pdf");//filtra archivos de tipo jpg
//        fileChooser.setFileFilter(filtroExtension);
//
//        int result = fileChooser.showSaveDialog(null);
//        if (result == JFileChooser.APPROVE_OPTION) {
//            File file = new File(fileChooser.getSelectedFile() + ".pdf");//crea el archivo file con la extencion jpg
//
//        Document document = new Document();
//    PdfWriter writer = null;
//
//         try {
//             writer = PdfWriter.getInstance(document, new FileOutputStream(file));
//         } catch (FileNotFoundException ex) {
//             Logger.getLogger(Graphics.class.getName()).log(Level.SEVERE, null, ex);
//         } catch (DocumentException ex) {
//             Logger.getLogger(Graphics.class.getName()).log(Level.SEVERE, null, ex);
//         }
//
//
//    document.open();
//    PdfContentByte cb = writer.getDirectContent();
//
//    PdfTemplate tp = cb.createTemplate(500, 500);
//    Graphics2D g2;
//
//    g2 = tp.createGraphicsShapes(500, 500);
//
//    // g2 = tp.createGraphics(500, 500);
//    jPanel_graphics.print(g2);
//    g2.dispose();
//    cb.addTemplate(tp, 30, 300);
//
//    // step 5: we close the document
//    document.close();
//  
//    } 
//    }
//}
