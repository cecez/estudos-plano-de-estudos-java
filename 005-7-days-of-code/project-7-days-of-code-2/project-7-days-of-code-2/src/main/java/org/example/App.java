package org.example;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try {
            String apiKey = Config.getApiKey();
            String rawJson = new ImdbApiClient(apiKey).getBody();

            List<Content> movieList = new ImdbMovieJsonParser(rawJson).parse();

            Writer printWriter = new PrintWriter("movies.html");
            new HTMLGenerator(printWriter).generate(movieList);
            printWriter.close();


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}
