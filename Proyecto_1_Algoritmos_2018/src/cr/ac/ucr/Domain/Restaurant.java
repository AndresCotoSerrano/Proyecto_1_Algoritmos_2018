/*
 * Equipo de trabajo para el proyecto 1 de Algoritmos 2018
 */
package cr.ac.ucr.Domain;

import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 *Objeto que contiene todos los Datos de los restaurante afiliados a nuestra aplicacion
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 */
public class Restaurant implements Serializable {
    
    String ID;
    String logo;
    String name;
    String province;
    String location;

    public Restaurant(String ID,String logo, String name, String province, String location) {
        this.ID = ID;
        this.logo = logo;
        this.name = name;
        this.province = province;
        this.location = location;
    }

   

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
     public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Restaurant{"+"ID="+ID + "logo=" + logo + ", name=" + name + ", province=" + province + ", location=" + location + '}';
    }
    
    
    
}
