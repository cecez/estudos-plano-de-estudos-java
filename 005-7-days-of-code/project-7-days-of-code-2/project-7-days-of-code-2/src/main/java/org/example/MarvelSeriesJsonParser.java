package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class MarvelSeriesJsonParser implements JsonParser {
    private final String rawJson;
    private String rawResults;
    private String[] rawSeries;
    List<Series> seriesList = new ArrayList<>();

    public MarvelSeriesJsonParser(String rawJson) {
        this.rawJson = rawJson;
    }

    @Override
    public List<Series> parse() {
        this.parseRawResults();
        this.parseRawSeries();
        this.parseRawAttributeSeries();

        return this.seriesList;
    }

    private void parseRawAttributeSeries() {
        for (String rawSerie : this.rawSeries) {
            String title = this.parseTitle(rawSerie);
            int year = this.parseYear(rawSerie);
            String urlImage = this.parseUrlImage(rawSerie);
            double rating = 1.1;

            Series series = new Series(title, urlImage, rating, year);
            this.seriesList.add(series);
        }
    }

    private String parseUrlImage(String rawSerie) {
        Pattern pattern = Pattern.compile("\"path\":\"(.*?)\",");
        Matcher matcher = pattern.matcher(rawSerie);
        String urlImage;
        if (matcher.find()) {
            urlImage = matcher.group(1).trim();

            pattern = Pattern.compile("\"extension\":\"(.*?)\"");
            matcher = pattern.matcher(rawSerie);
            if (matcher.find()) {
                return urlImage + "." + matcher.group(1).trim();
            }
        }
        return "https://bitsofco.de/content/images/2018/12/broken-1.png";
    }

    private int parseYear(String rawSerie) {
        Pattern pattern = Pattern.compile("\"startYear\":(\\d*),");
        Matcher matcher = pattern.matcher(rawSerie);
        if (matcher.find()) {
            return parseInt(matcher.group(1));
        }
        return 0;
    }

    private String parseTitle(String rawSerie) {
        Pattern pattern = Pattern.compile("\"title\":\"(.*?)\"");
        Matcher matcher = pattern.matcher(rawSerie);
        if (matcher.find()) {
            return matcher.group(1).trim();
        }
        return "Título não encontrado";
    }

    private void parseRawSeries() {
        this.rawSeries = this.rawResults.split("}\\s*,\\s*\\{\\s*\"id\"");

        for (int i=0; i < this.rawSeries.length; i++) {
            int indexBeginArray = this.rawSeries[i].indexOf("\"title\"");
            int indexEndArray = this.rawSeries[i].lastIndexOf("\"creators\"");
            String rawCleanedSerie = this.rawSeries[i].substring(indexBeginArray, indexEndArray);
            this.rawSeries[i] = rawCleanedSerie.trim();
        }
    }

    private void parseRawResults() {
        int indexBeginArray = this.rawJson.indexOf("[") + 1;
        int indexEndArray = this.rawJson.lastIndexOf("]");
        String resultsData = this.rawJson.substring(indexBeginArray, indexEndArray);

        this.rawResults = resultsData.trim();
    }
}
