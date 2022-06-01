package org.example;

import java.util.ArrayList;
import java.util.List;

public class JSONParser {

    private final String rawJSON;
    List<Movie> movieList = new ArrayList<>();
    private String movieData;

    public JSONParser(String rawJSON) {
        this.rawJSON = rawJSON;
    }

    public void parse() {
        this.movieData();
        this.parseMovies();
    }

    // process movie data
    private void parseMovies() {
        String[] movies = this.movieData.split("},");

        for (String movie : movies) {
            String movieRawAttributes = this.movieRawAttributes(movie);
            Movie movieObject = this.movieAttributes(movieRawAttributes);
            movieList.add(movieObject);
        }
    }

    // retrieve movie data only
    private void movieData() {
        int indexBeginArray = this.rawJSON.indexOf("[") + 1;
        int indexEndArray = this.rawJSON.lastIndexOf("]");
        String movieData = this.rawJSON.substring(indexBeginArray, indexEndArray);

        this.movieData = movieData.trim();
    }

    private String movieRawAttributes(String movie) {
        String movieTrimmed = movie.trim();
        int indexBeginMovie = movieTrimmed.indexOf("{") + 2;
        int indexEndMovie = movieTrimmed.lastIndexOf("\"");
        movieTrimmed = movieTrimmed.substring(indexBeginMovie, indexEndMovie);

        return movieTrimmed.trim();
    }

    public Movie movieAttributes(String movieRawAttributes) {
        String[] movieAttributes = movieRawAttributes.split("\",\"");

        Movie movieObject = new Movie();
        for (String movieRawAttribute : movieAttributes) {
            String[] movieRawItem = movieRawAttribute.split("\":\"");

            switch (movieRawItem[0]) {
                case "title":
                    movieObject.setTitle(movieRawItem[1]);
                    break;
                case "image":
                    movieObject.setUrlImage(movieRawItem[1]);
                    break;
                case "imDbRating":
                    double rating = Double.parseDouble(movieRawItem[1]);
                    movieObject.setRating(rating);
                    break;
                case "year":
                    int year = Integer.parseInt(movieRawItem[1]);
                    movieObject.setYear(year);
                    break;
            }

        }
        return movieObject;
    }

    public List<Movie> getMovies() {
        return movieList;
    }
}
