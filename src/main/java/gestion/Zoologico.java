package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(){
        this(null, null);
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    //geter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void setZona(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    //fin getter y setter



    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }

    public int cantidadTotalAnimales(){
        int contadorAnimales = 0;
        for (Zona zona:zonas) {
            contadorAnimales += zona.cantidadAnimales();
        }
        return contadorAnimales;
    }
}
