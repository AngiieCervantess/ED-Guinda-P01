/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.guinda.p01;
import java.util.ArrayList;
/**
 *
 * @author Osvaldo Gonzalez
 */
public class Pelicula<P> implements Comparable<Pelicula<P>>{ //Implementamos el comprable para poder usar collection.sort
    String name;//Nombre de la pelicula
    int numero;
    
    public Pelicula(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumero() {//El numero son la visitas que tiene esta pelicuala
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int compareTo(Pelicula<P> temp) {
        if(this.getNumero()<temp.getNumero()){ //Cuando comparamos si el numero que tenemos
            return 1;                           //es mas grande contra el que comparamos regresamos un 1
        }
        if(this.getNumero()>temp.getNumero()){//Si es menor se regresa un -1
            return -1;
        }
        return 0; //Pero cuando son iguales se regresa un 0
    }
}
