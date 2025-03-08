
import java.util.Scanner;

/*  a) creacion de la clase que permite capturar el nombre, apellido, genero, edad, estas propiedades
       deberán ser definidas mediante el modificador de acceso Privado */

public class RecolectarDatos {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

//  creacion del constructor de la clase que permita inicializar las propiedades de la clase

    public RecolectarDatos(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

}