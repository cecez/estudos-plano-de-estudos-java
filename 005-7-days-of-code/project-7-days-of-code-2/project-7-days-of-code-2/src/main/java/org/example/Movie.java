package org.example;

public class Movie implements Content, Comparable<Movie> {
    private String title;
    private String urlImage;
    private double rating;
    private int year;

    public String getTitle() {
        return this.title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String getType() {
        return "Movie";
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        return Double.compare(this.rating, o.getRating());
    }
}
