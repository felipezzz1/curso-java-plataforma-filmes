import br.com.fezor.screenmatch.calculations.TimestampCalculator;
import br.com.fezor.screenmatch.models.Movie;
import br.com.fezor.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("Batman");;
        myMovie.setYearOfRelease(1990);;
        myMovie.setDuration(165);

        myMovie.rateMovie(9.9);
        myMovie.rateMovie(8);
        myMovie.rateMovie(10);
        System.out.println(myMovie.getNumberOfRatings());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duration in minutes to watch Lost: " + lost.getDuration());

        TimestampCalculator calculator = new TimestampCalculator();
        calculator.include(myMovie);
        System.out.println(calculator.getTotalTime());

    }
}
