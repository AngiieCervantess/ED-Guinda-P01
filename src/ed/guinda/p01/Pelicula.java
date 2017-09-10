/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.guinda.p01;
import java.util.ArrayList;
/**
 *
 * @author HONORIO ZAIBACK
 */
public abstract class Pelicula {
    String name;
    int numero;
    
    public Pelicula(String name, int numero){
        this.name = name;
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public int getNumero() {
        return numero;
    }
}
