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

    String name;
    String email;
    String phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }

}
