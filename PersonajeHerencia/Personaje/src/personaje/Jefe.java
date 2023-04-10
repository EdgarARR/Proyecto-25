/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

/**
 *
 * @author Profesor
 */

//Herencia
public class Jefe extends Personaje{
    //Atributo para la asociación
    private Arma arma;

    public Jefe() {
        super();
        this.arma= new Arma();
    }

    public Jefe(double danio, String nombre, double salud, double habilidad) {
        super(nombre, salud, habilidad);
        this.arma = new Arma(danio);
    }
    
    public Jefe(Arma arma, String nombre, double salud, double habilidad) {
        super(nombre, salud, habilidad);
        this.arma = new Arma(arma.getDanio());
    }

    public Arma getArma() {
        return arma;
    }
    /*
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        this.nombre="Otro nombre";
        return super.toString()+"Jefe{" + "arma=" + arma + '}';
        
    }

    
        
}
