/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.modelo;

import java.util.ArrayList;

public class PlayList {

    public static final int MAX_CANCIONES = 3;

    private String nombre;
    private ArrayList<Cancion> canciones;

    public PlayList(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return new ArrayList<>(canciones);
    }

    public boolean agregar(Cancion cancion) {
        if (cancion == null) {
            return false;
        }

        if (canciones.size() >= MAX_CANCIONES) {
            return false;
        }

        for (Cancion c : canciones) {
            if (c.getTitulo().equalsIgnoreCase(cancion.getTitulo())) {
                return false;
            }
        }

        canciones.add(cancion);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");
        int i = 1;
        for (Cancion c : canciones) {
            System.out.println(i + ". " + c.getTitulo() + " - " + c.getArtista() + " (" + c.getDuracion() + " s)");
            i++;
        }
    }

    public int duracionTotal() {
        int suma = 0;
        for (Cancion c : canciones) {
            suma += c.getDuracion();
        }
        return suma;
    }

    public Cancion buscar(String titulo) {
        for (Cancion c : canciones) {
            if (c.getTitulo().equalsIgnoreCase(titulo)) {
                return c;
            }
        }
        return null;
    }

    public int eliminarArtista(String artista) {
        int eliminadas = 0;
        for (Cancion c : canciones) {
            if (c.getArtista().equalsIgnoreCase(artista)) {
                canciones.remove(c);
                eliminadas++;
            }
        }
        return eliminadas;
    }

    public Cancion cancionMasLarga() {
        if (canciones.isEmpty()) {
            return null;
        }
        Cancion mayor = canciones.get(0);
        for (Cancion c : canciones) {
            if (c.getDuracion() > mayor.getDuracion()) {
                mayor = c;
            }
        }
        return mayor;
    }

}
