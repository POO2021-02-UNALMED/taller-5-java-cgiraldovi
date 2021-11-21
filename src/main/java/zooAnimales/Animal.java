package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Animal {
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;


    //constructor

    public Animal() {
        this(null, 0, null, null);
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;

        totalAnimales++;
    }

    //fin constructor

    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    //fin getter and setter


    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        int contadorMamiferos = 0;
        int contadorAves = 0;
        int contadorReptiles = 0;
        int contadorPeces = 0;
        int contadorAnfibios = 0;
        return "hola";
        //no se como acceder a las zonas de los demas animales

    }

    @Override
    public String toString() {
        String nombreAnimal = nombre;
        int edadAnimal = edad;
        String habitatAnimal = habitat;
        String generoAnimal = genero;
        String zonaAnimal;
        String nombreZoo;

        if (zona != null) {
            zonaAnimal = zona.getNombre();
            nombreZoo = zona.getZoo().getNombre();

            return "Mi nombre es #" + nombreAnimal + ", tengo una edad de #" + edadAnimal + ", habito en #" +
                    habitatAnimal + " y mi genero es#" + generoAnimal + ", la zona en la que me ubico es #" +
                    zonaAnimal + ", en el #" + nombreZoo;
        } else {
            return "Mi nombre es #" + nombreAnimal + ", tengo una edad de #" + edadAnimal +
                    ", habito en #" + habitatAnimal + " y mi genero es#" + generoAnimal;
        }


    }
}
