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
public class Cine<P extends Pelicula> {
    ArrayList<Sala<P>> teams = new ArrayList<>();
    String name;
    
    public Cine(String name){
        this.name = name;
    }
    
    
}
