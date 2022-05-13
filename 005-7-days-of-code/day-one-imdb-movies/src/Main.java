import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;


public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        System.out.println("Listing the top 250 movies from IMDB.");

        // obtaining private apiKey
        String currentDirectory = System.getProperty("user.dir");
        FileInputStream propFile = new FileInputStream(currentDirectory + "/005-7-days-of-code/day-one-imdb-movies/src/myProperties.txt");
        Properties properties = new Properties(System.getProperties());
        properties.load(propFile);
        String apiKey = properties.getProperty("api.key");

        // making request
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://imdb-api.com/en/API/Top250Movies/" + apiKey))
                .timeout(Duration.ofMinutes(1))
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // parsing request
        JSONObject jsonObject = new JSONObject(response.body());
        JSONArray items = jsonObject.getJSONArray("items");

        // listing data
        for (int i = 0; i < items.length(); i++) {
            JSONObject movie = (JSONObject) items.get(i);
            System.out.print(movie.getString("rank") + " - ");
            System.out.println(movie.getString("title"));
        }

    }
}