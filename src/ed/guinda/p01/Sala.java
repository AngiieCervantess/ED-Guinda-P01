/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.guinda.p01;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Osvaldo Gonzalez
 */
public class Sala<P extends Pelicula>{
    ArrayList<Pelicula> peliculas;//Ahora hacemos un arrayList de tipo Pelicula
    int numero; //Todo esto lo vimos en un trabajo de POO
    
    public Sala(int numero){
        this.numero = numero;
        this.peliculas = new ArrayList<Pelicula>();
    }
    
    public int getNumero(){//Este es el numero de Sala en la que estamos
        return this.numero;
    }
    
    String Sort() {
       Collections.sort(peliculas);
       return peliculas.get(0).getName();//Se arregla y de una vez se regresa el nombre de la pelicula mas vista
    }                                    //porque es lo que mas nos importa
    
    public void addPelicula(String name){
        if(peliculas.contains(name)){//Es muy facil añadir elemento al arrayList
            System.out.println("The movie "+name +" is already in this cinema room.");
        } else peliculas.add(new Pelicula(name));//Usamos el .contain para saber si ya esta registrado
    }                           //De otra manera se introduce a nuestro arrayList
    
    int Fetch(String name) {
        for(int i=0;i<peliculas.size();i++){ //El fetch que usamos en clase pero modificado 
            if(peliculas.get(i).getName()==name)//para qur funcione con arrayList
                return i; 
        }
        return -1; 
    }
    
    int getVisitas(){
        int x = this.peliculas.get(0).getNumero();
        return x;
    }
}