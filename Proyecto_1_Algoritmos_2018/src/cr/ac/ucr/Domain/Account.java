/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.Domain;

import java.io.Serializable;

/**
 * Informacion necesaria de la cuenta
 *
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 */
public class Account implements Serializable {

    String user;
    String pass;
    String email;
    boolean isAdmin;

    public Account(String user, String pass,String email, boolean isAdmin) {
        this.user = user;
        this.pass = pass;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "user=" + user + ", pass=" + pass + ", isAdmin=" + isAdmin + '}';
    }

}
