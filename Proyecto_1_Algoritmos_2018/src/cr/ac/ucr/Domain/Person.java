/*
 * Equipo de trabajo para el proyecto 1 de Algoritmos 2018
 */
package cr.ac.ucr.Domain;

import java.io.Serializable;

/**
 * Clase abstracta que hereda a Agente, Cliente, y Administrador
 *
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 */
public abstract class Person implements Serializable {

    String ID;
    String name;
    String lastName1;
    String lastName2;
    String email;
    String phone;
    String province;
    String address;

    public Person(String ID, String name, String lastName1, String lastName2, String email, String phone, String province, String address) {
        this.ID = ID;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.email = email;
        this.phone = phone;
        this.province = province;
        this.address = address;
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

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", name=" + name + ", lastName1=" + lastName1 + ", lastName2=" + lastName2 + ", email=" + email + ", phone=" + phone + ", province=" + province + ", address=" + address + '}';
    }

   

}
