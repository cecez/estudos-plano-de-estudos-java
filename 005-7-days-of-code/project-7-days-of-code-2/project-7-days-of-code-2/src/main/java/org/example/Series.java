package org.example;

public class Series implements Content, Comparable<Series> {

    private final String title;
    private final String urlImage;
    private final double rating;
    private final int year;

    Series(String title, String urlImage, double rating, int year) {
        this.title = title;
        this.urlImage = urlImage;
        this.rating = rating;
        this.year = year;
    }
    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUrlImage() {
        return this.urlImage;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public double getRating() {
        return this.rating;
    }

    @Override
    public String getType() {
        return "Series";
    }

    @Override
    public int compareTo(Series o) {
        return Double.compare(this.rating, o.getRating());
    }
}
