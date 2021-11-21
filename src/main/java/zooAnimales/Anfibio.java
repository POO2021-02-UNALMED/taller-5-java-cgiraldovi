package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    ArrayList<Anfibio> listado = new ArrayList<>();
    int ranas;
    int salamandras;
    String colorPiel;
    boolean venenoso;

    //constructor

    public Anfibio(){
        this(null,-1,null,null,null,false);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;

        listado.add(this);
    }

    //fin constructor

    //getter and setter

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }


    //fin getter and setter



    public int cantidadAnfibios(){
       return listado.size();
    }

    public String movimiento(){
        return "saltar";
    }

    public Anfibio crearRana(String nombre,int edad,String genero){
        ranas ++;

        String colorPiel = "rojo";
        Boolean venenoso = true;
        String habitat = "selva";
        Anfibio rana = new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
        return rana;
    }

    public void crearSalamandra(String nombre,int edad,String genero){
        salamandras ++;
        String colorPiel = "negro y amarillo";
        Boolean venenoso = false;
        String habitat = "selva";

        Anfibio salamandra = new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
        return;salamandra;
    }
}
