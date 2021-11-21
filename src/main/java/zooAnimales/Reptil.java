package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
    ArrayList<Reptil> listado = new ArrayList<>();
    int iguanas;
    int serpientes;
    String colorEscamas;
    int largoCola;

    //constructor

    public Reptil(){
        this(null,-1,null,null,null,-1);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;

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

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    //fin getter and setter

    public int cantidadReptiles(){
        return listado.size();
    }

    public String movimiento(){
        return "reptar";
    }

    public Reptil crearIguana(String nombre,int edad,String genero){
        iguanas ++;
        String colorEscamas = "verde";
        int largoCola = 3;
        String habitat = "humedal";
        Reptil iguana = new Reptil(nombre, edad,habitat,genero,colorEscamas,largoCola);
        return iguana;
    }

    public Reptil crearSerpiente(String nombre,int edad,String genero){
        serpientes ++;

        String colorEscamas = "blanco";
        int largoCola = 1;
        String habitat = "jungla";
        Reptil serpiente = new Reptil(nombre,edad,habitat,genero,colorEscamas,largoCola);
        return serpiente;
    }



}
