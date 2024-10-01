import br.com.fezor.screenmatch.calculations.RecomendationFilter;
import br.com.fezor.screenmatch.calculations.TimestampCalculator;
import br.com.fezor.screenmatch.models.Episode;
import br.com.fezor.screenmatch.models.Movie;
import br.com.fezor.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Batman", 1990, 165);

        myMovie.rateMovie(9.9);
        myMovie.rateMovie(8);
        myMovie.rateMovie(10);

        Series lost = new Series("Lost", 2000, 500);
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duration in minutes to watch Lost: " + lost.getDuration());

        TimestampCalculator calculator = new TimestampCalculator();
        calculator.include(myMovie);

        RecomendationFilter recomendationFilter = new RecomendationFilter();

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setVisualizations(1200);

        recomendationFilter.filter(episode);
        recomendationFilter.filter(myMovie);

        Movie randomMovie = new Movie("Spider-Man", 2002, 200);
        randomMovie.rateMovie(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(randomMovie);
        System.out.println("List Size: " + movieList.size());
        System.out.println(movieList);

        for (Movie movie : movieList) {
            System.out.println(movie.getName());
        }
    }
}
