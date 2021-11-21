package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    ArrayList<Ave> listado = new ArrayList<>();
    public int halcones;
    public int aguilas;
    String colorPlumas;

    //constructor
    public Ave(){
        this(null,-1,null,null,null);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;

        listado.add(this);
    }


    //fin constructor

    //getter and setter

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    //fin getter and setter



    public int cantidadAves(){
        return listado.size();

    }

    public String movimiento(){
        return "volar";
    }

    public Ave crearHalcon(String nombre,int edad,String genero){
        halcones ++;
        String colorPlumas = "cafe glorioso";
        String habitat = "montanas";
        Ave halcon = new Ave(nombre,edad,habitat,genero,colorPlumas);
        return halcon;
    }

    public Ave crearAguila(String nombre,int edad,String genero){
        aguilas ++;

        String colorPlumas = "blanco y amarillo";
        String habitat = "montanas";

        Ave aguila = new Ave(nombre,edad,habitat,genero,colorPlumas);
        return aguila;
    }
}
