package org.example;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Timestamp;
import java.time.Duration;

public class MarvelApiClient implements ApiClient {

    private final String apiPublicKey;
    private final String apiPrivateKey;

    MarvelApiClient() throws Exception {
        this.apiPublicKey = Config.get("marvel.api.public.key");
        this.apiPrivateKey = Config.get("marvel.api.private.key");
    }
    @Override
    public String getBody() throws InterruptedException, IOException, URISyntaxException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(uri())
                .timeout(Duration.ofMinutes(1))
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private URI uri() throws URISyntaxException {
        long ts = new Timestamp(System.currentTimeMillis()).getTime();
        String hash = DigestUtils.md5Hex(ts + this.apiPrivateKey + this.apiPublicKey);
        String str = String.format(
            "https://gateway.marvel.com/v1/public/series?ts=%s&apikey=%s&hash=%s", ts, this.apiPublicKey, hash
        );
        return new URI(str);
    }

}
