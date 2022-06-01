package org.example;

public class Movie {
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
}
