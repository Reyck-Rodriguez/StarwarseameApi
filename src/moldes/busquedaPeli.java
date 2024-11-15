package moldes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class busquedaPeli {

    /// conecciones con la url del api de swapi
    String direccion;

    pelicula bucarpelicula(int numeropelicula) {
        URI direccion = URI.create("https://swapi.dev/api/films/" + numeropelicula);
        try {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest pregunta = HttpRequest.newBuilder()
                    .uri(direccion).build();

            HttpResponse<String> respuesta = null;

            respuesta = cliente.send(pregunta, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(respuesta.body(), pelicula.class);
        } catch (Exception e) {
            throw new RuntimeException("no existe pailas con la peli");

        }


    }
}
