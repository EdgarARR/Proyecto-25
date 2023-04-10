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
public class Heroe extends Personaje{
    private double energia;
    private double velocidad;
    private double lsv;
    private double lsh;
    private Item[] items= new Item[5];

    public Heroe() {
        super();
    }

    public Heroe(double energia, double velocidad, double lsv, double lsh) {
        super();
        this.energia = energia;
        this.velocidad = velocidad;
        this.lsv = lsv;
        this.lsh = lsh;
    }
    
    public Heroe(String nombre, double salud, double habilidad,double energia, double velocidad, double lsv, double lsh) {
        super(nombre, salud, habilidad);
        this.energia = energia;
        this.velocidad = velocidad;
        this.lsv = lsv;
        this.lsh = lsh;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getLsv() {
        return lsv;
    }

    public void setLsv(double lsv) {
        this.lsv = lsv;
    }

    public double getLsh() {
        return lsh;
    }

    public void setLsh(double lsh) {
        this.lsh = lsh;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public String getNombre() {
        return nombre;
    }


    public void enfrentaJefe(Jefe j){
        this.setSalud(this.getSalud()-j.getArma().getDanio()*0.1);
    }
    

    @Override
    public String toString() {
        return super.toString()+"Heroe{" + "energia=" + energia + ", velocidad=" + velocidad + ", lsv=" + lsv + ", lsh=" + lsh + ", items=" + items + '}';
    }
    
    
    
}
