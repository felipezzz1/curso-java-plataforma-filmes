import br.com.fezor.screenmatch.models.Movie;

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
    }
}
