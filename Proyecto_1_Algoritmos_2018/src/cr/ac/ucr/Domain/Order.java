/*
 * Equipo de trabajo para el proyecto 1 de Algoritmos 2018
 */
package cr.ac.ucr.Domain;

import java.io.Serializable;

/**
 *Objeto que contiene toda la informacion importante de los restaurantes
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 * @
 */
public class Order implements Serializable {
    String Cliente;
    int NumOrder;
    String agente;
    String date;
    String provincia;
    String conductor;
    String restauran;
    String product;
    int quantity;
    int amount;

    public Order(String Cliente, int NumOrder, String agente, String date, String provincia, String conductor, String restauran, String product, int quantity, int amount) {
        this.Cliente = Cliente;
        this.NumOrder = NumOrder;
        this.agente = agente;
        this.date = date;
        this.provincia = provincia;
        this.conductor = conductor;
        this.restauran = restauran;
        this.product = product;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getNumOrder() {
        return NumOrder;
    }

    public void setNumOrder(int NumOrder) {
        this.NumOrder = NumOrder;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getRestauran() {
        return restauran;
    }

    public void setRestauran(String restauran) {
        this.restauran = restauran;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" + "Cliente=" + Cliente + ", NumOrder=" + NumOrder + ", agente=" + agente + ", date=" + date + ", provincia=" + provincia + ", conductor=" + conductor + ", restauran=" + restauran + ", product=" + product + ", quantity=" + quantity + ", amount=" + amount + '}';
    }
    
    

    
}
