package org.example;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args )
    {
        try {
            List<Movie> movieList = imdbMovies();
            List<Series> seriesList = marvelSeries();

            List<? extends Content> mixedList = Stream.of(movieList, seriesList)
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());

            Collections.sort(mixedList, Comparator.comparing(Content::getYear));

            System.out.println("Salvando dados no HTML...");
            Writer printWriter = new PrintWriter("movies-and-series.html");
            new HTMLGenerator(printWriter).generate(mixedList);
            printWriter.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<Movie> imdbMovies() throws Exception {
        System.out.println("Realizando requisição para a API IMDB...");
        String rawJson = new ImdbApiClient().getBody();

        System.out.println("Processando resultados...");
        List<Movie> movieList = new ImdbMovieJsonParser(rawJson).parse();
        Collections.sort(movieList);

        return movieList;

//        System.out.println("Salvando dados no HTML...");
//        Writer printWriter = new PrintWriter("movies.html");
//        new HTMLGenerator(printWriter).generate(movieList);
//        printWriter.close();
    }

    public static List<Series> marvelSeries() throws Exception {
        System.out.println("Realizando requisição para a API Marvel...");
        String rawJson = new MarvelApiClient().getBody();

        System.out.println("Processando resultados...");
        List<Series> seriesList = new MarvelSeriesJsonParser(rawJson).parse();
        Collections.sort(seriesList);

        return seriesList;

//        System.out.println("Gerando HTML...");
//        Writer printWriter = new PrintWriter("series.html");
//        new HTMLGenerator(printWriter).generate(seriesList);
//        printWriter.close();
    }
}
