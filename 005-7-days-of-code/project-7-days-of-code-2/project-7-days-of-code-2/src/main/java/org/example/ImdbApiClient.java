package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ImdbApiClient implements ApiClient {
    private final String apiKey;

    public ImdbApiClient(String apiKey) {
        this.apiKey = apiKey;
    }

    // Obtain JSON data from the internet
    public String getBody() throws InterruptedException, URISyntaxException, IOException {

        // making request
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://imdb-api.com/en/API/Top250Movies/" + this.apiKey))
                .timeout(Duration.ofMinutes(1))
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // parsing request
        return response.body();
    }
}
