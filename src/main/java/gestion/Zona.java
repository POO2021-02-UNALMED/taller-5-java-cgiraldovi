package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;


    //constructor

    public Zona(){
        this(null, null);
    }

    public Zona(String nombre, Zoologico zoologico) {
        this.nombre = nombre;
        this.zoo = zoologico;
    }

    //fin constructor




    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }


    //fin getter y setter

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }
}
