/*
 * Equipo de trabajo para el proyecto 1 de Algoritmos 2018
 */
package ac.cr.ucr.Domain;

/**
 * Objeto que contiene todos los Datos de los conductores encargados de
 * transportar los pedidos
 *
 * @author Equipo de trabajo: Melvin Astorga, Andres Coto, Kevin
 * @version 1.0
 */
public class Driver extends Person {

    String typeVehicule;
    String age;

    public Driver(String name, String email, String phone, String typeVehicule,String age) {
        super(name, email, phone);
        this.typeVehicule = typeVehicule;
        this.age = age;
    }

    public String getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + " Driver{" + "typeVehicule=" + typeVehicule + ", age=" + age + '}';
    }
   

}
