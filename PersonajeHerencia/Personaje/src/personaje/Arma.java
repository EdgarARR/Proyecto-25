/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

/**
 *
 * @author Profesor
 */
public class Arma {
    private double danio;

    public Arma(){}
    
    public Arma(double danio) {
        this.danio = danio;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    @Override
    public String toString() {
        return "Arma{" + "danio=" + danio + '}';
    }

    
    
}
