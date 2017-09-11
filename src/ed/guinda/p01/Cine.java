/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.guinda.p01;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Osvaldo Gonzalez
 */
public class Cine<P extends Pelicula> {
    ArrayList<Sala<P>> salas = new ArrayList<>();//Ahora necesitamos un arrayList
                                                //para meter todas las salas que tendremos
    
    public void mostView(){
        for (Sala temp: salas) {//Este es el for que recorre los ArraysList
            System.out.println("La pelicula ' " +temp.Sort() +" ' en la sala numero " +temp.getNumero() +" con " +temp.getVisitas() +
                    "visitas.");//Muestra las mejores peliculas en cada sala
        }
    }
    
    public void registro(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ver = new ArrayList<>();
        boolean rep;
        String pelicula;
        for(int i=0; i<7 ; i++){//Como son 7 salas la condicion es facil
            salas.add(new Sala(i+1));//Cada sala se identificara con el numero
        }
        for(int j=0; j<15;j++){
            System.out.println("Introduzca el nombre de la pelicula");
            do{
                rep = true;
                pelicula = this.obtenerTexto();
                if (ver.isEmpty()){
                    rep = false;
                    ver.add(pelicula);
                }else{
                    if (ver.contains(pelicula)){
                        System.out.println("La pelicula ya esta registrada");
                    }else{
                        rep = false;
                        ver.add(pelicula);
                    }
                }
            }while (rep == true);
            for(int i=0; i<7 ; i++){
            salas.get(i).addPelicula(pelicula);//Se introduce la pelicula al array
            int x = salas.get(i).Fetch(pelicula);
            System.out.println("Introduzca el numero de personas que visito esta pelicula en la sala no."+(i+1));
            int visitas = scanner.nextInt();//Depues se pide el numero de visitas
            salas.get(i).peliculas.get(x).setNumero(visitas);
             }
        }
    }
    
    public String obtenerTexto (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
