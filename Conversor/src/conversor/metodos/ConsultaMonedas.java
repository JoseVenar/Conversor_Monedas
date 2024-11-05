package conversor.metodos;

import com.google.gson.Gson;
import conversor.modelos.Moneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {

    private static final HttpClient client = HttpClient.newHttpClient();

    public Double tasaCambio(String monedaBase, String monedaOjetivo) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c87968a47b9568e705cf4616/latest/" + monedaBase);

        HttpRequest request = HttpRequest.newBuilder()
             .uri(direccion)
             .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Moneda monedaRespuesta = gson.fromJson(response.body(), Moneda.class);

            return monedaRespuesta.conversion_rates().get(monedaOjetivo);

        } catch (Exception e) {
            throw new RuntimeException("Error al realizar la consulta", e);
        }

    }

}
