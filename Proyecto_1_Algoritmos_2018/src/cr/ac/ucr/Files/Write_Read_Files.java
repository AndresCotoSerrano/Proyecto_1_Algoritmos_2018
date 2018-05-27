package cr.ac.ucr.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import javax.swing.JOptionPane;

public class Write_Read_Files {

    public BufferedReader getBufferReader(String nombre) {

        File archivo = new File(nombre);
        BufferedReader br = null;

        try {
            FileInputStream fis = new FileInputStream(archivo);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Problemas");

        }

        return br;
    }

    public PrintStream getPrintStream(String nombre) {

        File archivo = new File(nombre);
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(archivo, false);
            ps = new PrintStream(fos);
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "El dato no se a podido ingresar");
        }

        return ps;

    }

    public PrintStream getPrintStreamWithDelete(String nombre) throws IOException {

        File archivo = new File(nombre);
        archivo.delete();
        PrintStream ps = null;
        try {
            archivo.createNewFile();
            FileOutputStream fos = new FileOutputStream(archivo, false);
            ps = new PrintStream(fos);
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "El dato no se a podido ingresar");
        }

        return ps;

    }

}
