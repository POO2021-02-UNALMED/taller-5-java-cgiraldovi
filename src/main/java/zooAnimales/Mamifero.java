package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
    static ArrayList<Mamifero> listado = new ArrayList<>();
    int caballos;
    int leones;
    boolean pelaje;
    int patas;

    //constructor

    public Mamifero(){
        this(null,-1,null,null,false,-1);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;

        listado.add(this);
    }


    //fin constructor

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getLeones() {
        return leones;
    }

    public void setLeones(int leones) {
        this.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }


    //getter and setter

    //fin getter and setter

    public int cantidadMamiferos(){
        return listado.size();
    }

    public Mamifero crearCaballo(String nombre,int edad,String genero){
        caballos ++;

        Boolean pelaje = true;
        int patas = 4;
        String habitat = "pradera";

        Mamifero caballo = new Mamifero(nombre,edad,habitat,genero, pelaje,patas);
        return caballo;
    }

    public Mamifero crearLeon(String nombre,int edad,String genero){
        leones ++;

        Boolean pelaje = true;
        int patas = 4;
        String habitat = "selva";

        Mamifero leon = new Mamifero(nombre,edad,habitat,genero,pelaje,patas);
        return leon;
    }
}
