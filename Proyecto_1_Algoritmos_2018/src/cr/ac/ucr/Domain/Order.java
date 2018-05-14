/*
 * Equipo de trabajo para el proyecto 1 de Algoritmos 2018
 */
package cr.ac.ucr.Domain;
/**
 *Objeto que contiene toda la informacion importante de los restaurantes
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 * @
 */
public class Order {
    Restaurant restauran;
    Product product;
    int quantity;
    int amount;

    public Order(Restaurant restauran, Product product, int quantity, int amount) {
        this.restauran = restauran;
        this.product = product;
        this.quantity = quantity;
        this.amount = amount;
    }

    public Restaurant getRestauran() {
        return restauran;
    }

    public void setRestauran(Restaurant restauran) {
        this.restauran = restauran;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
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
        return "Order{" + "restauran=" + restauran + ", product=" + product + ", quantity=" + quantity + ", amount=" + amount + '}';
    }
    
}
