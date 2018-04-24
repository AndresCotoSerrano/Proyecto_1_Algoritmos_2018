/*
 * Equipo de trabajo para el proyecto 1 de Algoritmos 2018
 */
package cr.ac.ucr.Domain;

/**
 * Objeto que contiene todos los Datos del Agente de ordenes, que se encarga de
 * recibir las ordenes de los clientes y ejecutar el pedido
 *
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 */
public class Client extends Person {

    String province;

    public Client(String provincia, String name, String email, String phone) {
        super(name, email, phone);
        this.province = provincia;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return super.toString()+ "Client{" + "province=" + province + '}';
    }
    

}
