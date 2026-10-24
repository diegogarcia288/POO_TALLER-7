/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.app;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PruebaLista {

    public static void main(String[] args) {
        ArrayList<String> generos = new ArrayList<>();
        generos.add("Rock");
        generos.add("Salsa");
        generos.add("Vallenato");
        
        System.out.println(generos.size());
        System.out.println(generos.get(1));
        
        generos.set(1, "Merengue");
        generos.add(0, "POP");
        
        System.out.println(generos);
        
        generos.remove("Rock");
        System.out.println(generos.contains("Rock"));
        System.out.println(generos.indexOf("Vallenato"));
        
        for(String genero : generos){
            System.out.println(genero.toUpperCase());}
    }
}
