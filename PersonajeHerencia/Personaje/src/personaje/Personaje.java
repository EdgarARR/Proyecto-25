package personaje;
//Anthony Tadeo Cerqueda Martinez 2193041273

import java.util.Random;

public class Personaje {
    protected String nombre;
    public double salud;
    private double habilidad;

    
    public Personaje(){}
    
    public Personaje(String nombre, double salud, double habilidad) {
        this.nombre = nombre;
        this.salud = salud;
        this.habilidad = habilidad;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(double habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + this.nombre + ", salud=" + this.salud + ", habilidad=" + this.habilidad + '}';
    }
    
    
    
}