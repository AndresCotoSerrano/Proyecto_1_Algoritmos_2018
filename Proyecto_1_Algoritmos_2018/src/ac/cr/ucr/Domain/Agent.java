/*
 * Equipo de trabajo para el proyecto 1 de Algoritmos 2018
 */
package ac.cr.ucr.Domain;

/**
 * Objeto que contiene todos los Datos de los clientes de nuestra aplicacion
 *
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 */
public class Agent extends Person {

    String user;
    String code;

    public Agent(String name, String email, String user, String code) {
        super(name, email);
        this.user = user;
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString() + " Agent{" + "user=" + user + ", code=" + code + '}';
    }

}
