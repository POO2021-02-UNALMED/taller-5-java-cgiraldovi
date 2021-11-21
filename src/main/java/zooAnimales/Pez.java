package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
    ArrayList<Pez> listado = new ArrayList<>();
    int salmones;
    int bacalaos;
    String colorEscamas;
    int cantidadAletas;

    //constructor
    public Pez(){
        this(null,-1,null,null,null,-1);
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;

        listado.add(this);
    }

    //fin constructor

    //getter and setter



    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    //fin getter and setter



    public int cantidadPeces(){
        return listado.size();
    }

    public String movimiento(){
        return "nadar";
    }

    public Pez crearSalmon(String nombre,int edad,String genero){
        salmones ++;
        String colorEscamas = "rojo";
        int cantidadAletas = 6;
        String habitat = "oceano";
        Pez salmon = new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
        return salmon;
    }

    public Pez crearBacalao(String nombre,int edad,String genero){
        salmones ++;
        String colorEscamas = "gris";
        int cantidadAletas = 6;
        String habitat = "oceano";

        Pez bacalao = new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
        return bacalao;
    }

}
