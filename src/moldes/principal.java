package moldes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws IOException {
        Scanner mete = new Scanner(System.in);

        //implementando un menu de busqueda
        System.out.println("que desea buscar de Star Wars? (1) Peli, (2) Personaje, (3) Planeta");
        int opc = mete.nextInt();
        if (opc == 1) {
            System.out.println("escogiste la busqueda por pelicula");
            // preguntarle al cliente que ingrese el numero de la pelicula

            busquedaPeli pregunta = new busquedaPeli();
            System.out.println("Ingrese el numero de la pelicula: ");

            try {
                var numeroPelicula = Integer.valueOf(mete.nextInt());
                pelicula pelicula = pregunta.bucarpelicula(numeroPelicula);
                System.out.println(pelicula);

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresaste un valor no numerico.");
                System.out.println("me cierro chau User");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("me cierro chau User");
            }
        } else if (opc == 2) {
            System.out.println("escogiste la busqueda por personaje");
        }else if (opc == 3) {
            System.out.println("escogiste la busqueda por planeta");
        }else {
            System.out.println("Error: Ingresaste un valor no valido. Elija entre 1, 2 o 3.");
        }


    }
}

