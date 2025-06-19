package entities;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Conversor {

    public ConversaoResultado converteMoeda( String moedaBase, String moedaConverte, double totalParaConverter) throws IOException, InterruptedException{
        URI busca = URI.create("https://v6.exchangerate-api.com/v6/14d037fcbaec782e50bc1c5f/pair/"+moedaBase+"/"+moedaConverte+"/"+totalParaConverter);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
         .uri(busca)
         .build();

          HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());
         return new Gson().fromJson(response.body(),ConversaoResultado.class);
    }


}
