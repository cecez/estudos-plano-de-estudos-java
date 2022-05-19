import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        System.out.println("Parsing JSON data...");
        System.out.println("--------------------------------");

        String jsonData = jsonData();
        String jsonMovies = moviesData(jsonData);
        String[] movies = jsonMovies.split("},");

        for (String movie : movies) {
            String movieRawAttributes = movieRawAttributes(movie);
            Movie movieObject = movieAttributes(movieRawAttributes);

            System.out.println("Title: " + movieObject.getTitle());
            System.out.println("Image: " + movieObject.getUrlImage());
            System.out.println("Rating: " + movieObject.getRating());
            System.out.println("Year: " + movieObject.getYear());


            System.out.println("--------------------------------");
        }
    }

    public static String jsonData() throws IOException, InterruptedException, URISyntaxException {
        // Obtain JSON data from the internet

        // obtaining private apiKey
        String currentDirectory = System.getProperty("user.dir");
        FileInputStream propFile = new FileInputStream(currentDirectory + "/005-7-days-of-code/day-two-parsing-json/day-two-parsing-json/src/myProperties.txt");
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
        return response.body();
    }

    public static String moviesData(String jsonData) {
        return jsonData.substring(jsonData.indexOf("[") + 1, jsonData.lastIndexOf("]")).trim();
    }

    public static String movieRawAttributes(String movie) {
        String movieTrimmed = movie.trim();

        return movieTrimmed.substring(movieTrimmed.indexOf("{") + 2, movieTrimmed.lastIndexOf("\"")).trim();
    }

    public static Movie movieAttributes(String movieRawAttributes) {
        String[] movieAttributes = movieRawAttributes.split("\",\"");

        Movie movieObject = new Movie();
        for (String movieRawAttribute : movieAttributes) {
            String[] movieRawItem = movieRawAttribute.split("\":\"");

            if (movieRawItem[0].equals("title")) {
                movieObject.setTitle(movieRawItem[1]);
            } else if (movieRawItem[0].equals("image")) {
                movieObject.setUrlImage(movieRawItem[1]);
            } else if (movieRawItem[0].equals("imDbRating")) {
                double rating = Double.parseDouble(movieRawItem[1]);
                movieObject.setRating(rating);
            } else if (movieRawItem[0].equals("year")) {
                int year = Integer.parseInt(movieRawItem[1]);
                movieObject.setYear(year);
            }

        }
        return movieObject;
    }
}