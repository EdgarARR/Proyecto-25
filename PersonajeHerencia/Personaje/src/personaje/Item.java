/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

/**
 *
 * @author Profesor
 */
public class Item {
    private String nombre;
    private double csalud;
    private double chabilidad;

    public Item(){}
    
    public Item(String nombre, double csalud, double chabilidad) {
        this.nombre = nombre;
        this.csalud = csalud;
        this.chabilidad = chabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCsalud() {
        return csalud;
    }

    public void setCsalud(double csalud) {
        this.csalud = csalud;
    }

    public double getChabilidad() {
        return chabilidad;
    }

    public void setChabilidad(double chabilidad) {
        this.chabilidad = chabilidad;
    }
    
    
    public String convierteACadena(){
        return "Item:"+this.nombre+" Salud"+this.getCsalud()+" Habilidad"+this.getChabilidad();
    }
    
}
