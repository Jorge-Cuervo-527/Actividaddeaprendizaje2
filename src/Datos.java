
import java.util.Scanner;

public class Datos {
    private static RecolectarDatos[] personas = new RecolectarDatos[5];
    private static Scanner scanner = new Scanner(System.in);

    //creamos un metodo para capturar los datos de las personas
    public static void capturarDatos() {
        System.out.println("Por favor ingrese los datos de 5 personas");
        for (int i = 0; i < 5; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.println("ingrese el nombre:  ");
            String nombre = scanner.nextLine();
            System.out.println("ingrese el apellido:  ");
            String apellido = scanner.nextLine();

            System.out.println("ingrese el genero (M = Masculino, F = Femenino):  ");
            String genero = scanner.nextLine();
            if (genero.equalsIgnoreCase("M")) {
                genero = "Masculino";
            } else if (genero.equalsIgnoreCase("F")) {
                genero = "Femenino";
            } else {
                System.out.println("Genero no valido, por favor ingrese un genero valido");
                i--;
                continue;
            }
            System.out.println("ingrese la edad:  ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            personas[i] = new RecolectarDatos(nombre, apellido, genero, edad);
        }
    }

    //creamos un metodo para obtener los nombres y generos de las personas
    public static String[] obtenerNombresYGeneros() {
        String[] nombresYGeneros = new String[5];
        for (int i = 0; i < 5; i++) {
            nombresYGeneros[i] = personas[i].getNombre() + " " + personas[i].getApellido() + " " + personas[i].getGenero();
        }
        return nombresYGeneros;
    }

    //creamos un metodo para calcular el promedio de las edades
    public static double calcularPromedioEdades() {
        int suma = 0;
        for (RecolectarDatos edades : personas) {
            suma += edades.getEdad();
        }
        return (double) suma / personas.length;
    }

    //creamos un metodo para contar la cantidad de personas de genero masculino
    public static int contarMasculinos() {
        int i = 0;
        for (RecolectarDatos persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("Masculino")) {
                i++;
            }
        }
        return i;
    }

    //creamos un metodo para contar la cantidad de personas de genero femenino
    public static int contarFemeninos() {
        int i = 0;
        for (RecolectarDatos persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("Femenino")) {
                i++;
            }
        }
        return i;
    }

    //creamos un metodo main para ejecutar los metodos
    public static void main(String[] args) {
        capturarDatos();
        String[] nombresYGeneros = obtenerNombresYGeneros();
        System.out.println("Nombres y generos de las personas: ");
        for (String nombreYGenero : nombresYGeneros) {
            System.out.println(nombreYGenero);
        }
        System.out.println("Promedio de edades: " + calcularPromedioEdades());
        System.out.println("Cantidad de personas de genero masculino: " + contarMasculinos());
        System.out.println("Cantidad de personas de genero femenino: " + contarFemeninos());
    }
}

