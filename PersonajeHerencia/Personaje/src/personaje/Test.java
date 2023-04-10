/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personaje;

/**
 *
 * @author Profesor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arma a= new Arma(11);
        Jefe j= new Jefe(a, "Bowser", 100, 100);
        Heroe h1= new Heroe("Edgar", 100, 10, 50, 50, 90, 10);
        Personaje p= new Personaje("Jill", 100, 100);

        //Arreglo de personajes
        Personaje[] personajes= new Personaje[3];
        personajes[0]=h1;
        personajes[1]=j;
        personajes[2]=p;
        
        System.out.println(personajes[0]);
        System.out.println(personajes[1]);
        System.out.println(personajes[2]);

        Item []herramientas= new Item[5];
        herramientas[0]= new Item("Hongo",1,1);
        herramientas[1]= new Item("Flor",2,2);
        herramientas[2]= new Item("Hoja",3,3);
        herramientas[3]= new Item("Martillo",4,4);
        herramientas[4]= new Item("Palo",5,5);
        
        h1.enfrentaJefe(j);
        
        Heroe h2= new Heroe("Luigi", 5, 5, 5, 5, 5, 5);
        System.out.println(h1);
        System.out.println(h2);
        
    }
    
}
