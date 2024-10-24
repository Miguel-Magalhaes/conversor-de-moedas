import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Moedas buscaMoeda () throws IOException, InterruptedException {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/3645bbf229c280c3bad4014c/latest/BRL");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Moedas.class);
    }
}
