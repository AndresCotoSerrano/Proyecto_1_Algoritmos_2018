/*
 * Equipo de trabajo para el proyecto 1 de Algoritmos 2018
 */
package cr.ac.ucr.Domain;

import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 * Objeto que contiene todos los de los productos que ofrecemos a nuestros
 * clientes
 *
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 */
public class Product {

    private String ID;
    private String name;
    private String cost;
    private String type;
    private String pathImage;

    public Product(String ID,String name, String cost, String type, String pathImage) {
       this.ID = ID;
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.pathImage = pathImage;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    @Override
    public String toString() {
        return "Product{"+ "ID="+ ID + "name=" + name + ", cost=" + cost + ", type=" + type + ", pathImage=" + pathImage + '}';
    }

    
}
