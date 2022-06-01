package org.example;


import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try {
            String apiKey = Config.getApiKey();
            IMDBApiWrapper imdbApiWrapper = new IMDBApiWrapper(apiKey);
            String rawJson = imdbApiWrapper.getData();

            JSONParser jsonParser = new JSONParser(rawJson);
            jsonParser.parse();
            List<Movie> movieList = jsonParser.getMovies();

            File file = new File("movies.html");
            Writer printWriter = new PrintWriter(file);
            HTMLGenerator htmlGenerator = new HTMLGenerator(printWriter);
            htmlGenerator.generate(movieList);
            printWriter.close();


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}
