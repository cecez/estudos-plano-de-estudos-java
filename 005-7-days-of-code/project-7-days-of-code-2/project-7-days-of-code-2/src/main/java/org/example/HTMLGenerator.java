package org.example;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class HTMLGenerator {

    private final Writer writer;

    public HTMLGenerator(Writer writer) {
        this.writer = writer;
    }

    public void generate(List<Movie> movieList) throws IOException {


        String htmlBegin =
                """
                <html>
                    <head>
                        <title>Top 250 movies from IMDB</title>
                    </head>
                    <body>
                """;
        this.writer.write(htmlBegin);

        int movieIndex = 1;
        for (Movie movieObject : movieList) {
            String htmlMovie =
                    """
                    <p><b>%d. %s</b></p>
                    <p><small>%d | %.2f</small></p>
                    <p><img src="%s" /></p>
                    <hr/>
                    """;
            htmlMovie = String.format(
                    htmlMovie,
                    movieIndex,
                    movieObject.getTitle(),
                    movieObject.getYear(),
                    movieObject.getRating(),
                    movieObject.getUrlImage());
            this.writer.write(htmlMovie);
            movieIndex++;
        }

        String htmlEnd =
                """
                    </body>
                    </html>
                """;
        this.writer.write(htmlEnd);

    }
}
